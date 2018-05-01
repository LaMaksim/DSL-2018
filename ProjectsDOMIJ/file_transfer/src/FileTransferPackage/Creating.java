/**
 */
package FileTransferPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Creating</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FileTransferPackage.Creating#getDestination <em>Destination</em>}</li>
 *   <li>{@link FileTransferPackage.Creating#getStrategy <em>Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see FileTransferPackage.FileTransferPackagePackage#getCreating()
 * @model abstract="true"
 * @generated
 */
public interface Creating extends Transformation {
	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(Path)
	 * @see FileTransferPackage.FileTransferPackagePackage#getCreating_Destination()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Path getDestination();

	/**
	 * Sets the value of the '{@link FileTransferPackage.Creating#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Path value);

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link FileTransferPackage.Strategies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' attribute.
	 * @see FileTransferPackage.Strategies
	 * @see #setStrategy(Strategies)
	 * @see FileTransferPackage.FileTransferPackagePackage#getCreating_Strategy()
	 * @model
	 * @generated
	 */
	Strategies getStrategy();

	/**
	 * Sets the value of the '{@link FileTransferPackage.Creating#getStrategy <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' attribute.
	 * @see FileTransferPackage.Strategies
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(Strategies value);

} // Creating
