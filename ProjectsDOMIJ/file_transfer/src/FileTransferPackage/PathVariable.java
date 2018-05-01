/**
 */
package FileTransferPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FileTransferPackage.PathVariable#getValue <em>Value</em>}</li>
 *   <li>{@link FileTransferPackage.PathVariable#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see FileTransferPackage.FileTransferPackagePackage#getPathVariable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='pathVariableRegularName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot pathVariableRegularName='\n\t\t\tname.matches(\'[a-zA-Z][a-zA-Z0-9]*\')' pathVariableRegularName$message='\'Must use regular name, starting with letter followed by letters and numbers only\''"
 * @generated
 */
public interface PathVariable extends Execution {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Path)
	 * @see FileTransferPackage.FileTransferPackagePackage#getPathVariable_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Path getValue();

	/**
	 * Sets the value of the '{@link FileTransferPackage.PathVariable#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Path value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see FileTransferPackage.FileTransferPackagePackage#getPathVariable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FileTransferPackage.PathVariable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PathVariable
