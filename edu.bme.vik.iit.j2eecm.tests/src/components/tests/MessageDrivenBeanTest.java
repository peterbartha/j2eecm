/**
 */
package components.tests;

import components.ComponentsFactory;
import components.MessageDrivenBean;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Message Driven Bean</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageDrivenBeanTest extends EJBTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MessageDrivenBeanTest.class);
	}

	/**
	 * Constructs a new Message Driven Bean test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDrivenBeanTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Message Driven Bean test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MessageDrivenBean getFixture() {
		return (MessageDrivenBean)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ComponentsFactory.eINSTANCE.createMessageDrivenBean());
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

} //MessageDrivenBeanTest
