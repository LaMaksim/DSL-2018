/**
 */
package FileTransferPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FileTransferPackage.OnAttributes#getName <em>Name</em>}</li>
 *   <li>{@link FileTransferPackage.OnAttributes#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see FileTransferPackage.FileTransferPackagePackage#getOnAttributes()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='attributeFilterRegularName attributeFilterRegularValue'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot attributeFilterRegularName='\n\t\t\tname.matches(\'[a-zA-Z][a-zA-Z0-9]*\')' attributeFilterRegularName$message='\'Must use regular name, starting with letter followed by letters and numbers only\'' attributeFilterRegularValue='\n\t\t\tname.matches(\'[a-zA-Z][a-zA-Z0-9]*\')' attributeFilterRegularValue$message='\'Must use regular name, starting with letter followed by letters and numbers only\''"
 * @generated
 */
public interface OnAttributes extends OnCustom {
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
	 * @see FileTransferPackage.FileTransferPackagePackage#getOnAttributes_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FileTransferPackage.OnAttributes#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see FileTransferPackage.FileTransferPackagePackage#getOnAttributes_Value()
	 * @model unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link FileTransferPackage.OnAttributes#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // OnAttributes
