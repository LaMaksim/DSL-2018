/**
 */
package FileTransferPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FileTransferPackage.OnMeasure#getOperator <em>Operator</em>}</li>
 *   <li>{@link FileTransferPackage.OnMeasure#getTreshold <em>Treshold</em>}</li>
 * </ul>
 * </p>
 *
 * @see FileTransferPackage.FileTransferPackagePackage#getOnMeasure()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='tresholdPositive'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot tresholdPositive='\n\t\t\ttreshold>0' tresholdPositive$message='\'Treshold must be positive\''"
 * @generated
 */
public interface OnMeasure extends FilterLeaf {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link FileTransferPackage.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see FileTransferPackage.Operator
	 * @see #setOperator(Operator)
	 * @see FileTransferPackage.FileTransferPackagePackage#getOnMeasure_Operator()
	 * @model required="true"
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link FileTransferPackage.OnMeasure#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see FileTransferPackage.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

	/**
	 * Returns the value of the '<em><b>Treshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Treshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treshold</em>' attribute.
	 * @see #setTreshold(int)
	 * @see FileTransferPackage.FileTransferPackagePackage#getOnMeasure_Treshold()
	 * @model required="true"
	 * @generated
	 */
	int getTreshold();

	/**
	 * Sets the value of the '{@link FileTransferPackage.OnMeasure#getTreshold <em>Treshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treshold</em>' attribute.
	 * @see #getTreshold()
	 * @generated
	 */
	void setTreshold(int value);

} // OnMeasure
