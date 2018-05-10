/**
 */
package er.tests;

import er.ErFactory;
import er.IdentificationDependency;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Identification Dependency</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdentificationDependencyTest extends RelationshipConceptTest
{

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(IdentificationDependencyTest.class);
	}

  /**
	 * Constructs a new Identification Dependency test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public IdentificationDependencyTest(String name)
  {
		super(name);
	}

  /**
	 * Returns the fixture for this Identification Dependency test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected IdentificationDependency getFixture()
  {
		return (IdentificationDependency)fixture;
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
		setFixture(ErFactory.eINSTANCE.createIdentificationDependency());
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

} //IdentificationDependencyTest
