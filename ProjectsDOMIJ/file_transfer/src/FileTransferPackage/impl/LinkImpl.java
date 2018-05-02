/**
 */
package FileTransferPackage.impl;

import FileTransferPackage.FileTransferPackagePackage;
import FileTransferPackage.FilterComponent;
import FileTransferPackage.Link;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FileTransferPackage.impl.LinkImpl#getElement <em>Element</em>}</li>
 *   <li>{@link FileTransferPackage.impl.LinkImpl#isAnd <em>And</em>}</li>
 *   <li>{@link FileTransferPackage.impl.LinkImpl#isOr <em>Or</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends MinimalEObjectImpl.Container implements Link {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected FilterComponent element;

	/**
	 * The default value of the '{@link #isAnd() <em>And</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnd() <em>And</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnd()
	 * @generated
	 * @ordered
	 */
	protected boolean and = AND_EDEFAULT;

	/**
	 * The default value of the '{@link #isOr() <em>Or</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOr() <em>Or</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOr()
	 * @generated
	 * @ordered
	 */
	protected boolean or = OR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FileTransferPackagePackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterComponent getElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(FilterComponent newElement, NotificationChain msgs) {
		FilterComponent oldElement = element;
		element = newElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FileTransferPackagePackage.LINK__ELEMENT, oldElement, newElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(FilterComponent newElement) {
		if (newElement != element) {
			NotificationChain msgs = null;
			if (element != null)
				msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FileTransferPackagePackage.LINK__ELEMENT, null, msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FileTransferPackagePackage.LINK__ELEMENT, null, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FileTransferPackagePackage.LINK__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnd() {
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnd(boolean newAnd) {
		boolean oldAnd = and;
		and = newAnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FileTransferPackagePackage.LINK__AND, oldAnd, and));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOr() {
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOr(boolean newOr) {
		boolean oldOr = or;
		or = newOr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FileTransferPackagePackage.LINK__OR, oldOr, or));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FileTransferPackagePackage.LINK__ELEMENT:
				return basicSetElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FileTransferPackagePackage.LINK__ELEMENT:
				return getElement();
			case FileTransferPackagePackage.LINK__AND:
				return isAnd();
			case FileTransferPackagePackage.LINK__OR:
				return isOr();
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
			case FileTransferPackagePackage.LINK__ELEMENT:
				setElement((FilterComponent)newValue);
				return;
			case FileTransferPackagePackage.LINK__AND:
				setAnd((Boolean)newValue);
				return;
			case FileTransferPackagePackage.LINK__OR:
				setOr((Boolean)newValue);
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
			case FileTransferPackagePackage.LINK__ELEMENT:
				setElement((FilterComponent)null);
				return;
			case FileTransferPackagePackage.LINK__AND:
				setAnd(AND_EDEFAULT);
				return;
			case FileTransferPackagePackage.LINK__OR:
				setOr(OR_EDEFAULT);
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
			case FileTransferPackagePackage.LINK__ELEMENT:
				return element != null;
			case FileTransferPackagePackage.LINK__AND:
				return and != AND_EDEFAULT;
			case FileTransferPackagePackage.LINK__OR:
				return or != OR_EDEFAULT;
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
		result.append(" (and: ");
		result.append(and);
		result.append(", or: ");
		result.append(or);
		result.append(')');
		return result.toString();
	}

} //LinkImpl
