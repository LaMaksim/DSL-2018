/**
 */
package FileTransferPackage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FileTransferPackage.Link#getElement <em>Element</em>}</li>
 *   <li>{@link FileTransferPackage.Link#isAnd <em>And</em>}</li>
 *   <li>{@link FileTransferPackage.Link#isOr <em>Or</em>}</li>
 * </ul>
 * </p>
 *
 * @see FileTransferPackage.FileTransferPackagePackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(FilterComponent)
	 * @see FileTransferPackage.FileTransferPackagePackage#getLink_Element()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FilterComponent getElement();

	/**
	 * Sets the value of the '{@link FileTransferPackage.Link#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(FilterComponent value);

	/**
	 * Returns the value of the '<em><b>And</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>And</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' attribute.
	 * @see #setAnd(boolean)
	 * @see FileTransferPackage.FileTransferPackagePackage#getLink_And()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isAnd();

	/**
	 * Sets the value of the '{@link FileTransferPackage.Link#isAnd <em>And</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>And</em>' attribute.
	 * @see #isAnd()
	 * @generated
	 */
	void setAnd(boolean value);

	/**
	 * Returns the value of the '<em><b>Or</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Or</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or</em>' attribute.
	 * @see #setOr(boolean)
	 * @see FileTransferPackage.FileTransferPackagePackage#getLink_Or()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isOr();

	/**
	 * Sets the value of the '{@link FileTransferPackage.Link#isOr <em>Or</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or</em>' attribute.
	 * @see #isOr()
	 * @generated
	 */
	void setOr(boolean value);

} // Link
