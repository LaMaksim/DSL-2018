/**
 */
package FileTransferPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Leaf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FileTransferPackage.FilterLeaf#isInverse <em>Inverse</em>}</li>
 * </ul>
 * </p>
 *
 * @see FileTransferPackage.FileTransferPackagePackage#getFilterLeaf()
 * @model abstract="true"
 * @generated
 */
public interface FilterLeaf extends FilterComponent {
	/**
	 * Returns the value of the '<em><b>Inverse</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse</em>' attribute.
	 * @see #setInverse(boolean)
	 * @see FileTransferPackage.FileTransferPackagePackage#getFilterLeaf_Inverse()
	 * @model default="false"
	 * @generated
	 */
	boolean isInverse();

	/**
	 * Sets the value of the '{@link FileTransferPackage.FilterLeaf#isInverse <em>Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse</em>' attribute.
	 * @see #isInverse()
	 * @generated
	 */
	void setInverse(boolean value);

} // FilterLeaf
