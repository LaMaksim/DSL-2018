/**
 */
package er.tests;

import er.AttributeDomain;
import er.ErFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attribute Domain</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeDomainTest extends TestCase
{

  /**
	 * The fixture for this Attribute Domain test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AttributeDomain fixture = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(AttributeDomainTest.class);
	}

  /**
	 * Constructs a new Attribute Domain test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AttributeDomainTest(String name)
  {
		super(name);
	}

  /**
	 * Sets the fixture for this Attribute Domain test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void setFixture(AttributeDomain fixture)
  {
		this.fixture = fixture;
	}

  /**
	 * Returns the fixture for this Attribute Domain test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AttributeDomain getFixture()
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
		setFixture(ErFactory.eINSTANCE.createAttributeDomain());
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

} //AttributeDomainTest
