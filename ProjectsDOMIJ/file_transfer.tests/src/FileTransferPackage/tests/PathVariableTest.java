/**
 */
package FileTransferPackage.tests;

import FileTransferPackage.FileTransferPackageFactory;
import FileTransferPackage.PathVariable;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Path Variable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PathVariableTest extends ExecutionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PathVariableTest.class);
	}

	/**
	 * Constructs a new Path Variable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathVariableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Path Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PathVariable getFixture() {
		return (PathVariable)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FileTransferPackageFactory.eINSTANCE.createPathVariable());
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

} //PathVariableTest