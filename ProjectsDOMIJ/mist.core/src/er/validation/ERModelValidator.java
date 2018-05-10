/**
 *
 * $Id$
 */
package er.validation;

import er.Domain;
import er.Entity;
import er.Gerund;
import er.RelationshipConcept;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link er.ERModel}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ERModelValidator {
	boolean validate();

	boolean validateEntities(EList<Entity> value);
	boolean validateRelationships(EList<RelationshipConcept> value);
	boolean validateGerunds(EList<Gerund> value);
	boolean validateDomains(EList<Domain> value);
}