/**
 */
package er.tests;

import er.ErFactory;
import er.RegularEntity;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Regular Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegularEntityTest extends TestCase
{

  /**
	 * The fixture for this Regular Entity test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RegularEntity fixture = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(RegularEntityTest.class);
	}

  /**
	 * Constructs a new Regular Entity test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RegularEntityTest(String name)
  {
		super(name);
	}

  /**
	 * Sets the fixture for this Regular Entity test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void setFixture(RegularEntity fixture)
  {
		this.fixture = fixture;
	}

  /**
	 * Returns the fixture for this Regular Entity test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RegularEntity getFixture()
  {
		return fixture;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
  @Override
  protected void setUp() throws Exception
  {
		setFixture(ErFactory.eINSTANCE.createRegularEntity());
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
  @Override
  protected void tearDown() throws Exception
  {
		setFixture(null);
	}

} //RegularEntityTest
