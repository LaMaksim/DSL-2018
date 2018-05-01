/**
 */
package FileTransferPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FileTransferPackage.Model#getPath_variables <em>Path variables</em>}</li>
 *   <li>{@link FileTransferPackage.Model#getSelection_variables <em>Selection variables</em>}</li>
 *   <li>{@link FileTransferPackage.Model#getTransformations <em>Transformations</em>}</li>
 * </ul>
 * </p>
 *
 * @see FileTransferPackage.FileTransferPackagePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Path variables</b></em>' containment reference list.
	 * The list contents are of type {@link FileTransferPackage.PathVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path variables</em>' containment reference list.
	 * @see FileTransferPackage.FileTransferPackagePackage#getModel_Path_variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<PathVariable> getPath_variables();

	/**
	 * Returns the value of the '<em><b>Selection variables</b></em>' containment reference list.
	 * The list contents are of type {@link FileTransferPackage.SelectionVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection variables</em>' containment reference list.
	 * @see FileTransferPackage.FileTransferPackagePackage#getModel_Selection_variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<SelectionVariable> getSelection_variables();

	/**
	 * Returns the value of the '<em><b>Transformations</b></em>' containment reference list.
	 * The list contents are of type {@link FileTransferPackage.Transformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformations</em>' containment reference list.
	 * @see FileTransferPackage.FileTransferPackagePackage#getModel_Transformations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transformation> getTransformations();

} // Model
