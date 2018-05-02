/**
 */
package FileTransferPackage.impl;

import FileTransferPackage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FileTransferPackageFactoryImpl extends EFactoryImpl implements FileTransferPackageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FileTransferPackageFactory init() {
		try {
			FileTransferPackageFactory theFileTransferPackageFactory = (FileTransferPackageFactory)EPackage.Registry.INSTANCE.getEFactory(FileTransferPackagePackage.eNS_URI);
			if (theFileTransferPackageFactory != null) {
				return theFileTransferPackageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FileTransferPackageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileTransferPackageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FileTransferPackagePackage.PATH: return createPath();
			case FileTransferPackagePackage.SELECTION: return createSelection();
			case FileTransferPackagePackage.COPY: return createCopy();
			case FileTransferPackagePackage.MOVE: return createMove();
			case FileTransferPackagePackage.DELETE: return createDelete();
			case FileTransferPackagePackage.CONCRETE_STEP: return createConcreteStep();
			case FileTransferPackagePackage.PATH_VARIABLE: return createPathVariable();
			case FileTransferPackagePackage.ON_NAME: return createOnName();
			case FileTransferPackagePackage.ON_EXTENSION: return createOnExtension();
			case FileTransferPackagePackage.ON_TIME: return createOnTime();
			case FileTransferPackagePackage.ON_ATTRIBUTES: return createOnAttributes();
			case FileTransferPackagePackage.ON_TAGS: return createOnTags();
			case FileTransferPackagePackage.ON_SIZE: return createOnSize();
			case FileTransferPackagePackage.FILTER_CONTAINER: return createFilterContainer();
			case FileTransferPackagePackage.MODEL: return createModel();
			case FileTransferPackagePackage.VARIABLE_STEP: return createVariableStep();
			case FileTransferPackagePackage.IS_EMPTY: return createIsEmpty();
			case FileTransferPackagePackage.ON_TYPE: return createOnType();
			case FileTransferPackagePackage.PARAMETRIZED_STEP: return createParametrizedStep();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FileTransferPackagePackage.OPERATOR:
				return createOperatorFromString(eDataType, initialValue);
			case FileTransferPackagePackage.FILE_TYPE:
				return createFileTypeFromString(eDataType, initialValue);
			case FileTransferPackagePackage.TIME_TYPE:
				return createTimeTypeFromString(eDataType, initialValue);
			case FileTransferPackagePackage.MEMORY_UNIT:
				return createMemoryUnitFromString(eDataType, initialValue);
			case FileTransferPackagePackage.TIME_UNIT:
				return createTimeUnitFromString(eDataType, initialValue);
			case FileTransferPackagePackage.STRATEGIES:
				return createStrategiesFromString(eDataType, initialValue);
			case FileTransferPackagePackage.COMPOSITION_TYPE:
				return createCompositionTypeFromString(eDataType, initialValue);
			case FileTransferPackagePackage.QUANTIFICATORS:
				return createQuantificatorsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FileTransferPackagePackage.OPERATOR:
				return convertOperatorToString(eDataType, instanceValue);
			case FileTransferPackagePackage.FILE_TYPE:
				return convertFileTypeToString(eDataType, instanceValue);
			case FileTransferPackagePackage.TIME_TYPE:
				return convertTimeTypeToString(eDataType, instanceValue);
			case FileTransferPackagePackage.MEMORY_UNIT:
				return convertMemoryUnitToString(eDataType, instanceValue);
			case FileTransferPackagePackage.TIME_UNIT:
				return convertTimeUnitToString(eDataType, instanceValue);
			case FileTransferPackagePackage.STRATEGIES:
				return convertStrategiesToString(eDataType, instanceValue);
			case FileTransferPackagePackage.COMPOSITION_TYPE:
				return convertCompositionTypeToString(eDataType, instanceValue);
			case FileTransferPackagePackage.QUANTIFICATORS:
				return convertQuantificatorsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Path createPath() {
		PathImpl path = new PathImpl();
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection createSelection() {
		SelectionImpl selection = new SelectionImpl();
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Copy createCopy() {
		CopyImpl copy = new CopyImpl();
		return copy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move createMove() {
		MoveImpl move = new MoveImpl();
		return move;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteStep createConcreteStep() {
		ConcreteStepImpl concreteStep = new ConcreteStepImpl();
		return concreteStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathVariable createPathVariable() {
		PathVariableImpl pathVariable = new PathVariableImpl();
		return pathVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnName createOnName() {
		OnNameImpl onName = new OnNameImpl();
		return onName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnExtension createOnExtension() {
		OnExtensionImpl onExtension = new OnExtensionImpl();
		return onExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnTime createOnTime() {
		OnTimeImpl onTime = new OnTimeImpl();
		return onTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnAttributes createOnAttributes() {
		OnAttributesImpl onAttributes = new OnAttributesImpl();
		return onAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnTags createOnTags() {
		OnTagsImpl onTags = new OnTagsImpl();
		return onTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnSize createOnSize() {
		OnSizeImpl onSize = new OnSizeImpl();
		return onSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterContainer createFilterContainer() {
		FilterContainerImpl filterContainer = new FilterContainerImpl();
		return filterContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableStep createVariableStep() {
		VariableStepImpl variableStep = new VariableStepImpl();
		return variableStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsEmpty createIsEmpty() {
		IsEmptyImpl isEmpty = new IsEmptyImpl();
		return isEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnType createOnType() {
		OnTypeImpl onType = new OnTypeImpl();
		return onType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametrizedStep createParametrizedStep() {
		ParametrizedStepImpl parametrizedStep = new ParametrizedStepImpl();
		return parametrizedStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperatorFromString(EDataType eDataType, String initialValue) {
		Operator result = Operator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType createFileTypeFromString(EDataType eDataType, String initialValue) {
		FileType result = FileType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeType createTimeTypeFromString(EDataType eDataType, String initialValue) {
		TimeType result = TimeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryUnit createMemoryUnitFromString(EDataType eDataType, String initialValue) {
		MemoryUnit result = MemoryUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemoryUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit createTimeUnitFromString(EDataType eDataType, String initialValue) {
		TimeUnit result = TimeUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strategies createStrategiesFromString(EDataType eDataType, String initialValue) {
		Strategies result = Strategies.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrategiesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionType createCompositionTypeFromString(EDataType eDataType, String initialValue) {
		CompositionType result = CompositionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantificators createQuantificatorsFromString(EDataType eDataType, String initialValue) {
		Quantificators result = Quantificators.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantificatorsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileTransferPackagePackage getFileTransferPackagePackage() {
		return (FileTransferPackagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FileTransferPackagePackage getPackage() {
		return FileTransferPackagePackage.eINSTANCE;
	}

} //FileTransferPackageFactoryImpl
