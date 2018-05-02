/**
 */
package FileTransferPackage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see FileTransferPackage.FileTransferPackagePackage
 * @generated
 */
public interface FileTransferPackageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FileTransferPackageFactory eINSTANCE = FileTransferPackage.impl.FileTransferPackageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path</em>'.
	 * @generated
	 */
	Path createPath();

	/**
	 * Returns a new object of class '<em>Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection</em>'.
	 * @generated
	 */
	Selection createSelection();

	/**
	 * Returns a new object of class '<em>Copy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copy</em>'.
	 * @generated
	 */
	Copy createCopy();

	/**
	 * Returns a new object of class '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move</em>'.
	 * @generated
	 */
	Move createMove();

	/**
	 * Returns a new object of class '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete</em>'.
	 * @generated
	 */
	Delete createDelete();

	/**
	 * Returns a new object of class '<em>Concrete Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Step</em>'.
	 * @generated
	 */
	ConcreteStep createConcreteStep();

	/**
	 * Returns a new object of class '<em>Path Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Variable</em>'.
	 * @generated
	 */
	PathVariable createPathVariable();

	/**
	 * Returns a new object of class '<em>On Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Name</em>'.
	 * @generated
	 */
	OnName createOnName();

	/**
	 * Returns a new object of class '<em>On Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Extension</em>'.
	 * @generated
	 */
	OnExtension createOnExtension();

	/**
	 * Returns a new object of class '<em>On Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Time</em>'.
	 * @generated
	 */
	OnTime createOnTime();

	/**
	 * Returns a new object of class '<em>On Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Attributes</em>'.
	 * @generated
	 */
	OnAttributes createOnAttributes();

	/**
	 * Returns a new object of class '<em>On Tags</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Tags</em>'.
	 * @generated
	 */
	OnTags createOnTags();

	/**
	 * Returns a new object of class '<em>On Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Size</em>'.
	 * @generated
	 */
	OnSize createOnSize();

	/**
	 * Returns a new object of class '<em>Filter Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Container</em>'.
	 * @generated
	 */
	FilterContainer createFilterContainer();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Variable Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Step</em>'.
	 * @generated
	 */
	VariableStep createVariableStep();

	/**
	 * Returns a new object of class '<em>Is Empty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Empty</em>'.
	 * @generated
	 */
	IsEmpty createIsEmpty();

	/**
	 * Returns a new object of class '<em>On Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Type</em>'.
	 * @generated
	 */
	OnType createOnType();

	/**
	 * Returns a new object of class '<em>Parametrized Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parametrized Step</em>'.
	 * @generated
	 */
	ParametrizedStep createParametrizedStep();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FileTransferPackagePackage getFileTransferPackagePackage();

} //FileTransferPackageFactory
