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
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import er.diagram.edit.commands.CategoriesEntitiesCreateCommand;
import er.diagram.edit.commands.CategoriesEntitiesReorientCommand;
import er.diagram.edit.commands.CategorisationCategorisedEntityCreateCommand;
import er.diagram.edit.commands.CategorisationCategorisedEntityReorientCommand;
import er.diagram.edit.commands.RegularEntityEntityCreateCommand;
import er.diagram.edit.commands.RegularEntityEntityReorientCommand;
import er.diagram.edit.parts.CategoriesEntitiesEditPart;
import er.diagram.edit.parts.CategorisationCategorisedEntityEditPart;
import er.diagram.edit.parts.GerundGerundRelationshipCompartmentEditPart;
import er.diagram.edit.parts.RegularEntityEntityEditPart;
import er.diagram.edit.parts.Relationship2EditPart;
import er.diagram.edit.parts.RelationshipRelationshipAttributesEditPart;
import er.diagram.part.ErVisualIDRegistry;
import er.diagram.providers.ErElementTypes;

/**
 * @generated
 */
public class GerundItemSemanticEditPolicy extends ErBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public GerundItemSemanticEditPolicy() {
		super(ErElementTypes.Gerund_2009);
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
			if (ErVisualIDRegistry.getVisualID(incomingLink) == CategorisationCategorisedEntityEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ErVisualIDRegistry.getVisualID(incomingLink) == RegularEntityEntityEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ErVisualIDRegistry.getVisualID(incomingLink) == CategoriesEntitiesEditPart.VISUAL_ID) {
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
			addDestroyChildNodesCommand(cmd);
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
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (ErVisualIDRegistry.getVisualID(node)) {
			case GerundGerundRelationshipCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (ErVisualIDRegistry.getVisualID(cnode)) {
					case Relationship2EditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (ErVisualIDRegistry.getVisualID(outgoingLink) == RelationshipRelationshipAttributesEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										outgoingLink.getSource().getElement(),
										null, outgoingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r) {
									protected CommandResult doExecuteWithResult(
											IProgressMonitor progressMonitor,
											IAdaptable info)
											throws ExecutionException {
										EObject referencedObject = getReferencedObject();
										Resource resource = referencedObject
												.eResource();
										CommandResult result = super
												.doExecuteWithResult(
														progressMonitor, info);
										if (resource != null) {
											resource.getContents().add(
													referencedObject);
										}
										return result;
									}
								});
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
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
		if (ErElementTypes.CategorisationCategorisedEntity_4005 == req
				.getElementType()) {
			return null;
		}
		if (ErElementTypes.RegularEntityEntity_4007 == req.getElementType()) {
			return null;
		}
		if (ErElementTypes.CategoriesEntities_4008 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ErElementTypes.CategorisationCategorisedEntity_4005 == req
				.getElementType()) {
			return getGEFWrapper(new CategorisationCategorisedEntityCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (ErElementTypes.RegularEntityEntity_4007 == req.getElementType()) {
			return getGEFWrapper(new RegularEntityEntityCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ErElementTypes.CategoriesEntities_4008 == req.getElementType()) {
			return getGEFWrapper(new CategoriesEntitiesCreateCommand(req,
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
		case CategorisationCategorisedEntityEditPart.VISUAL_ID:
			return getGEFWrapper(new CategorisationCategorisedEntityReorientCommand(
					req));
		case RegularEntityEntityEditPart.VISUAL_ID:
			return getGEFWrapper(new RegularEntityEntityReorientCommand(req));
		case CategoriesEntitiesEditPart.VISUAL_ID:
			return getGEFWrapper(new CategoriesEntitiesReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}