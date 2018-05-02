/**
 */
package FileTransferPackage.impl;

import FileTransferPackage.CompositionType;
import FileTransferPackage.ConcreteStep;
import FileTransferPackage.Copy;
import FileTransferPackage.Creating;
import FileTransferPackage.Delete;
import FileTransferPackage.Execution;
import FileTransferPackage.FileTransferPackageFactory;
import FileTransferPackage.FileTransferPackagePackage;
import FileTransferPackage.FileType;
import FileTransferPackage.FilterComponent;
import FileTransferPackage.FilterContainer;
import FileTransferPackage.FilterLeaf;
import FileTransferPackage.GenericStep;
import FileTransferPackage.IsEmpty;
import FileTransferPackage.Link;
import FileTransferPackage.MemoryUnit;
import FileTransferPackage.Model;
import FileTransferPackage.Move;
import FileTransferPackage.OnAttributes;
import FileTransferPackage.OnBasic;
import FileTransferPackage.OnCustom;
import FileTransferPackage.OnExtension;
import FileTransferPackage.OnMeasure;
import FileTransferPackage.OnName;
import FileTransferPackage.OnSize;
import FileTransferPackage.OnTags;
import FileTransferPackage.OnTime;
import FileTransferPackage.OnType;
import FileTransferPackage.Operator;
import FileTransferPackage.ParametrizedStep;
import FileTransferPackage.Path;
import FileTransferPackage.PathVariable;
import FileTransferPackage.Quantificators;
import FileTransferPackage.Selection;
import FileTransferPackage.Strategies;
import FileTransferPackage.TimeType;
import FileTransferPackage.TimeUnit;
import FileTransferPackage.Transformation;
import FileTransferPackage.VariableStep;

