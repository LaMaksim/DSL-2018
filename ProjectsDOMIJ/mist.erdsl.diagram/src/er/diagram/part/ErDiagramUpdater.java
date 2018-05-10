/*
 * 
 */
package er.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import er.Attribute;
import er.Categories;
import er.Categorisation;
import er.Domain;
import er.ERModel;
import er.Entity;
import er.EntityConcept;
import er.ErPackage;
import er.Gerund;
import er.IdentificationDependency;
import er.Key;
import er.RegularEntity;
import er.Relationship;
import er.RelationshipConcept;
import er.diagram.edit.parts.AttributeDomainDomainEditPart;
import er.diagram.edit.parts.AttributeEditPart;
import er.diagram.edit.parts.CategoriesEditPart;
import er.diagram.edit.parts.CategoriesEntitiesEditPart;
import er.diagram.edit.parts.CategorisationCategorisedEntityEditPart;
import er.diagram.edit.parts.CategorisationEditPart;
import er.diagram.edit.parts.DomainEditPart;
import er.diagram.edit.parts.ERModelEditPart;
import er.diagram.edit.parts.EntityEditPart;
import er.diagram.edit.parts.EntityEntityAttributesEditPart;
import er.diagram.edit.parts.EntityEntityKeySetCompartmentEditPart;
import er.diagram.edit.parts.EntityPrimaryKeyEditPart;
import er.diagram.edit.parts.GerundEditPart;
import er.diagram.edit.parts.GerundGerundRelationshipCompartmentEditPart;
import er.diagram.edit.parts.ISAClassificationAttributeEditPart;
import er.diagram.edit.parts.ISAEditPart;
import er.diagram.edit.parts.ISASubtypesEditPart;
import er.diagram.edit.parts.IdentificationDependencyEditPart;
import er.diagram.edit.parts.IdentificationDependencyWeakEntityEditPart;
import er.diagram.edit.parts.KeyEditPart;
import er.diagram.edit.parts.KeyKeyAttributesEditPart;
import er.diagram.edit.parts.RegularEntity2EditPart;
import er.diagram.edit.parts.RegularEntity3EditPart;
import er.diagram.edit.parts.RegularEntityEditPart;
import er.diagram.edit.parts.RegularEntityEntityEditPart;
import er.diagram.edit.parts.Relationship2EditPart;
import er.diagram.edit.parts.RelationshipEditPart;
import er.diagram.edit.parts.RelationshipRelationshipAttributesEditPart;
import er.diagram.providers.ErElementTypes;

/**
 * @generated
 */
