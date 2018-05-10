/**
 *
 * $Id$
 */
package rdbms.validation;

import rdbms.SystemDataType;

/**
 * A sample validator interface for {@link rdbms.UserDefinedDataType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface UserDefinedDataTypeValidator {
	boolean validate();

	boolean validateDataType(SystemDataType value);
	boolean validatePrecision(int value);
	boolean validateLength(int value);
	boolean validateDefaultValue(String value);
}