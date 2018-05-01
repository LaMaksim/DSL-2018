/**
 */
package FileTransferPackage.impl;

import FileTransferPackage.FileTransferPackagePackage;
import FileTransferPackage.Model;
import FileTransferPackage.PathVariable;
import FileTransferPackage.SelectionVariable;
import FileTransferPackage.Transformation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FileTransferPackage.impl.ModelImpl#getPath_variables <em>Path variables</em>}</li>
 *   <li>{@link FileTransferPackage.impl.ModelImpl#getSelection_variables <em>Selection variables</em>}</li>
 *   <li>{@link FileTransferPackage.impl.ModelImpl#getTransformations <em>Transformations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getPath_variables() <em>Path variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath_variables()
	 * @generated
	 * @ordered
	 */
	protected EList<PathVariable> path_variables;

	/**
	 * The cached value of the '{@link #getSelection_variables() <em>Selection variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection_variables()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectionVariable> selection_variables;

	/**
	 * The cached value of the '{@link #getTransformations() <em>Transformations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformations()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation> transformations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FileTransferPackagePackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathVariable> getPath_variables() {
		if (path_variables == null) {
			path_variables = new EObjectContainmentEList<PathVariable>(PathVariable.class, this, FileTransferPackagePackage.MODEL__PATH_VARIABLES);
		}
		return path_variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectionVariable> getSelection_variables() {
		if (selection_variables == null) {
			selection_variables = new EObjectContainmentEList<SelectionVariable>(SelectionVariable.class, this, FileTransferPackagePackage.MODEL__SELECTION_VARIABLES);
		}
		return selection_variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformation> getTransformations() {
		if (transformations == null) {
			transformations = new EObjectContainmentEList<Transformation>(Transformation.class, this, FileTransferPackagePackage.MODEL__TRANSFORMATIONS);
		}
		return transformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FileTransferPackagePackage.MODEL__PATH_VARIABLES:
				return ((InternalEList<?>)getPath_variables()).basicRemove(otherEnd, msgs);
			case FileTransferPackagePackage.MODEL__SELECTION_VARIABLES:
				return ((InternalEList<?>)getSelection_variables()).basicRemove(otherEnd, msgs);
			case FileTransferPackagePackage.MODEL__TRANSFORMATIONS:
				return ((InternalEList<?>)getTransformations()).basicRemove(otherEnd, msgs);
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
			case FileTransferPackagePackage.MODEL__PATH_VARIABLES:
				return getPath_variables();
			case FileTransferPackagePackage.MODEL__SELECTION_VARIABLES:
				return getSelection_variables();
			case FileTransferPackagePackage.MODEL__TRANSFORMATIONS:
				return getTransformations();
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
			case FileTransferPackagePackage.MODEL__PATH_VARIABLES:
				getPath_variables().clear();
				getPath_variables().addAll((Collection<? extends PathVariable>)newValue);
				return;
			case FileTransferPackagePackage.MODEL__SELECTION_VARIABLES:
				getSelection_variables().clear();
				getSelection_variables().addAll((Collection<? extends SelectionVariable>)newValue);
				return;
			case FileTransferPackagePackage.MODEL__TRANSFORMATIONS:
				getTransformations().clear();
				getTransformations().addAll((Collection<? extends Transformation>)newValue);
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
			case FileTransferPackagePackage.MODEL__PATH_VARIABLES:
				getPath_variables().clear();
				return;
			case FileTransferPackagePackage.MODEL__SELECTION_VARIABLES:
				getSelection_variables().clear();
				return;
			case FileTransferPackagePackage.MODEL__TRANSFORMATIONS:
				getTransformations().clear();
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
			case FileTransferPackagePackage.MODEL__PATH_VARIABLES:
				return path_variables != null && !path_variables.isEmpty();
			case FileTransferPackagePackage.MODEL__SELECTION_VARIABLES:
				return selection_variables != null && !selection_variables.isEmpty();
			case FileTransferPackagePackage.MODEL__TRANSFORMATIONS:
				return transformations != null && !transformations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
