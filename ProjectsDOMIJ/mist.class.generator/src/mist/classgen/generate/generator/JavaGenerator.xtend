package mist.classgen.generate.generator

import FileTransferPackage.ConcreteStep
import FileTransferPackage.Copy
import FileTransferPackage.Delete
import FileTransferPackage.Execution
import FileTransferPackage.FilterComponent
import FileTransferPackage.FilterContainer
import FileTransferPackage.GenericStep
import FileTransferPackage.IsEmpty
import FileTransferPackage.Link
import FileTransferPackage.Model
import FileTransferPackage.Move
import FileTransferPackage.OnAttributes
import FileTransferPackage.OnExtension
import FileTransferPackage.OnName
import FileTransferPackage.OnSize
import FileTransferPackage.OnTags
import FileTransferPackage.OnTime
import FileTransferPackage.OnType
import FileTransferPackage.ParametrizedStep
import FileTransferPackage.Path
import FileTransferPackage.PathVariable
import FileTransferPackage.Selection
import FileTransferPackage.VariableStep
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.common.util.EList
import FileTransferPackage.FileType
import FileTransferPackage.MemoryUnit
import FileTransferPackage.Operator
import FileTransferPackage.TimeUnit
import FileTransferPackage.TimeType
import FileTransferPackage.Quantificators
import FileTransferPackage.Strategies
/**
 * Generate Database create sql
 */
class JavaGenerator{
	
	def generate(Model model){
		
		
		'''
		«FOR execution: model.executions»
		«execution.generate»
		«ENDFOR»
		'''
		
	}
	
	def generate(Execution execution){
		
//		var pathvar = execution as PathVariable
//		if (!(execution instanceof PathVariable)){
//			pathvar = null;
//		}
		'''
		«IF execution instanceof PathVariable»
		«generate(execution as PathVariable)»
		«ENDIF»
		«IF execution instanceof Selection»
		«generate(execution as Selection)»
		«ENDIF»
		«IF execution instanceof Copy»
		«generate(execution as Copy)»
		«ENDIF»
		«IF execution instanceof Move»
		«generate(execution as Move)»
		«ENDIF»
		«IF execution instanceof Delete»
		«generate(execution as Delete)»
		«ENDIF»
		'''
	}
	
	def getFlattenSteps(EList<GenericStep> steps){
		var retval = new ArrayList<GenericStep>();
		
		for(GenericStep step : steps){
			if(step instanceof VariableStep){
				var variable = step as VariableStep;
				var toAdd = getFlattenSteps(variable.value.value.steps) as ArrayList<GenericStep>;
				retval.addAll(toAdd);
			}else{
				retval.add(step);
			}
		}
		return retval;
	}
	def generate(PathVariable pathvar){
		'''
		«pathvar.name» = «pathvar.value.generate»
		'''
	}
	def generate(Path path){
		var resolved = getFlattenSteps(path.steps)
		'''
		[«FOR step :resolved SEPARATOR ','»«generate(step)»«ENDFOR»]
		'''
	}
	
	def generate(GenericStep step){
		'''«IF step instanceof ConcreteStep»«generate(step as ConcreteStep)»«ENDIF»«IF step instanceof ParametrizedStep»«generate(step as ParametrizedStep)»«ENDIF»'''
	}
	def generate(ConcreteStep step){
		'''Step("«step.value»«IF step.absolute»:«ENDIF»")'''
	}
	def generate(ParametrizedStep step){
		'''Step("«step.name»",parametrized=True)'''
	}	
	
	def generate(Selection selection){
		var filter = selection.where
		var from = selection.from
		var name = selection.name
		'''
		_from = «from.generate»
		def _filter(profiler):
			return «IF filter == null»True«ELSE»«filter.generate»«ENDIF»
		Selection(name="«name»",path=_from,where=_filter)
		'''	
	}
	 
	def generate(FilterComponent filter){
		if (filter instanceof FilterContainer)
			return generate(filter as FilterContainer)
		if (filter instanceof OnName)
			return generate(filter as OnName)
		if (filter instanceof OnExtension)
			return generate(filter as OnExtension)
		if (filter instanceof OnTime)
			return generate(filter as OnTime)
		if (filter instanceof OnAttributes)
			return generate(filter as OnAttributes)
		if (filter instanceof OnTags)
			return generate(filter as OnTags)
		if (filter instanceof OnSize)
			return generate(filter as OnSize)
		if (filter instanceof IsEmpty)
			return generate(filter as IsEmpty)
		if (filter instanceof OnType)
			return generate(filter as OnType)
	}
	
	def generate(FilterContainer filter){
		'''(«FOR link : filter.links»«link.generate»«ENDFOR»)'''
	}
	def generate(Link link){
		var and = link.and
		var or = link.or
		var elem = link.element
		
		'''«IF and» and «ENDIF»«IF or» or «ENDIF»«elem.generate»'''
	}
	
	def generate(OnName name){
		var inverse = name.inverse
		var value = name.name
		'''profiler.getPureFileName() is «IF inverse»not«ENDIF» «value»'''
	}
	
	def generate(OnExtension extension2){
		var extensions = extension2.extensions
		var inverse = extension2.inverse
		
		'''profiler.getExtension() «IF inverse»not«ENDIF» in [«extensions.generateStringlist»]'''
	}
	
	def generate(IsEmpty empty){
		var inverse = empty.inverse
		
		'''«IF inverse»not«ENDIF» profiler.isEmpty()'''
	}
	
