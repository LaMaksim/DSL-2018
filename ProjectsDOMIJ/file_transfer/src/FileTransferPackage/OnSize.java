/**
 */
package FileTransferPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FileTransferPackage.OnSize#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see FileTransferPackage.FileTransferPackagePackage#getOnSize()
 * @model
 * @generated
 */
public interface OnSize extends OnMeasure {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link FileTransferPackage.MemoryUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see FileTransferPackage.MemoryUnit
	 * @see #setUnit(MemoryUnit)
	 * @see FileTransferPackage.FileTransferPackagePackage#getOnSize_Unit()
	 * @model unique="false" required="true"
	 * @generated
	 */
	MemoryUnit getUnit();

	/**
	 * Sets the value of the '{@link FileTransferPackage.OnSize#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see FileTransferPackage.MemoryUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(MemoryUnit value);

} // OnSize
