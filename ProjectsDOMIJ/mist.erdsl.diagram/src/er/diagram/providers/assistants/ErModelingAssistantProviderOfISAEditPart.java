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
import er.diagram.edit.parts.ISAEditPart;
import er.diagram.providers.ErElementTypes;
import er.diagram.providers.ErModelingAssistantProvider;

/**
 * @generated
 */
public class ErModelingAssistantProviderOfISAEditPart extends
		ErModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ErElementTypes.RegularEntity_3007);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ISAEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(ISAEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ErElementTypes.ISASubtypes_4003);
		types.add(ErElementTypes.ISAClassificationAttribute_4004);
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
		return doGetRelTypesOnSourceAndTarget((ISAEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			ISAEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof EntityEditPart) {
			types.add(ErElementTypes.ISASubtypes_4003);
		}
		if (targetEditPart instanceof AttributeEditPart) {
			types.add(ErElementTypes.ISAClassificationAttribute_4004);
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
		return doGetTypesForTarget((ISAEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(ISAEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ErElementTypes.ISASubtypes_4003) {
			types.add(ErElementTypes.Entity_2004);
		} else if (relationshipType == ErElementTypes.ISAClassificationAttribute_4004) {
			types.add(ErElementTypes.Attribute_2003);
		}
		return types;
	}

}
