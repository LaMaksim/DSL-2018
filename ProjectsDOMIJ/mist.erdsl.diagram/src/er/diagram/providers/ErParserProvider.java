/*
 * 
 */
package er.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import er.ErPackage;
import er.diagram.edit.parts.AttributeNameEditPart;
import er.diagram.edit.parts.CategoriesMinMaxEditPart;
import er.diagram.edit.parts.CategorisationNameEditPart;
import er.diagram.edit.parts.DomainNameEditPart;
import er.diagram.edit.parts.EntityNameEditPart;
import er.diagram.edit.parts.ISANameEditPart;
import er.diagram.edit.parts.IdentificationDependencyNameEditPart;
import er.diagram.edit.parts.KeyNameEditPart;
import er.diagram.edit.parts.RegularEntityMinMax2EditPart;
import er.diagram.edit.parts.RegularEntityMinMax3EditPart;
import er.diagram.edit.parts.RegularEntityMinMaxEditPart;
import er.diagram.edit.parts.RelationshipName2EditPart;
import er.diagram.edit.parts.RelationshipNameEditPart;
import er.diagram.parsers.MessageFormatParser;
import er.diagram.part.ErVisualIDRegistry;

/**
 * @generated
 */
public class ErParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser entityName_5032Parser;

	/**
	 * @generated
	 */
	private IParser getEntityName_5032Parser() {
		if (entityName_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { ErPackage.eINSTANCE
					.getModellingConcept_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entityName_5032Parser = parser;
		}
		return entityName_5032Parser;
	}

	/**
	 * @generated
	 */
	private IParser relationshipName_5033Parser;

	/**
	 * @generated
	 */
	private IParser getRelationshipName_5033Parser() {
		if (relationshipName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { ErPackage.eINSTANCE
					.getModellingConcept_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			relationshipName_5033Parser = parser;
		}
		return relationshipName_5033Parser;
	}

	/**
	 * @generated
	 */
	private IParser iSAName_5039Parser;

	/**
	 * @generated
	 */
	private IParser getISAName_5039Parser() {
		if (iSAName_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { ErPackage.eINSTANCE
					.getModellingConcept_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			iSAName_5039Parser = parser;
		}
		return iSAName_5039Parser;
	}

	/**
	 * @generated
	 */
	private IParser categorisationName_5040Parser;

	/**
	 * @generated
	 */
	private IParser getCategorisationName_5040Parser() {
		if (categorisationName_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { ErPackage.eINSTANCE
					.getModellingConcept_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			categorisationName_5040Parser = parser;
		}
		return categorisationName_5040Parser;
	}

	/**
	 * @generated
	 */
	private IParser identificationDependencyName_5036Parser;

	/**
	 * @generated
	 */
	private IParser getIdentificationDependencyName_5036Parser() {
		if (identificationDependencyName_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { ErPackage.eINSTANCE
					.getModellingConcept_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			identificationDependencyName_5036Parser = parser;
		}
		return identificationDependencyName_5036Parser;
	}

	/**
	 * @generated
	 */
	private IParser domainName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getDomainName_5016Parser() {
		if (domainName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { ErPackage.eINSTANCE
					.getModellingConcept_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			domainName_5016Parser = parser;
		}
		return domainName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser attributeName_5031Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeName_5031Parser() {
		if (attributeName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { ErPackage.eINSTANCE
					.getModellingConcept_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attributeName_5031Parser = parser;
		}
		return attributeName_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser keyName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getKeyName_5018Parser() {
		if (keyName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { ErPackage.eINSTANCE
					.getModellingConcept_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			keyName_5018Parser = parser;
		}
		return keyName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser regularEntityMinMax_5041Parser;

	/**
	 * @generated
	 */
	private IParser getRegularEntityMinMax_5041Parser() {
		if (regularEntityMinMax_5041Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ErPackage.eINSTANCE.getRegularEntity_Min(),
					ErPackage.eINSTANCE.getRegularEntity_Max() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0},{1})"); //$NON-NLS-1$
			parser.setEditorPattern("({0},{1})"); //$NON-NLS-1$
			parser.setEditPattern("({0},{1})"); //$NON-NLS-1$
			regularEntityMinMax_5041Parser = parser;
		}
		return regularEntityMinMax_5041Parser;
	}

	/**
	 * @generated
	 */
	private IParser regularEntityMinMax_5042Parser;

	/**
	 * @generated
	 */
	private IParser getRegularEntityMinMax_5042Parser() {
		if (regularEntityMinMax_5042Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ErPackage.eINSTANCE.getRegularEntity_Min(),
					ErPackage.eINSTANCE.getRegularEntity_Max() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0},{1})"); //$NON-NLS-1$
			parser.setEditorPattern("({0},{1})"); //$NON-NLS-1$
			parser.setEditPattern("({0},{1})"); //$NON-NLS-1$
			regularEntityMinMax_5042Parser = parser;
		}
		return regularEntityMinMax_5042Parser;
	}

	/**
	 * @generated
	 */
	private IParser categoriesMinMax_5044Parser;

	/**
	 * @generated
	 */
	private IParser getCategoriesMinMax_5044Parser() {
		if (categoriesMinMax_5044Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ErPackage.eINSTANCE.getCategories_Min(),
					ErPackage.eINSTANCE.getCategories_Max() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0},{1})"); //$NON-NLS-1$
			parser.setEditorPattern("({0},{1})"); //$NON-NLS-1$
			parser.setEditPattern("({0},{1})"); //$NON-NLS-1$
			categoriesMinMax_5044Parser = parser;
		}
		return categoriesMinMax_5044Parser;
	}

	/**
	 * @generated
	 */
	private IParser regularEntityMinMax_5043Parser;

	/**
	 * @generated
	 */
	private IParser getRegularEntityMinMax_5043Parser() {
		if (regularEntityMinMax_5043Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ErPackage.eINSTANCE.getRegularEntity_Min(),
					ErPackage.eINSTANCE.getRegularEntity_Max() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0},{1})"); //$NON-NLS-1$
			parser.setEditorPattern("({0},{1})"); //$NON-NLS-1$
			parser.setEditPattern("({0},{1})"); //$NON-NLS-1$
			regularEntityMinMax_5043Parser = parser;
		}
		return regularEntityMinMax_5043Parser;
	}

	/**
	 * @generated
	 */
	private IParser relationshipName_5045Parser;

	/**
	 * @generated
	 */
	private IParser getRelationshipName_5045Parser() {
		if (relationshipName_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { ErPackage.eINSTANCE
					.getModellingConcept_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			relationshipName_5045Parser = parser;
		}
		return relationshipName_5045Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case EntityNameEditPart.VISUAL_ID:
			return getEntityName_5032Parser();
		case RelationshipNameEditPart.VISUAL_ID:
			return getRelationshipName_5033Parser();
		case ISANameEditPart.VISUAL_ID:
			return getISAName_5039Parser();
		case CategorisationNameEditPart.VISUAL_ID:
			return getCategorisationName_5040Parser();
		case IdentificationDependencyNameEditPart.VISUAL_ID:
			return getIdentificationDependencyName_5036Parser();
		case DomainNameEditPart.VISUAL_ID:
			return getDomainName_5016Parser();
		case AttributeNameEditPart.VISUAL_ID:
			return getAttributeName_5031Parser();
		case KeyNameEditPart.VISUAL_ID:
			return getKeyName_5018Parser();
		case RegularEntityMinMaxEditPart.VISUAL_ID:
			return getRegularEntityMinMax_5041Parser();
		case RegularEntityMinMax2EditPart.VISUAL_ID:
			return getRegularEntityMinMax_5042Parser();
		case CategoriesMinMaxEditPart.VISUAL_ID:
			return getCategoriesMinMax_5044Parser();
		case RegularEntityMinMax3EditPart.VISUAL_ID:
			return getRegularEntityMinMax_5043Parser();
		case RelationshipName2EditPart.VISUAL_ID:
			return getRelationshipName_5045Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ErVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ErVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ErElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
