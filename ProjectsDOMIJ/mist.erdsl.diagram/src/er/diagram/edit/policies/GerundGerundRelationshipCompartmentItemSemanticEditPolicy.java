/*
 * 
 */
package er.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import er.diagram.edit.commands.Relationship2CreateCommand;
import er.diagram.providers.ErElementTypes;

/**
 * @generated
 */
public class GerundGerundRelationshipCompartmentItemSemanticEditPolicy extends
		ErBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public GerundGerundRelationshipCompartmentItemSemanticEditPolicy() {
		super(ErElementTypes.Gerund_2009);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ErElementTypes.Relationship_3011 == req.getElementType()) {
			return getGEFWrapper(new Relationship2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
