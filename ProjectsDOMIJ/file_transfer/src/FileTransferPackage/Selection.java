/**
 */
package FileTransferPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FileTransferPackage.Selection#getWhere <em>Where</em>}</li>
 *   <li>{@link FileTransferPackage.Selection#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see FileTransferPackage.FileTransferPackagePackage#getSelection()
 * @model
 * @generated
 */
public interface Selection extends EObject {
	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference list.
	 * The list contents are of type {@link FileTransferPackage.FilterComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference list.
	 * @see FileTransferPackage.FileTransferPackagePackage#getSelection_Where()
	 * @model containment="true"
	 * @generated
	 */
	EList<FilterComponent> getWhere();

	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(Path)
	 * @see FileTransferPackage.FileTransferPackagePackage#getSelection_From()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Path getFrom();

	/**
	 * Sets the value of the '{@link FileTransferPackage.Selection#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Path value);

} // Selection
