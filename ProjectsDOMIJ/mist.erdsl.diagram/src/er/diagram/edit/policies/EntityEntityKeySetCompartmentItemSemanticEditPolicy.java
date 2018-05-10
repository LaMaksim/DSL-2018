/*
 * 
 */
package er.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import er.diagram.edit.commands.KeyCreateCommand;
import er.diagram.providers.ErElementTypes;

/**
 * @generated
 */
public class EntityEntityKeySetCompartmentItemSemanticEditPolicy extends
		ErBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EntityEntityKeySetCompartmentItemSemanticEditPolicy() {
		super(ErElementTypes.Entity_2004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ErElementTypes.Key_3004 == req.getElementType()) {
			return getGEFWrapper(new KeyCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
