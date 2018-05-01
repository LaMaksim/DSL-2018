/**
 */
package FileTransferPackage.impl;

import FileTransferPackage.FileTransferPackagePackage;
import FileTransferPackage.OnTime;
import FileTransferPackage.TimeType;
import FileTransferPackage.TimeUnit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>On Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FileTransferPackage.impl.OnTimeImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link FileTransferPackage.impl.OnTimeImpl#getTimeOf <em>Time Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OnTimeImpl extends OnMeasureImpl implements OnTime {
	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnit UNIT_EDEFAULT = TimeUnit.MIN;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected TimeUnit unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeOf() <em>Time Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOf()
	 * @generated
	 * @ordered
	 */
	protected static final TimeType TIME_OF_EDEFAULT = TimeType.MODIFICATION;

	/**
	 * The cached value of the '{@link #getTimeOf() <em>Time Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOf()
	 * @generated
	 * @ordered
	 */
	protected TimeType timeOf = TIME_OF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FileTransferPackagePackage.Literals.ON_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(TimeUnit newUnit) {
		TimeUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FileTransferPackagePackage.ON_TIME__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeType getTimeOf() {
		return timeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeOf(TimeType newTimeOf) {
		TimeType oldTimeOf = timeOf;
		timeOf = newTimeOf == null ? TIME_OF_EDEFAULT : newTimeOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FileTransferPackagePackage.ON_TIME__TIME_OF, oldTimeOf, timeOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FileTransferPackagePackage.ON_TIME__UNIT:
				return getUnit();
			case FileTransferPackagePackage.ON_TIME__TIME_OF:
				return getTimeOf();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FileTransferPackagePackage.ON_TIME__UNIT:
				setUnit((TimeUnit)newValue);
				return;
			case FileTransferPackagePackage.ON_TIME__TIME_OF:
				setTimeOf((TimeType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FileTransferPackagePackage.ON_TIME__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case FileTransferPackagePackage.ON_TIME__TIME_OF:
				setTimeOf(TIME_OF_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FileTransferPackagePackage.ON_TIME__UNIT:
				return unit != UNIT_EDEFAULT;
			case FileTransferPackagePackage.ON_TIME__TIME_OF:
				return timeOf != TIME_OF_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (unit: ");
		result.append(unit);
		result.append(", timeOf: ");
		result.append(timeOf);
		result.append(')');
		return result.toString();
	}

} //OnTimeImpl
