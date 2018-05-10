/*
 * 
 */
package er.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import er.ERModel;
import er.diagram.edit.parts.AttributeDomainDomainEditPart;
import er.diagram.edit.parts.AttributeEditPart;
import er.diagram.edit.parts.AttributeNameEditPart;
import er.diagram.edit.parts.CategoriesEditPart;
import er.diagram.edit.parts.CategoriesEntitiesEditPart;
import er.diagram.edit.parts.CategoriesMinMaxEditPart;
import er.diagram.edit.parts.CategorisationCategorisedEntityEditPart;
import er.diagram.edit.parts.CategorisationEditPart;
import er.diagram.edit.parts.CategorisationNameEditPart;
import er.diagram.edit.parts.DomainEditPart;
import er.diagram.edit.parts.DomainNameEditPart;
import er.diagram.edit.parts.ERModelEditPart;
import er.diagram.edit.parts.EntityEditPart;
import er.diagram.edit.parts.EntityEntityAttributesEditPart;
import er.diagram.edit.parts.EntityNameEditPart;
import er.diagram.edit.parts.EntityPrimaryKeyEditPart;
import er.diagram.edit.parts.GerundEditPart;
import er.diagram.edit.parts.ISAClassificationAttributeEditPart;
import er.diagram.edit.parts.ISAEditPart;
import er.diagram.edit.parts.ISANameEditPart;
import er.diagram.edit.parts.ISASubtypesEditPart;
import er.diagram.edit.parts.IdentificationDependencyEditPart;
import er.diagram.edit.parts.IdentificationDependencyNameEditPart;
import er.diagram.edit.parts.IdentificationDependencyWeakEntityEditPart;
import er.diagram.edit.parts.KeyEditPart;
import er.diagram.edit.parts.KeyKeyAttributesEditPart;
import er.diagram.edit.parts.KeyNameEditPart;
import er.diagram.edit.parts.RegularEntity2EditPart;
import er.diagram.edit.parts.RegularEntity3EditPart;
import er.diagram.edit.parts.RegularEntityEditPart;
import er.diagram.edit.parts.RegularEntityEntityEditPart;
import er.diagram.edit.parts.RegularEntityMinMax2EditPart;
import er.diagram.edit.parts.RegularEntityMinMax3EditPart;
import er.diagram.edit.parts.RegularEntityMinMaxEditPart;
import er.diagram.edit.parts.Relationship2EditPart;
import er.diagram.edit.parts.RelationshipEditPart;
import er.diagram.edit.parts.RelationshipName2EditPart;
import er.diagram.edit.parts.RelationshipNameEditPart;
import er.diagram.edit.parts.RelationshipRelationshipAttributesEditPart;
import er.diagram.part.ErDiagramEditorPlugin;
import er.diagram.part.ErVisualIDRegistry;
import er.diagram.providers.ErElementTypes;
import er.diagram.providers.ErParserProvider;

/**
 * @generated
 */
