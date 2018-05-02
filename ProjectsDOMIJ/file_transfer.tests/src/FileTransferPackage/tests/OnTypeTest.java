/**
 */
package FileTransferPackage.tests;

import FileTransferPackage.FileTransferPackageFactory;
import FileTransferPackage.OnType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>On Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OnTypeTest extends OnBasicTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OnTypeTest.class);
	}

	/**
	 * Constructs a new On Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this On Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OnType getFixture() {
		return (OnType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FileTransferPackageFactory.eINSTANCE.createOnType());
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

} //OnTypeTest
