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
 *   <li>{@link FileTransferPackage.Link#getCompositonType <em>Compositon Type</em>}</li>
 *   <li>{@link FileTransferPackage.Link#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see FileTransferPackage.FileTransferPackagePackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Compositon Type</b></em>' attribute.
	 * The default value is <code>"and"</code>.
	 * The literals are from the enumeration {@link FileTransferPackage.CompositionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compositon Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compositon Type</em>' attribute.
	 * @see FileTransferPackage.CompositionType
	 * @see #setCompositonType(CompositionType)
	 * @see FileTransferPackage.FileTransferPackagePackage#getLink_CompositonType()
	 * @model default="and" unique="false"
	 * @generated
	 */
	CompositionType getCompositonType();

	/**
	 * Sets the value of the '{@link FileTransferPackage.Link#getCompositonType <em>Compositon Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compositon Type</em>' attribute.
	 * @see FileTransferPackage.CompositionType
	 * @see #getCompositonType()
	 * @generated
	 */
	void setCompositonType(CompositionType value);

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

} // Link
