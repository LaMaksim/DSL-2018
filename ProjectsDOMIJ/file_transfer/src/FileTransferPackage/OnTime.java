/**
 */
package FileTransferPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FileTransferPackage.OnTime#getUnit <em>Unit</em>}</li>
 *   <li>{@link FileTransferPackage.OnTime#getTimeOf <em>Time Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see FileTransferPackage.FileTransferPackagePackage#getOnTime()
 * @model
 * @generated
 */
public interface OnTime extends OnMeasure {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link FileTransferPackage.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see FileTransferPackage.TimeUnit
	 * @see #setUnit(TimeUnit)
	 * @see FileTransferPackage.FileTransferPackagePackage#getOnTime_Unit()
	 * @model required="true"
	 * @generated
	 */
	TimeUnit getUnit();

	/**
	 * Sets the value of the '{@link FileTransferPackage.OnTime#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see FileTransferPackage.TimeUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TimeUnit value);

	/**
	 * Returns the value of the '<em><b>Time Of</b></em>' attribute.
	 * The literals are from the enumeration {@link FileTransferPackage.TimeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Of</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Of</em>' attribute.
	 * @see FileTransferPackage.TimeType
	 * @see #setTimeOf(TimeType)
	 * @see FileTransferPackage.FileTransferPackagePackage#getOnTime_TimeOf()
	 * @model required="true"
	 * @generated
	 */
	TimeType getTimeOf();

	/**
	 * Sets the value of the '{@link FileTransferPackage.OnTime#getTimeOf <em>Time Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Of</em>' attribute.
	 * @see FileTransferPackage.TimeType
	 * @see #getTimeOf()
	 * @generated
	 */
	void setTimeOf(TimeType value);

} // OnTime
