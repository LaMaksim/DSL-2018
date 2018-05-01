/**
 */
package FileTransferPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FileTransferPackage.Path#getSteps <em>Steps</em>}</li>
 *   <li>{@link FileTransferPackage.Path#isAbsolute <em>Absolute</em>}</li>
 * </ul>
 * </p>
 *
 * @see FileTransferPackage.FileTransferPackagePackage#getPath()
 * @model
 * @generated
 */
public interface Path extends EObject {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link FileTransferPackage.GenericStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see FileTransferPackage.FileTransferPackagePackage#getPath_Steps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GenericStep> getSteps();

	/**
	 * Returns the value of the '<em><b>Absolute</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute</em>' attribute.
	 * @see #setAbsolute(boolean)
	 * @see FileTransferPackage.FileTransferPackagePackage#getPath_Absolute()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isAbsolute();

	/**
	 * Sets the value of the '{@link FileTransferPackage.Path#isAbsolute <em>Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Absolute</em>' attribute.
	 * @see #isAbsolute()
	 * @generated
	 */
	void setAbsolute(boolean value);

} // Path
