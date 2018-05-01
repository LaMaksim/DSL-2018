/**
 */
package FileTransferPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FileTransferPackage.ConcreteStep#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see FileTransferPackage.FileTransferPackagePackage#getConcreteStep()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='dontContainsParametrizedVariable'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot dontContainsParametrizedVariable='\n\t\t\tnot value.matches(\'.*\\\\{\\\\$.\\\\}*.*\')' dontContainsParametrizedVariable$message='\'Concrete step can\\\'t hold parametrized variable\''"
 * @generated
 */
public interface ConcreteStep extends GenericStep {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"\"a\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see FileTransferPackage.FileTransferPackagePackage#getConcreteStep_Value()
	 * @model default="\"a\"" required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link FileTransferPackage.ConcreteStep#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ConcreteStep
