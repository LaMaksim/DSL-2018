/**
 */
package FileTransferPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FileTransferPackage.OnName#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see FileTransferPackage.FileTransferPackagePackage#getOnName()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='filterNameRegularName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot filterNameRegularName='\n\t\t\tname.matches(\'[a-zA-Z][a-zA-Z0-9]*\')' filterNameRegularName$message='\'Must use regular name, starting with letter followed by letters and numbers only\''"
 * @generated
 */
public interface OnName extends OnBasic {
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
	 * @see FileTransferPackage.FileTransferPackagePackage#getOnName_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FileTransferPackage.OnName#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // OnName
