/**
 */
package FileTransferPackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FileTransferPackage.FilterContainer#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see FileTransferPackage.FileTransferPackagePackage#getFilterContainer()
 * @model
 * @generated
 */
public interface FilterContainer extends FilterComponent {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link FileTransferPackage.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see FileTransferPackage.FileTransferPackagePackage#getFilterContainer_Links()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Link> getLinks();

} // FilterContainer
