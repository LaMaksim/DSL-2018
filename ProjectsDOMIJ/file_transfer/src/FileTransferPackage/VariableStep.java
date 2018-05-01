/**
 */
package FileTransferPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FileTransferPackage.VariableStep#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see FileTransferPackage.FileTransferPackagePackage#getVariableStep()
 * @model
 * @generated
 */
public interface VariableStep extends GenericStep {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(PathVariable)
	 * @see FileTransferPackage.FileTransferPackagePackage#getVariableStep_Value()
	 * @model required="true"
	 * @generated
	 */
	PathVariable getValue();

	/**
	 * Sets the value of the '{@link FileTransferPackage.VariableStep#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(PathVariable value);

} // VariableStep
