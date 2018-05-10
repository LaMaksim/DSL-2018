/*
 * 
 */
package er.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import er.diagram.edit.parts.AttributeEditPart;
import er.diagram.edit.parts.EntityEditPart;
import er.diagram.edit.parts.KeyEditPart;
import er.diagram.providers.ErElementTypes;
import er.diagram.providers.ErModelingAssistantProvider;

/**
 * @generated
 */
public class ErModelingAssistantProviderOfEntityEditPart extends
		ErModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ErElementTypes.Key_3004);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((EntityEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(EntityEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ErElementTypes.EntityEntityAttributes_4012);
		types.add(ErElementTypes.EntityPrimaryKey_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((EntityEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			EntityEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof AttributeEditPart) {
			types.add(ErElementTypes.EntityEntityAttributes_4012);
		}
		if (targetEditPart instanceof KeyEditPart) {
			types.add(ErElementTypes.EntityPrimaryKey_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((EntityEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(EntityEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ErElementTypes.EntityEntityAttributes_4012) {
			types.add(ErElementTypes.Attribute_2003);
		} else if (relationshipType == ErElementTypes.EntityPrimaryKey_4001) {
			types.add(ErElementTypes.Key_3004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((EntityEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(EntityEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(ErElementTypes.ISASubtypes_4003);
		types.add(ErElementTypes.CategorisationCategorisedEntity_4005);
		types.add(ErElementTypes.IdentificationDependencyWeakEntity_4006);
		types.add(ErElementTypes.RegularEntityEntity_4007);
		types.add(ErElementTypes.CategoriesEntities_4008);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((EntityEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(EntityEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ErElementTypes.ISASubtypes_4003) {
			types.add(ErElementTypes.ISA_2006);
		} else if (relationshipType == ErElementTypes.CategorisationCategorisedEntity_4005) {
			types.add(ErElementTypes.Categorisation_2007);
		} else if (relationshipType == ErElementTypes.IdentificationDependencyWeakEntity_4006) {
			types.add(ErElementTypes.IdentificationDependency_2008);
		} else if (relationshipType == ErElementTypes.RegularEntityEntity_4007) {
			types.add(ErElementTypes.RegularEntity_3005);
			types.add(ErElementTypes.RegularEntity_3007);
			types.add(ErElementTypes.RegularEntity_3010);
		} else if (relationshipType == ErElementTypes.CategoriesEntities_4008) {
			types.add(ErElementTypes.Categories_3008);
		}
		return types;
	}

}
