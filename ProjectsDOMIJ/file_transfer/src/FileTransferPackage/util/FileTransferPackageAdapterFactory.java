/**
 */
package FileTransferPackage.util;

import FileTransferPackage.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see FileTransferPackage.FileTransferPackagePackage
 * @generated
 */
public class FileTransferPackageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FileTransferPackagePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileTransferPackageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FileTransferPackagePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileTransferPackageSwitch<Adapter> modelSwitch =
		new FileTransferPackageSwitch<Adapter>() {
			@Override
			public Adapter casePath(Path object) {
				return createPathAdapter();
			}
			@Override
			public Adapter caseSelection(Selection object) {
				return createSelectionAdapter();
			}
			@Override
			public Adapter caseTransformation(Transformation object) {
				return createTransformationAdapter();
			}
			@Override
			public Adapter caseCreating(Creating object) {
				return createCreatingAdapter();
			}
			@Override
			public Adapter caseCopy(Copy object) {
				return createCopyAdapter();
			}
			@Override
			public Adapter caseMove(Move object) {
				return createMoveAdapter();
			}
			@Override
			public Adapter caseDelete(Delete object) {
				return createDeleteAdapter();
			}
			@Override
			public Adapter caseConcreteStep(ConcreteStep object) {
				return createConcreteStepAdapter();
			}
			@Override
			public Adapter casePathVariable(PathVariable object) {
				return createPathVariableAdapter();
			}
			@Override
			public Adapter caseFilterLeaf(FilterLeaf object) {
				return createFilterLeafAdapter();
			}
			@Override
			public Adapter caseOnName(OnName object) {
				return createOnNameAdapter();
			}
			@Override
			public Adapter caseOnExtension(OnExtension object) {
				return createOnExtensionAdapter();
			}
			@Override
			public Adapter caseOnMeasure(OnMeasure object) {
				return createOnMeasureAdapter();
			}
			@Override
			public Adapter caseOnTime(OnTime object) {
				return createOnTimeAdapter();
			}
			@Override
			public Adapter caseOnAttributes(OnAttributes object) {
				return createOnAttributesAdapter();
			}
			@Override
			public Adapter caseOnTags(OnTags object) {
				return createOnTagsAdapter();
			}
			@Override
			public Adapter caseOnSize(OnSize object) {
				return createOnSizeAdapter();
			}
			@Override
			public Adapter caseOnBasic(OnBasic object) {
				return createOnBasicAdapter();
			}
			@Override
			public Adapter caseOnCustom(OnCustom object) {
				return createOnCustomAdapter();
			}
			@Override
			public Adapter caseFilterContainer(FilterContainer object) {
				return createFilterContainerAdapter();
			}
			@Override
			public Adapter caseFilterComponent(FilterComponent object) {
				return createFilterComponentAdapter();
			}
			@Override
			public Adapter caseSelectionVariable(SelectionVariable object) {
				return createSelectionVariableAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseGenericStep(GenericStep object) {
				return createGenericStepAdapter();
			}
			@Override
			public Adapter caseVariableStep(VariableStep object) {
				return createVariableStepAdapter();
			}
			@Override
			public Adapter caseIsEmpty(IsEmpty object) {
				return createIsEmptyAdapter();
			}
			@Override
			public Adapter caseOnType(OnType object) {
				return createOnTypeAdapter();
			}
			@Override
			public Adapter caseParametrizedStep(ParametrizedStep object) {
				return createParametrizedStepAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.Path
	 * @generated
	 */
	public Adapter createPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.Selection
	 * @generated
	 */
	public Adapter createSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.Transformation
	 * @generated
	 */
	public Adapter createTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.Creating <em>Creating</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.Creating
	 * @generated
	 */
	public Adapter createCreatingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.Copy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.Copy
	 * @generated
	 */
	public Adapter createCopyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.Move
	 * @generated
	 */
	public Adapter createMoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.Delete
	 * @generated
	 */
	public Adapter createDeleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.ConcreteStep <em>Concrete Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.ConcreteStep
	 * @generated
	 */
	public Adapter createConcreteStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.PathVariable <em>Path Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.PathVariable
	 * @generated
	 */
	public Adapter createPathVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.FilterLeaf <em>Filter Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.FilterLeaf
	 * @generated
	 */
	public Adapter createFilterLeafAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.OnName <em>On Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.OnName
	 * @generated
	 */
	public Adapter createOnNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.OnExtension <em>On Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.OnExtension
	 * @generated
	 */
	public Adapter createOnExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.OnMeasure <em>On Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.OnMeasure
	 * @generated
	 */
	public Adapter createOnMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.OnTime <em>On Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.OnTime
	 * @generated
	 */
	public Adapter createOnTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.OnAttributes <em>On Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.OnAttributes
	 * @generated
	 */
	public Adapter createOnAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.OnTags <em>On Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.OnTags
	 * @generated
	 */
	public Adapter createOnTagsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.OnSize <em>On Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.OnSize
	 * @generated
	 */
	public Adapter createOnSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.OnBasic <em>On Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.OnBasic
	 * @generated
	 */
	public Adapter createOnBasicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.OnCustom <em>On Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.OnCustom
	 * @generated
	 */
	public Adapter createOnCustomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.FilterContainer <em>Filter Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.FilterContainer
	 * @generated
	 */
	public Adapter createFilterContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.FilterComponent <em>Filter Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.FilterComponent
	 * @generated
	 */
	public Adapter createFilterComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.SelectionVariable <em>Selection Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.SelectionVariable
	 * @generated
	 */
	public Adapter createSelectionVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.GenericStep <em>Generic Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.GenericStep
	 * @generated
	 */
	public Adapter createGenericStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.VariableStep <em>Variable Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.VariableStep
	 * @generated
	 */
	public Adapter createVariableStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.IsEmpty <em>Is Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.IsEmpty
	 * @generated
	 */
	public Adapter createIsEmptyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.OnType <em>On Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.OnType
	 * @generated
	 */
	public Adapter createOnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FileTransferPackage.ParametrizedStep <em>Parametrized Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileTransferPackage.ParametrizedStep
	 * @generated
	 */
	public Adapter createParametrizedStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FileTransferPackageAdapterFactory
