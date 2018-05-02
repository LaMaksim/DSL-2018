/**
 */
package FileTransferPackage.tests;

import FileTransferPackage.ConcreteStep;
import FileTransferPackage.FileTransferPackageFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Concrete Step</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcreteStepTest extends GenericStepTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConcreteStepTest.class);
	}

	/**
	 * Constructs a new Concrete Step test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteStepTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Concrete Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConcreteStep getFixture() {
		return (ConcreteStep)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FileTransferPackageFactory.eINSTANCE.createConcreteStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ConcreteStepTest
