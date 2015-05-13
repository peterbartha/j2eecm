/**
 */
package components.tests;

import components.ComponentsFactory;
import components.strutsLinkRelation;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>struts Link Relation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class strutsLinkRelationTest extends WebContainerRelationsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(strutsLinkRelationTest.class);
	}

	/**
	 * Constructs a new struts Link Relation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public strutsLinkRelationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this struts Link Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected strutsLinkRelation getFixture() {
		return (strutsLinkRelation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ComponentsFactory.eINSTANCE.createstrutsLinkRelation());
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

} //strutsLinkRelationTest
