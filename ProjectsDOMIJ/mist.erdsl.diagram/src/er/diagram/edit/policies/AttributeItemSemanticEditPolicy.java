/*
 * 
 */
package er.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import er.diagram.edit.commands.EntityEntityAttributesCreateCommand;
import er.diagram.edit.commands.EntityEntityAttributesReorientCommand;
import er.diagram.edit.commands.ISAClassificationAttributeCreateCommand;
import er.diagram.edit.commands.ISAClassificationAttributeReorientCommand;
import er.diagram.edit.commands.KeyKeyAttributesCreateCommand;
import er.diagram.edit.commands.KeyKeyAttributesReorientCommand;
import er.diagram.edit.commands.RelationshipRelationshipAttributesCreateCommand;
import er.diagram.edit.commands.RelationshipRelationshipAttributesReorientCommand;
import er.diagram.edit.parts.EntityEntityAttributesEditPart;
import er.diagram.edit.parts.ISAClassificationAttributeEditPart;
import er.diagram.edit.parts.KeyKeyAttributesEditPart;
import er.diagram.edit.parts.RelationshipRelationshipAttributesEditPart;
import er.diagram.part.ErVisualIDRegistry;
import er.diagram.providers.ErElementTypes;

/**
 * @generated
 */
public class AttributeItemSemanticEditPolicy extends
		ErBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AttributeItemSemanticEditPolicy() {
		super(ErElementTypes.Attribute_2003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (ErVisualIDRegistry.getVisualID(incomingLink) == EntityEntityAttributesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r) {
					protected CommandResult doExecuteWithResult(
							IProgressMonitor progressMonitor, IAdaptable info)
							throws ExecutionException {
						EObject referencedObject = getReferencedObject();
						Resource resource = referencedObject.eResource();
						CommandResult result = super.doExecuteWithResult(
								progressMonitor, info);
						if (resource != null) {
							resource.getContents().add(referencedObject);
						}
						return result;
					}
				});
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ErVisualIDRegistry.getVisualID(incomingLink) == RelationshipRelationshipAttributesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r) {
					protected CommandResult doExecuteWithResult(
							IProgressMonitor progressMonitor, IAdaptable info)
							throws ExecutionException {
						EObject referencedObject = getReferencedObject();
						Resource resource = referencedObject.eResource();
						CommandResult result = super.doExecuteWithResult(
								progressMonitor, info);
						if (resource != null) {
							resource.getContents().add(referencedObject);
						}
						return result;
					}
				});
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ErVisualIDRegistry.getVisualID(incomingLink) == ISAClassificationAttributeEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ErVisualIDRegistry.getVisualID(incomingLink) == KeyKeyAttributesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ErElementTypes.EntityEntityAttributes_4012 == req.getElementType()) {
			return null;
		}
		if (ErElementTypes.RelationshipRelationshipAttributes_4013 == req
				.getElementType()) {
			return null;
		}
		if (ErElementTypes.ISAClassificationAttribute_4004 == req
				.getElementType()) {
			return null;
		}
		if (ErElementTypes.KeyKeyAttributes_4009 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ErElementTypes.EntityEntityAttributes_4012 == req.getElementType()) {
			return getGEFWrapper(new EntityEntityAttributesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ErElementTypes.RelationshipRelationshipAttributes_4013 == req
				.getElementType()) {
			return getGEFWrapper(new RelationshipRelationshipAttributesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (ErElementTypes.ISAClassificationAttribute_4004 == req
				.getElementType()) {
			return getGEFWrapper(new ISAClassificationAttributeCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (ErElementTypes.KeyKeyAttributes_4009 == req.getElementType()) {
			return getGEFWrapper(new KeyKeyAttributesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case EntityEntityAttributesEditPart.VISUAL_ID:
			return getGEFWrapper(new EntityEntityAttributesReorientCommand(req));
		case RelationshipRelationshipAttributesEditPart.VISUAL_ID:
			return getGEFWrapper(new RelationshipRelationshipAttributesReorientCommand(
					req));
		case ISAClassificationAttributeEditPart.VISUAL_ID:
			return getGEFWrapper(new ISAClassificationAttributeReorientCommand(
					req));
		case KeyKeyAttributesEditPart.VISUAL_ID:
			return getGEFWrapper(new KeyKeyAttributesReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
