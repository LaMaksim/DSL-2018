/**
 */
package FileTransferPackage.impl;

import FileTransferPackage.FileTransferPackagePackage;
import FileTransferPackage.FilterLeaf;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Leaf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FileTransferPackage.impl.FilterLeafImpl#isTrueFalseSearch <em>True False Search</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FilterLeafImpl extends FilterComponentImpl implements FilterLeaf {
	/**
	 * The default value of the '{@link #isTrueFalseSearch() <em>True False Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrueFalseSearch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRUE_FALSE_SEARCH_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isTrueFalseSearch() <em>True False Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrueFalseSearch()
	 * @generated
	 * @ordered
	 */
	protected boolean trueFalseSearch = TRUE_FALSE_SEARCH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterLeafImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FileTransferPackagePackage.Literals.FILTER_LEAF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTrueFalseSearch() {
		return trueFalseSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrueFalseSearch(boolean newTrueFalseSearch) {
		boolean oldTrueFalseSearch = trueFalseSearch;
		trueFalseSearch = newTrueFalseSearch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FileTransferPackagePackage.FILTER_LEAF__TRUE_FALSE_SEARCH, oldTrueFalseSearch, trueFalseSearch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FileTransferPackagePackage.FILTER_LEAF__TRUE_FALSE_SEARCH:
				return isTrueFalseSearch();
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
			case FileTransferPackagePackage.FILTER_LEAF__TRUE_FALSE_SEARCH:
				setTrueFalseSearch((Boolean)newValue);
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
			case FileTransferPackagePackage.FILTER_LEAF__TRUE_FALSE_SEARCH:
				setTrueFalseSearch(TRUE_FALSE_SEARCH_EDEFAULT);
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
			case FileTransferPackagePackage.FILTER_LEAF__TRUE_FALSE_SEARCH:
				return trueFalseSearch != TRUE_FALSE_SEARCH_EDEFAULT;
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
		result.append(" (trueFalseSearch: ");
		result.append(trueFalseSearch);
		result.append(')');
		return result.toString();
	}

} //FilterLeafImpl
