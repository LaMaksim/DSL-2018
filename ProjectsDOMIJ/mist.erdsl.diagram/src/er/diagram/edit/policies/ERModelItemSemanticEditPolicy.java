/*
 * 
 */
package er.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import er.diagram.edit.commands.AttributeCreateCommand;
import er.diagram.edit.commands.CategorisationCreateCommand;
import er.diagram.edit.commands.DomainCreateCommand;
import er.diagram.edit.commands.EntityCreateCommand;
import er.diagram.edit.commands.GerundCreateCommand;
import er.diagram.edit.commands.ISACreateCommand;
import er.diagram.edit.commands.IdentificationDependencyCreateCommand;
import er.diagram.edit.commands.RelationshipCreateCommand;
import er.diagram.providers.ErElementTypes;

/**
 * @generated
 */
public class ERModelItemSemanticEditPolicy extends ErBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ERModelItemSemanticEditPolicy() {
		super(ErElementTypes.ERModel_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ErElementTypes.Entity_2004 == req.getElementType()) {
			return getGEFWrapper(new EntityCreateCommand(req));
		}
		if (ErElementTypes.Relationship_2005 == req.getElementType()) {
			return getGEFWrapper(new RelationshipCreateCommand(req));
		}
		if (ErElementTypes.ISA_2006 == req.getElementType()) {
			return getGEFWrapper(new ISACreateCommand(req));
		}
		if (ErElementTypes.Categorisation_2007 == req.getElementType()) {
			return getGEFWrapper(new CategorisationCreateCommand(req));
		}
		if (ErElementTypes.IdentificationDependency_2008 == req
				.getElementType()) {
			return getGEFWrapper(new IdentificationDependencyCreateCommand(req));
		}
		if (ErElementTypes.Gerund_2009 == req.getElementType()) {
			return getGEFWrapper(new GerundCreateCommand(req));
		}
		if (ErElementTypes.Domain_2002 == req.getElementType()) {
			return getGEFWrapper(new DomainCreateCommand(req));
		}
		if (ErElementTypes.Attribute_2003 == req.getElementType()) {
			return getGEFWrapper(new AttributeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
