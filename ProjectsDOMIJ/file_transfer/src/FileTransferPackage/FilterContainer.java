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
 *   <li>{@link FileTransferPackage.FilterContainer#getSegments <em>Segments</em>}</li>
 *   <li>{@link FileTransferPackage.FilterContainer#getCompositionType <em>Composition Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see FileTransferPackage.FileTransferPackagePackage#getFilterContainer()
 * @model
 * @generated
 */
public interface FilterContainer extends FilterComponent {
	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link FileTransferPackage.FilterComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see FileTransferPackage.FileTransferPackagePackage#getFilterContainer_Segments()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<FilterComponent> getSegments();

	/**
	 * Returns the value of the '<em><b>Composition Type</b></em>' attribute.
	 * The literals are from the enumeration {@link FileTransferPackage.CompositionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition Type</em>' attribute.
	 * @see FileTransferPackage.CompositionType
	 * @see #setCompositionType(CompositionType)
	 * @see FileTransferPackage.FileTransferPackagePackage#getFilterContainer_CompositionType()
	 * @model unique="false"
	 * @generated
	 */
	CompositionType getCompositionType();

	/**
	 * Sets the value of the '{@link FileTransferPackage.FilterContainer#getCompositionType <em>Composition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composition Type</em>' attribute.
	 * @see FileTransferPackage.CompositionType
	 * @see #getCompositionType()
	 * @generated
	 */
	void setCompositionType(CompositionType value);

} // FilterContainer
