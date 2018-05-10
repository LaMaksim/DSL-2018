/*
 * 
 */
package er.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import er.diagram.providers.ErElementTypes;

/**
 * @generated
 */
public class IdentificationDependencyWeakEntityItemSemanticEditPolicy extends
		ErBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IdentificationDependencyWeakEntityItemSemanticEditPolicy() {
		super(ErElementTypes.IdentificationDependencyWeakEntity_4006);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
