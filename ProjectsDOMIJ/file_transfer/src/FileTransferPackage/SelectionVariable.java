/**
 */
package FileTransferPackage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FileTransferPackage.SelectionVariable#getName <em>Name</em>}</li>
 *   <li>{@link FileTransferPackage.SelectionVariable#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see FileTransferPackage.FileTransferPackagePackage#getSelectionVariable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='selectionVariableRegularName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot selectionVariableRegularName='\n\t\t\tname.matches(\'[a-zA-Z][a-zA-Z0-9]*\')' selectionVariableRegularName$message='\'Must use regular name, starting with letter followed by letters and numbers only\''"
 * @generated
 */
public interface SelectionVariable extends EObject {
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
	 * @see FileTransferPackage.FileTransferPackagePackage#getSelectionVariable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FileTransferPackage.SelectionVariable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Selection)
	 * @see FileTransferPackage.FileTransferPackagePackage#getSelectionVariable_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Selection getValue();

	/**
	 * Sets the value of the '{@link FileTransferPackage.SelectionVariable#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Selection value);

} // SelectionVariable