public class ErNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ErDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ErDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ErNavigatorItem
				&& !isOwnView(((ErNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ErNavigatorGroup) {
			ErNavigatorGroup group = (ErNavigatorGroup) element;
			return ErDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof ErNavigatorItem) {
			ErNavigatorItem navigatorItem = (ErNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (ErVisualIDRegistry.getVisualID(view)) {
		case ERModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.example.org/er?ERModel", ErElementTypes.ERModel_1000); //$NON-NLS-1$
		case DomainEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org/er?Domain", ErElementTypes.Domain_2002); //$NON-NLS-1$
		case AttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org/er?Attribute", ErElementTypes.Attribute_2003); //$NON-NLS-1$
		case EntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org/er?Entity", ErElementTypes.Entity_2004); //$NON-NLS-1$
		case RelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org/er?Relationship", ErElementTypes.Relationship_2005); //$NON-NLS-1$
		case ISAEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org/er?ISA", ErElementTypes.ISA_2006); //$NON-NLS-1$
		case CategorisationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org/er?Categorisation", ErElementTypes.Categorisation_2007); //$NON-NLS-1$
		case IdentificationDependencyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org/er?IdentificationDependency", ErElementTypes.IdentificationDependency_2008); //$NON-NLS-1$
		case GerundEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org/er?Gerund", ErElementTypes.Gerund_2009); //$NON-NLS-1$
		case KeyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org/er?Key", ErElementTypes.Key_3004); //$NON-NLS-1$
		case RegularEntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org/er?RegularEntity", ErElementTypes.RegularEntity_3005); //$NON-NLS-1$
		case RegularEntity2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org/er?RegularEntity", ErElementTypes.RegularEntity_3007); //$NON-NLS-1$
		case CategoriesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org/er?Categories", ErElementTypes.Categories_3008); //$NON-NLS-1$
		case RegularEntity3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org/er?RegularEntity", ErElementTypes.RegularEntity_3010); //$NON-NLS-1$
		case Relationship2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.example.org/er?Relationship", ErElementTypes.Relationship_3011); //$NON-NLS-1$
		case EntityPrimaryKeyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.example.org/er?Entity?primaryKey", ErElementTypes.EntityPrimaryKey_4001); //$NON-NLS-1$
		case ISASubtypesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.example.org/er?ISA?subtypes", ErElementTypes.ISASubtypes_4003); //$NON-NLS-1$
		case ISAClassificationAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.example.org/er?ISA?classificationAttribute", ErElementTypes.ISAClassificationAttribute_4004); //$NON-NLS-1$
		case CategorisationCategorisedEntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.example.org/er?Categorisation?categorisedEntity", ErElementTypes.CategorisationCategorisedEntity_4005); //$NON-NLS-1$
		case IdentificationDependencyWeakEntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.example.org/er?IdentificationDependency?weakEntity", ErElementTypes.IdentificationDependencyWeakEntity_4006); //$NON-NLS-1$
		case RegularEntityEntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.example.org/er?RegularEntity?entity", ErElementTypes.RegularEntityEntity_4007); //$NON-NLS-1$
		case CategoriesEntitiesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.example.org/er?Categories?entities", ErElementTypes.CategoriesEntities_4008); //$NON-NLS-1$
		case KeyKeyAttributesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.example.org/er?Key?keyAttributes", ErElementTypes.KeyKeyAttributes_4009); //$NON-NLS-1$
		case AttributeDomainDomainEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.example.org/er?AttributeDomain?domain", ErElementTypes.AttributeDomainDomain_4011); //$NON-NLS-1$
		case EntityEntityAttributesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.example.org/er?Entity?entityAttributes", ErElementTypes.EntityEntityAttributes_4012); //$NON-NLS-1$
		case RelationshipRelationshipAttributesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.example.org/er?Relationship?relationshipAttributes", ErElementTypes.RelationshipRelationshipAttributes_4013); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ErDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ErElementTypes.isKnownElementType(elementType)) {
			image = ErElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof ErNavigatorGroup) {
			ErNavigatorGroup group = (ErNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ErNavigatorItem) {
			ErNavigatorItem navigatorItem = (ErNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ErVisualIDRegistry.getVisualID(view)) {
		case ERModelEditPart.VISUAL_ID:
			return getERModel_1000Text(view);
		case DomainEditPart.VISUAL_ID:
			return getDomain_2002Text(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_2003Text(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2004Text(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_2005Text(view);
		case ISAEditPart.VISUAL_ID:
			return getISA_2006Text(view);
		case CategorisationEditPart.VISUAL_ID:
			return getCategorisation_2007Text(view);
		case IdentificationDependencyEditPart.VISUAL_ID:
			return getIdentificationDependency_2008Text(view);
		case GerundEditPart.VISUAL_ID:
			return getGerund_2009Text(view);
		case KeyEditPart.VISUAL_ID:
			return getKey_3004Text(view);
		case RegularEntityEditPart.VISUAL_ID:
			return getRegularEntity_3005Text(view);
		case RegularEntity2EditPart.VISUAL_ID:
			return getRegularEntity_3007Text(view);
		case CategoriesEditPart.VISUAL_ID:
			return getCategories_3008Text(view);
		case RegularEntity3EditPart.VISUAL_ID:
			return getRegularEntity_3010Text(view);
		case Relationship2EditPart.VISUAL_ID:
			return getRelationship_3011Text(view);
		case EntityPrimaryKeyEditPart.VISUAL_ID:
			return getEntityPrimaryKey_4001Text(view);
		case ISASubtypesEditPart.VISUAL_ID:
			return getISASubtypes_4003Text(view);
		case ISAClassificationAttributeEditPart.VISUAL_ID:
			return getISAClassificationAttribute_4004Text(view);
		case CategorisationCategorisedEntityEditPart.VISUAL_ID:
			return getCategorisationCategorisedEntity_4005Text(view);
		case IdentificationDependencyWeakEntityEditPart.VISUAL_ID:
			return getIdentificationDependencyWeakEntity_4006Text(view);
		case RegularEntityEntityEditPart.VISUAL_ID:
			return getRegularEntityEntity_4007Text(view);
		case CategoriesEntitiesEditPart.VISUAL_ID:
			return getCategoriesEntities_4008Text(view);
		case KeyKeyAttributesEditPart.VISUAL_ID:
			return getKeyKeyAttributes_4009Text(view);
		case AttributeDomainDomainEditPart.VISUAL_ID:
			return getAttributeDomainDomain_4011Text(view);
		case EntityEntityAttributesEditPart.VISUAL_ID:
			return getEntityEntityAttributes_4012Text(view);
		case RelationshipRelationshipAttributesEditPart.VISUAL_ID:
			return getRelationshipRelationshipAttributes_4013Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getERModel_1000Text(View view) {
		ERModel domainModelElement = (ERModel) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDomain_2002Text(View view) {
		IParser parser = ErParserProvider.getParser(ErElementTypes.Domain_2002,
				view.getElement() != null ? view.getElement() : view,
				ErVisualIDRegistry.getType(DomainNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttribute_2003Text(View view) {
		IParser parser = ErParserProvider.getParser(
				ErElementTypes.Attribute_2003,
				view.getElement() != null ? view.getElement() : view,
				ErVisualIDRegistry.getType(AttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntity_2004Text(View view) {
		IParser parser = ErParserProvider.getParser(ErElementTypes.Entity_2004,
				view.getElement() != null ? view.getElement() : view,
				ErVisualIDRegistry.getType(EntityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationship_2005Text(View view) {
		IParser parser = ErParserProvider.getParser(
				ErElementTypes.Relationship_2005,
				view.getElement() != null ? view.getElement() : view,
				ErVisualIDRegistry.getType(RelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getISA_2006Text(View view) {
		IParser parser = ErParserProvider.getParser(ErElementTypes.ISA_2006,
				view.getElement() != null ? view.getElement() : view,
				ErVisualIDRegistry.getType(ISANameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCategorisation_2007Text(View view) {
		IParser parser = ErParserProvider.getParser(
				ErElementTypes.Categorisation_2007,
				view.getElement() != null ? view.getElement() : view,
				ErVisualIDRegistry
						.getType(CategorisationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIdentificationDependency_2008Text(View view) {
		IParser parser = ErParserProvider
				.getParser(
						ErElementTypes.IdentificationDependency_2008,
						view.getElement() != null ? view.getElement() : view,
						ErVisualIDRegistry
								.getType(IdentificationDependencyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGerund_2009Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getKey_3004Text(View view) {
		IParser parser = ErParserProvider.getParser(ErElementTypes.Key_3004,
				view.getElement() != null ? view.getElement() : view,
				ErVisualIDRegistry.getType(KeyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRegularEntity_3005Text(View view) {
		IParser parser = ErParserProvider.getParser(
				ErElementTypes.RegularEntity_3005,
				view.getElement() != null ? view.getElement() : view,
				ErVisualIDRegistry
						.getType(RegularEntityMinMaxEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRegularEntity_3007Text(View view) {
		IParser parser = ErParserProvider.getParser(
				ErElementTypes.RegularEntity_3007,
				view.getElement() != null ? view.getElement() : view,
				ErVisualIDRegistry
						.getType(RegularEntityMinMax2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCategories_3008Text(View view) {
		IParser parser = ErParserProvider.getParser(
				ErElementTypes.Categories_3008,
				view.getElement() != null ? view.getElement() : view,
				ErVisualIDRegistry.getType(CategoriesMinMaxEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRegularEntity_3010Text(View view) {
		IParser parser = ErParserProvider.getParser(
				ErElementTypes.RegularEntity_3010,
				view.getElement() != null ? view.getElement() : view,
				ErVisualIDRegistry
						.getType(RegularEntityMinMax3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationship_3011Text(View view) {
		IParser parser = ErParserProvider
				.getParser(ErElementTypes.Relationship_3011,
						view.getElement() != null ? view.getElement() : view,
						ErVisualIDRegistry
								.getType(RelationshipName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntityPrimaryKey_4001Text(View view) {
		IParser parser = ErParserProvider.getParser(
				ErElementTypes.EntityPrimaryKey_4001,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getISASubtypes_4003Text(View view) {
		IParser parser = ErParserProvider.getParser(
				ErElementTypes.ISASubtypes_4003,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getISAClassificationAttribute_4004Text(View view) {
		IParser parser = ErParserProvider.getParser(
				ErElementTypes.ISAClassificationAttribute_4004,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCategorisationCategorisedEntity_4005Text(View view) {
		IParser parser = ErParserProvider.getParser(
				ErElementTypes.CategorisationCategorisedEntity_4005,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIdentificationDependencyWeakEntity_4006Text(View view) {
		IParser parser = ErParserProvider.getParser(
				ErElementTypes.IdentificationDependencyWeakEntity_4006,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRegularEntityEntity_4007Text(View view) {
		IParser parser = ErParserProvider.getParser(
				ErElementTypes.RegularEntityEntity_4007,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCategoriesEntities_4008Text(View view) {
		IParser parser = ErParserProvider.getParser(
				ErElementTypes.CategoriesEntities_4008,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getKeyKeyAttributes_4009Text(View view) {
		IParser parser = ErParserProvider.getParser(
				ErElementTypes.KeyKeyAttributes_4009,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttributeDomainDomain_4011Text(View view) {
		IParser parser = ErParserProvider.getParser(
				ErElementTypes.AttributeDomainDomain_4011,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntityEntityAttributes_4012Text(View view) {
		IParser parser = ErParserProvider.getParser(
				ErElementTypes.EntityEntityAttributes_4012,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationshipRelationshipAttributes_4013Text(View view) {
		IParser parser = ErParserProvider.getParser(
				ErElementTypes.RelationshipRelationshipAttributes_4013,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ErDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ERModelEditPart.MODEL_ID.equals(ErVisualIDRegistry
				.getModelID(view));
	}

}
