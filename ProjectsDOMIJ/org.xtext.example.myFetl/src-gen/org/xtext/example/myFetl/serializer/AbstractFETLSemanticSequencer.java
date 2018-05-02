package org.xtext.example.myFetl.serializer;

import FileTransferPackage.ConcreteStep;
import FileTransferPackage.Copy;
import FileTransferPackage.Delete;
import FileTransferPackage.FileTransferPackagePackage;
import FileTransferPackage.FilterContainer;
import FileTransferPackage.IsEmpty;
import FileTransferPackage.Link;
import FileTransferPackage.Model;
import FileTransferPackage.Move;
import FileTransferPackage.OnAttributes;
import FileTransferPackage.OnExtension;
import FileTransferPackage.OnName;
import FileTransferPackage.OnSize;
import FileTransferPackage.OnTags;
import FileTransferPackage.OnTime;
import FileTransferPackage.OnType;
import FileTransferPackage.ParametrizedStep;
import FileTransferPackage.Path;
import FileTransferPackage.PathVariable;
import FileTransferPackage.Selection;
import FileTransferPackage.VariableStep;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.myFetl.services.FETLGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractFETLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FETLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == FileTransferPackagePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FileTransferPackagePackage.CONCRETE_STEP:
				if(context == grammarAccess.getConcreteStepRule() ||
				   context == grammarAccess.getGenericStepRule()) {
					sequence_ConcreteStep(context, (ConcreteStep) semanticObject); 
					return; 
				}
				else break;
			case FileTransferPackagePackage.COPY:
				if(context == grammarAccess.getCopyRule() ||
				   context == grammarAccess.getExecutionRule()) {
					sequence_Copy(context, (Copy) semanticObject); 
					return; 
				}
				else break;
			case FileTransferPackagePackage.DELETE:
				if(context == grammarAccess.getDeleteRule() ||
				   context == grammarAccess.getExecutionRule()) {
					sequence_Delete(context, (Delete) semanticObject); 
					return; 
				}
				else break;
			case FileTransferPackagePackage.FILTER_CONTAINER:
				if(context == grammarAccess.getFilterComponentRule() ||
				   context == grammarAccess.getFilterContainerRule()) {
					sequence_FilterContainer(context, (FilterContainer) semanticObject); 
					return; 
				}
				else break;
			case FileTransferPackagePackage.IS_EMPTY:
				if(context == grammarAccess.getFilterComponentRule() ||
				   context == grammarAccess.getIsEmptyRule()) {
					sequence_IsEmpty(context, (IsEmpty) semanticObject); 
					return; 
				}
				else break;
			case FileTransferPackagePackage.LINK:
				if(context == grammarAccess.getLinkRule()) {
					sequence_Link(context, (Link) semanticObject); 
					return; 
				}
				else break;
			case FileTransferPackagePackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case FileTransferPackagePackage.MOVE:
				if(context == grammarAccess.getExecutionRule() ||
				   context == grammarAccess.getMoveRule()) {
					sequence_Move(context, (Move) semanticObject); 
					return; 
				}
				else break;
			case FileTransferPackagePackage.ON_ATTRIBUTES:
				if(context == grammarAccess.getFilterComponentRule() ||
				   context == grammarAccess.getOnAttributesRule()) {
					sequence_OnAttributes(context, (OnAttributes) semanticObject); 
					return; 
				}
				else break;
			case FileTransferPackagePackage.ON_EXTENSION:
				if(context == grammarAccess.getFilterComponentRule() ||
				   context == grammarAccess.getOnExtensionRule()) {
					sequence_OnExtension(context, (OnExtension) semanticObject); 
					return; 
				}
				else break;
			case FileTransferPackagePackage.ON_NAME:
				if(context == grammarAccess.getFilterComponentRule() ||
				   context == grammarAccess.getOnNameRule()) {
					sequence_OnName(context, (OnName) semanticObject); 
					return; 
				}
				else break;
			case FileTransferPackagePackage.ON_SIZE:
				if(context == grammarAccess.getFilterComponentRule() ||
				   context == grammarAccess.getOnSizeRule()) {
					sequence_OnSize(context, (OnSize) semanticObject); 
					return; 
				}
				else break;
			case FileTransferPackagePackage.ON_TAGS:
				if(context == grammarAccess.getFilterComponentRule() ||
				   context == grammarAccess.getOnTagsRule()) {
					sequence_OnTags(context, (OnTags) semanticObject); 
					return; 
				}
				else break;
			case FileTransferPackagePackage.ON_TIME:
				if(context == grammarAccess.getFilterComponentRule() ||
				   context == grammarAccess.getOnTimeRule()) {
					sequence_OnTime(context, (OnTime) semanticObject); 
					return; 
				}
				else break;
			case FileTransferPackagePackage.ON_TYPE:
				if(context == grammarAccess.getFilterComponentRule() ||
				   context == grammarAccess.getOnTypeRule()) {
					sequence_OnType(context, (OnType) semanticObject); 
					return; 
				}
				else break;
			case FileTransferPackagePackage.PARAMETRIZED_STEP:
				if(context == grammarAccess.getGenericStepRule() ||
				   context == grammarAccess.getParametrizedStepRule()) {
					sequence_ParametrizedStep(context, (ParametrizedStep) semanticObject); 
					return; 
				}
				else break;
			case FileTransferPackagePackage.PATH:
				if(context == grammarAccess.getPathRule()) {
					sequence_Path(context, (Path) semanticObject); 
					return; 
				}
				else break;
			case FileTransferPackagePackage.PATH_VARIABLE:
				if(context == grammarAccess.getExecutionRule() ||
				   context == grammarAccess.getPathVariableRule()) {
					sequence_PathVariable(context, (PathVariable) semanticObject); 
					return; 
				}
				else break;
			case FileTransferPackagePackage.SELECTION:
				if(context == grammarAccess.getExecutionRule() ||
				   context == grammarAccess.getSelectionRule()) {
					sequence_Selection(context, (Selection) semanticObject); 
					return; 
				}
				else break;
			case FileTransferPackagePackage.VARIABLE_STEP:
				if(context == grammarAccess.getGenericStepRule() ||
				   context == grammarAccess.getVariableStepRule()) {
					sequence_VariableStep(context, (VariableStep) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     value=EString
	 */
	protected void sequence_ConcreteStep(EObject context, ConcreteStep semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FileTransferPackagePackage.Literals.CONCRETE_STEP__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FileTransferPackagePackage.Literals.CONCRETE_STEP__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConcreteStepAccess().getValueEStringParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (source=[Selection|EString] destination=Path strategy=Strategies?)
	 */
	protected void sequence_Copy(EObject context, Copy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     source=[Selection|EString]
	 */
	protected void sequence_Delete(EObject context, Delete semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FileTransferPackagePackage.Literals.TRANSFORMATION__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FileTransferPackagePackage.Literals.TRANSFORMATION__SOURCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeleteAccess().getSourceSelectionEStringParserRuleCall_2_0_1(), semanticObject.getSource());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (links+=Link links+=Link*)
	 */
	protected void sequence_FilterContainer(EObject context, FilterContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (inverse?='not'?)
	 */
	protected void sequence_IsEmpty(EObject context, IsEmpty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (compositonType=CompositionType? element=FilterComponent)
	 */
	protected void sequence_Link(EObject context, Link semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (executions+=Execution executions+=Execution*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (source=[Selection|EString] destination=Path strategy=Strategies?)
	 */
	protected void sequence_Move(EObject context, Move semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (inverse?='not'? | (inverse?='not'? value=EString)))
	 */
	protected void sequence_OnAttributes(EObject context, OnAttributes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (inverse?='not'? (extensions+=EString extensions+=EString*)?)
	 */
	protected void sequence_OnExtension(EObject context, OnExtension semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (inverse?='not'? name=EString)
	 */
	protected void sequence_OnName(EObject context, OnName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (inverse?='not'? operator=Operator treshold=EInt unit=MemoryUnit)
	 */
	protected void sequence_OnSize(EObject context, OnSize semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((tags+=EString tags+=EString*)? (quantificator=Quantificators | treshold=EInt) inverse?='not'? only?='and no more tags'?)
	 */
	protected void sequence_OnTags(EObject context, OnTags semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (timeOf=TimeType operator=Operator treshold=EInt unit=TimeUnit)
	 */
	protected void sequence_OnTime(EObject context, OnTime semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (inverse?='not'? type=FileType)
	 */
	protected void sequence_OnType(EObject context, OnType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_ParametrizedStep(EObject context, ParametrizedStep semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FileTransferPackagePackage.Literals.PARAMETRIZED_STEP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FileTransferPackagePackage.Literals.PARAMETRIZED_STEP__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParametrizedStepAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString value=Path)
	 */
	protected void sequence_PathVariable(EObject context, PathVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FileTransferPackagePackage.Literals.PATH_VARIABLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FileTransferPackagePackage.Literals.PATH_VARIABLE__VALUE));
			if(transientValues.isValueTransient(semanticObject, FileTransferPackagePackage.Literals.PATH_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FileTransferPackagePackage.Literals.PATH_VARIABLE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPathVariableAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPathVariableAccess().getValuePathParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (steps+=GenericStep steps+=GenericStep*)
	 */
	protected void sequence_Path(EObject context, Path semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString from=Path (where+=FilterComponent where+=FilterComponent*)?)
	 */
	protected void sequence_Selection(EObject context, Selection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=[PathVariable|EString]
	 */
	protected void sequence_VariableStep(EObject context, VariableStep semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FileTransferPackagePackage.Literals.VARIABLE_STEP__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FileTransferPackagePackage.Literals.VARIABLE_STEP__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableStepAccess().getValuePathVariableEStringParserRuleCall_1_0_1(), semanticObject.getValue());
		feeder.finish();
	}
}
