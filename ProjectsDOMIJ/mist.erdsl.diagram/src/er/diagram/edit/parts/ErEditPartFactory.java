/*
 * 
 */
package er.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import er.diagram.part.ErVisualIDRegistry;

/**
 * @generated
 */
public class ErEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ErVisualIDRegistry.getVisualID(view)) {

			case ERModelEditPart.VISUAL_ID:
				return new ERModelEditPart(view);

			case EntityEditPart.VISUAL_ID:
				return new EntityEditPart(view);

			case EntityNameEditPart.VISUAL_ID:
				return new EntityNameEditPart(view);

			case RelationshipEditPart.VISUAL_ID:
				return new RelationshipEditPart(view);

			case RelationshipNameEditPart.VISUAL_ID:
				return new RelationshipNameEditPart(view);

			case ISAEditPart.VISUAL_ID:
				return new ISAEditPart(view);

			case ISANameEditPart.VISUAL_ID:
				return new ISANameEditPart(view);

			case CategorisationEditPart.VISUAL_ID:
				return new CategorisationEditPart(view);

			case CategorisationNameEditPart.VISUAL_ID:
				return new CategorisationNameEditPart(view);

			case IdentificationDependencyEditPart.VISUAL_ID:
				return new IdentificationDependencyEditPart(view);

			case IdentificationDependencyNameEditPart.VISUAL_ID:
				return new IdentificationDependencyNameEditPart(view);

			case GerundEditPart.VISUAL_ID:
				return new GerundEditPart(view);

			case DomainEditPart.VISUAL_ID:
				return new DomainEditPart(view);

			case DomainNameEditPart.VISUAL_ID:
				return new DomainNameEditPart(view);

			case AttributeEditPart.VISUAL_ID:
				return new AttributeEditPart(view);

			case AttributeNameEditPart.VISUAL_ID:
				return new AttributeNameEditPart(view);

			case KeyEditPart.VISUAL_ID:
				return new KeyEditPart(view);

			case KeyNameEditPart.VISUAL_ID:
				return new KeyNameEditPart(view);

			case RegularEntityEditPart.VISUAL_ID:
				return new RegularEntityEditPart(view);

			case RegularEntityMinMaxEditPart.VISUAL_ID:
				return new RegularEntityMinMaxEditPart(view);

			case RegularEntity2EditPart.VISUAL_ID:
				return new RegularEntity2EditPart(view);

			case RegularEntityMinMax2EditPart.VISUAL_ID:
				return new RegularEntityMinMax2EditPart(view);

			case CategoriesEditPart.VISUAL_ID:
				return new CategoriesEditPart(view);

			case CategoriesMinMaxEditPart.VISUAL_ID:
				return new CategoriesMinMaxEditPart(view);

			case RegularEntity3EditPart.VISUAL_ID:
				return new RegularEntity3EditPart(view);

			case RegularEntityMinMax3EditPart.VISUAL_ID:
				return new RegularEntityMinMax3EditPart(view);

			case Relationship2EditPart.VISUAL_ID:
				return new Relationship2EditPart(view);

			case RelationshipName2EditPart.VISUAL_ID:
				return new RelationshipName2EditPart(view);

			case EntityEntityKeySetCompartmentEditPart.VISUAL_ID:
				return new EntityEntityKeySetCompartmentEditPart(view);

			case GerundGerundRelationshipCompartmentEditPart.VISUAL_ID:
				return new GerundGerundRelationshipCompartmentEditPart(view);

			case EntityEntityAttributesEditPart.VISUAL_ID:
				return new EntityEntityAttributesEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case EntityPrimaryKeyEditPart.VISUAL_ID:
				return new EntityPrimaryKeyEditPart(view);

			case EntityPrimaryKeyExternalLabelEditPart.VISUAL_ID:
				return new EntityPrimaryKeyExternalLabelEditPart(view);

			case RelationshipRelationshipAttributesEditPart.VISUAL_ID:
				return new RelationshipRelationshipAttributesEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case ISASubtypesEditPart.VISUAL_ID:
				return new ISASubtypesEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case ISAClassificationAttributeEditPart.VISUAL_ID:
				return new ISAClassificationAttributeEditPart(view);

			case ISAClassificationAttributeExternalLabelEditPart.VISUAL_ID:
				return new ISAClassificationAttributeExternalLabelEditPart(view);

			case CategorisationCategorisedEntityEditPart.VISUAL_ID:
				return new CategorisationCategorisedEntityEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case IdentificationDependencyWeakEntityEditPart.VISUAL_ID:
				return new IdentificationDependencyWeakEntityEditPart(view);

			case IdentificationDependencyWeakEntityExternalLabelEditPart.VISUAL_ID:
				return new IdentificationDependencyWeakEntityExternalLabelEditPart(
						view);

			case RegularEntityEntityEditPart.VISUAL_ID:
				return new RegularEntityEntityEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case CategoriesEntitiesEditPart.VISUAL_ID:
				return new CategoriesEntitiesEditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			case KeyKeyAttributesEditPart.VISUAL_ID:
				return new KeyKeyAttributesEditPart(view);

			case WrappingLabel7EditPart.VISUAL_ID:
				return new WrappingLabel7EditPart(view);

			case AttributeDomainDomainEditPart.VISUAL_ID:
				return new AttributeDomainDomainEditPart(view);

			case WrappingLabel8EditPart.VISUAL_ID:
				return new WrappingLabel8EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
