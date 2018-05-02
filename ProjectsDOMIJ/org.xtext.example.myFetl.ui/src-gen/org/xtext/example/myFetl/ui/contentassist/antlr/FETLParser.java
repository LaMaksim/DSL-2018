/*
* generated by Xtext
*/
package org.xtext.example.myFetl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.myFetl.services.FETLGrammarAccess;

public class FETLParser extends AbstractContentAssistParser {
	
	@Inject
	private FETLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.myFetl.ui.contentassist.antlr.internal.InternalFETLParser createParser() {
		org.xtext.example.myFetl.ui.contentassist.antlr.internal.InternalFETLParser result = new org.xtext.example.myFetl.ui.contentassist.antlr.internal.InternalFETLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getExecutionAccess().getAlternatives(), "rule__Execution__Alternatives");
					put(grammarAccess.getGenericStepAccess().getAlternatives(), "rule__GenericStep__Alternatives");
					put(grammarAccess.getLinkAccess().getAlternatives_0(), "rule__Link__Alternatives_0");
					put(grammarAccess.getFilterComponentAccess().getAlternatives(), "rule__FilterComponent__Alternatives");
					put(grammarAccess.getOnAttributesAccess().getAlternatives_2(), "rule__OnAttributes__Alternatives_2");
					put(grammarAccess.getOnTagsAccess().getAlternatives_3(), "rule__OnTags__Alternatives_3");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getStrategiesAccess().getAlternatives(), "rule__Strategies__Alternatives");
					put(grammarAccess.getOperatorAccess().getAlternatives(), "rule__Operator__Alternatives");
					put(grammarAccess.getTimeUnitAccess().getAlternatives(), "rule__TimeUnit__Alternatives");
					put(grammarAccess.getTimeTypeAccess().getAlternatives(), "rule__TimeType__Alternatives");
					put(grammarAccess.getQuantificatorsAccess().getAlternatives(), "rule__Quantificators__Alternatives");
					put(grammarAccess.getMemoryUnitAccess().getAlternatives(), "rule__MemoryUnit__Alternatives");
					put(grammarAccess.getFileTypeAccess().getAlternatives(), "rule__FileType__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getModelAccess().getGroup_2(), "rule__Model__Group_2__0");
					put(grammarAccess.getPathVariableAccess().getGroup(), "rule__PathVariable__Group__0");
					put(grammarAccess.getPathAccess().getGroup(), "rule__Path__Group__0");
					put(grammarAccess.getPathAccess().getGroup_1(), "rule__Path__Group_1__0");
					put(grammarAccess.getConcreteStepAccess().getGroup(), "rule__ConcreteStep__Group__0");
					put(grammarAccess.getVariableStepAccess().getGroup(), "rule__VariableStep__Group__0");
					put(grammarAccess.getParametrizedStepAccess().getGroup(), "rule__ParametrizedStep__Group__0");
					put(grammarAccess.getSelectionAccess().getGroup(), "rule__Selection__Group__0");
					put(grammarAccess.getSelectionAccess().getGroup_4(), "rule__Selection__Group_4__0");
					put(grammarAccess.getCopyAccess().getGroup(), "rule__Copy__Group__0");
					put(grammarAccess.getCopyAccess().getGroup_5(), "rule__Copy__Group_5__0");
					put(grammarAccess.getMoveAccess().getGroup(), "rule__Move__Group__0");
					put(grammarAccess.getMoveAccess().getGroup_5(), "rule__Move__Group_5__0");
					put(grammarAccess.getDeleteAccess().getGroup(), "rule__Delete__Group__0");
					put(grammarAccess.getFilterContainerAccess().getGroup(), "rule__FilterContainer__Group__0");
					put(grammarAccess.getLinkAccess().getGroup(), "rule__Link__Group__0");
					put(grammarAccess.getOnAttributesAccess().getGroup(), "rule__OnAttributes__Group__0");
					put(grammarAccess.getOnAttributesAccess().getGroup_2_0(), "rule__OnAttributes__Group_2_0__0");
					put(grammarAccess.getOnAttributesAccess().getGroup_2_1(), "rule__OnAttributes__Group_2_1__0");
					put(grammarAccess.getOnTagsAccess().getGroup(), "rule__OnTags__Group__0");
					put(grammarAccess.getOnTagsAccess().getGroup_1(), "rule__OnTags__Group_1__0");
					put(grammarAccess.getOnTagsAccess().getGroup_1_1(), "rule__OnTags__Group_1_1__0");
					put(grammarAccess.getOnTagsAccess().getGroup_3_1(), "rule__OnTags__Group_3_1__0");
					put(grammarAccess.getOnTimeAccess().getGroup(), "rule__OnTime__Group__0");
					put(grammarAccess.getOnSizeAccess().getGroup(), "rule__OnSize__Group__0");
					put(grammarAccess.getOnNameAccess().getGroup(), "rule__OnName__Group__0");
					put(grammarAccess.getOnExtensionAccess().getGroup(), "rule__OnExtension__Group__0");
					put(grammarAccess.getOnExtensionAccess().getGroup_4(), "rule__OnExtension__Group_4__0");
					put(grammarAccess.getOnExtensionAccess().getGroup_4_1(), "rule__OnExtension__Group_4_1__0");
					put(grammarAccess.getIsEmptyAccess().getGroup(), "rule__IsEmpty__Group__0");
					put(grammarAccess.getOnTypeAccess().getGroup(), "rule__OnType__Group__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getModelAccess().getExecutionsAssignment_1(), "rule__Model__ExecutionsAssignment_1");
					put(grammarAccess.getModelAccess().getExecutionsAssignment_2_1(), "rule__Model__ExecutionsAssignment_2_1");
					put(grammarAccess.getPathVariableAccess().getNameAssignment_0(), "rule__PathVariable__NameAssignment_0");
					put(grammarAccess.getPathVariableAccess().getValueAssignment_2(), "rule__PathVariable__ValueAssignment_2");
					put(grammarAccess.getPathAccess().getStepsAssignment_0(), "rule__Path__StepsAssignment_0");
					put(grammarAccess.getPathAccess().getStepsAssignment_1_1(), "rule__Path__StepsAssignment_1_1");
					put(grammarAccess.getConcreteStepAccess().getValueAssignment_0(), "rule__ConcreteStep__ValueAssignment_0");
					put(grammarAccess.getConcreteStepAccess().getAbsoluteAssignment_1(), "rule__ConcreteStep__AbsoluteAssignment_1");
					put(grammarAccess.getVariableStepAccess().getValueAssignment_1(), "rule__VariableStep__ValueAssignment_1");
					put(grammarAccess.getParametrizedStepAccess().getNameAssignment_2(), "rule__ParametrizedStep__NameAssignment_2");
					put(grammarAccess.getSelectionAccess().getNameAssignment_1(), "rule__Selection__NameAssignment_1");
					put(grammarAccess.getSelectionAccess().getFromAssignment_3(), "rule__Selection__FromAssignment_3");
					put(grammarAccess.getSelectionAccess().getWhereAssignment_4_1(), "rule__Selection__WhereAssignment_4_1");
					put(grammarAccess.getCopyAccess().getSourceAssignment_2(), "rule__Copy__SourceAssignment_2");
					put(grammarAccess.getCopyAccess().getDestinationAssignment_4(), "rule__Copy__DestinationAssignment_4");
					put(grammarAccess.getCopyAccess().getStrategyAssignment_5_1(), "rule__Copy__StrategyAssignment_5_1");
					put(grammarAccess.getMoveAccess().getSourceAssignment_2(), "rule__Move__SourceAssignment_2");
					put(grammarAccess.getMoveAccess().getDestinationAssignment_4(), "rule__Move__DestinationAssignment_4");
					put(grammarAccess.getMoveAccess().getStrategyAssignment_5_1(), "rule__Move__StrategyAssignment_5_1");
					put(grammarAccess.getDeleteAccess().getSourceAssignment_2(), "rule__Delete__SourceAssignment_2");
					put(grammarAccess.getFilterContainerAccess().getLinksAssignment_1(), "rule__FilterContainer__LinksAssignment_1");
					put(grammarAccess.getFilterContainerAccess().getLinksAssignment_2(), "rule__FilterContainer__LinksAssignment_2");
					put(grammarAccess.getLinkAccess().getAndAssignment_0_0(), "rule__Link__AndAssignment_0_0");
					put(grammarAccess.getLinkAccess().getOrAssignment_0_1(), "rule__Link__OrAssignment_0_1");
					put(grammarAccess.getLinkAccess().getElementAssignment_1(), "rule__Link__ElementAssignment_1");
					put(grammarAccess.getOnAttributesAccess().getNameAssignment_1(), "rule__OnAttributes__NameAssignment_1");
					put(grammarAccess.getOnAttributesAccess().getInverseAssignment_2_0_0(), "rule__OnAttributes__InverseAssignment_2_0_0");
					put(grammarAccess.getOnAttributesAccess().getInverseAssignment_2_1_1(), "rule__OnAttributes__InverseAssignment_2_1_1");
					put(grammarAccess.getOnAttributesAccess().getValueAssignment_2_1_2(), "rule__OnAttributes__ValueAssignment_2_1_2");
					put(grammarAccess.getOnTagsAccess().getTagsAssignment_1_0(), "rule__OnTags__TagsAssignment_1_0");
					put(grammarAccess.getOnTagsAccess().getTagsAssignment_1_1_1(), "rule__OnTags__TagsAssignment_1_1_1");
					put(grammarAccess.getOnTagsAccess().getQuantificatorAssignment_3_0(), "rule__OnTags__QuantificatorAssignment_3_0");
					put(grammarAccess.getOnTagsAccess().getTresholdAssignment_3_1_0(), "rule__OnTags__TresholdAssignment_3_1_0");
					put(grammarAccess.getOnTagsAccess().getInverseAssignment_4(), "rule__OnTags__InverseAssignment_4");
					put(grammarAccess.getOnTagsAccess().getOnlyAssignment_6(), "rule__OnTags__OnlyAssignment_6");
					put(grammarAccess.getOnTimeAccess().getTimeOfAssignment_0(), "rule__OnTime__TimeOfAssignment_0");
					put(grammarAccess.getOnTimeAccess().getOperatorAssignment_2(), "rule__OnTime__OperatorAssignment_2");
					put(grammarAccess.getOnTimeAccess().getTresholdAssignment_3(), "rule__OnTime__TresholdAssignment_3");
					put(grammarAccess.getOnTimeAccess().getUnitAssignment_4(), "rule__OnTime__UnitAssignment_4");
					put(grammarAccess.getOnSizeAccess().getInverseAssignment_1(), "rule__OnSize__InverseAssignment_1");
					put(grammarAccess.getOnSizeAccess().getOperatorAssignment_2(), "rule__OnSize__OperatorAssignment_2");
					put(grammarAccess.getOnSizeAccess().getTresholdAssignment_3(), "rule__OnSize__TresholdAssignment_3");
					put(grammarAccess.getOnSizeAccess().getUnitAssignment_4(), "rule__OnSize__UnitAssignment_4");
					put(grammarAccess.getOnNameAccess().getInverseAssignment_2(), "rule__OnName__InverseAssignment_2");
					put(grammarAccess.getOnNameAccess().getNameAssignment_3(), "rule__OnName__NameAssignment_3");
					put(grammarAccess.getOnExtensionAccess().getInverseAssignment_2(), "rule__OnExtension__InverseAssignment_2");
					put(grammarAccess.getOnExtensionAccess().getExtensionsAssignment_4_0(), "rule__OnExtension__ExtensionsAssignment_4_0");
					put(grammarAccess.getOnExtensionAccess().getExtensionsAssignment_4_1_1(), "rule__OnExtension__ExtensionsAssignment_4_1_1");
					put(grammarAccess.getIsEmptyAccess().getInverseAssignment_2(), "rule__IsEmpty__InverseAssignment_2");
					put(grammarAccess.getOnTypeAccess().getInverseAssignment_2(), "rule__OnType__InverseAssignment_2");
					put(grammarAccess.getOnTypeAccess().getTypeAssignment_3(), "rule__OnType__TypeAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.myFetl.ui.contentassist.antlr.internal.InternalFETLParser typedParser = (org.xtext.example.myFetl.ui.contentassist.antlr.internal.InternalFETLParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public FETLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FETLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
