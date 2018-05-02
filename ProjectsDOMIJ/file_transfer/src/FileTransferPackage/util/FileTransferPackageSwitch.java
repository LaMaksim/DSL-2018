/**
 */
package FileTransferPackage.util;

import FileTransferPackage.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see FileTransferPackage.FileTransferPackagePackage
 * @generated
 */
public class FileTransferPackageSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FileTransferPackagePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileTransferPackageSwitch() {
		if (modelPackage == null) {
			modelPackage = FileTransferPackagePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FileTransferPackagePackage.PATH: {
				Path path = (Path)theEObject;
				T result = casePath(path);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.SELECTION: {
				Selection selection = (Selection)theEObject;
				T result = caseSelection(selection);
				if (result == null) result = caseExecution(selection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.TRANSFORMATION: {
				Transformation transformation = (Transformation)theEObject;
				T result = caseTransformation(transformation);
				if (result == null) result = caseExecution(transformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.CREATING: {
				Creating creating = (Creating)theEObject;
				T result = caseCreating(creating);
				if (result == null) result = caseTransformation(creating);
				if (result == null) result = caseExecution(creating);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.COPY: {
				Copy copy = (Copy)theEObject;
				T result = caseCopy(copy);
				if (result == null) result = caseCreating(copy);
				if (result == null) result = caseTransformation(copy);
				if (result == null) result = caseExecution(copy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.MOVE: {
				Move move = (Move)theEObject;
				T result = caseMove(move);
				if (result == null) result = caseCreating(move);
				if (result == null) result = caseTransformation(move);
				if (result == null) result = caseExecution(move);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.DELETE: {
				Delete delete = (Delete)theEObject;
				T result = caseDelete(delete);
				if (result == null) result = caseTransformation(delete);
				if (result == null) result = caseExecution(delete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.CONCRETE_STEP: {
				ConcreteStep concreteStep = (ConcreteStep)theEObject;
				T result = caseConcreteStep(concreteStep);
				if (result == null) result = caseGenericStep(concreteStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.PATH_VARIABLE: {
				PathVariable pathVariable = (PathVariable)theEObject;
				T result = casePathVariable(pathVariable);
				if (result == null) result = caseExecution(pathVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.FILTER_LEAF: {
				FilterLeaf filterLeaf = (FilterLeaf)theEObject;
				T result = caseFilterLeaf(filterLeaf);
				if (result == null) result = caseFilterComponent(filterLeaf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.ON_NAME: {
				OnName onName = (OnName)theEObject;
				T result = caseOnName(onName);
				if (result == null) result = caseOnBasic(onName);
				if (result == null) result = caseFilterLeaf(onName);
				if (result == null) result = caseFilterComponent(onName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.ON_EXTENSION: {
				OnExtension onExtension = (OnExtension)theEObject;
				T result = caseOnExtension(onExtension);
				if (result == null) result = caseOnBasic(onExtension);
				if (result == null) result = caseFilterLeaf(onExtension);
				if (result == null) result = caseFilterComponent(onExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.ON_MEASURE: {
				OnMeasure onMeasure = (OnMeasure)theEObject;
				T result = caseOnMeasure(onMeasure);
				if (result == null) result = caseFilterLeaf(onMeasure);
				if (result == null) result = caseFilterComponent(onMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.ON_TIME: {
				OnTime onTime = (OnTime)theEObject;
				T result = caseOnTime(onTime);
				if (result == null) result = caseOnMeasure(onTime);
				if (result == null) result = caseFilterLeaf(onTime);
				if (result == null) result = caseFilterComponent(onTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.ON_ATTRIBUTES: {
				OnAttributes onAttributes = (OnAttributes)theEObject;
				T result = caseOnAttributes(onAttributes);
				if (result == null) result = caseOnCustom(onAttributes);
				if (result == null) result = caseFilterLeaf(onAttributes);
				if (result == null) result = caseFilterComponent(onAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.ON_TAGS: {
				OnTags onTags = (OnTags)theEObject;
				T result = caseOnTags(onTags);
				if (result == null) result = caseOnCustom(onTags);
				if (result == null) result = caseFilterLeaf(onTags);
				if (result == null) result = caseFilterComponent(onTags);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.ON_SIZE: {
				OnSize onSize = (OnSize)theEObject;
				T result = caseOnSize(onSize);
				if (result == null) result = caseOnMeasure(onSize);
				if (result == null) result = caseFilterLeaf(onSize);
				if (result == null) result = caseFilterComponent(onSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.ON_BASIC: {
				OnBasic onBasic = (OnBasic)theEObject;
				T result = caseOnBasic(onBasic);
				if (result == null) result = caseFilterLeaf(onBasic);
				if (result == null) result = caseFilterComponent(onBasic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.ON_CUSTOM: {
				OnCustom onCustom = (OnCustom)theEObject;
				T result = caseOnCustom(onCustom);
				if (result == null) result = caseFilterLeaf(onCustom);
				if (result == null) result = caseFilterComponent(onCustom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.FILTER_CONTAINER: {
				FilterContainer filterContainer = (FilterContainer)theEObject;
				T result = caseFilterContainer(filterContainer);
				if (result == null) result = caseFilterComponent(filterContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.FILTER_COMPONENT: {
				FilterComponent filterComponent = (FilterComponent)theEObject;
				T result = caseFilterComponent(filterComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.GENERIC_STEP: {
				GenericStep genericStep = (GenericStep)theEObject;
				T result = caseGenericStep(genericStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.VARIABLE_STEP: {
				VariableStep variableStep = (VariableStep)theEObject;
				T result = caseVariableStep(variableStep);
				if (result == null) result = caseGenericStep(variableStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.IS_EMPTY: {
				IsEmpty isEmpty = (IsEmpty)theEObject;
				T result = caseIsEmpty(isEmpty);
				if (result == null) result = caseOnBasic(isEmpty);
				if (result == null) result = caseFilterLeaf(isEmpty);
				if (result == null) result = caseFilterComponent(isEmpty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.ON_TYPE: {
				OnType onType = (OnType)theEObject;
				T result = caseOnType(onType);
				if (result == null) result = caseOnBasic(onType);
				if (result == null) result = caseFilterLeaf(onType);
				if (result == null) result = caseFilterComponent(onType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.PARAMETRIZED_STEP: {
				ParametrizedStep parametrizedStep = (ParametrizedStep)theEObject;
				T result = caseParametrizedStep(parametrizedStep);
				if (result == null) result = caseGenericStep(parametrizedStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.EXECUTION: {
				Execution execution = (Execution)theEObject;
				T result = caseExecution(execution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FileTransferPackagePackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePath(Path object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelection(Selection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformation(Transformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Creating</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Creating</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreating(Creating object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopy(Copy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMove(Move object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelete(Delete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteStep(ConcreteStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathVariable(PathVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Leaf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Leaf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterLeaf(FilterLeaf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnName(OnName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnExtension(OnExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnMeasure(OnMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnTime(OnTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnAttributes(OnAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Tags</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Tags</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnTags(OnTags object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnSize(OnSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Basic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Basic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnBasic(OnBasic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Custom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Custom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnCustom(OnCustom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterContainer(FilterContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterComponent(FilterComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericStep(GenericStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableStep(VariableStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Empty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Empty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsEmpty(IsEmpty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnType(OnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parametrized Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parametrized Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametrizedStep(ParametrizedStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecution(Execution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FileTransferPackageSwitch
