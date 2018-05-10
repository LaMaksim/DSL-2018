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
public class AttributeDomainDomainItemSemanticEditPolicy extends
		ErBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AttributeDomainDomainItemSemanticEditPolicy() {
		super(ErElementTypes.AttributeDomainDomain_4011);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
