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
 *   <li>{@link FileTransferPackage.Model#getExecutions <em>Executions</em>}</li>
 * </ul>
 * </p>
 *
 * @see FileTransferPackage.FileTransferPackagePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Executions</b></em>' containment reference list.
	 * The list contents are of type {@link FileTransferPackage.Execution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executions</em>' containment reference list.
	 * @see FileTransferPackage.FileTransferPackagePackage#getModel_Executions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Execution> getExecutions();

} // Model
