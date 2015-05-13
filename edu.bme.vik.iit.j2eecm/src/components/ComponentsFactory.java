/**
 */
package components;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see components.ComponentsPackage
 * @generated
 */
public interface ComponentsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentsFactory eINSTANCE = components.impl.ComponentsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client</em>'.
	 * @generated
	 */
	Client createClient();

	/**
	 * Returns a new object of class '<em>J2EE Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>J2EE Server</em>'.
	 * @generated
	 */
	J2EEServer createJ2EEServer();

	/**
	 * Returns a new object of class '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database</em>'.
	 * @generated
	 */
	Database createDatabase();

	/**
	 * Returns a new object of class '<em>Browser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Browser</em>'.
	 * @generated
	 */
	Browser createBrowser();

	/**
	 * Returns a new object of class '<em>Application Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Client</em>'.
	 * @generated
	 */
	ApplicationClient createApplicationClient();

	/**
	 * Returns a new object of class '<em>Web Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Container</em>'.
	 * @generated
	 */
	WebContainer createWebContainer();

	/**
	 * Returns a new object of class '<em>EJB Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EJB Container</em>'.
	 * @generated
	 */
	EJBContainer createEJBContainer();

	/**
	 * Returns a new object of class '<em>Entity Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Bean</em>'.
	 * @generated
	 */
	EntityBean createEntityBean();

	/**
	 * Returns a new object of class '<em>Message Driven Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Driven Bean</em>'.
	 * @generated
	 */
	MessageDrivenBean createMessageDrivenBean();

	/**
	 * Returns a new object of class '<em>Stateless Session Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stateless Session Bean</em>'.
	 * @generated
	 */
	StatelessSessionBean createStatelessSessionBean();

	/**
	 * Returns a new object of class '<em>Stateful Session Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stateful Session Bean</em>'.
	 * @generated
	 */
	StatefulSessionBean createStatefulSessionBean();

	/**
	 * Returns a new object of class '<em>Servlet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Servlet</em>'.
	 * @generated
	 */
	Servlet createServlet();

	/**
	 * Returns a new object of class '<em>JSP Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSP Page</em>'.
	 * @generated
	 */
	JSPPage createJSPPage();

	/**
	 * Returns a new object of class '<em>Container Releationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Releationship</em>'.
	 * @generated
	 */
	ContainerReleationship createContainerReleationship();

	/**
	 * Returns a new object of class '<em>Web Releationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Releationship</em>'.
	 * @generated
	 */
	WebReleationship createWebReleationship();

	/**
	 * Returns a new object of class '<em>App Releationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Releationship</em>'.
	 * @generated
	 */
	AppReleationship createAppReleationship();

	/**
	 * Returns a new object of class '<em>Data Releationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Releationship</em>'.
	 * @generated
	 */
	DataReleationship createDataReleationship();

	/**
	 * Returns a new object of class '<em>Class Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Element</em>'.
	 * @generated
	 */
	ClassElement createClassElement();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association</em>'.
	 * @generated
	 */
	Association createAssociation();

	/**
	 * Returns a new object of class '<em>Package Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Element</em>'.
	 * @generated
	 */
	PackageElement createPackageElement();

	/**
	 * Returns a new object of class '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generalization</em>'.
	 * @generated
	 */
	Generalization createGeneralization();

	/**
	 * Returns a new object of class '<em>web Model Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>web Model Relationship</em>'.
	 * @generated
	 */
	webModelRelationship createwebModelRelationship();

	/**
	 * Returns a new object of class '<em>Interface Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Element</em>'.
	 * @generated
	 */
	InterfaceElement createInterfaceElement();

	/**
	 * Returns a new object of class '<em>Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregation</em>'.
	 * @generated
	 */
	Aggregation createAggregation();

	/**
	 * Returns a new object of class '<em>Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Realization</em>'.
	 * @generated
	 */
	Realization createRealization();

	/**
	 * Returns a new object of class '<em>Struts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Struts</em>'.
	 * @generated
	 */
	Struts createStruts();

	/**
	 * Returns a new object of class '<em>Struts Global</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Struts Global</em>'.
	 * @generated
	 */
	StrutsGlobal createStrutsGlobal();

	/**
	 * Returns a new object of class '<em>Action Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Relationship</em>'.
	 * @generated
	 */
	ActionRelationship createActionRelationship();

	/**
	 * Returns a new object of class '<em>Struts Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Struts Relation</em>'.
	 * @generated
	 */
	StrutsRelation createStrutsRelation();

	/**
	 * Returns a new object of class '<em>XML Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Config</em>'.
	 * @generated
	 */
	XMLConfig createXMLConfig();

	/**
	 * Returns a new object of class '<em>Struts Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Struts Operation</em>'.
	 * @generated
	 */
	StrutsOperation createStrutsOperation();

	/**
	 * Returns a new object of class '<em>Exception Handling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Handling</em>'.
	 * @generated
	 */
	ExceptionHandling createExceptionHandling();

	/**
	 * Returns a new object of class '<em>Event Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Call</em>'.
	 * @generated
	 */
	EventCall createEventCall();

	/**
	 * Returns a new object of class '<em>Enum Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Element</em>'.
	 * @generated
	 */
	EnumElement createEnumElement();

	/**
	 * Returns a new object of class '<em>Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Literal</em>'.
	 * @generated
	 */
	EnumLiteral createEnumLiteral();

	/**
	 * Returns a new object of class '<em>HTML5</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTML5</em>'.
	 * @generated
	 */
	HTML5 createHTML5();

	/**
	 * Returns a new object of class '<em>static Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>static Relationship</em>'.
	 * @generated
	 */
	staticRelationship createstaticRelationship();

	/**
	 * Returns a new object of class '<em>Link Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Element</em>'.
	 * @generated
	 */
	LinkElement createLinkElement();

	/**
	 * Returns a new object of class '<em>link Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>link Relationship</em>'.
	 * @generated
	 */
	linkRelationship createlinkRelationship();

	/**
	 * Returns a new object of class '<em>struts Link Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>struts Link Relation</em>'.
	 * @generated
	 */
	strutsLinkRelation createstrutsLinkRelation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentsPackage getComponentsPackage();

} //ComponentsFactory
