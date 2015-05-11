/**
 */
package components.tests;

import components.ComponentsFactory;
import components.StatelessSessionBean;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stateless Session Bean</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatelessSessionBeanTest extends SessionBeanTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StatelessSessionBeanTest.class);
	}

	/**
	 * Constructs a new Stateless Session Bean test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatelessSessionBeanTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Stateless Session Bean test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StatelessSessionBean getFixture() {
		return (StatelessSessionBean)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ComponentsFactory.eINSTANCE.createStatelessSessionBean());
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

} //StatelessSessionBeanTest
