/**
 */
package FileTransferPackage.util;

import FileTransferPackage.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see FileTransferPackage.FileTransferPackagePackage
 * @generated
 */
public class FileTransferPackageValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FileTransferPackageValidator INSTANCE = new FileTransferPackageValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "FileTransferPackage";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileTransferPackageValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return FileTransferPackagePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case FileTransferPackagePackage.PATH:
				return validatePath((Path)value, diagnostics, context);
			case FileTransferPackagePackage.SELECTION:
				return validateSelection((Selection)value, diagnostics, context);
			case FileTransferPackagePackage.TRANSFORMATION:
				return validateTransformation((Transformation)value, diagnostics, context);
			case FileTransferPackagePackage.CREATING:
				return validateCreating((Creating)value, diagnostics, context);
			case FileTransferPackagePackage.COPY:
				return validateCopy((Copy)value, diagnostics, context);
			case FileTransferPackagePackage.MOVE:
				return validateMove((Move)value, diagnostics, context);
			case FileTransferPackagePackage.DELETE:
				return validateDelete((Delete)value, diagnostics, context);
			case FileTransferPackagePackage.CONCRETE_STEP:
				return validateConcreteStep((ConcreteStep)value, diagnostics, context);
			case FileTransferPackagePackage.PATH_VARIABLE:
				return validatePathVariable((PathVariable)value, diagnostics, context);
			case FileTransferPackagePackage.FILTER_LEAF:
				return validateFilterLeaf((FilterLeaf)value, diagnostics, context);
			case FileTransferPackagePackage.ON_NAME:
				return validateOnName((OnName)value, diagnostics, context);
			case FileTransferPackagePackage.ON_EXTENSION:
				return validateOnExtension((OnExtension)value, diagnostics, context);
			case FileTransferPackagePackage.ON_MEASURE:
				return validateOnMeasure((OnMeasure)value, diagnostics, context);
			case FileTransferPackagePackage.ON_TIME:
				return validateOnTime((OnTime)value, diagnostics, context);
			case FileTransferPackagePackage.ON_ATTRIBUTES:
				return validateOnAttributes((OnAttributes)value, diagnostics, context);
			case FileTransferPackagePackage.ON_TAGS:
				return validateOnTags((OnTags)value, diagnostics, context);
			case FileTransferPackagePackage.ON_SIZE:
				return validateOnSize((OnSize)value, diagnostics, context);
			case FileTransferPackagePackage.ON_BASIC:
				return validateOnBasic((OnBasic)value, diagnostics, context);
			case FileTransferPackagePackage.ON_CUSTOM:
				return validateOnCustom((OnCustom)value, diagnostics, context);
			case FileTransferPackagePackage.FILTER_CONTAINER:
				return validateFilterContainer((FilterContainer)value, diagnostics, context);
			case FileTransferPackagePackage.FILTER_COMPONENT:
				return validateFilterComponent((FilterComponent)value, diagnostics, context);
			case FileTransferPackagePackage.SELECTION_VARIABLE:
				return validateSelectionVariable((SelectionVariable)value, diagnostics, context);
			case FileTransferPackagePackage.MODEL:
				return validateModel((Model)value, diagnostics, context);
			case FileTransferPackagePackage.GENERIC_STEP:
				return validateGenericStep((GenericStep)value, diagnostics, context);
			case FileTransferPackagePackage.VARIABLE_STEP:
				return validateVariableStep((VariableStep)value, diagnostics, context);
			case FileTransferPackagePackage.IS_EMPTY:
				return validateIsEmpty((IsEmpty)value, diagnostics, context);
			case FileTransferPackagePackage.ON_TYPE:
				return validateOnType((OnType)value, diagnostics, context);
			case FileTransferPackagePackage.PARAMETRIZED_STEP:
				return validateParametrizedStep((ParametrizedStep)value, diagnostics, context);
			case FileTransferPackagePackage.OPERATOR:
				return validateOperator((Operator)value, diagnostics, context);
			case FileTransferPackagePackage.FILE_TYPE:
				return validateFileType((FileType)value, diagnostics, context);
			case FileTransferPackagePackage.TIME_TYPE:
				return validateTimeType((TimeType)value, diagnostics, context);
			case FileTransferPackagePackage.MEMORY_UNIT:
				return validateMemoryUnit((MemoryUnit)value, diagnostics, context);
			case FileTransferPackagePackage.TIME_UNIT:
				return validateTimeUnit((TimeUnit)value, diagnostics, context);
			case FileTransferPackagePackage.STRATEGIES:
				return validateStrategies((Strategies)value, diagnostics, context);
			case FileTransferPackagePackage.COMPOSITION_TYPE:
				return validateCompositionType((CompositionType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePath(Path path, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(path, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelection(Selection selection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformation(Transformation transformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transformation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreating(Creating creating, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(creating, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopy(Copy copy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(copy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMove(Move move, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(move, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelete(Delete delete, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delete, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcreteStep(ConcreteStep concreteStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(concreteStep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(concreteStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(concreteStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(concreteStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(concreteStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(concreteStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(concreteStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(concreteStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(concreteStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcreteStep_dontContainsParametrizedVariable(concreteStep, diagnostics, context);
		return result;
	}

	/**
	 * Validates the dontContainsParametrizedVariable constraint of '<em>Concrete Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcreteStep_dontContainsParametrizedVariable(ConcreteStep concreteStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "dontContainsParametrizedVariable", getObjectLabel(concreteStep, context) },
						 new Object[] { concreteStep },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePathVariable(PathVariable pathVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pathVariable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pathVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pathVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pathVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pathVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pathVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pathVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pathVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pathVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validatePathVariable_pathVariableRegularName(pathVariable, diagnostics, context);
		return result;
	}

	/**
	 * Validates the pathVariableRegularName constraint of '<em>Path Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePathVariable_pathVariableRegularName(PathVariable pathVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "pathVariableRegularName", getObjectLabel(pathVariable, context) },
						 new Object[] { pathVariable },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterLeaf(FilterLeaf filterLeaf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterLeaf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnName(OnName onName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(onName, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(onName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(onName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(onName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(onName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(onName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(onName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(onName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(onName, diagnostics, context);
		if (result || diagnostics != null) result &= validateOnName_filterNameRegularName(onName, diagnostics, context);
		return result;
	}

	/**
	 * Validates the filterNameRegularName constraint of '<em>On Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnName_filterNameRegularName(OnName onName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "filterNameRegularName", getObjectLabel(onName, context) },
						 new Object[] { onName },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnExtension(OnExtension onExtension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(onExtension, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(onExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(onExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(onExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(onExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(onExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(onExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(onExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(onExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validateOnExtension_ExtensionsContent(onExtension, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ExtensionsContent constraint of '<em>On Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnExtension_ExtensionsContent(OnExtension onExtension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ExtensionsContent", getObjectLabel(onExtension, context) },
						 new Object[] { onExtension },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnMeasure(OnMeasure onMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(onMeasure, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(onMeasure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(onMeasure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(onMeasure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(onMeasure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(onMeasure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(onMeasure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(onMeasure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(onMeasure, diagnostics, context);
		if (result || diagnostics != null) result &= validateOnMeasure_tresholdPositive(onMeasure, diagnostics, context);
		return result;
	}

	/**
	 * Validates the tresholdPositive constraint of '<em>On Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnMeasure_tresholdPositive(OnMeasure onMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "tresholdPositive", getObjectLabel(onMeasure, context) },
						 new Object[] { onMeasure },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnTime(OnTime onTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(onTime, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(onTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(onTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(onTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(onTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(onTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(onTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(onTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(onTime, diagnostics, context);
		if (result || diagnostics != null) result &= validateOnMeasure_tresholdPositive(onTime, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnAttributes(OnAttributes onAttributes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(onAttributes, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(onAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(onAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(onAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(onAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(onAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(onAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(onAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(onAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateOnAttributes_attributeFilterRegularName(onAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateOnAttributes_attributeFilterRegularValue(onAttributes, diagnostics, context);
		return result;
	}

	/**
	 * Validates the attributeFilterRegularName constraint of '<em>On Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnAttributes_attributeFilterRegularName(OnAttributes onAttributes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "attributeFilterRegularName", getObjectLabel(onAttributes, context) },
						 new Object[] { onAttributes },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the attributeFilterRegularValue constraint of '<em>On Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnAttributes_attributeFilterRegularValue(OnAttributes onAttributes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "attributeFilterRegularValue", getObjectLabel(onAttributes, context) },
						 new Object[] { onAttributes },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnTags(OnTags onTags, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(onTags, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(onTags, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(onTags, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(onTags, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(onTags, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(onTags, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(onTags, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(onTags, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(onTags, diagnostics, context);
		if (result || diagnostics != null) result &= validateOnTags_TagsTresholdNumberPositiveMinus1(onTags, diagnostics, context);
		if (result || diagnostics != null) result &= validateOnTags_TagsContent(onTags, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TagsTresholdNumberPositiveMinus1 constraint of '<em>On Tags</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnTags_TagsTresholdNumberPositiveMinus1(OnTags onTags, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TagsTresholdNumberPositiveMinus1", getObjectLabel(onTags, context) },
						 new Object[] { onTags },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the TagsContent constraint of '<em>On Tags</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnTags_TagsContent(OnTags onTags, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TagsContent", getObjectLabel(onTags, context) },
						 new Object[] { onTags },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnSize(OnSize onSize, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(onSize, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(onSize, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(onSize, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(onSize, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(onSize, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(onSize, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(onSize, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(onSize, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(onSize, diagnostics, context);
		if (result || diagnostics != null) result &= validateOnMeasure_tresholdPositive(onSize, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnBasic(OnBasic onBasic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onBasic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnCustom(OnCustom onCustom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onCustom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterContainer(FilterContainer filterContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterComponent(FilterComponent filterComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionVariable(SelectionVariable selectionVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(selectionVariable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(selectionVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(selectionVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(selectionVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(selectionVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(selectionVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(selectionVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(selectionVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(selectionVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateSelectionVariable_selectionVariableRegularName(selectionVariable, diagnostics, context);
		return result;
	}

	/**
	 * Validates the selectionVariableRegularName constraint of '<em>Selection Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionVariable_selectionVariableRegularName(SelectionVariable selectionVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "selectionVariableRegularName", getObjectLabel(selectionVariable, context) },
						 new Object[] { selectionVariable },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(model, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericStep(GenericStep genericStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(genericStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableStep(VariableStep variableStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsEmpty(IsEmpty isEmpty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(isEmpty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnType(OnType onType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParametrizedStep(ParametrizedStep parametrizedStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parametrizedStep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parametrizedStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parametrizedStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parametrizedStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parametrizedStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parametrizedStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parametrizedStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parametrizedStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parametrizedStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateParametrizedStep_parametrizedStepRegularName(parametrizedStep, diagnostics, context);
		return result;
	}

	/**
	 * Validates the parametrizedStepRegularName constraint of '<em>Parametrized Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParametrizedStep_parametrizedStepRegularName(ParametrizedStep parametrizedStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "parametrizedStepRegularName", getObjectLabel(parametrizedStep, context) },
						 new Object[] { parametrizedStep },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperator(Operator operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileType(FileType fileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeType(TimeType timeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryUnit(MemoryUnit memoryUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnit(TimeUnit timeUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrategies(Strategies strategies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionType(CompositionType compositionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //FileTransferPackageValidator