import FileTransferPackage.util.FileTransferPackageValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FileTransferPackagePackageImpl extends EPackageImpl implements FileTransferPackagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creatingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterLeafEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onTagsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onBasicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onCustomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isEmptyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametrizedStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fileTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum memoryUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum strategiesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compositionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum quantificatorsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see FileTransferPackage.FileTransferPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FileTransferPackagePackageImpl() {
		super(eNS_URI, FileTransferPackageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FileTransferPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FileTransferPackagePackage init() {
		if (isInited) return (FileTransferPackagePackage)EPackage.Registry.INSTANCE.getEPackage(FileTransferPackagePackage.eNS_URI);

		// Obtain or create and register package
		FileTransferPackagePackageImpl theFileTransferPackagePackage = (FileTransferPackagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FileTransferPackagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FileTransferPackagePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFileTransferPackagePackage.createPackageContents();

		// Initialize created meta-data
		theFileTransferPackagePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theFileTransferPackagePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return FileTransferPackageValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theFileTransferPackagePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FileTransferPackagePackage.eNS_URI, theFileTransferPackagePackage);
		return theFileTransferPackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPath() {
		return pathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPath_Steps() {
		return (EReference)pathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelection() {
		return selectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelection_Where() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelection_From() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelection_Name() {
		return (EAttribute)selectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_Source() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreating() {
		return creatingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreating_Destination() {
		return (EReference)creatingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreating_Strategy() {
		return (EAttribute)creatingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopy() {
		return copyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMove() {
		return moveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelete() {
		return deleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteStep() {
		return concreteStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteStep_Value() {
		return (EAttribute)concreteStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteStep_Absolute() {
		return (EAttribute)concreteStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathVariable() {
		return pathVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathVariable_Value() {
		return (EReference)pathVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathVariable_Name() {
		return (EAttribute)pathVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterLeaf() {
		return filterLeafEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterLeaf_Inverse() {
		return (EAttribute)filterLeafEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnName() {
		return onNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnName_Name() {
		return (EAttribute)onNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnExtension() {
		return onExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnExtension_Extensions() {
		return (EAttribute)onExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnMeasure() {
		return onMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnMeasure_Operator() {
		return (EAttribute)onMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnMeasure_Treshold() {
		return (EAttribute)onMeasureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnTime() {
		return onTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnTime_Unit() {
		return (EAttribute)onTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnTime_TimeOf() {
		return (EAttribute)onTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnAttributes() {
		return onAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnAttributes_Name() {
		return (EAttribute)onAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnAttributes_Value() {
		return (EAttribute)onAttributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnTags() {
		return onTagsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnTags_Tags() {
		return (EAttribute)onTagsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnTags_Only() {
		return (EAttribute)onTagsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnTags_Treshold() {
		return (EAttribute)onTagsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnTags_Quantificator() {
		return (EAttribute)onTagsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnSize() {
		return onSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnSize_Unit() {
		return (EAttribute)onSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnBasic() {
		return onBasicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnCustom() {
		return onCustomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterContainer() {
		return filterContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterContainer_Links() {
		return (EReference)filterContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterComponent() {
		return filterComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Executions() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericStep() {
		return genericStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableStep() {
		return variableStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableStep_Value() {
		return (EReference)variableStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsEmpty() {
		return isEmptyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnType() {
		return onTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnType_Type() {
		return (EAttribute)onTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametrizedStep() {
		return parametrizedStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametrizedStep_Name() {
		return (EAttribute)parametrizedStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecution() {
		return executionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_CompositonType() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Element() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperator() {
		return operatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFileType() {
		return fileTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeType() {
		return timeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMemoryUnit() {
		return memoryUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeUnit() {
		return timeUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStrategies() {
		return strategiesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompositionType() {
		return compositionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuantificators() {
		return quantificatorsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileTransferPackageFactory getFileTransferPackageFactory() {
		return (FileTransferPackageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pathEClass = createEClass(PATH);
		createEReference(pathEClass, PATH__STEPS);

		selectionEClass = createEClass(SELECTION);
		createEReference(selectionEClass, SELECTION__WHERE);
		createEReference(selectionEClass, SELECTION__FROM);
		createEAttribute(selectionEClass, SELECTION__NAME);

		transformationEClass = createEClass(TRANSFORMATION);
		createEReference(transformationEClass, TRANSFORMATION__SOURCE);

		creatingEClass = createEClass(CREATING);
		createEReference(creatingEClass, CREATING__DESTINATION);
		createEAttribute(creatingEClass, CREATING__STRATEGY);

		copyEClass = createEClass(COPY);

		moveEClass = createEClass(MOVE);

		deleteEClass = createEClass(DELETE);

		concreteStepEClass = createEClass(CONCRETE_STEP);
		createEAttribute(concreteStepEClass, CONCRETE_STEP__VALUE);
		createEAttribute(concreteStepEClass, CONCRETE_STEP__ABSOLUTE);

		pathVariableEClass = createEClass(PATH_VARIABLE);
		createEReference(pathVariableEClass, PATH_VARIABLE__VALUE);
		createEAttribute(pathVariableEClass, PATH_VARIABLE__NAME);

		filterLeafEClass = createEClass(FILTER_LEAF);
		createEAttribute(filterLeafEClass, FILTER_LEAF__INVERSE);

		onNameEClass = createEClass(ON_NAME);
		createEAttribute(onNameEClass, ON_NAME__NAME);

		onExtensionEClass = createEClass(ON_EXTENSION);
		createEAttribute(onExtensionEClass, ON_EXTENSION__EXTENSIONS);

		onMeasureEClass = createEClass(ON_MEASURE);
		createEAttribute(onMeasureEClass, ON_MEASURE__OPERATOR);
		createEAttribute(onMeasureEClass, ON_MEASURE__TRESHOLD);

		onTimeEClass = createEClass(ON_TIME);
		createEAttribute(onTimeEClass, ON_TIME__UNIT);
		createEAttribute(onTimeEClass, ON_TIME__TIME_OF);

		onAttributesEClass = createEClass(ON_ATTRIBUTES);
		createEAttribute(onAttributesEClass, ON_ATTRIBUTES__NAME);
		createEAttribute(onAttributesEClass, ON_ATTRIBUTES__VALUE);

		onTagsEClass = createEClass(ON_TAGS);
		createEAttribute(onTagsEClass, ON_TAGS__TAGS);
		createEAttribute(onTagsEClass, ON_TAGS__ONLY);
		createEAttribute(onTagsEClass, ON_TAGS__TRESHOLD);
		createEAttribute(onTagsEClass, ON_TAGS__QUANTIFICATOR);

		onSizeEClass = createEClass(ON_SIZE);
		createEAttribute(onSizeEClass, ON_SIZE__UNIT);

		onBasicEClass = createEClass(ON_BASIC);

		onCustomEClass = createEClass(ON_CUSTOM);

		filterContainerEClass = createEClass(FILTER_CONTAINER);
		createEReference(filterContainerEClass, FILTER_CONTAINER__LINKS);

		filterComponentEClass = createEClass(FILTER_COMPONENT);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__EXECUTIONS);

		genericStepEClass = createEClass(GENERIC_STEP);

		variableStepEClass = createEClass(VARIABLE_STEP);
		createEReference(variableStepEClass, VARIABLE_STEP__VALUE);

		isEmptyEClass = createEClass(IS_EMPTY);

		onTypeEClass = createEClass(ON_TYPE);
		createEAttribute(onTypeEClass, ON_TYPE__TYPE);

		parametrizedStepEClass = createEClass(PARAMETRIZED_STEP);
		createEAttribute(parametrizedStepEClass, PARAMETRIZED_STEP__NAME);

		executionEClass = createEClass(EXECUTION);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__COMPOSITON_TYPE);
		createEReference(linkEClass, LINK__ELEMENT);

		// Create enums
		operatorEEnum = createEEnum(OPERATOR);
		fileTypeEEnum = createEEnum(FILE_TYPE);
		timeTypeEEnum = createEEnum(TIME_TYPE);
		memoryUnitEEnum = createEEnum(MEMORY_UNIT);
		timeUnitEEnum = createEEnum(TIME_UNIT);
		strategiesEEnum = createEEnum(STRATEGIES);
		compositionTypeEEnum = createEEnum(COMPOSITION_TYPE);
		quantificatorsEEnum = createEEnum(QUANTIFICATORS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		selectionEClass.getESuperTypes().add(this.getExecution());
		transformationEClass.getESuperTypes().add(this.getExecution());
		creatingEClass.getESuperTypes().add(this.getTransformation());
		copyEClass.getESuperTypes().add(this.getCreating());
		moveEClass.getESuperTypes().add(this.getCreating());
		deleteEClass.getESuperTypes().add(this.getTransformation());
		concreteStepEClass.getESuperTypes().add(this.getGenericStep());
		pathVariableEClass.getESuperTypes().add(this.getExecution());
		filterLeafEClass.getESuperTypes().add(this.getFilterComponent());
		onNameEClass.getESuperTypes().add(this.getOnBasic());
		onExtensionEClass.getESuperTypes().add(this.getOnBasic());
		onMeasureEClass.getESuperTypes().add(this.getFilterLeaf());
		onTimeEClass.getESuperTypes().add(this.getOnMeasure());
		onAttributesEClass.getESuperTypes().add(this.getOnCustom());
		onTagsEClass.getESuperTypes().add(this.getOnCustom());
		onSizeEClass.getESuperTypes().add(this.getOnMeasure());
		onBasicEClass.getESuperTypes().add(this.getFilterLeaf());
		onCustomEClass.getESuperTypes().add(this.getFilterLeaf());
		filterContainerEClass.getESuperTypes().add(this.getFilterComponent());
		variableStepEClass.getESuperTypes().add(this.getGenericStep());
		isEmptyEClass.getESuperTypes().add(this.getOnBasic());
		onTypeEClass.getESuperTypes().add(this.getOnBasic());
		parametrizedStepEClass.getESuperTypes().add(this.getGenericStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPath_Steps(), this.getGenericStep(), null, "steps", null, 1, -1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionEClass, Selection.class, "Selection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelection_Where(), this.getFilterComponent(), null, "where", null, 0, -1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelection_From(), this.getPath(), null, "from", null, 1, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelection_Name(), ecorePackage.getEString(), "name", null, 1, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationEClass, Transformation.class, "Transformation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformation_Source(), this.getSelection(), null, "source", null, 1, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(creatingEClass, Creating.class, "Creating", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreating_Destination(), this.getPath(), null, "destination", null, 1, 1, Creating.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreating_Strategy(), this.getStrategies(), "strategy", null, 0, 1, Creating.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(copyEClass, Copy.class, "Copy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moveEClass, Move.class, "Move", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deleteEClass, Delete.class, "Delete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(concreteStepEClass, ConcreteStep.class, "ConcreteStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcreteStep_Value(), ecorePackage.getEString(), "value", "\"a\"", 1, 1, ConcreteStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteStep_Absolute(), ecorePackage.getEBooleanObject(), "absolute", "false", 0, 1, ConcreteStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathVariableEClass, PathVariable.class, "PathVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathVariable_Value(), this.getPath(), null, "value", null, 1, 1, PathVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, PathVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterLeafEClass, FilterLeaf.class, "FilterLeaf", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilterLeaf_Inverse(), ecorePackage.getEBoolean(), "inverse", "false", 0, 1, FilterLeaf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onNameEClass, OnName.class, "OnName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnName_Name(), ecorePackage.getEString(), "name", null, 1, 1, OnName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onExtensionEClass, OnExtension.class, "OnExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnExtension_Extensions(), ecorePackage.getEString(), "extensions", null, 0, -1, OnExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onMeasureEClass, OnMeasure.class, "OnMeasure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnMeasure_Operator(), this.getOperator(), "operator", null, 1, 1, OnMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnMeasure_Treshold(), ecorePackage.getEInt(), "treshold", null, 1, 1, OnMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onTimeEClass, OnTime.class, "OnTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnTime_Unit(), this.getTimeUnit(), "unit", null, 1, 1, OnTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnTime_TimeOf(), this.getTimeType(), "timeOf", null, 1, 1, OnTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onAttributesEClass, OnAttributes.class, "OnAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnAttributes_Name(), ecorePackage.getEString(), "name", null, 1, 1, OnAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnAttributes_Value(), ecorePackage.getEString(), "value", null, 0, 1, OnAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onTagsEClass, OnTags.class, "OnTags", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnTags_Tags(), ecorePackage.getEString(), "tags", "", 0, -1, OnTags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnTags_Only(), ecorePackage.getEBoolean(), "only", "false", 0, 1, OnTags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnTags_Treshold(), ecorePackage.getEInt(), "treshold", "-1", 0, 1, OnTags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnTags_Quantificator(), this.getQuantificators(), "quantificator", "all", 0, 1, OnTags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onSizeEClass, OnSize.class, "OnSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnSize_Unit(), this.getMemoryUnit(), "unit", null, 1, 1, OnSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onBasicEClass, OnBasic.class, "OnBasic", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(onCustomEClass, OnCustom.class, "OnCustom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(filterContainerEClass, FilterContainer.class, "FilterContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterContainer_Links(), this.getLink(), null, "links", null, 2, -1, FilterContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterComponentEClass, FilterComponent.class, "FilterComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Executions(), this.getExecution(), null, "executions", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericStepEClass, GenericStep.class, "GenericStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableStepEClass, VariableStep.class, "VariableStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableStep_Value(), this.getPathVariable(), null, "value", null, 1, 1, VariableStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isEmptyEClass, IsEmpty.class, "IsEmpty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(onTypeEClass, OnType.class, "OnType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnType_Type(), this.getFileType(), "type", null, 1, 1, OnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parametrizedStepEClass, ParametrizedStep.class, "ParametrizedStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParametrizedStep_Name(), ecorePackage.getEString(), "name", null, 1, 1, ParametrizedStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionEClass, Execution.class, "Execution", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_CompositonType(), this.getCompositionType(), "compositonType", "and", 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Element(), this.getFilterComponent(), null, "element", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(operatorEEnum, Operator.class, "Operator");
		addEEnumLiteral(operatorEEnum, Operator.EQUAL);
		addEEnumLiteral(operatorEEnum, Operator.LESS);
		addEEnumLiteral(operatorEEnum, Operator.MORE);
		addEEnumLiteral(operatorEEnum, Operator.LESS_EQUAL);
		addEEnumLiteral(operatorEEnum, Operator.MORE_EQUAL);

		initEEnum(fileTypeEEnum, FileType.class, "FileType");
		addEEnumLiteral(fileTypeEEnum, FileType.DOCUMENT);
		addEEnumLiteral(fileTypeEEnum, FileType.DIRECTORY);

		initEEnum(timeTypeEEnum, TimeType.class, "TimeType");
		addEEnumLiteral(timeTypeEEnum, TimeType.MODIFIED);
		addEEnumLiteral(timeTypeEEnum, TimeType.CREATED);

		initEEnum(memoryUnitEEnum, MemoryUnit.class, "MemoryUnit");
		addEEnumLiteral(memoryUnitEEnum, MemoryUnit.KB);
		addEEnumLiteral(memoryUnitEEnum, MemoryUnit.MB);
		addEEnumLiteral(memoryUnitEEnum, MemoryUnit.GB);
		addEEnumLiteral(memoryUnitEEnum, MemoryUnit.TB);

		initEEnum(timeUnitEEnum, TimeUnit.class, "TimeUnit");
		addEEnumLiteral(timeUnitEEnum, TimeUnit.MINS);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.HOURS);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.DAYS);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.WEEKS);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.MONTHS);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.YEARS);

		initEEnum(strategiesEEnum, Strategies.class, "Strategies");
		addEEnumLiteral(strategiesEEnum, Strategies.FORCED);
		addEEnumLiteral(strategiesEEnum, Strategies.APPEND);
		addEEnumLiteral(strategiesEEnum, Strategies.CAREFULLY);

		initEEnum(compositionTypeEEnum, CompositionType.class, "CompositionType");
		addEEnumLiteral(compositionTypeEEnum, CompositionType.AND);
		addEEnumLiteral(compositionTypeEEnum, CompositionType.OR);

		initEEnum(quantificatorsEEnum, Quantificators.class, "Quantificators");
		addEEnumLiteral(quantificatorsEEnum, Quantificators.ANY);
		addEEnumLiteral(quantificatorsEEnum, Quantificators.ALL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (concreteStepEClass, 
		   source, 
		   new String[] {
			 "constraints", "dontContainsParametrizedVariable"
		   });			
		addAnnotation
		  (pathVariableEClass, 
		   source, 
		   new String[] {
			 "constraints", "pathVariableRegularName"
		   });			
		addAnnotation
		  (onNameEClass, 
		   source, 
		   new String[] {
			 "constraints", "filterNameRegularName"
		   });			
		addAnnotation
		  (onExtensionEClass, 
		   source, 
		   new String[] {
			 "constraints", "ExtensionsContent"
		   });			
		addAnnotation
		  (onMeasureEClass, 
		   source, 
		   new String[] {
			 "constraints", "tresholdPositive"
		   });			
		addAnnotation
		  (onAttributesEClass, 
		   source, 
		   new String[] {
			 "constraints", "attributeFilterRegularName attributeFilterRegularValue"
		   });			
		addAnnotation
		  (onTagsEClass, 
		   source, 
		   new String[] {
			 "constraints", "TagsTresholdNumberPositiveMinus1 TagsContent"
		   });			
		addAnnotation
		  (parametrizedStepEClass, 
		   source, 
		   new String[] {
			 "constraints", "parametrizedStepRegularName"
		   });	
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";			
		addAnnotation
		  (concreteStepEClass, 
		   source, 
		   new String[] {
			 "dontContainsParametrizedVariable", "\n\t\t\tnot value.matches(\'.*\\\\{\\\\$.\\\\}*.*\')",
			 "dontContainsParametrizedVariable$message", "\'Concrete step can\\\'t hold parametrized variable\'"
		   });			
		addAnnotation
		  (pathVariableEClass, 
		   source, 
		   new String[] {
			 "pathVariableRegularName", "\n\t\t\tname.matches(\'[a-zA-Z][a-zA-Z0-9]*\')",
			 "pathVariableRegularName$message", "\'Must use regular name, starting with letter followed by letters and numbers only\'"
		   });			
		addAnnotation
		  (onNameEClass, 
		   source, 
		   new String[] {
			 "filterNameRegularName", "\n\t\t\tname.matches(\'[a-zA-Z][a-zA-Z0-9]*\')",
			 "filterNameRegularName$message", "\'Must use regular name, starting with letter followed by letters and numbers only\'"
		   });			
		addAnnotation
		  (onExtensionEClass, 
		   source, 
		   new String[] {
			 "ExtensionsContent", "\n\t\t\textensions->forAll(ex:String |  ex.matches(\'[a-zA-Z][a-zA-Z0-9]*\') )",
			 "ExtensionsContent$message", "\'Tags must be regular identifiers\'"
		   });			
		addAnnotation
		  (onMeasureEClass, 
		   source, 
		   new String[] {
			 "tresholdPositive", "\n\t\t\ttreshold>0",
			 "tresholdPositive$message", "\'Treshold must be positive\'"
		   });			
		addAnnotation
		  (onAttributesEClass, 
		   source, 
		   new String[] {
			 "attributeFilterRegularName", "\n\t\t\tname.matches(\'[a-zA-Z][a-zA-Z0-9]*\')",
			 "attributeFilterRegularName$message", "\'Must use regular name, starting with letter followed by letters and numbers only\'",
			 "attributeFilterRegularValue", "\n\t\t\tname.matches(\'[a-zA-Z][a-zA-Z0-9]*\')",
			 "attributeFilterRegularValue$message", "\'Must use regular name, starting with letter followed by letters and numbers only\'"
		   });			
		addAnnotation
		  (onTagsEClass, 
		   source, 
		   new String[] {
			 "TagsTresholdNumberPositiveMinus1", "\n\t\t\ttreshold>=-1",
			 "TagsTresholdNumberPositiveMinus1$message", "\'Treshold must be positive or 0 or -1\'",
			 "TagsContent", "\n\t\t\ttags->forAll(tg:String |  tg.matches(\'[a-zA-Z][a-zA-Z0-9]*\') )",
			 "TagsContent$message", "\'Tags must be regular identifiers\'"
		   });			
		addAnnotation
		  (parametrizedStepEClass, 
		   source, 
		   new String[] {
			 "parametrizedStepRegularName", "\n\t\t\tname.matches(\'[a-zA-Z][a-zA-Z0-9]*\')",
			 "parametrizedStepRegularName$message", "\'Must use regular name, starting with letter followed by letters and numbers only\'"
		   });
	}

} //FileTransferPackagePackageImpl
