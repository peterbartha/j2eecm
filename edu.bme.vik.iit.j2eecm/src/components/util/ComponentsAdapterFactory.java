/**
 */
package components.util;

import components.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see components.ComponentsPackage
 * @generated
 */
public class ComponentsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ComponentsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentsSwitch<Adapter> modelSwitch =
		new ComponentsSwitch<Adapter>() {
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseClient(Client object) {
				return createClientAdapter();
			}
			@Override
			public Adapter caseJ2EEServer(J2EEServer object) {
				return createJ2EEServerAdapter();
			}
			@Override
			public Adapter caseDatabase(Database object) {
				return createDatabaseAdapter();
			}
			@Override
			public Adapter caseBrowser(Browser object) {
				return createBrowserAdapter();
			}
			@Override
			public Adapter caseApplicationClient(ApplicationClient object) {
				return createApplicationClientAdapter();
			}
			@Override
			public Adapter caseWebContainer(WebContainer object) {
				return createWebContainerAdapter();
			}
			@Override
			public Adapter caseEJBContainer(EJBContainer object) {
				return createEJBContainerAdapter();
			}
			@Override
			public Adapter caseEJB(EJB object) {
				return createEJBAdapter();
			}
			@Override
			public Adapter caseEntityBean(EntityBean object) {
				return createEntityBeanAdapter();
			}
			@Override
			public Adapter caseSessionBean(SessionBean object) {
				return createSessionBeanAdapter();
			}
			@Override
			public Adapter caseMessageDrivenBean(MessageDrivenBean object) {
				return createMessageDrivenBeanAdapter();
			}
			@Override
			public Adapter caseStatelessSessionBean(StatelessSessionBean object) {
				return createStatelessSessionBeanAdapter();
			}
			@Override
			public Adapter caseStatefulSessionBean(StatefulSessionBean object) {
				return createStatefulSessionBeanAdapter();
			}
			@Override
			public Adapter caseServlet(Servlet object) {
				return createServletAdapter();
			}
			@Override
			public Adapter caseJSPPage(JSPPage object) {
				return createJSPPageAdapter();
			}
			@Override
			public Adapter caseContainerReleationship(ContainerReleationship object) {
				return createContainerReleationshipAdapter();
			}
			@Override
			public Adapter caseWebReleationship(WebReleationship object) {
				return createWebReleationshipAdapter();
			}
			@Override
			public Adapter caseAppReleationship(AppReleationship object) {
				return createAppReleationshipAdapter();
			}
			@Override
			public Adapter caseDataReleationship(DataReleationship object) {
				return createDataReleationshipAdapter();
			}
			@Override
			public Adapter caseClassElement(ClassElement object) {
				return createClassElementAdapter();
			}
			@Override
			public Adapter caseClassifier(Classifier object) {
				return createClassifierAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter casePackageElement(PackageElement object) {
				return createPackageElementAdapter();
			}
			@Override
			public Adapter caseGeneralization(Generalization object) {
				return createGeneralizationAdapter();
			}
			@Override
			public Adapter casePackageableElement(PackageableElement object) {
				return createPackageableElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter casewebModelRelationship(webModelRelationship object) {
				return createwebModelRelationshipAdapter();
			}
			@Override
			public Adapter caseWebContainerElement(WebContainerElement object) {
				return createWebContainerElementAdapter();
			}
			@Override
			public Adapter caseInterfaceElement(InterfaceElement object) {
				return createInterfaceElementAdapter();
			}
			@Override
			public Adapter caseAggregation(Aggregation object) {
				return createAggregationAdapter();
			}
			@Override
			public Adapter caseRealization(Realization object) {
				return createRealizationAdapter();
			}
			@Override
			public Adapter caseClassifierElement(ClassifierElement object) {
				return createClassifierElementAdapter();
			}
			@Override
			public Adapter caseStruts(Struts object) {
				return createStrutsAdapter();
			}
			@Override
			public Adapter caseStrutsGlobal(StrutsGlobal object) {
				return createStrutsGlobalAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseActionRelationship(ActionRelationship object) {
				return createActionRelationshipAdapter();
			}
			@Override
			public Adapter caseStrutsRelation(StrutsRelation object) {
				return createStrutsRelationAdapter();
			}
			@Override
			public Adapter caseXMLConfig(XMLConfig object) {
				return createXMLConfigAdapter();
			}
			@Override
			public Adapter caseStrutsOperation(StrutsOperation object) {
				return createStrutsOperationAdapter();
			}
			@Override
			public Adapter caseExceptionHandling(ExceptionHandling object) {
				return createExceptionHandlingAdapter();
			}
			@Override
			public Adapter caseEventCall(EventCall object) {
				return createEventCallAdapter();
			}
			@Override
			public Adapter caseEnumElement(EnumElement object) {
				return createEnumElementAdapter();
			}
			@Override
			public Adapter caseEnumLiteral(EnumLiteral object) {
				return createEnumLiteralAdapter();
			}
			@Override
			public Adapter caseHTML5(HTML5 object) {
				return createHTML5Adapter();
			}
			@Override
			public Adapter caseStaticWebElement(StaticWebElement object) {
				return createStaticWebElementAdapter();
			}
			@Override
			public Adapter casestaticRelationship(staticRelationship object) {
				return createstaticRelationshipAdapter();
			}
			@Override
			public Adapter caseLinkElement(LinkElement object) {
				return createLinkElementAdapter();
			}
			@Override
			public Adapter caselinkRelationship(linkRelationship object) {
				return createlinkRelationshipAdapter();
			}
			@Override
			public Adapter casestrutsLinkRelation(strutsLinkRelation object) {
				return createstrutsLinkRelationAdapter();
			}
			@Override
			public Adapter caseWebContainerRelations(WebContainerRelations object) {
				return createWebContainerRelationsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link components.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.Client
	 * @generated
	 */
	public Adapter createClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.J2EEServer <em>J2EE Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.J2EEServer
	 * @generated
	 */
	public Adapter createJ2EEServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.Browser <em>Browser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.Browser
	 * @generated
	 */
	public Adapter createBrowserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.ApplicationClient <em>Application Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.ApplicationClient
	 * @generated
	 */
	public Adapter createApplicationClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.WebContainer <em>Web Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.WebContainer
	 * @generated
	 */
	public Adapter createWebContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.EJBContainer <em>EJB Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.EJBContainer
	 * @generated
	 */
	public Adapter createEJBContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.EJB <em>EJB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.EJB
	 * @generated
	 */
	public Adapter createEJBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.EntityBean <em>Entity Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.EntityBean
	 * @generated
	 */
	public Adapter createEntityBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.SessionBean <em>Session Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.SessionBean
	 * @generated
	 */
	public Adapter createSessionBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.MessageDrivenBean <em>Message Driven Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.MessageDrivenBean
	 * @generated
	 */
	public Adapter createMessageDrivenBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.StatelessSessionBean <em>Stateless Session Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.StatelessSessionBean
	 * @generated
	 */
	public Adapter createStatelessSessionBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.StatefulSessionBean <em>Stateful Session Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.StatefulSessionBean
	 * @generated
	 */
	public Adapter createStatefulSessionBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.Servlet <em>Servlet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.Servlet
	 * @generated
	 */
	public Adapter createServletAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.JSPPage <em>JSP Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.JSPPage
	 * @generated
	 */
	public Adapter createJSPPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.ContainerReleationship <em>Container Releationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.ContainerReleationship
	 * @generated
	 */
	public Adapter createContainerReleationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.WebReleationship <em>Web Releationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.WebReleationship
	 * @generated
	 */
	public Adapter createWebReleationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.AppReleationship <em>App Releationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.AppReleationship
	 * @generated
	 */
	public Adapter createAppReleationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.DataReleationship <em>Data Releationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.DataReleationship
	 * @generated
	 */
	public Adapter createDataReleationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.ClassElement <em>Class Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.ClassElement
	 * @generated
	 */
	public Adapter createClassElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.PackageElement <em>Package Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.PackageElement
	 * @generated
	 */
	public Adapter createPackageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.Generalization
	 * @generated
	 */
	public Adapter createGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.PackageableElement <em>Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.PackageableElement
	 * @generated
	 */
	public Adapter createPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.webModelRelationship <em>web Model Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.webModelRelationship
	 * @generated
	 */
	public Adapter createwebModelRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.WebContainerElement <em>Web Container Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.WebContainerElement
	 * @generated
	 */
	public Adapter createWebContainerElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.InterfaceElement <em>Interface Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.InterfaceElement
	 * @generated
	 */
	public Adapter createInterfaceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.Aggregation
	 * @generated
	 */
	public Adapter createAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.Realization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.Realization
	 * @generated
	 */
	public Adapter createRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.ClassifierElement <em>Classifier Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.ClassifierElement
	 * @generated
	 */
	public Adapter createClassifierElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.Struts <em>Struts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.Struts
	 * @generated
	 */
	public Adapter createStrutsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.StrutsGlobal <em>Struts Global</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.StrutsGlobal
	 * @generated
	 */
	public Adapter createStrutsGlobalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.ActionRelationship <em>Action Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.ActionRelationship
	 * @generated
	 */
	public Adapter createActionRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.StrutsRelation <em>Struts Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.StrutsRelation
	 * @generated
	 */
	public Adapter createStrutsRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.XMLConfig <em>XML Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.XMLConfig
	 * @generated
	 */
	public Adapter createXMLConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.StrutsOperation <em>Struts Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.StrutsOperation
	 * @generated
	 */
	public Adapter createStrutsOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.ExceptionHandling <em>Exception Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.ExceptionHandling
	 * @generated
	 */
	public Adapter createExceptionHandlingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.EventCall <em>Event Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.EventCall
	 * @generated
	 */
	public Adapter createEventCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.EnumElement <em>Enum Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.EnumElement
	 * @generated
	 */
	public Adapter createEnumElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.EnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.EnumLiteral
	 * @generated
	 */
	public Adapter createEnumLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.HTML5 <em>HTML5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.HTML5
	 * @generated
	 */
	public Adapter createHTML5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.StaticWebElement <em>Static Web Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.StaticWebElement
	 * @generated
	 */
	public Adapter createStaticWebElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.staticRelationship <em>static Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.staticRelationship
	 * @generated
	 */
	public Adapter createstaticRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.LinkElement <em>Link Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.LinkElement
	 * @generated
	 */
	public Adapter createLinkElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.linkRelationship <em>link Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.linkRelationship
	 * @generated
	 */
	public Adapter createlinkRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.strutsLinkRelation <em>struts Link Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.strutsLinkRelation
	 * @generated
	 */
	public Adapter createstrutsLinkRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link components.WebContainerRelations <em>Web Container Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see components.WebContainerRelations
	 * @generated
	 */
	public Adapter createWebContainerRelationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ComponentsAdapterFactory
