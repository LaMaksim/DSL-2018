/**
 */
package FileTransferPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FileTransferPackage.OnType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see FileTransferPackage.FileTransferPackagePackage#getOnType()
 * @model
 * @generated
 */
public interface OnType extends OnBasic {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link FileTransferPackage.FileType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see FileTransferPackage.FileType
	 * @see #setType(FileType)
	 * @see FileTransferPackage.FileTransferPackagePackage#getOnType_Type()
	 * @model unique="false" required="true"
	 * @generated
	 */
	FileType getType();

	/**
	 * Sets the value of the '{@link FileTransferPackage.OnType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see FileTransferPackage.FileType
	 * @see #getType()
	 * @generated
	 */
	void setType(FileType value);

} // OnType
