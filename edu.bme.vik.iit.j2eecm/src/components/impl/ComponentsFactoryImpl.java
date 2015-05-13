/**
 */
package components.impl;

import components.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentsFactoryImpl extends EFactoryImpl implements ComponentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentsFactory init() {
		try {
			ComponentsFactory theComponentsFactory = (ComponentsFactory)EPackage.Registry.INSTANCE.getEFactory(ComponentsPackage.eNS_URI);
			if (theComponentsFactory != null) {
				return theComponentsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ComponentsPackage.MODEL: return createModel();
			case ComponentsPackage.CLIENT: return createClient();
			case ComponentsPackage.J2EE_SERVER: return createJ2EEServer();
			case ComponentsPackage.DATABASE: return createDatabase();
			case ComponentsPackage.BROWSER: return createBrowser();
			case ComponentsPackage.APPLICATION_CLIENT: return createApplicationClient();
			case ComponentsPackage.WEB_CONTAINER: return createWebContainer();
			case ComponentsPackage.EJB_CONTAINER: return createEJBContainer();
			case ComponentsPackage.ENTITY_BEAN: return createEntityBean();
			case ComponentsPackage.MESSAGE_DRIVEN_BEAN: return createMessageDrivenBean();
			case ComponentsPackage.STATELESS_SESSION_BEAN: return createStatelessSessionBean();
			case ComponentsPackage.STATEFUL_SESSION_BEAN: return createStatefulSessionBean();
			case ComponentsPackage.SERVLET: return createServlet();
			case ComponentsPackage.JSP_PAGE: return createJSPPage();
			case ComponentsPackage.CONTAINER_RELEATIONSHIP: return createContainerReleationship();
			case ComponentsPackage.WEB_RELEATIONSHIP: return createWebReleationship();
			case ComponentsPackage.APP_RELEATIONSHIP: return createAppReleationship();
			case ComponentsPackage.DATA_RELEATIONSHIP: return createDataReleationship();
			case ComponentsPackage.CLASS_ELEMENT: return createClassElement();
			case ComponentsPackage.OPERATION: return createOperation();
			case ComponentsPackage.PROPERTY: return createProperty();
			case ComponentsPackage.ASSOCIATION: return createAssociation();
			case ComponentsPackage.PACKAGE_ELEMENT: return createPackageElement();
			case ComponentsPackage.GENERALIZATION: return createGeneralization();
			case ComponentsPackage.WEB_MODEL_RELATIONSHIP: return createwebModelRelationship();
			case ComponentsPackage.INTERFACE_ELEMENT: return createInterfaceElement();
			case ComponentsPackage.AGGREGATION: return createAggregation();
			case ComponentsPackage.REALIZATION: return createRealization();
			case ComponentsPackage.STRUTS: return createStruts();
			case ComponentsPackage.STRUTS_GLOBAL: return createStrutsGlobal();
			case ComponentsPackage.ACTION_RELATIONSHIP: return createActionRelationship();
			case ComponentsPackage.STRUTS_RELATION: return createStrutsRelation();
			case ComponentsPackage.XML_CONFIG: return createXMLConfig();
			case ComponentsPackage.STRUTS_OPERATION: return createStrutsOperation();
			case ComponentsPackage.EXCEPTION_HANDLING: return createExceptionHandling();
			case ComponentsPackage.EVENT_CALL: return createEventCall();
			case ComponentsPackage.ENUM_ELEMENT: return createEnumElement();
			case ComponentsPackage.ENUM_LITERAL: return createEnumLiteral();
			case ComponentsPackage.HTML5: return createHTML5();
			case ComponentsPackage.STATIC_RELATIONSHIP: return createstaticRelationship();
			case ComponentsPackage.LINK_ELEMENT: return createLinkElement();
			case ComponentsPackage.LINK_RELATIONSHIP: return createlinkRelationship();
			case ComponentsPackage.STRUTS_LINK_RELATION: return createstrutsLinkRelation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ComponentsPackage.VISIBILITY_KIND:
				return createVisibilityKindFromString(eDataType, initialValue);
			case ComponentsPackage.VIEW_TYPE_KIND:
				return createViewTypeKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ComponentsPackage.VISIBILITY_KIND:
				return convertVisibilityKindToString(eDataType, instanceValue);
			case ComponentsPackage.VIEW_TYPE_KIND:
				return convertViewTypeKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client createClient() {
		ClientImpl client = new ClientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public J2EEServer createJ2EEServer() {
		J2EEServerImpl j2EEServer = new J2EEServerImpl();
		return j2EEServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database createDatabase() {
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Browser createBrowser() {
		BrowserImpl browser = new BrowserImpl();
		return browser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationClient createApplicationClient() {
		ApplicationClientImpl applicationClient = new ApplicationClientImpl();
		return applicationClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebContainer createWebContainer() {
		WebContainerImpl webContainer = new WebContainerImpl();
		return webContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EJBContainer createEJBContainer() {
		EJBContainerImpl ejbContainer = new EJBContainerImpl();
		return ejbContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityBean createEntityBean() {
		EntityBeanImpl entityBean = new EntityBeanImpl();
		return entityBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDrivenBean createMessageDrivenBean() {
		MessageDrivenBeanImpl messageDrivenBean = new MessageDrivenBeanImpl();
		return messageDrivenBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatelessSessionBean createStatelessSessionBean() {
		StatelessSessionBeanImpl statelessSessionBean = new StatelessSessionBeanImpl();
		return statelessSessionBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatefulSessionBean createStatefulSessionBean() {
		StatefulSessionBeanImpl statefulSessionBean = new StatefulSessionBeanImpl();
		return statefulSessionBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Servlet createServlet() {
		ServletImpl servlet = new ServletImpl();
		return servlet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSPPage createJSPPage() {
		JSPPageImpl jspPage = new JSPPageImpl();
		return jspPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerReleationship createContainerReleationship() {
		ContainerReleationshipImpl containerReleationship = new ContainerReleationshipImpl();
		return containerReleationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebReleationship createWebReleationship() {
		WebReleationshipImpl webReleationship = new WebReleationshipImpl();
		return webReleationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppReleationship createAppReleationship() {
		AppReleationshipImpl appReleationship = new AppReleationshipImpl();
		return appReleationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataReleationship createDataReleationship() {
		DataReleationshipImpl dataReleationship = new DataReleationshipImpl();
		return dataReleationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassElement createClassElement() {
		ClassElementImpl classElement = new ClassElementImpl();
		return classElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageElement createPackageElement() {
		PackageElementImpl packageElement = new PackageElementImpl();
		return packageElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization() {
		GeneralizationImpl generalization = new GeneralizationImpl();
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public webModelRelationship createwebModelRelationship() {
		webModelRelationshipImpl webModelRelationship = new webModelRelationshipImpl();
		return webModelRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceElement createInterfaceElement() {
		InterfaceElementImpl interfaceElement = new InterfaceElementImpl();
		return interfaceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aggregation createAggregation() {
		AggregationImpl aggregation = new AggregationImpl();
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realization createRealization() {
		RealizationImpl realization = new RealizationImpl();
		return realization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Struts createStruts() {
		StrutsImpl struts = new StrutsImpl();
		return struts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrutsGlobal createStrutsGlobal() {
		StrutsGlobalImpl strutsGlobal = new StrutsGlobalImpl();
		return strutsGlobal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRelationship createActionRelationship() {
		ActionRelationshipImpl actionRelationship = new ActionRelationshipImpl();
		return actionRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrutsRelation createStrutsRelation() {
		StrutsRelationImpl strutsRelation = new StrutsRelationImpl();
		return strutsRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLConfig createXMLConfig() {
		XMLConfigImpl xmlConfig = new XMLConfigImpl();
		return xmlConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrutsOperation createStrutsOperation() {
		StrutsOperationImpl strutsOperation = new StrutsOperationImpl();
		return strutsOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionHandling createExceptionHandling() {
		ExceptionHandlingImpl exceptionHandling = new ExceptionHandlingImpl();
		return exceptionHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventCall createEventCall() {
		EventCallImpl eventCall = new EventCallImpl();
		return eventCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumElement createEnumElement() {
		EnumElementImpl enumElement = new EnumElementImpl();
		return enumElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteral createEnumLiteral() {
		EnumLiteralImpl enumLiteral = new EnumLiteralImpl();
		return enumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTML5 createHTML5() {
		HTML5Impl html5 = new HTML5Impl();
		return html5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public staticRelationship createstaticRelationship() {
		staticRelationshipImpl staticRelationship = new staticRelationshipImpl();
		return staticRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkElement createLinkElement() {
		LinkElementImpl linkElement = new LinkElementImpl();
		return linkElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public linkRelationship createlinkRelationship() {
		linkRelationshipImpl linkRelationship = new linkRelationshipImpl();
		return linkRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public strutsLinkRelation createstrutsLinkRelation() {
		strutsLinkRelationImpl strutsLinkRelation = new strutsLinkRelationImpl();
		return strutsLinkRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind createVisibilityKindFromString(EDataType eDataType, String initialValue) {
		VisibilityKind result = VisibilityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewTypeKind createViewTypeKindFromString(EDataType eDataType, String initialValue) {
		ViewTypeKind result = ViewTypeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertViewTypeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsPackage getComponentsPackage() {
		return (ComponentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentsPackage getPackage() {
		return ComponentsPackage.eINSTANCE;
	}

} //ComponentsFactoryImpl
