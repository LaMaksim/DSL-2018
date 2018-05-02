/**
 */
package FileTransferPackage.impl;

import FileTransferPackage.ConcreteStep;
import FileTransferPackage.FileTransferPackagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FileTransferPackage.impl.ConcreteStepImpl#getValue <em>Value</em>}</li>
 *   <li>{@link FileTransferPackage.impl.ConcreteStepImpl#isAbsolute <em>Absolute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcreteStepImpl extends GenericStepImpl implements ConcreteStep {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = "\"a\"";

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAbsolute() <em>Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbsolute()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSOLUTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbsolute() <em>Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbsolute()
	 * @generated
	 * @ordered
	 */
	protected boolean absolute = ABSOLUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FileTransferPackagePackage.Literals.CONCRETE_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FileTransferPackagePackage.CONCRETE_STEP__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbsolute() {
		return absolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsolute(boolean newAbsolute) {
		boolean oldAbsolute = absolute;
		absolute = newAbsolute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FileTransferPackagePackage.CONCRETE_STEP__ABSOLUTE, oldAbsolute, absolute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FileTransferPackagePackage.CONCRETE_STEP__VALUE:
				return getValue();
			case FileTransferPackagePackage.CONCRETE_STEP__ABSOLUTE:
				return isAbsolute();
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
			case FileTransferPackagePackage.CONCRETE_STEP__VALUE:
				setValue((String)newValue);
				return;
			case FileTransferPackagePackage.CONCRETE_STEP__ABSOLUTE:
				setAbsolute((Boolean)newValue);
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
			case FileTransferPackagePackage.CONCRETE_STEP__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case FileTransferPackagePackage.CONCRETE_STEP__ABSOLUTE:
				setAbsolute(ABSOLUTE_EDEFAULT);
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
			case FileTransferPackagePackage.CONCRETE_STEP__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case FileTransferPackagePackage.CONCRETE_STEP__ABSOLUTE:
				return absolute != ABSOLUTE_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", absolute: ");
		result.append(absolute);
		result.append(')');
		return result.toString();
	}

} //ConcreteStepImpl
