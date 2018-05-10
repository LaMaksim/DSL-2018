/*
 * 
 */
package er.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import er.diagram.edit.parts.AttributeEditPart;
import er.diagram.providers.ErElementTypes;
import er.diagram.providers.ErModelingAssistantProvider;

/**
 * @generated
 */
public class ErModelingAssistantProviderOfAttributeEditPart extends
		ErModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((AttributeEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(AttributeEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(ErElementTypes.EntityEntityAttributes_4012);
		types.add(ErElementTypes.RelationshipRelationshipAttributes_4013);
		types.add(ErElementTypes.ISAClassificationAttribute_4004);
		types.add(ErElementTypes.KeyKeyAttributes_4009);
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
		return doGetTypesForSource((AttributeEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(AttributeEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ErElementTypes.EntityEntityAttributes_4012) {
			types.add(ErElementTypes.Entity_2004);
		} else if (relationshipType == ErElementTypes.RelationshipRelationshipAttributes_4013) {
			types.add(ErElementTypes.Relationship_2005);
			types.add(ErElementTypes.Relationship_3011);
		} else if (relationshipType == ErElementTypes.ISAClassificationAttribute_4004) {
			types.add(ErElementTypes.ISA_2006);
		} else if (relationshipType == ErElementTypes.KeyKeyAttributes_4009) {
			types.add(ErElementTypes.Key_3004);
		}
		return types;
	}

}
