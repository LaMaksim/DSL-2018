/**
 */
package FileTransferPackage.impl;

import FileTransferPackage.FileTransferPackagePackage;
import FileTransferPackage.OnTags;
import FileTransferPackage.Quantificators;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>On Tags</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FileTransferPackage.impl.OnTagsImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link FileTransferPackage.impl.OnTagsImpl#isOnly <em>Only</em>}</li>
 *   <li>{@link FileTransferPackage.impl.OnTagsImpl#getTreshold <em>Treshold</em>}</li>
 *   <li>{@link FileTransferPackage.impl.OnTagsImpl#getQuantificator <em>Quantificator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OnTagsImpl extends OnCustomImpl implements OnTags {
	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tags;

	/**
	 * The default value of the '{@link #isOnly() <em>Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOnly() <em>Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean only = ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTreshold() <em>Treshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreshold()
	 * @generated
	 * @ordered
	 */
	protected static final int TRESHOLD_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getTreshold() <em>Treshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreshold()
	 * @generated
	 * @ordered
	 */
	protected int treshold = TRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantificator() <em>Quantificator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantificator()
	 * @generated
	 * @ordered
	 */
	protected static final Quantificators QUANTIFICATOR_EDEFAULT = Quantificators.ALL;

	/**
	 * The cached value of the '{@link #getQuantificator() <em>Quantificator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantificator()
	 * @generated
	 * @ordered
	 */
	protected Quantificators quantificator = QUANTIFICATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnTagsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FileTransferPackagePackage.Literals.ON_TAGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeEList<String>(String.class, this, FileTransferPackagePackage.ON_TAGS__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOnly() {
		return only;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnly(boolean newOnly) {
		boolean oldOnly = only;
		only = newOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FileTransferPackagePackage.ON_TAGS__ONLY, oldOnly, only));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTreshold() {
		return treshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreshold(int newTreshold) {
		int oldTreshold = treshold;
		treshold = newTreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FileTransferPackagePackage.ON_TAGS__TRESHOLD, oldTreshold, treshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantificators getQuantificator() {
		return quantificator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantificator(Quantificators newQuantificator) {
		Quantificators oldQuantificator = quantificator;
		quantificator = newQuantificator == null ? QUANTIFICATOR_EDEFAULT : newQuantificator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FileTransferPackagePackage.ON_TAGS__QUANTIFICATOR, oldQuantificator, quantificator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FileTransferPackagePackage.ON_TAGS__TAGS:
				return getTags();
			case FileTransferPackagePackage.ON_TAGS__ONLY:
				return isOnly();
			case FileTransferPackagePackage.ON_TAGS__TRESHOLD:
				return getTreshold();
			case FileTransferPackagePackage.ON_TAGS__QUANTIFICATOR:
				return getQuantificator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FileTransferPackagePackage.ON_TAGS__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case FileTransferPackagePackage.ON_TAGS__ONLY:
				setOnly((Boolean)newValue);
				return;
			case FileTransferPackagePackage.ON_TAGS__TRESHOLD:
				setTreshold((Integer)newValue);
				return;
			case FileTransferPackagePackage.ON_TAGS__QUANTIFICATOR:
				setQuantificator((Quantificators)newValue);
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
			case FileTransferPackagePackage.ON_TAGS__TAGS:
				getTags().clear();
				return;
			case FileTransferPackagePackage.ON_TAGS__ONLY:
				setOnly(ONLY_EDEFAULT);
				return;
			case FileTransferPackagePackage.ON_TAGS__TRESHOLD:
				setTreshold(TRESHOLD_EDEFAULT);
				return;
			case FileTransferPackagePackage.ON_TAGS__QUANTIFICATOR:
				setQuantificator(QUANTIFICATOR_EDEFAULT);
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
			case FileTransferPackagePackage.ON_TAGS__TAGS:
				return tags != null && !tags.isEmpty();
			case FileTransferPackagePackage.ON_TAGS__ONLY:
				return only != ONLY_EDEFAULT;
			case FileTransferPackagePackage.ON_TAGS__TRESHOLD:
				return treshold != TRESHOLD_EDEFAULT;
			case FileTransferPackagePackage.ON_TAGS__QUANTIFICATOR:
				return quantificator != QUANTIFICATOR_EDEFAULT;
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
		result.append(" (tags: ");
		result.append(tags);
		result.append(", only: ");
		result.append(only);
		result.append(", treshold: ");
		result.append(treshold);
		result.append(", quantificator: ");
		result.append(quantificator);
		result.append(')');
		return result.toString();
	}

} //OnTagsImpl
