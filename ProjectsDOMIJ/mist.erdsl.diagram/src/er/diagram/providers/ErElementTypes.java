/*
 * 
 */
package er.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import er.ErPackage;
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
import er.diagram.edit.parts.EntityPrimaryKeyEditPart;
import er.diagram.edit.parts.GerundEditPart;
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
import er.diagram.part.ErDiagramEditorPlugin;

/**
 * @generated
 */
public class ErElementTypes {

	/**
	 * @generated
	 */
	private ErElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ErDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ERModel_1000 = getElementType("mist.erdsl.diagram.ERModel_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Entity_2004 = getElementType("mist.erdsl.diagram.Entity_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relationship_2005 = getElementType("mist.erdsl.diagram.Relationship_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ISA_2006 = getElementType("mist.erdsl.diagram.ISA_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Categorisation_2007 = getElementType("mist.erdsl.diagram.Categorisation_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IdentificationDependency_2008 = getElementType("mist.erdsl.diagram.IdentificationDependency_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Gerund_2009 = getElementType("mist.erdsl.diagram.Gerund_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Domain_2002 = getElementType("mist.erdsl.diagram.Domain_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_2003 = getElementType("mist.erdsl.diagram.Attribute_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Key_3004 = getElementType("mist.erdsl.diagram.Key_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RegularEntity_3005 = getElementType("mist.erdsl.diagram.RegularEntity_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RegularEntity_3007 = getElementType("mist.erdsl.diagram.RegularEntity_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Categories_3008 = getElementType("mist.erdsl.diagram.Categories_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RegularEntity_3010 = getElementType("mist.erdsl.diagram.RegularEntity_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relationship_3011 = getElementType("mist.erdsl.diagram.Relationship_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntityEntityAttributes_4012 = getElementType("mist.erdsl.diagram.EntityEntityAttributes_4012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntityPrimaryKey_4001 = getElementType("mist.erdsl.diagram.EntityPrimaryKey_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RelationshipRelationshipAttributes_4013 = getElementType("mist.erdsl.diagram.RelationshipRelationshipAttributes_4013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ISASubtypes_4003 = getElementType("mist.erdsl.diagram.ISASubtypes_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ISAClassificationAttribute_4004 = getElementType("mist.erdsl.diagram.ISAClassificationAttribute_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CategorisationCategorisedEntity_4005 = getElementType("mist.erdsl.diagram.CategorisationCategorisedEntity_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IdentificationDependencyWeakEntity_4006 = getElementType("mist.erdsl.diagram.IdentificationDependencyWeakEntity_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RegularEntityEntity_4007 = getElementType("mist.erdsl.diagram.RegularEntityEntity_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CategoriesEntities_4008 = getElementType("mist.erdsl.diagram.CategoriesEntities_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType KeyKeyAttributes_4009 = getElementType("mist.erdsl.diagram.KeyKeyAttributes_4009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AttributeDomainDomain_4011 = getElementType("mist.erdsl.diagram.AttributeDomainDomain_4011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ERModel_1000, ErPackage.eINSTANCE.getERModel());

			elements.put(Entity_2004, ErPackage.eINSTANCE.getEntity());

			elements.put(Relationship_2005,
					ErPackage.eINSTANCE.getRelationship());

			elements.put(ISA_2006, ErPackage.eINSTANCE.getISA());

			elements.put(Categorisation_2007,
					ErPackage.eINSTANCE.getCategorisation());

			elements.put(IdentificationDependency_2008,
					ErPackage.eINSTANCE.getIdentificationDependency());

			elements.put(Gerund_2009, ErPackage.eINSTANCE.getGerund());

			elements.put(Domain_2002, ErPackage.eINSTANCE.getDomain());

			elements.put(Attribute_2003, ErPackage.eINSTANCE.getAttribute());

			elements.put(Key_3004, ErPackage.eINSTANCE.getKey());

			elements.put(RegularEntity_3005,
					ErPackage.eINSTANCE.getRegularEntity());

			elements.put(RegularEntity_3007,
					ErPackage.eINSTANCE.getRegularEntity());

			elements.put(Categories_3008, ErPackage.eINSTANCE.getCategories());

			elements.put(RegularEntity_3010,
					ErPackage.eINSTANCE.getRegularEntity());

			elements.put(Relationship_3011,
					ErPackage.eINSTANCE.getRelationship());

			elements.put(EntityEntityAttributes_4012,
					ErPackage.eINSTANCE.getEntity_EntityAttributes());

			elements.put(EntityPrimaryKey_4001,
					ErPackage.eINSTANCE.getEntity_PrimaryKey());

			elements.put(RelationshipRelationshipAttributes_4013,
					ErPackage.eINSTANCE
							.getRelationship_RelationshipAttributes());

			elements.put(ISASubtypes_4003,
					ErPackage.eINSTANCE.getISA_Subtypes());

			elements.put(ISAClassificationAttribute_4004,
					ErPackage.eINSTANCE.getISA_ClassificationAttribute());

			elements.put(CategorisationCategorisedEntity_4005,
					ErPackage.eINSTANCE.getCategorisation_CategorisedEntity());

			elements.put(IdentificationDependencyWeakEntity_4006,
					ErPackage.eINSTANCE
							.getIdentificationDependency_WeakEntity());

			elements.put(RegularEntityEntity_4007,
					ErPackage.eINSTANCE.getRegularEntity_Entity());

			elements.put(CategoriesEntities_4008,
					ErPackage.eINSTANCE.getCategories_Entities());

			elements.put(KeyKeyAttributes_4009,
					ErPackage.eINSTANCE.getKey_KeyAttributes());

			elements.put(AttributeDomainDomain_4011,
					ErPackage.eINSTANCE.getAttributeDomain_Domain());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ERModel_1000);
			KNOWN_ELEMENT_TYPES.add(Entity_2004);
			KNOWN_ELEMENT_TYPES.add(Relationship_2005);
			KNOWN_ELEMENT_TYPES.add(ISA_2006);
			KNOWN_ELEMENT_TYPES.add(Categorisation_2007);
			KNOWN_ELEMENT_TYPES.add(IdentificationDependency_2008);
			KNOWN_ELEMENT_TYPES.add(Gerund_2009);
			KNOWN_ELEMENT_TYPES.add(Domain_2002);
			KNOWN_ELEMENT_TYPES.add(Attribute_2003);
			KNOWN_ELEMENT_TYPES.add(Key_3004);
			KNOWN_ELEMENT_TYPES.add(RegularEntity_3005);
			KNOWN_ELEMENT_TYPES.add(RegularEntity_3007);
			KNOWN_ELEMENT_TYPES.add(Categories_3008);
			KNOWN_ELEMENT_TYPES.add(RegularEntity_3010);
			KNOWN_ELEMENT_TYPES.add(Relationship_3011);
			KNOWN_ELEMENT_TYPES.add(EntityEntityAttributes_4012);
			KNOWN_ELEMENT_TYPES.add(EntityPrimaryKey_4001);
			KNOWN_ELEMENT_TYPES.add(RelationshipRelationshipAttributes_4013);
			KNOWN_ELEMENT_TYPES.add(ISASubtypes_4003);
			KNOWN_ELEMENT_TYPES.add(ISAClassificationAttribute_4004);
			KNOWN_ELEMENT_TYPES.add(CategorisationCategorisedEntity_4005);
			KNOWN_ELEMENT_TYPES.add(IdentificationDependencyWeakEntity_4006);
			KNOWN_ELEMENT_TYPES.add(RegularEntityEntity_4007);
			KNOWN_ELEMENT_TYPES.add(CategoriesEntities_4008);
			KNOWN_ELEMENT_TYPES.add(KeyKeyAttributes_4009);
			KNOWN_ELEMENT_TYPES.add(AttributeDomainDomain_4011);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ERModelEditPart.VISUAL_ID:
			return ERModel_1000;
		case EntityEditPart.VISUAL_ID:
			return Entity_2004;
		case RelationshipEditPart.VISUAL_ID:
			return Relationship_2005;
		case ISAEditPart.VISUAL_ID:
			return ISA_2006;
		case CategorisationEditPart.VISUAL_ID:
			return Categorisation_2007;
		case IdentificationDependencyEditPart.VISUAL_ID:
			return IdentificationDependency_2008;
		case GerundEditPart.VISUAL_ID:
			return Gerund_2009;
		case DomainEditPart.VISUAL_ID:
			return Domain_2002;
		case AttributeEditPart.VISUAL_ID:
			return Attribute_2003;
		case KeyEditPart.VISUAL_ID:
			return Key_3004;
		case RegularEntityEditPart.VISUAL_ID:
			return RegularEntity_3005;
		case RegularEntity2EditPart.VISUAL_ID:
			return RegularEntity_3007;
		case CategoriesEditPart.VISUAL_ID:
			return Categories_3008;
		case RegularEntity3EditPart.VISUAL_ID:
			return RegularEntity_3010;
		case Relationship2EditPart.VISUAL_ID:
			return Relationship_3011;
		case EntityEntityAttributesEditPart.VISUAL_ID:
			return EntityEntityAttributes_4012;
		case EntityPrimaryKeyEditPart.VISUAL_ID:
			return EntityPrimaryKey_4001;
		case RelationshipRelationshipAttributesEditPart.VISUAL_ID:
			return RelationshipRelationshipAttributes_4013;
		case ISASubtypesEditPart.VISUAL_ID:
			return ISASubtypes_4003;
		case ISAClassificationAttributeEditPart.VISUAL_ID:
			return ISAClassificationAttribute_4004;
		case CategorisationCategorisedEntityEditPart.VISUAL_ID:
			return CategorisationCategorisedEntity_4005;
		case IdentificationDependencyWeakEntityEditPart.VISUAL_ID:
			return IdentificationDependencyWeakEntity_4006;
		case RegularEntityEntityEditPart.VISUAL_ID:
			return RegularEntityEntity_4007;
		case CategoriesEntitiesEditPart.VISUAL_ID:
			return CategoriesEntities_4008;
		case KeyKeyAttributesEditPart.VISUAL_ID:
			return KeyKeyAttributes_4009;
		case AttributeDomainDomainEditPart.VISUAL_ID:
			return AttributeDomainDomain_4011;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return er.diagram.providers.ErElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return er.diagram.providers.ErElementTypes.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return er.diagram.providers.ErElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
