/**
 */
package components.tests;

import components.ComponentsFactory;
import components.webModelRelationship;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>web Model Relationship</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class webModelRelationshipTest extends WebContainerRelationsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(webModelRelationshipTest.class);
	}

	/**
	 * Constructs a new web Model Relationship test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public webModelRelationshipTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this web Model Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected webModelRelationship getFixture() {
		return (webModelRelationship)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ComponentsFactory.eINSTANCE.createwebModelRelationship());
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

} //webModelRelationshipTest