	def generate(OnType onType){
		var type = onType.type.toString()
		var inverse = onType.inverse
		var document = type.equals("Document")
//		var directory = type.equals("Directory")
		
		'''«IF inverse»not«ENDIF» profiler.is«IF document»Doc«ELSE»Dir«ENDIF»'''
	}
	
	def generate(OnSize onSize){
		var inverse = onSize.inverse
		var operator = getOperatorNotation(onSize.operator)
		var treshold = onSize.treshold
		var unit = getMemoryUnitSize(onSize.unit)
		
		'''«IF inverse»not«ENDIF» profiler.getSize() «operator» «treshold»*«unit»'''
	}
	
	def generate(OnTime time){
		var inverse = time.inverse
		var treshold = time.treshold
		var unit = getTimeUnitSize(time.unit)
		var action = getActionNotation(time.timeOf)
		var operator = getOperatorNotation(time.operator)
		
		'''«IF inverse»not«ENDIF» profiler.getSecondsFrom("«action»") «operator» «treshold»*«unit»'''
	}
	

	def generate(OnTags tags){
		var tag = tags.tags
		var count = getTagsCount(tags.treshold,tags.quantificator.toString())
		var inverse = tags.inverse
		var only = tags.only
		
		'''checkProfilerTags(profiler, extensionList=[«generateStringlist(tag)»], negation=«boolean2text(inverse)», quantity=«count», noMore=«boolean2text(only)»)'''		
	}	
	
	def generate(OnAttributes attributes){
		var name = attributes.name
		var inverse = attributes.inverse
		var value = attributes.value
		var setted = value == null || value.equals("")
		
		'''checkProfilerAttribute(profiler,«name»,neg=«boolean2text(inverse)»«IF !setted»,val="«value»"«ENDIF»)'''
			
	}

	def boolean2text(boolean b){
		if(b)
			return "True"
		else
			return "False"
	}
	def getTagsCount(int treshold, String quanty){
		if(quanty.equals("any"))
			return 1
		return treshold;
	}
	
	def getMemoryUnitSize(MemoryUnit unit){
		var txt = unit.toString()
		if(txt.equals("KB")) return 1024
		if(txt.equals("MB")) return 1024*1024
		if(txt.equals("GB")) return 1024*1024*1024
		if(txt.equals("TB")) return 1024*1024*1024*1024
	}
	def getTimeUnitSize(TimeUnit unit){
		var txt = unit.toString;
		if(txt.equals("mins")) return 60
		if(txt.equals("hours")) return 60*60
		if(txt.equals("days")) return 60*60*24
		if(txt.equals("weeks")) return 60*60*24*7
		if(txt.equals("months")) return 60*60*24*30
		if(txt.equals("years")) return 60*60*24*365+6
	}
	def getOperatorNotation(Operator operator){
		var txt = operator.toString();
		switch txt{
			case "less": return "<"
			case "less_equal": return "<="
			case "equal": return "=="
			case "more": return ">"
			case "more_equal": return ">=" 
		}
	}
	def getActionNotation(TimeType timeType){
		var txt = timeType.toString();
		if(txt.equals("created"))
			return "creation"
		else
			return "modification"
	}
		
	def generateStringlist(List<String> lista){
		'''«FOR elem : lista SEPARATOR ','»"«elem»"«ENDFOR»'''
	}
		
		
		
	def generate(Move move){
		var path = move.destination
		var strategy = move.strategy.toString()
		var select = move.source.name
		
		'''
		_destination = «path.generate»
		Move(selection_name="«select»",destination=_destination,tactic="«strategy»")
		'''
		
	}
	def generate(Copy copy){
		var path = copy.destination
		var strategy = copy.strategy.toString()
		var select = copy.source.name
		
		'''
		_destination = «path.generate»
		Copy(selection_name="«select»",destination=_destination,tactic="«strategy»")
		'''
	}
	
	def generate(Delete delete){
		var select = delete.source.name
		
		'''
		Delete(selection_name="«select»")
		'''
	}
    /*
    def generate(Class cls, String packageName) {
    '''
		package «packageName»;
		
		«cls.accessModifier» class «cls.name» «IF cls.supertypes.size > 0»extends «cls.supertypes.get(0).name»«ENDIF»{
			«FOR f : cls.fields»
			     «f.generate»
			«ENDFOR»
			
			
			«FOR m : cls.methods»
			     «m.generate(cls)»
			     
            «ENDFOR»	
		}
    '''}
    
    def generate(Attribute attr) {
    '''
		«attr.accessModifier» «IF attr.isStatic»static «ENDIF»«IF attr.type != null»«attr.type.type.name»«ELSE»String«ENDIF» «attr.name»;
    '''}
   
    def generateParameter(Attribute attr) {
    '''«IF attr.isStatic»static «ENDIF»«IF attr.type != null»«attr.type.type.name»«ELSE»String«ENDIF» «attr.name»'''
    }
    
   	
   	def generate(Method func, Class c) {
    '''
        «IF func.isAbstract»abstract «ENDIF»«func.accessModifier» «IF func.isStatic»static «ENDIF»«IF func.returnType != null»«func.returnType.type.name» «ELSE»«IF !c.name.equalsIgnoreCase(func.name)»String «ENDIF»«ENDIF»«func.name»(«FOR p : func.parameters SEPARATOR ", "»«p.generateParameter»«ENDFOR»)«IF func.body != null» {
            «func.body»
        }«ENDIF»;
    '''}
    */
    
}