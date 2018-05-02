/**
 */
package FileTransferPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see FileTransferPackage.FileTransferPackageFactory
 * @model kind="package"
 * @generated
 */
public interface FileTransferPackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FileTransferPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://lamaksim.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "maksim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FileTransferPackagePackage eINSTANCE = FileTransferPackage.impl.FileTransferPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.PathImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getPath()
	 * @generated
	 */
	int PATH = 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__STEPS = 0;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.Execution <em>Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.Execution
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getExecution()
	 * @generated
	 */
	int EXECUTION = 27;

	/**
	 * The number of structural features of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.SelectionImpl <em>Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.SelectionImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getSelection()
	 * @generated
	 */
	int SELECTION = 1;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__WHERE = EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__FROM = EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__NAME = EXECUTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FEATURE_COUNT = EXECUTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_OPERATION_COUNT = EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.Transformation <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.Transformation
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__SOURCE = EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPERATION_COUNT = EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.Creating <em>Creating</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.Creating
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getCreating()
	 * @generated
	 */
	int CREATING = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATING__SOURCE = TRANSFORMATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATING__DESTINATION = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATING__STRATEGY = TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Creating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATING_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Creating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATING_OPERATION_COUNT = TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.CopyImpl <em>Copy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.CopyImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getCopy()
	 * @generated
	 */
	int COPY = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__SOURCE = CREATING__SOURCE;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__DESTINATION = CREATING__DESTINATION;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__STRATEGY = CREATING__STRATEGY;

	/**
	 * The number of structural features of the '<em>Copy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_FEATURE_COUNT = CREATING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Copy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OPERATION_COUNT = CREATING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.MoveImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__SOURCE = CREATING__SOURCE;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__DESTINATION = CREATING__DESTINATION;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__STRATEGY = CREATING__STRATEGY;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = CREATING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_OPERATION_COUNT = CREATING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.DeleteImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__SOURCE = TRANSFORMATION__SOURCE;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_OPERATION_COUNT = TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.GenericStepImpl <em>Generic Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.GenericStepImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getGenericStep()
	 * @generated
	 */
	int GENERIC_STEP = 22;

	/**
	 * The number of structural features of the '<em>Generic Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Generic Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.ConcreteStepImpl <em>Concrete Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.ConcreteStepImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getConcreteStep()
	 * @generated
	 */
	int CONCRETE_STEP = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STEP__VALUE = GENERIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concrete Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STEP_FEATURE_COUNT = GENERIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Concrete Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STEP_OPERATION_COUNT = GENERIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.PathVariableImpl <em>Path Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.PathVariableImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getPathVariable()
	 * @generated
	 */
	int PATH_VARIABLE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE__VALUE = EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE__NAME = EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Path Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_FEATURE_COUNT = EXECUTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Path Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_OPERATION_COUNT = EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.FilterComponentImpl <em>Filter Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.FilterComponentImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getFilterComponent()
	 * @generated
	 */
	int FILTER_COMPONENT = 20;

	/**
	 * The number of structural features of the '<em>Filter Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Filter Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.FilterLeafImpl <em>Filter Leaf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.FilterLeafImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getFilterLeaf()
	 * @generated
	 */
	int FILTER_LEAF = 9;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_LEAF__INVERSE = FILTER_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filter Leaf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_LEAF_FEATURE_COUNT = FILTER_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Filter Leaf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_LEAF_OPERATION_COUNT = FILTER_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.OnBasicImpl <em>On Basic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.OnBasicImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getOnBasic()
	 * @generated
	 */
	int ON_BASIC = 17;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_BASIC__INVERSE = FILTER_LEAF__INVERSE;

	/**
	 * The number of structural features of the '<em>On Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_BASIC_FEATURE_COUNT = FILTER_LEAF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>On Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_BASIC_OPERATION_COUNT = FILTER_LEAF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.OnNameImpl <em>On Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.OnNameImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getOnName()
	 * @generated
	 */
	int ON_NAME = 10;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_NAME__INVERSE = ON_BASIC__INVERSE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_NAME__NAME = ON_BASIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>On Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_NAME_FEATURE_COUNT = ON_BASIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>On Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_NAME_OPERATION_COUNT = ON_BASIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.OnExtensionImpl <em>On Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.OnExtensionImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getOnExtension()
	 * @generated
	 */
	int ON_EXTENSION = 11;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXTENSION__INVERSE = ON_BASIC__INVERSE;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXTENSION__EXTENSIONS = ON_BASIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>On Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXTENSION_FEATURE_COUNT = ON_BASIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>On Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXTENSION_OPERATION_COUNT = ON_BASIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.OnMeasureImpl <em>On Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.OnMeasureImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getOnMeasure()
	 * @generated
	 */
	int ON_MEASURE = 12;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MEASURE__INVERSE = FILTER_LEAF__INVERSE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MEASURE__OPERATOR = FILTER_LEAF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Treshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MEASURE__TRESHOLD = FILTER_LEAF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>On Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MEASURE_FEATURE_COUNT = FILTER_LEAF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>On Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MEASURE_OPERATION_COUNT = FILTER_LEAF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.OnTimeImpl <em>On Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.OnTimeImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getOnTime()
	 * @generated
	 */
	int ON_TIME = 13;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TIME__INVERSE = ON_MEASURE__INVERSE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TIME__OPERATOR = ON_MEASURE__OPERATOR;

	/**
	 * The feature id for the '<em><b>Treshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TIME__TRESHOLD = ON_MEASURE__TRESHOLD;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TIME__UNIT = ON_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TIME__TIME_OF = ON_MEASURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>On Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TIME_FEATURE_COUNT = ON_MEASURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>On Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TIME_OPERATION_COUNT = ON_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.OnCustomImpl <em>On Custom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.OnCustomImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getOnCustom()
	 * @generated
	 */
	int ON_CUSTOM = 18;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_CUSTOM__INVERSE = FILTER_LEAF__INVERSE;

	/**
	 * The number of structural features of the '<em>On Custom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_CUSTOM_FEATURE_COUNT = FILTER_LEAF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>On Custom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_CUSTOM_OPERATION_COUNT = FILTER_LEAF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.OnAttributesImpl <em>On Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.OnAttributesImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getOnAttributes()
	 * @generated
	 */
	int ON_ATTRIBUTES = 14;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ATTRIBUTES__INVERSE = ON_CUSTOM__INVERSE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ATTRIBUTES__NAME = ON_CUSTOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ATTRIBUTES__VALUE = ON_CUSTOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>On Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ATTRIBUTES_FEATURE_COUNT = ON_CUSTOM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>On Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ATTRIBUTES_OPERATION_COUNT = ON_CUSTOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.OnTagsImpl <em>On Tags</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.OnTagsImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getOnTags()
	 * @generated
	 */
	int ON_TAGS = 15;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TAGS__INVERSE = ON_CUSTOM__INVERSE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TAGS__TAGS = ON_CUSTOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TAGS__ONLY = ON_CUSTOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Treshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TAGS__TRESHOLD = ON_CUSTOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Quantificator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TAGS__QUANTIFICATOR = ON_CUSTOM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>On Tags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TAGS_FEATURE_COUNT = ON_CUSTOM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>On Tags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TAGS_OPERATION_COUNT = ON_CUSTOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.OnSizeImpl <em>On Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.OnSizeImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getOnSize()
	 * @generated
	 */
	int ON_SIZE = 16;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SIZE__INVERSE = ON_MEASURE__INVERSE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SIZE__OPERATOR = ON_MEASURE__OPERATOR;

	/**
	 * The feature id for the '<em><b>Treshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SIZE__TRESHOLD = ON_MEASURE__TRESHOLD;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SIZE__UNIT = ON_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>On Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SIZE_FEATURE_COUNT = ON_MEASURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>On Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SIZE_OPERATION_COUNT = ON_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.FilterContainerImpl <em>Filter Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.FilterContainerImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getFilterContainer()
	 * @generated
	 */
	int FILTER_CONTAINER = 19;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONTAINER__LINKS = FILTER_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filter Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONTAINER_FEATURE_COUNT = FILTER_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Filter Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONTAINER_OPERATION_COUNT = FILTER_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.ModelImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 21;

	/**
	 * The feature id for the '<em><b>Executions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__EXECUTIONS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.VariableStepImpl <em>Variable Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.VariableStepImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getVariableStep()
	 * @generated
	 */
	int VARIABLE_STEP = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_STEP__VALUE = GENERIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_STEP_FEATURE_COUNT = GENERIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_STEP_OPERATION_COUNT = GENERIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.IsEmptyImpl <em>Is Empty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.IsEmptyImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getIsEmpty()
	 * @generated
	 */
	int IS_EMPTY = 24;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EMPTY__INVERSE = ON_BASIC__INVERSE;

	/**
	 * The number of structural features of the '<em>Is Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EMPTY_FEATURE_COUNT = ON_BASIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EMPTY_OPERATION_COUNT = ON_BASIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.OnTypeImpl <em>On Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.OnTypeImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getOnType()
	 * @generated
	 */
	int ON_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TYPE__INVERSE = ON_BASIC__INVERSE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TYPE__TYPE = ON_BASIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>On Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TYPE_FEATURE_COUNT = ON_BASIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>On Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TYPE_OPERATION_COUNT = ON_BASIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.ParametrizedStepImpl <em>Parametrized Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.ParametrizedStepImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getParametrizedStep()
	 * @generated
	 */
	int PARAMETRIZED_STEP = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIZED_STEP__NAME = GENERIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parametrized Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIZED_STEP_FEATURE_COUNT = GENERIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parametrized Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIZED_STEP_OPERATION_COUNT = GENERIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.impl.LinkImpl
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getLink()
	 * @generated
	 */
	int LINK = 28;

	/**
	 * The feature id for the '<em><b>Compositon Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__COMPOSITON_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FileTransferPackage.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.Operator
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 29;

	/**
	 * The meta object id for the '{@link FileTransferPackage.FileType <em>File Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.FileType
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getFileType()
	 * @generated
	 */
	int FILE_TYPE = 30;

	/**
	 * The meta object id for the '{@link FileTransferPackage.TimeType <em>Time Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.TimeType
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getTimeType()
	 * @generated
	 */
	int TIME_TYPE = 31;

	/**
	 * The meta object id for the '{@link FileTransferPackage.MemoryUnit <em>Memory Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.MemoryUnit
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getMemoryUnit()
	 * @generated
	 */
	int MEMORY_UNIT = 32;

	/**
	 * The meta object id for the '{@link FileTransferPackage.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.TimeUnit
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 33;

	/**
	 * The meta object id for the '{@link FileTransferPackage.Strategies <em>Strategies</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.Strategies
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getStrategies()
	 * @generated
	 */
	int STRATEGIES = 34;

	/**
	 * The meta object id for the '{@link FileTransferPackage.CompositionType <em>Composition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.CompositionType
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getCompositionType()
	 * @generated
	 */
	int COMPOSITION_TYPE = 35;

	/**
	 * The meta object id for the '{@link FileTransferPackage.Quantificators <em>Quantificators</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileTransferPackage.Quantificators
	 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getQuantificators()
	 * @generated
	 */
	int QUANTIFICATORS = 36;


	/**
	 * Returns the meta object for class '{@link FileTransferPackage.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see FileTransferPackage.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the containment reference list '{@link FileTransferPackage.Path#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see FileTransferPackage.Path#getSteps()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Steps();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection</em>'.
	 * @see FileTransferPackage.Selection
	 * @generated
	 */
	EClass getSelection();

	/**
	 * Returns the meta object for the containment reference list '{@link FileTransferPackage.Selection#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Where</em>'.
	 * @see FileTransferPackage.Selection#getWhere()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_Where();

	/**
	 * Returns the meta object for the containment reference '{@link FileTransferPackage.Selection#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see FileTransferPackage.Selection#getFrom()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_From();

	/**
	 * Returns the meta object for the attribute '{@link FileTransferPackage.Selection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FileTransferPackage.Selection#getName()
	 * @see #getSelection()
	 * @generated
	 */
	EAttribute getSelection_Name();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see FileTransferPackage.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the reference '{@link FileTransferPackage.Transformation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see FileTransferPackage.Transformation#getSource()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Source();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.Creating <em>Creating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creating</em>'.
	 * @see FileTransferPackage.Creating
	 * @generated
	 */
	EClass getCreating();

	/**
	 * Returns the meta object for the containment reference '{@link FileTransferPackage.Creating#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination</em>'.
	 * @see FileTransferPackage.Creating#getDestination()
	 * @see #getCreating()
	 * @generated
	 */
	EReference getCreating_Destination();

	/**
	 * Returns the meta object for the attribute '{@link FileTransferPackage.Creating#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see FileTransferPackage.Creating#getStrategy()
	 * @see #getCreating()
	 * @generated
	 */
	EAttribute getCreating_Strategy();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.Copy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy</em>'.
	 * @see FileTransferPackage.Copy
	 * @generated
	 */
	EClass getCopy();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see FileTransferPackage.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see FileTransferPackage.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.ConcreteStep <em>Concrete Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Step</em>'.
	 * @see FileTransferPackage.ConcreteStep
	 * @generated
	 */
	EClass getConcreteStep();

	/**
	 * Returns the meta object for the attribute '{@link FileTransferPackage.ConcreteStep#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see FileTransferPackage.ConcreteStep#getValue()
	 * @see #getConcreteStep()
	 * @generated
	 */
	EAttribute getConcreteStep_Value();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.PathVariable <em>Path Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Variable</em>'.
	 * @see FileTransferPackage.PathVariable
	 * @generated
	 */
	EClass getPathVariable();

	/**
	 * Returns the meta object for the containment reference '{@link FileTransferPackage.PathVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see FileTransferPackage.PathVariable#getValue()
	 * @see #getPathVariable()
	 * @generated
	 */
	EReference getPathVariable_Value();

	/**
	 * Returns the meta object for the attribute '{@link FileTransferPackage.PathVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FileTransferPackage.PathVariable#getName()
	 * @see #getPathVariable()
	 * @generated
	 */
	EAttribute getPathVariable_Name();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.FilterLeaf <em>Filter Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Leaf</em>'.
	 * @see FileTransferPackage.FilterLeaf
	 * @generated
	 */
	EClass getFilterLeaf();

	/**
	 * Returns the meta object for the attribute '{@link FileTransferPackage.FilterLeaf#isInverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverse</em>'.
	 * @see FileTransferPackage.FilterLeaf#isInverse()
	 * @see #getFilterLeaf()
	 * @generated
	 */
	EAttribute getFilterLeaf_Inverse();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.OnName <em>On Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Name</em>'.
	 * @see FileTransferPackage.OnName
	 * @generated
	 */
	EClass getOnName();

	/**
	 * Returns the meta object for the attribute '{@link FileTransferPackage.OnName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FileTransferPackage.OnName#getName()
	 * @see #getOnName()
	 * @generated
	 */
	EAttribute getOnName_Name();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.OnExtension <em>On Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Extension</em>'.
	 * @see FileTransferPackage.OnExtension
	 * @generated
	 */
	EClass getOnExtension();

	/**
	 * Returns the meta object for the attribute list '{@link FileTransferPackage.OnExtension#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Extensions</em>'.
	 * @see FileTransferPackage.OnExtension#getExtensions()
	 * @see #getOnExtension()
	 * @generated
	 */
	EAttribute getOnExtension_Extensions();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.OnMeasure <em>On Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Measure</em>'.
	 * @see FileTransferPackage.OnMeasure
	 * @generated
	 */
	EClass getOnMeasure();

	/**
	 * Returns the meta object for the attribute '{@link FileTransferPackage.OnMeasure#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see FileTransferPackage.OnMeasure#getOperator()
	 * @see #getOnMeasure()
	 * @generated
	 */
	EAttribute getOnMeasure_Operator();

	/**
	 * Returns the meta object for the attribute '{@link FileTransferPackage.OnMeasure#getTreshold <em>Treshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Treshold</em>'.
	 * @see FileTransferPackage.OnMeasure#getTreshold()
	 * @see #getOnMeasure()
	 * @generated
	 */
	EAttribute getOnMeasure_Treshold();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.OnTime <em>On Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Time</em>'.
	 * @see FileTransferPackage.OnTime
	 * @generated
	 */
	EClass getOnTime();

	/**
	 * Returns the meta object for the attribute '{@link FileTransferPackage.OnTime#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see FileTransferPackage.OnTime#getUnit()
	 * @see #getOnTime()
	 * @generated
	 */
	EAttribute getOnTime_Unit();

	/**
	 * Returns the meta object for the attribute '{@link FileTransferPackage.OnTime#getTimeOf <em>Time Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Of</em>'.
	 * @see FileTransferPackage.OnTime#getTimeOf()
	 * @see #getOnTime()
	 * @generated
	 */
	EAttribute getOnTime_TimeOf();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.OnAttributes <em>On Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Attributes</em>'.
	 * @see FileTransferPackage.OnAttributes
	 * @generated
	 */
	EClass getOnAttributes();

	/**
	 * Returns the meta object for the attribute '{@link FileTransferPackage.OnAttributes#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FileTransferPackage.OnAttributes#getName()
	 * @see #getOnAttributes()
	 * @generated
	 */
	EAttribute getOnAttributes_Name();

	/**
	 * Returns the meta object for the attribute '{@link FileTransferPackage.OnAttributes#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see FileTransferPackage.OnAttributes#getValue()
	 * @see #getOnAttributes()
	 * @generated
	 */
	EAttribute getOnAttributes_Value();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.OnTags <em>On Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Tags</em>'.
	 * @see FileTransferPackage.OnTags
	 * @generated
	 */
	EClass getOnTags();

	/**
	 * Returns the meta object for the attribute list '{@link FileTransferPackage.OnTags#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags</em>'.
	 * @see FileTransferPackage.OnTags#getTags()
	 * @see #getOnTags()
	 * @generated
	 */
	EAttribute getOnTags_Tags();

	/**
	 * Returns the meta object for the attribute '{@link FileTransferPackage.OnTags#isOnly <em>Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only</em>'.
	 * @see FileTransferPackage.OnTags#isOnly()
	 * @see #getOnTags()
	 * @generated
	 */
	EAttribute getOnTags_Only();

	/**
	 * Returns the meta object for the attribute '{@link FileTransferPackage.OnTags#getTreshold <em>Treshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Treshold</em>'.
	 * @see FileTransferPackage.OnTags#getTreshold()
	 * @see #getOnTags()
	 * @generated
	 */
	EAttribute getOnTags_Treshold();

	/**
	 * Returns the meta object for the attribute '{@link FileTransferPackage.OnTags#getQuantificator <em>Quantificator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantificator</em>'.
	 * @see FileTransferPackage.OnTags#getQuantificator()
	 * @see #getOnTags()
	 * @generated
	 */
	EAttribute getOnTags_Quantificator();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.OnSize <em>On Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Size</em>'.
	 * @see FileTransferPackage.OnSize
	 * @generated
	 */
	EClass getOnSize();

	/**
	 * Returns the meta object for the attribute '{@link FileTransferPackage.OnSize#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see FileTransferPackage.OnSize#getUnit()
	 * @see #getOnSize()
	 * @generated
	 */
	EAttribute getOnSize_Unit();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.OnBasic <em>On Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Basic</em>'.
	 * @see FileTransferPackage.OnBasic
	 * @generated
	 */
	EClass getOnBasic();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.OnCustom <em>On Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Custom</em>'.
	 * @see FileTransferPackage.OnCustom
	 * @generated
	 */
	EClass getOnCustom();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.FilterContainer <em>Filter Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Container</em>'.
	 * @see FileTransferPackage.FilterContainer
	 * @generated
	 */
	EClass getFilterContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link FileTransferPackage.FilterContainer#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see FileTransferPackage.FilterContainer#getLinks()
	 * @see #getFilterContainer()
	 * @generated
	 */
	EReference getFilterContainer_Links();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.FilterComponent <em>Filter Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Component</em>'.
	 * @see FileTransferPackage.FilterComponent
	 * @generated
	 */
	EClass getFilterComponent();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see FileTransferPackage.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link FileTransferPackage.Model#getExecutions <em>Executions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executions</em>'.
	 * @see FileTransferPackage.Model#getExecutions()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Executions();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.GenericStep <em>Generic Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Step</em>'.
	 * @see FileTransferPackage.GenericStep
	 * @generated
	 */
	EClass getGenericStep();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.VariableStep <em>Variable Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Step</em>'.
	 * @see FileTransferPackage.VariableStep
	 * @generated
	 */
	EClass getVariableStep();

	/**
	 * Returns the meta object for the reference '{@link FileTransferPackage.VariableStep#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see FileTransferPackage.VariableStep#getValue()
	 * @see #getVariableStep()
	 * @generated
	 */
	EReference getVariableStep_Value();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.IsEmpty <em>Is Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Empty</em>'.
	 * @see FileTransferPackage.IsEmpty
	 * @generated
	 */
	EClass getIsEmpty();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.OnType <em>On Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Type</em>'.
	 * @see FileTransferPackage.OnType
	 * @generated
	 */
	EClass getOnType();

	/**
	 * Returns the meta object for the attribute '{@link FileTransferPackage.OnType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see FileTransferPackage.OnType#getType()
	 * @see #getOnType()
	 * @generated
	 */
	EAttribute getOnType_Type();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.ParametrizedStep <em>Parametrized Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametrized Step</em>'.
	 * @see FileTransferPackage.ParametrizedStep
	 * @generated
	 */
	EClass getParametrizedStep();

	/**
	 * Returns the meta object for the attribute '{@link FileTransferPackage.ParametrizedStep#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FileTransferPackage.ParametrizedStep#getName()
	 * @see #getParametrizedStep()
	 * @generated
	 */
	EAttribute getParametrizedStep_Name();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.Execution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution</em>'.
	 * @see FileTransferPackage.Execution
	 * @generated
	 */
	EClass getExecution();

	/**
	 * Returns the meta object for class '{@link FileTransferPackage.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see FileTransferPackage.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link FileTransferPackage.Link#getCompositonType <em>Compositon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compositon Type</em>'.
	 * @see FileTransferPackage.Link#getCompositonType()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_CompositonType();

	/**
	 * Returns the meta object for the containment reference '{@link FileTransferPackage.Link#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see FileTransferPackage.Link#getElement()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Element();

	/**
	 * Returns the meta object for enum '{@link FileTransferPackage.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see FileTransferPackage.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the meta object for enum '{@link FileTransferPackage.FileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>File Type</em>'.
	 * @see FileTransferPackage.FileType
	 * @generated
	 */
	EEnum getFileType();

	/**
	 * Returns the meta object for enum '{@link FileTransferPackage.TimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Type</em>'.
	 * @see FileTransferPackage.TimeType
	 * @generated
	 */
	EEnum getTimeType();

	/**
	 * Returns the meta object for enum '{@link FileTransferPackage.MemoryUnit <em>Memory Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Memory Unit</em>'.
	 * @see FileTransferPackage.MemoryUnit
	 * @generated
	 */
	EEnum getMemoryUnit();

	/**
	 * Returns the meta object for enum '{@link FileTransferPackage.TimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit</em>'.
	 * @see FileTransferPackage.TimeUnit
	 * @generated
	 */
	EEnum getTimeUnit();

	/**
	 * Returns the meta object for enum '{@link FileTransferPackage.Strategies <em>Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Strategies</em>'.
	 * @see FileTransferPackage.Strategies
	 * @generated
	 */
	EEnum getStrategies();

	/**
	 * Returns the meta object for enum '{@link FileTransferPackage.CompositionType <em>Composition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Composition Type</em>'.
	 * @see FileTransferPackage.CompositionType
	 * @generated
	 */
	EEnum getCompositionType();

	/**
	 * Returns the meta object for enum '{@link FileTransferPackage.Quantificators <em>Quantificators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quantificators</em>'.
	 * @see FileTransferPackage.Quantificators
	 * @generated
	 */
	EEnum getQuantificators();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FileTransferPackageFactory getFileTransferPackageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.PathImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__STEPS = eINSTANCE.getPath_Steps();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.SelectionImpl <em>Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.SelectionImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getSelection()
		 * @generated
		 */
		EClass SELECTION = eINSTANCE.getSelection();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__WHERE = eINSTANCE.getSelection_Where();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__FROM = eINSTANCE.getSelection_From();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION__NAME = eINSTANCE.getSelection_Name();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.Transformation <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.Transformation
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__SOURCE = eINSTANCE.getTransformation_Source();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.Creating <em>Creating</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.Creating
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getCreating()
		 * @generated
		 */
		EClass CREATING = eINSTANCE.getCreating();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATING__DESTINATION = eINSTANCE.getCreating_Destination();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATING__STRATEGY = eINSTANCE.getCreating_Strategy();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.CopyImpl <em>Copy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.CopyImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getCopy()
		 * @generated
		 */
		EClass COPY = eINSTANCE.getCopy();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.MoveImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.DeleteImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.ConcreteStepImpl <em>Concrete Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.ConcreteStepImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getConcreteStep()
		 * @generated
		 */
		EClass CONCRETE_STEP = eINSTANCE.getConcreteStep();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_STEP__VALUE = eINSTANCE.getConcreteStep_Value();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.PathVariableImpl <em>Path Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.PathVariableImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getPathVariable()
		 * @generated
		 */
		EClass PATH_VARIABLE = eINSTANCE.getPathVariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_VARIABLE__VALUE = eINSTANCE.getPathVariable_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_VARIABLE__NAME = eINSTANCE.getPathVariable_Name();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.FilterLeafImpl <em>Filter Leaf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.FilterLeafImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getFilterLeaf()
		 * @generated
		 */
		EClass FILTER_LEAF = eINSTANCE.getFilterLeaf();

		/**
		 * The meta object literal for the '<em><b>Inverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_LEAF__INVERSE = eINSTANCE.getFilterLeaf_Inverse();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.OnNameImpl <em>On Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.OnNameImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getOnName()
		 * @generated
		 */
		EClass ON_NAME = eINSTANCE.getOnName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_NAME__NAME = eINSTANCE.getOnName_Name();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.OnExtensionImpl <em>On Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.OnExtensionImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getOnExtension()
		 * @generated
		 */
		EClass ON_EXTENSION = eINSTANCE.getOnExtension();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_EXTENSION__EXTENSIONS = eINSTANCE.getOnExtension_Extensions();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.OnMeasureImpl <em>On Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.OnMeasureImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getOnMeasure()
		 * @generated
		 */
		EClass ON_MEASURE = eINSTANCE.getOnMeasure();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_MEASURE__OPERATOR = eINSTANCE.getOnMeasure_Operator();

		/**
		 * The meta object literal for the '<em><b>Treshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_MEASURE__TRESHOLD = eINSTANCE.getOnMeasure_Treshold();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.OnTimeImpl <em>On Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.OnTimeImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getOnTime()
		 * @generated
		 */
		EClass ON_TIME = eINSTANCE.getOnTime();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_TIME__UNIT = eINSTANCE.getOnTime_Unit();

		/**
		 * The meta object literal for the '<em><b>Time Of</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_TIME__TIME_OF = eINSTANCE.getOnTime_TimeOf();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.OnAttributesImpl <em>On Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.OnAttributesImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getOnAttributes()
		 * @generated
		 */
		EClass ON_ATTRIBUTES = eINSTANCE.getOnAttributes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_ATTRIBUTES__NAME = eINSTANCE.getOnAttributes_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_ATTRIBUTES__VALUE = eINSTANCE.getOnAttributes_Value();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.OnTagsImpl <em>On Tags</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.OnTagsImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getOnTags()
		 * @generated
		 */
		EClass ON_TAGS = eINSTANCE.getOnTags();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_TAGS__TAGS = eINSTANCE.getOnTags_Tags();

		/**
		 * The meta object literal for the '<em><b>Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_TAGS__ONLY = eINSTANCE.getOnTags_Only();

		/**
		 * The meta object literal for the '<em><b>Treshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_TAGS__TRESHOLD = eINSTANCE.getOnTags_Treshold();

		/**
		 * The meta object literal for the '<em><b>Quantificator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_TAGS__QUANTIFICATOR = eINSTANCE.getOnTags_Quantificator();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.OnSizeImpl <em>On Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.OnSizeImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getOnSize()
		 * @generated
		 */
		EClass ON_SIZE = eINSTANCE.getOnSize();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_SIZE__UNIT = eINSTANCE.getOnSize_Unit();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.OnBasicImpl <em>On Basic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.OnBasicImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getOnBasic()
		 * @generated
		 */
		EClass ON_BASIC = eINSTANCE.getOnBasic();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.OnCustomImpl <em>On Custom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.OnCustomImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getOnCustom()
		 * @generated
		 */
		EClass ON_CUSTOM = eINSTANCE.getOnCustom();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.FilterContainerImpl <em>Filter Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.FilterContainerImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getFilterContainer()
		 * @generated
		 */
		EClass FILTER_CONTAINER = eINSTANCE.getFilterContainer();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_CONTAINER__LINKS = eINSTANCE.getFilterContainer_Links();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.FilterComponentImpl <em>Filter Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.FilterComponentImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getFilterComponent()
		 * @generated
		 */
		EClass FILTER_COMPONENT = eINSTANCE.getFilterComponent();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.ModelImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Executions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__EXECUTIONS = eINSTANCE.getModel_Executions();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.GenericStepImpl <em>Generic Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.GenericStepImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getGenericStep()
		 * @generated
		 */
		EClass GENERIC_STEP = eINSTANCE.getGenericStep();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.VariableStepImpl <em>Variable Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.VariableStepImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getVariableStep()
		 * @generated
		 */
		EClass VARIABLE_STEP = eINSTANCE.getVariableStep();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_STEP__VALUE = eINSTANCE.getVariableStep_Value();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.IsEmptyImpl <em>Is Empty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.IsEmptyImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getIsEmpty()
		 * @generated
		 */
		EClass IS_EMPTY = eINSTANCE.getIsEmpty();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.OnTypeImpl <em>On Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.OnTypeImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getOnType()
		 * @generated
		 */
		EClass ON_TYPE = eINSTANCE.getOnType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_TYPE__TYPE = eINSTANCE.getOnType_Type();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.ParametrizedStepImpl <em>Parametrized Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.ParametrizedStepImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getParametrizedStep()
		 * @generated
		 */
		EClass PARAMETRIZED_STEP = eINSTANCE.getParametrizedStep();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETRIZED_STEP__NAME = eINSTANCE.getParametrizedStep_Name();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.Execution <em>Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.Execution
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getExecution()
		 * @generated
		 */
		EClass EXECUTION = eINSTANCE.getExecution();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.impl.LinkImpl
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Compositon Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__COMPOSITON_TYPE = eINSTANCE.getLink_CompositonType();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__ELEMENT = eINSTANCE.getLink_Element();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.Operator
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.FileType <em>File Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.FileType
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getFileType()
		 * @generated
		 */
		EEnum FILE_TYPE = eINSTANCE.getFileType();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.TimeType <em>Time Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.TimeType
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getTimeType()
		 * @generated
		 */
		EEnum TIME_TYPE = eINSTANCE.getTimeType();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.MemoryUnit <em>Memory Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.MemoryUnit
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getMemoryUnit()
		 * @generated
		 */
		EEnum MEMORY_UNIT = eINSTANCE.getMemoryUnit();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.TimeUnit <em>Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.TimeUnit
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getTimeUnit()
		 * @generated
		 */
		EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.Strategies <em>Strategies</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.Strategies
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getStrategies()
		 * @generated
		 */
		EEnum STRATEGIES = eINSTANCE.getStrategies();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.CompositionType <em>Composition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.CompositionType
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getCompositionType()
		 * @generated
		 */
		EEnum COMPOSITION_TYPE = eINSTANCE.getCompositionType();

		/**
		 * The meta object literal for the '{@link FileTransferPackage.Quantificators <em>Quantificators</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileTransferPackage.Quantificators
		 * @see FileTransferPackage.impl.FileTransferPackagePackageImpl#getQuantificators()
		 * @generated
		 */
		EEnum QUANTIFICATORS = eINSTANCE.getQuantificators();

	}

} //FileTransferPackagePackage
