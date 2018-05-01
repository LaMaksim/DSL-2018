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
 *   <li>{@link FileTransferPackage.FilterLeaf#isTrueFalseSearch <em>True False Search</em>}</li>
 * </ul>
 * </p>
 *
 * @see FileTransferPackage.FileTransferPackagePackage#getFilterLeaf()
 * @model abstract="true"
 * @generated
 */
public interface FilterLeaf extends FilterComponent {
	/**
	 * Returns the value of the '<em><b>True False Search</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>True False Search</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True False Search</em>' attribute.
	 * @see #setTrueFalseSearch(boolean)
	 * @see FileTransferPackage.FileTransferPackagePackage#getFilterLeaf_TrueFalseSearch()
	 * @model default="true"
	 * @generated
	 */
	boolean isTrueFalseSearch();

	/**
	 * Sets the value of the '{@link FileTransferPackage.FilterLeaf#isTrueFalseSearch <em>True False Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True False Search</em>' attribute.
	 * @see #isTrueFalseSearch()
	 * @generated
	 */
	void setTrueFalseSearch(boolean value);

} // FilterLeaf
