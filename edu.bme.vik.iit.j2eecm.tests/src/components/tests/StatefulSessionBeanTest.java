/**
 */
package components.tests;

import components.ComponentsFactory;
import components.StatefulSessionBean;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stateful Session Bean</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatefulSessionBeanTest extends SessionBeanTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StatefulSessionBeanTest.class);
	}

	/**
	 * Constructs a new Stateful Session Bean test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatefulSessionBeanTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Stateful Session Bean test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StatefulSessionBean getFixture() {
		return (StatefulSessionBean)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ComponentsFactory.eINSTANCE.createStatefulSessionBean());
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

} //StatefulSessionBeanTest