public class ErDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<ErNodeDescriptor> getSemanticChildren(View view) {
		switch (ErVisualIDRegistry.getVisualID(view)) {
		case ERModelEditPart.VISUAL_ID:
			return getERModel_1000SemanticChildren(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_2005SemanticChildren(view);
		case ISAEditPart.VISUAL_ID:
			return getISA_2006SemanticChildren(view);
		case CategorisationEditPart.VISUAL_ID:
			return getCategorisation_2007SemanticChildren(view);
		case IdentificationDependencyEditPart.VISUAL_ID:
			return getIdentificationDependency_2008SemanticChildren(view);
		case Relationship2EditPart.VISUAL_ID:
			return getRelationship_3011SemanticChildren(view);
		case EntityEntityKeySetCompartmentEditPart.VISUAL_ID:
			return getEntityEntityKeySetCompartment_7019SemanticChildren(view);
		case GerundGerundRelationshipCompartmentEditPart.VISUAL_ID:
			return getGerundGerundRelationshipCompartment_7020SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ErNodeDescriptor> getERModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ERModel modelElement = (ERModel) view.getElement();
		LinkedList<ErNodeDescriptor> result = new LinkedList<ErNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEntities().iterator(); it
				.hasNext();) {
			Entity childElement = (Entity) it.next();
			int visualID = ErVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EntityEditPart.VISUAL_ID) {
				result.add(new ErNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRelationships().iterator(); it
				.hasNext();) {
			RelationshipConcept childElement = (RelationshipConcept) it.next();
			int visualID = ErVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RelationshipEditPart.VISUAL_ID) {
				result.add(new ErNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ISAEditPart.VISUAL_ID) {
				result.add(new ErNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CategorisationEditPart.VISUAL_ID) {
				result.add(new ErNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IdentificationDependencyEditPart.VISUAL_ID) {
				result.add(new ErNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getGerunds().iterator(); it
				.hasNext();) {
			Gerund childElement = (Gerund) it.next();
			int visualID = ErVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == GerundEditPart.VISUAL_ID) {
				result.add(new ErNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getDomains().iterator(); it
				.hasNext();) {
			Domain childElement = (Domain) it.next();
			int visualID = ErVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DomainEditPart.VISUAL_ID) {
				result.add(new ErNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		Resource resource = modelElement.eResource();
		for (Iterator<EObject> it = getPhantomNodesIterator(resource); it
				.hasNext();) {
			EObject childElement = it.next();
			if (childElement == modelElement) {
				continue;
			}
			if (ErVisualIDRegistry.getNodeVisualID(view, childElement) == AttributeEditPart.VISUAL_ID) {
				result.add(new ErNodeDescriptor(childElement,
						AttributeEditPart.VISUAL_ID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErNodeDescriptor> getRelationship_2005SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Relationship modelElement = (Relationship) view.getElement();
		LinkedList<ErNodeDescriptor> result = new LinkedList<ErNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEntities().iterator(); it
				.hasNext();) {
			RegularEntity childElement = (RegularEntity) it.next();
			int visualID = ErVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RegularEntityEditPart.VISUAL_ID) {
				result.add(new ErNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErNodeDescriptor> getISA_2006SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		er.ISA modelElement = (er.ISA) view.getElement();
		LinkedList<ErNodeDescriptor> result = new LinkedList<ErNodeDescriptor>();
		{
			RegularEntity childElement = modelElement.getSupertype();
			int visualID = ErVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RegularEntity2EditPart.VISUAL_ID) {
				result.add(new ErNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErNodeDescriptor> getCategorisation_2007SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Categorisation modelElement = (Categorisation) view.getElement();
		LinkedList<ErNodeDescriptor> result = new LinkedList<ErNodeDescriptor>();
		{
			Categories childElement = modelElement.getCategorisationEntities();
			int visualID = ErVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CategoriesEditPart.VISUAL_ID) {
				result.add(new ErNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErNodeDescriptor> getIdentificationDependency_2008SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		IdentificationDependency modelElement = (IdentificationDependency) view
				.getElement();
		LinkedList<ErNodeDescriptor> result = new LinkedList<ErNodeDescriptor>();
		{
			RegularEntity childElement = modelElement.getRegularEntity();
			int visualID = ErVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RegularEntity3EditPart.VISUAL_ID) {
				result.add(new ErNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErNodeDescriptor> getRelationship_3011SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Relationship modelElement = (Relationship) view.getElement();
		LinkedList<ErNodeDescriptor> result = new LinkedList<ErNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEntities().iterator(); it
				.hasNext();) {
			RegularEntity childElement = (RegularEntity) it.next();
			int visualID = ErVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RegularEntityEditPart.VISUAL_ID) {
				result.add(new ErNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErNodeDescriptor> getEntityEntityKeySetCompartment_7019SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Entity modelElement = (Entity) containerView.getElement();
		LinkedList<ErNodeDescriptor> result = new LinkedList<ErNodeDescriptor>();
		for (Iterator<?> it = modelElement.getKeySet().iterator(); it.hasNext();) {
			Key childElement = (Key) it.next();
			int visualID = ErVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == KeyEditPart.VISUAL_ID) {
				result.add(new ErNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErNodeDescriptor> getGerundGerundRelationshipCompartment_7020SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Gerund modelElement = (Gerund) containerView.getElement();
		LinkedList<ErNodeDescriptor> result = new LinkedList<ErNodeDescriptor>();
		{
			Relationship childElement = modelElement.getRelationship();
			int visualID = ErVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Relationship2EditPart.VISUAL_ID) {
				result.add(new ErNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Iterator<EObject> getPhantomNodesIterator(Resource resource) {
		return resource.getAllContents();
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getContainedLinks(View view) {
		switch (ErVisualIDRegistry.getVisualID(view)) {
		case ERModelEditPart.VISUAL_ID:
			return getERModel_1000ContainedLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2004ContainedLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_2005ContainedLinks(view);
		case ISAEditPart.VISUAL_ID:
			return getISA_2006ContainedLinks(view);
		case CategorisationEditPart.VISUAL_ID:
			return getCategorisation_2007ContainedLinks(view);
		case IdentificationDependencyEditPart.VISUAL_ID:
			return getIdentificationDependency_2008ContainedLinks(view);
		case GerundEditPart.VISUAL_ID:
			return getGerund_2009ContainedLinks(view);
		case DomainEditPart.VISUAL_ID:
			return getDomain_2002ContainedLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_2003ContainedLinks(view);
		case KeyEditPart.VISUAL_ID:
			return getKey_3004ContainedLinks(view);
		case RegularEntityEditPart.VISUAL_ID:
			return getRegularEntity_3005ContainedLinks(view);
		case RegularEntity2EditPart.VISUAL_ID:
			return getRegularEntity_3007ContainedLinks(view);
		case CategoriesEditPart.VISUAL_ID:
			return getCategories_3008ContainedLinks(view);
		case RegularEntity3EditPart.VISUAL_ID:
			return getRegularEntity_3010ContainedLinks(view);
		case Relationship2EditPart.VISUAL_ID:
			return getRelationship_3011ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getIncomingLinks(View view) {
		switch (ErVisualIDRegistry.getVisualID(view)) {
		case EntityEditPart.VISUAL_ID:
			return getEntity_2004IncomingLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_2005IncomingLinks(view);
		case ISAEditPart.VISUAL_ID:
			return getISA_2006IncomingLinks(view);
		case CategorisationEditPart.VISUAL_ID:
			return getCategorisation_2007IncomingLinks(view);
		case IdentificationDependencyEditPart.VISUAL_ID:
			return getIdentificationDependency_2008IncomingLinks(view);
		case GerundEditPart.VISUAL_ID:
			return getGerund_2009IncomingLinks(view);
		case DomainEditPart.VISUAL_ID:
			return getDomain_2002IncomingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_2003IncomingLinks(view);
		case KeyEditPart.VISUAL_ID:
			return getKey_3004IncomingLinks(view);
		case RegularEntityEditPart.VISUAL_ID:
			return getRegularEntity_3005IncomingLinks(view);
		case RegularEntity2EditPart.VISUAL_ID:
			return getRegularEntity_3007IncomingLinks(view);
		case CategoriesEditPart.VISUAL_ID:
			return getCategories_3008IncomingLinks(view);
		case RegularEntity3EditPart.VISUAL_ID:
			return getRegularEntity_3010IncomingLinks(view);
		case Relationship2EditPart.VISUAL_ID:
			return getRelationship_3011IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getOutgoingLinks(View view) {
		switch (ErVisualIDRegistry.getVisualID(view)) {
		case EntityEditPart.VISUAL_ID:
			return getEntity_2004OutgoingLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_2005OutgoingLinks(view);
		case ISAEditPart.VISUAL_ID:
			return getISA_2006OutgoingLinks(view);
		case CategorisationEditPart.VISUAL_ID:
			return getCategorisation_2007OutgoingLinks(view);
		case IdentificationDependencyEditPart.VISUAL_ID:
			return getIdentificationDependency_2008OutgoingLinks(view);
		case GerundEditPart.VISUAL_ID:
			return getGerund_2009OutgoingLinks(view);
		case DomainEditPart.VISUAL_ID:
			return getDomain_2002OutgoingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_2003OutgoingLinks(view);
		case KeyEditPart.VISUAL_ID:
			return getKey_3004OutgoingLinks(view);
		case RegularEntityEditPart.VISUAL_ID:
			return getRegularEntity_3005OutgoingLinks(view);
		case RegularEntity2EditPart.VISUAL_ID:
			return getRegularEntity_3007OutgoingLinks(view);
		case CategoriesEditPart.VISUAL_ID:
			return getCategories_3008OutgoingLinks(view);
		case RegularEntity3EditPart.VISUAL_ID:
			return getRegularEntity_3010OutgoingLinks(view);
		case Relationship2EditPart.VISUAL_ID:
			return getRelationship_3011OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getERModel_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getEntity_2004ContainedLinks(View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Entity_EntityAttributes_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Entity_PrimaryKey_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getRelationship_2005ContainedLinks(
			View view) {
		Relationship modelElement = (Relationship) view.getElement();
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_RelationshipAttributes_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getISA_2006ContainedLinks(View view) {
		er.ISA modelElement = (er.ISA) view.getElement();
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ISA_Subtypes_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ISA_ClassificationAttribute_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getCategorisation_2007ContainedLinks(
			View view) {
		Categorisation modelElement = (Categorisation) view.getElement();
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Categorisation_CategorisedEntity_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getIdentificationDependency_2008ContainedLinks(
			View view) {
		IdentificationDependency modelElement = (IdentificationDependency) view
				.getElement();
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_IdentificationDependency_WeakEntity_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getGerund_2009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getDomain_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getAttribute_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getKey_3004ContainedLinks(View view) {
		Key modelElement = (Key) view.getElement();
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Key_KeyAttributes_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getRegularEntity_3005ContainedLinks(
			View view) {
		RegularEntity modelElement = (RegularEntity) view.getElement();
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RegularEntity_Entity_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getRegularEntity_3007ContainedLinks(
			View view) {
		RegularEntity modelElement = (RegularEntity) view.getElement();
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RegularEntity_Entity_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getCategories_3008ContainedLinks(
			View view) {
		Categories modelElement = (Categories) view.getElement();
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Categories_Entities_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getRegularEntity_3010ContainedLinks(
			View view) {
		RegularEntity modelElement = (RegularEntity) view.getElement();
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RegularEntity_Entity_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getRelationship_3011ContainedLinks(
			View view) {
		Relationship modelElement = (Relationship) view.getElement();
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_RelationshipAttributes_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getEntity_2004IncomingLinks(View view) {
		Entity modelElement = (Entity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ISA_Subtypes_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Categorisation_CategorisedEntity_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IdentificationDependency_WeakEntity_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RegularEntity_Entity_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Categories_Entities_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getRelationship_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getISA_2006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getCategorisation_2007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getIdentificationDependency_2008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getGerund_2009IncomingLinks(View view) {
		Gerund modelElement = (Gerund) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Categorisation_CategorisedEntity_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RegularEntity_Entity_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Categories_Entities_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getDomain_2002IncomingLinks(View view) {
		Domain modelElement = (Domain) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_AttributeDomain_Domain_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getAttribute_2003IncomingLinks(
			View view) {
		Attribute modelElement = (Attribute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Entity_EntityAttributes_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Relationship_RelationshipAttributes_4013(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ISA_ClassificationAttribute_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Key_KeyAttributes_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getKey_3004IncomingLinks(View view) {
		Key modelElement = (Key) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Entity_PrimaryKey_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getRegularEntity_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getRegularEntity_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getCategories_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getRegularEntity_3010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getRelationship_3011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getEntity_2004OutgoingLinks(View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Entity_EntityAttributes_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Entity_PrimaryKey_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getRelationship_2005OutgoingLinks(
			View view) {
		Relationship modelElement = (Relationship) view.getElement();
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_RelationshipAttributes_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getISA_2006OutgoingLinks(View view) {
		er.ISA modelElement = (er.ISA) view.getElement();
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ISA_Subtypes_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ISA_ClassificationAttribute_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getCategorisation_2007OutgoingLinks(
			View view) {
		Categorisation modelElement = (Categorisation) view.getElement();
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Categorisation_CategorisedEntity_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getIdentificationDependency_2008OutgoingLinks(
			View view) {
		IdentificationDependency modelElement = (IdentificationDependency) view
				.getElement();
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_IdentificationDependency_WeakEntity_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getGerund_2009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getDomain_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getAttribute_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getKey_3004OutgoingLinks(View view) {
		Key modelElement = (Key) view.getElement();
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Key_KeyAttributes_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getRegularEntity_3005OutgoingLinks(
			View view) {
		RegularEntity modelElement = (RegularEntity) view.getElement();
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RegularEntity_Entity_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getRegularEntity_3007OutgoingLinks(
			View view) {
		RegularEntity modelElement = (RegularEntity) view.getElement();
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RegularEntity_Entity_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getCategories_3008OutgoingLinks(
			View view) {
		Categories modelElement = (Categories) view.getElement();
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Categories_Entities_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getRegularEntity_3010OutgoingLinks(
			View view) {
		RegularEntity modelElement = (RegularEntity) view.getElement();
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RegularEntity_Entity_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ErLinkDescriptor> getRelationship_3011OutgoingLinks(
			View view) {
		Relationship modelElement = (Relationship) view.getElement();
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_RelationshipAttributes_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ErLinkDescriptor> getIncomingFeatureModelFacetLinks_Entity_EntityAttributes_4012(
			Attribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ErPackage.eINSTANCE
					.getEntity_EntityAttributes()) {
				result.add(new ErLinkDescriptor(setting.getEObject(), target,
						ErElementTypes.EntityEntityAttributes_4012,
						EntityEntityAttributesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ErLinkDescriptor> getIncomingFeatureModelFacetLinks_Entity_PrimaryKey_4001(
			Key target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ErPackage.eINSTANCE
					.getEntity_PrimaryKey()) {
				result.add(new ErLinkDescriptor(setting.getEObject(), target,
						ErElementTypes.EntityPrimaryKey_4001,
						EntityPrimaryKeyEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ErLinkDescriptor> getIncomingFeatureModelFacetLinks_Relationship_RelationshipAttributes_4013(
			Attribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ErPackage.eINSTANCE
					.getRelationship_RelationshipAttributes()) {
				result.add(new ErLinkDescriptor(setting.getEObject(), target,
						ErElementTypes.RelationshipRelationshipAttributes_4013,
						RelationshipRelationshipAttributesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ErLinkDescriptor> getIncomingFeatureModelFacetLinks_ISA_Subtypes_4003(
			Entity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ErPackage.eINSTANCE
					.getISA_Subtypes()) {
				result.add(new ErLinkDescriptor(setting.getEObject(), target,
						ErElementTypes.ISASubtypes_4003,
						ISASubtypesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ErLinkDescriptor> getIncomingFeatureModelFacetLinks_ISA_ClassificationAttribute_4004(
			Attribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ErPackage.eINSTANCE
					.getISA_ClassificationAttribute()) {
				result.add(new ErLinkDescriptor(setting.getEObject(), target,
						ErElementTypes.ISAClassificationAttribute_4004,
						ISAClassificationAttributeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ErLinkDescriptor> getIncomingFeatureModelFacetLinks_Categorisation_CategorisedEntity_4005(
			EntityConcept target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ErPackage.eINSTANCE
					.getCategorisation_CategorisedEntity()) {
				result.add(new ErLinkDescriptor(setting.getEObject(), target,
						ErElementTypes.CategorisationCategorisedEntity_4005,
						CategorisationCategorisedEntityEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ErLinkDescriptor> getIncomingFeatureModelFacetLinks_IdentificationDependency_WeakEntity_4006(
			Entity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ErPackage.eINSTANCE
					.getIdentificationDependency_WeakEntity()) {
				result.add(new ErLinkDescriptor(setting.getEObject(), target,
						ErElementTypes.IdentificationDependencyWeakEntity_4006,
						IdentificationDependencyWeakEntityEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ErLinkDescriptor> getIncomingFeatureModelFacetLinks_RegularEntity_Entity_4007(
			EntityConcept target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ErPackage.eINSTANCE
					.getRegularEntity_Entity()) {
				result.add(new ErLinkDescriptor(setting.getEObject(), target,
						ErElementTypes.RegularEntityEntity_4007,
						RegularEntityEntityEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ErLinkDescriptor> getIncomingFeatureModelFacetLinks_Categories_Entities_4008(
			EntityConcept target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ErPackage.eINSTANCE
					.getCategories_Entities()) {
				result.add(new ErLinkDescriptor(setting.getEObject(), target,
						ErElementTypes.CategoriesEntities_4008,
						CategoriesEntitiesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ErLinkDescriptor> getIncomingFeatureModelFacetLinks_Key_KeyAttributes_4009(
			Attribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ErPackage.eINSTANCE
					.getKey_KeyAttributes()) {
				result.add(new ErLinkDescriptor(setting.getEObject(), target,
						ErElementTypes.KeyKeyAttributes_4009,
						KeyKeyAttributesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ErLinkDescriptor> getIncomingFeatureModelFacetLinks_AttributeDomain_Domain_4011(
			Domain target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ErPackage.eINSTANCE
					.getAttributeDomain_Domain()) {
				result.add(new ErLinkDescriptor(setting.getEObject(), target,
						ErElementTypes.AttributeDomainDomain_4011,
						AttributeDomainDomainEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ErLinkDescriptor> getOutgoingFeatureModelFacetLinks_Entity_EntityAttributes_4012(
			Entity source) {
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		for (Iterator<?> destinations = source.getEntityAttributes().iterator(); destinations
				.hasNext();) {
			Attribute destination = (Attribute) destinations.next();
			result.add(new ErLinkDescriptor(source, destination,
					ErElementTypes.EntityEntityAttributes_4012,
					EntityEntityAttributesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ErLinkDescriptor> getOutgoingFeatureModelFacetLinks_Entity_PrimaryKey_4001(
			Entity source) {
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		Key destination = source.getPrimaryKey();
		if (destination == null) {
			return result;
		}
		result.add(new ErLinkDescriptor(source, destination,
				ErElementTypes.EntityPrimaryKey_4001,
				EntityPrimaryKeyEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ErLinkDescriptor> getOutgoingFeatureModelFacetLinks_Relationship_RelationshipAttributes_4013(
			Relationship source) {
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		for (Iterator<?> destinations = source.getRelationshipAttributes()
				.iterator(); destinations.hasNext();) {
			Attribute destination = (Attribute) destinations.next();
			result.add(new ErLinkDescriptor(source, destination,
					ErElementTypes.RelationshipRelationshipAttributes_4013,
					RelationshipRelationshipAttributesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ErLinkDescriptor> getOutgoingFeatureModelFacetLinks_ISA_Subtypes_4003(
			er.ISA source) {
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		for (Iterator<?> destinations = source.getSubtypes().iterator(); destinations
				.hasNext();) {
			Entity destination = (Entity) destinations.next();
			result.add(new ErLinkDescriptor(source, destination,
					ErElementTypes.ISASubtypes_4003,
					ISASubtypesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ErLinkDescriptor> getOutgoingFeatureModelFacetLinks_ISA_ClassificationAttribute_4004(
			er.ISA source) {
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		Attribute destination = source.getClassificationAttribute();
		if (destination == null) {
			return result;
		}
		result.add(new ErLinkDescriptor(source, destination,
				ErElementTypes.ISAClassificationAttribute_4004,
				ISAClassificationAttributeEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ErLinkDescriptor> getOutgoingFeatureModelFacetLinks_Categorisation_CategorisedEntity_4005(
			Categorisation source) {
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		EntityConcept destination = source.getCategorisedEntity();
		if (destination == null) {
			return result;
		}
		result.add(new ErLinkDescriptor(source, destination,
				ErElementTypes.CategorisationCategorisedEntity_4005,
				CategorisationCategorisedEntityEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ErLinkDescriptor> getOutgoingFeatureModelFacetLinks_IdentificationDependency_WeakEntity_4006(
			IdentificationDependency source) {
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		Entity destination = source.getWeakEntity();
		if (destination == null) {
			return result;
		}
		result.add(new ErLinkDescriptor(source, destination,
				ErElementTypes.IdentificationDependencyWeakEntity_4006,
				IdentificationDependencyWeakEntityEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ErLinkDescriptor> getOutgoingFeatureModelFacetLinks_RegularEntity_Entity_4007(
			RegularEntity source) {
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		EntityConcept destination = source.getEntity();
		if (destination == null) {
			return result;
		}
		result.add(new ErLinkDescriptor(source, destination,
				ErElementTypes.RegularEntityEntity_4007,
				RegularEntityEntityEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ErLinkDescriptor> getOutgoingFeatureModelFacetLinks_Categories_Entities_4008(
			Categories source) {
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		for (Iterator<?> destinations = source.getEntities().iterator(); destinations
				.hasNext();) {
			EntityConcept destination = (EntityConcept) destinations.next();
			result.add(new ErLinkDescriptor(source, destination,
					ErElementTypes.CategoriesEntities_4008,
					CategoriesEntitiesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ErLinkDescriptor> getOutgoingFeatureModelFacetLinks_Key_KeyAttributes_4009(
			Key source) {
		LinkedList<ErLinkDescriptor> result = new LinkedList<ErLinkDescriptor>();
		for (Iterator<?> destinations = source.getKeyAttributes().iterator(); destinations
				.hasNext();) {
			Attribute destination = (Attribute) destinations.next();
			result.add(new ErLinkDescriptor(source, destination,
					ErElementTypes.KeyKeyAttributes_4009,
					KeyKeyAttributesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<ErNodeDescriptor> getSemanticChildren(View view) {
			return ErDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ErLinkDescriptor> getContainedLinks(View view) {
			return ErDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ErLinkDescriptor> getIncomingLinks(View view) {
			return ErDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ErLinkDescriptor> getOutgoingLinks(View view) {
			return ErDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
