/*
 * 
 */
package er.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import er.diagram.edit.parts.GerundEditPart;
import er.diagram.providers.ErElementTypes;
import er.diagram.providers.ErModelingAssistantProvider;

/**
 * @generated
 */
public class ErModelingAssistantProviderOfGerundEditPart extends
		ErModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ErElementTypes.Relationship_3011);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((GerundEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(GerundEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ErElementTypes.CategorisationCategorisedEntity_4005);
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
		return doGetTypesForSource((GerundEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(GerundEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ErElementTypes.CategorisationCategorisedEntity_4005) {
			types.add(ErElementTypes.Categorisation_2007);
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
