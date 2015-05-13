/**
 */
package components.tests;

import components.ComponentsFactory;
import components.staticRelationship;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>static Relationship</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class staticRelationshipTest extends WebContainerRelationsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(staticRelationshipTest.class);
	}

	/**
	 * Constructs a new static Relationship test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public staticRelationshipTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this static Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected staticRelationship getFixture() {
		return (staticRelationship)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ComponentsFactory.eINSTANCE.createstaticRelationship());
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

} //staticRelationshipTest
