/*
 * 
 */
package er.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import er.ERModel;
import er.ErPackage;
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
import er.diagram.edit.parts.EntityEntityKeySetCompartmentEditPart;
import er.diagram.edit.parts.EntityNameEditPart;
import er.diagram.edit.parts.EntityPrimaryKeyEditPart;
import er.diagram.edit.parts.EntityPrimaryKeyExternalLabelEditPart;
import er.diagram.edit.parts.GerundEditPart;
import er.diagram.edit.parts.GerundGerundRelationshipCompartmentEditPart;
import er.diagram.edit.parts.ISAClassificationAttributeEditPart;
import er.diagram.edit.parts.ISAClassificationAttributeExternalLabelEditPart;
import er.diagram.edit.parts.ISAEditPart;
import er.diagram.edit.parts.ISANameEditPart;
import er.diagram.edit.parts.ISASubtypesEditPart;
import er.diagram.edit.parts.IdentificationDependencyEditPart;
import er.diagram.edit.parts.IdentificationDependencyNameEditPart;
import er.diagram.edit.parts.IdentificationDependencyWeakEntityEditPart;
import er.diagram.edit.parts.IdentificationDependencyWeakEntityExternalLabelEditPart;
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
import er.diagram.edit.parts.WrappingLabel2EditPart;
import er.diagram.edit.parts.WrappingLabel3EditPart;
import er.diagram.edit.parts.WrappingLabel4EditPart;
import er.diagram.edit.parts.WrappingLabel5EditPart;
import er.diagram.edit.parts.WrappingLabel6EditPart;
import er.diagram.edit.parts.WrappingLabel7EditPart;
import er.diagram.edit.parts.WrappingLabel8EditPart;
import er.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ErVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "mist.erdsl.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ERModelEditPart.MODEL_ID.equals(view.getType())) {
				return ERModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return er.diagram.part.ErVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				ErDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ErPackage.eINSTANCE.getERModel().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((ERModel) domainElement)) {
			return ERModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = er.diagram.part.ErVisualIDRegistry
				.getModelID(containerView);
		if (!ERModelEditPart.MODEL_ID.equals(containerModelID)
				&& !"erdsl".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ERModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = er.diagram.part.ErVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ERModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ERModelEditPart.VISUAL_ID:
			if (ErPackage.eINSTANCE.getEntity().isSuperTypeOf(
					domainElement.eClass())) {
				return EntityEditPart.VISUAL_ID;
			}
			if (ErPackage.eINSTANCE.getRelationship().isSuperTypeOf(
					domainElement.eClass())) {
				return RelationshipEditPart.VISUAL_ID;
			}
			if (ErPackage.eINSTANCE.getISA().isSuperTypeOf(
					domainElement.eClass())) {
				return ISAEditPart.VISUAL_ID;
			}
			if (ErPackage.eINSTANCE.getCategorisation().isSuperTypeOf(
					domainElement.eClass())) {
				return CategorisationEditPart.VISUAL_ID;
			}
			if (ErPackage.eINSTANCE.getIdentificationDependency()
					.isSuperTypeOf(domainElement.eClass())) {
				return IdentificationDependencyEditPart.VISUAL_ID;
			}
			if (ErPackage.eINSTANCE.getGerund().isSuperTypeOf(
					domainElement.eClass())) {
				return GerundEditPart.VISUAL_ID;
			}
			if (ErPackage.eINSTANCE.getDomain().isSuperTypeOf(
					domainElement.eClass())) {
				return DomainEditPart.VISUAL_ID;
			}
			if (ErPackage.eINSTANCE.getAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeEditPart.VISUAL_ID;
			}
			break;
		case RelationshipEditPart.VISUAL_ID:
			if (ErPackage.eINSTANCE.getRegularEntity().isSuperTypeOf(
					domainElement.eClass())) {
				return RegularEntityEditPart.VISUAL_ID;
			}
			break;
		case ISAEditPart.VISUAL_ID:
			if (ErPackage.eINSTANCE.getRegularEntity().isSuperTypeOf(
					domainElement.eClass())) {
				return RegularEntity2EditPart.VISUAL_ID;
			}
			break;
		case CategorisationEditPart.VISUAL_ID:
			if (ErPackage.eINSTANCE.getCategories().isSuperTypeOf(
					domainElement.eClass())) {
				return CategoriesEditPart.VISUAL_ID;
			}
			break;
		case IdentificationDependencyEditPart.VISUAL_ID:
			if (ErPackage.eINSTANCE.getRegularEntity().isSuperTypeOf(
					domainElement.eClass())) {
				return RegularEntity3EditPart.VISUAL_ID;
			}
			break;
		case Relationship2EditPart.VISUAL_ID:
			if (ErPackage.eINSTANCE.getRegularEntity().isSuperTypeOf(
					domainElement.eClass())) {
				return RegularEntityEditPart.VISUAL_ID;
			}
			break;
		case EntityEntityKeySetCompartmentEditPart.VISUAL_ID:
			if (ErPackage.eINSTANCE.getKey().isSuperTypeOf(
					domainElement.eClass())) {
				return KeyEditPart.VISUAL_ID;
			}
			break;
		case GerundGerundRelationshipCompartmentEditPart.VISUAL_ID:
			if (ErPackage.eINSTANCE.getRelationship().isSuperTypeOf(
					domainElement.eClass())) {
				return Relationship2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = er.diagram.part.ErVisualIDRegistry
				.getModelID(containerView);
		if (!ERModelEditPart.MODEL_ID.equals(containerModelID)
				&& !"erdsl".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ERModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = er.diagram.part.ErVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ERModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ERModelEditPart.VISUAL_ID:
			if (EntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RelationshipEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ISAEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CategorisationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IdentificationDependencyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GerundEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DomainEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityEditPart.VISUAL_ID:
			if (EntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntityEntityKeySetCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RelationshipEditPart.VISUAL_ID:
			if (RelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RegularEntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ISAEditPart.VISUAL_ID:
			if (ISANameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RegularEntity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CategorisationEditPart.VISUAL_ID:
			if (CategorisationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CategoriesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IdentificationDependencyEditPart.VISUAL_ID:
			if (IdentificationDependencyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RegularEntity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GerundEditPart.VISUAL_ID:
			if (GerundGerundRelationshipCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DomainEditPart.VISUAL_ID:
			if (DomainNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributeEditPart.VISUAL_ID:
			if (AttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KeyEditPart.VISUAL_ID:
			if (KeyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RegularEntityEditPart.VISUAL_ID:
			if (RegularEntityMinMaxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RegularEntity2EditPart.VISUAL_ID:
			if (RegularEntityMinMax2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CategoriesEditPart.VISUAL_ID:
			if (CategoriesMinMaxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RegularEntity3EditPart.VISUAL_ID:
			if (RegularEntityMinMax3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Relationship2EditPart.VISUAL_ID:
			if (RelationshipName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RegularEntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityEntityKeySetCompartmentEditPart.VISUAL_ID:
			if (KeyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GerundGerundRelationshipCompartmentEditPart.VISUAL_ID:
			if (Relationship2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityEntityAttributesEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityPrimaryKeyEditPart.VISUAL_ID:
			if (EntityPrimaryKeyExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RelationshipRelationshipAttributesEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ISASubtypesEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ISAClassificationAttributeEditPart.VISUAL_ID:
			if (ISAClassificationAttributeExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CategorisationCategorisedEntityEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IdentificationDependencyWeakEntityEditPart.VISUAL_ID:
			if (IdentificationDependencyWeakEntityExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RegularEntityEntityEditPart.VISUAL_ID:
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CategoriesEntitiesEditPart.VISUAL_ID:
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KeyKeyAttributesEditPart.VISUAL_ID:
			if (WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributeDomainDomainEditPart.VISUAL_ID:
			if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(ERModel element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case EntityEntityKeySetCompartmentEditPart.VISUAL_ID:
		case GerundGerundRelationshipCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ERModelEditPart.VISUAL_ID:
			return false;
		case DomainEditPart.VISUAL_ID:
		case AttributeEditPart.VISUAL_ID:
		case KeyEditPart.VISUAL_ID:
		case RegularEntityEditPart.VISUAL_ID:
		case RegularEntity2EditPart.VISUAL_ID:
		case CategoriesEditPart.VISUAL_ID:
		case RegularEntity3EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return er.diagram.part.ErVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return er.diagram.part.ErVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return er.diagram.part.ErVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return er.diagram.part.ErVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return er.diagram.part.ErVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return er.diagram.part.ErVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
