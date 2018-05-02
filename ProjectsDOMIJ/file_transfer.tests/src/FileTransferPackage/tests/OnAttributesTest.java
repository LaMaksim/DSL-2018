/**
 */
package FileTransferPackage.tests;

import FileTransferPackage.FileTransferPackageFactory;
import FileTransferPackage.OnAttributes;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>On Attributes</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OnAttributesTest extends OnCustomTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OnAttributesTest.class);
	}

	/**
	 * Constructs a new On Attributes test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnAttributesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this On Attributes test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OnAttributes getFixture() {
		return (OnAttributes)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FileTransferPackageFactory.eINSTANCE.createOnAttributes());
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

} //OnAttributesTest
