/**
 */
package components.util;

import components.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see components.ComponentsPackage
 * @generated
 */
public class ComponentsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsSwitch() {
		if (modelPackage == null) {
			modelPackage = ComponentsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ComponentsPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.CLIENT: {
				Client client = (Client)theEObject;
				T result = caseClient(client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.J2EE_SERVER: {
				J2EEServer j2EEServer = (J2EEServer)theEObject;
				T result = caseJ2EEServer(j2EEServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.DATABASE: {
				Database database = (Database)theEObject;
				T result = caseDatabase(database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.BROWSER: {
				Browser browser = (Browser)theEObject;
				T result = caseBrowser(browser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.APPLICATION_CLIENT: {
				ApplicationClient applicationClient = (ApplicationClient)theEObject;
				T result = caseApplicationClient(applicationClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.WEB_CONTAINER: {
				WebContainer webContainer = (WebContainer)theEObject;
				T result = caseWebContainer(webContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.EJB_CONTAINER: {
				EJBContainer ejbContainer = (EJBContainer)theEObject;
				T result = caseEJBContainer(ejbContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.EJB: {
				EJB ejb = (EJB)theEObject;
				T result = caseEJB(ejb);
				if (result == null) result = caseClassElement(ejb);
				if (result == null) result = caseClassifierElement(ejb);
				if (result == null) result = caseClassifier(ejb);
				if (result == null) result = caseType(ejb);
				if (result == null) result = casePackageableElement(ejb);
				if (result == null) result = caseNamedElement(ejb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.ENTITY_BEAN: {
				EntityBean entityBean = (EntityBean)theEObject;
				T result = caseEntityBean(entityBean);
				if (result == null) result = caseEJB(entityBean);
				if (result == null) result = caseClassElement(entityBean);
				if (result == null) result = caseClassifierElement(entityBean);
				if (result == null) result = caseClassifier(entityBean);
				if (result == null) result = caseType(entityBean);
				if (result == null) result = casePackageableElement(entityBean);
				if (result == null) result = caseNamedElement(entityBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.SESSION_BEAN: {
				SessionBean sessionBean = (SessionBean)theEObject;
				T result = caseSessionBean(sessionBean);
				if (result == null) result = caseEJB(sessionBean);
				if (result == null) result = caseClassElement(sessionBean);
				if (result == null) result = caseClassifierElement(sessionBean);
				if (result == null) result = caseClassifier(sessionBean);
				if (result == null) result = caseType(sessionBean);
				if (result == null) result = casePackageableElement(sessionBean);
				if (result == null) result = caseNamedElement(sessionBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.MESSAGE_DRIVEN_BEAN: {
				MessageDrivenBean messageDrivenBean = (MessageDrivenBean)theEObject;
				T result = caseMessageDrivenBean(messageDrivenBean);
				if (result == null) result = caseEJB(messageDrivenBean);
				if (result == null) result = caseClassElement(messageDrivenBean);
				if (result == null) result = caseClassifierElement(messageDrivenBean);
				if (result == null) result = caseClassifier(messageDrivenBean);
				if (result == null) result = caseType(messageDrivenBean);
				if (result == null) result = casePackageableElement(messageDrivenBean);
				if (result == null) result = caseNamedElement(messageDrivenBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.STATELESS_SESSION_BEAN: {
				StatelessSessionBean statelessSessionBean = (StatelessSessionBean)theEObject;
				T result = caseStatelessSessionBean(statelessSessionBean);
				if (result == null) result = caseSessionBean(statelessSessionBean);
				if (result == null) result = caseEJB(statelessSessionBean);
				if (result == null) result = caseClassElement(statelessSessionBean);
				if (result == null) result = caseClassifierElement(statelessSessionBean);
				if (result == null) result = caseClassifier(statelessSessionBean);
				if (result == null) result = caseType(statelessSessionBean);
				if (result == null) result = casePackageableElement(statelessSessionBean);
				if (result == null) result = caseNamedElement(statelessSessionBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.STATEFUL_SESSION_BEAN: {
				StatefulSessionBean statefulSessionBean = (StatefulSessionBean)theEObject;
				T result = caseStatefulSessionBean(statefulSessionBean);
				if (result == null) result = caseSessionBean(statefulSessionBean);
				if (result == null) result = caseEJB(statefulSessionBean);
				if (result == null) result = caseClassElement(statefulSessionBean);
				if (result == null) result = caseClassifierElement(statefulSessionBean);
				if (result == null) result = caseClassifier(statefulSessionBean);
				if (result == null) result = caseType(statefulSessionBean);
				if (result == null) result = casePackageableElement(statefulSessionBean);
				if (result == null) result = caseNamedElement(statefulSessionBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.SERVLET: {
				Servlet servlet = (Servlet)theEObject;
				T result = caseServlet(servlet);
				if (result == null) result = caseWebContainerElement(servlet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.JSP_PAGE: {
				JSPPage jspPage = (JSPPage)theEObject;
				T result = caseJSPPage(jspPage);
				if (result == null) result = caseWebContainerElement(jspPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.CONTAINER_RELEATIONSHIP: {
				ContainerReleationship containerReleationship = (ContainerReleationship)theEObject;
				T result = caseContainerReleationship(containerReleationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.WEB_RELEATIONSHIP: {
				WebReleationship webReleationship = (WebReleationship)theEObject;
				T result = caseWebReleationship(webReleationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.APP_RELEATIONSHIP: {
				AppReleationship appReleationship = (AppReleationship)theEObject;
				T result = caseAppReleationship(appReleationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.DATA_RELEATIONSHIP: {
				DataReleationship dataReleationship = (DataReleationship)theEObject;
				T result = caseDataReleationship(dataReleationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.CLASS_ELEMENT: {
				ClassElement classElement = (ClassElement)theEObject;
				T result = caseClassElement(classElement);
				if (result == null) result = caseClassifierElement(classElement);
				if (result == null) result = caseClassifier(classElement);
				if (result == null) result = caseType(classElement);
				if (result == null) result = casePackageableElement(classElement);
				if (result == null) result = caseNamedElement(classElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.CLASSIFIER: {
				Classifier classifier = (Classifier)theEObject;
				T result = caseClassifier(classifier);
				if (result == null) result = caseType(classifier);
				if (result == null) result = casePackageableElement(classifier);
				if (result == null) result = caseNamedElement(classifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = casePackageableElement(operation);
				if (result == null) result = caseNamedElement(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = casePackageableElement(type);
				if (result == null) result = caseNamedElement(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = casePackageableElement(property);
				if (result == null) result = caseNamedElement(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseClassifier(association);
				if (result == null) result = caseType(association);
				if (result == null) result = casePackageableElement(association);
				if (result == null) result = caseNamedElement(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.PACKAGE_ELEMENT: {
				PackageElement packageElement = (PackageElement)theEObject;
				T result = casePackageElement(packageElement);
				if (result == null) result = caseClassifier(packageElement);
				if (result == null) result = caseType(packageElement);
				if (result == null) result = casePackageableElement(packageElement);
				if (result == null) result = caseNamedElement(packageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.GENERALIZATION: {
				Generalization generalization = (Generalization)theEObject;
				T result = caseGeneralization(generalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.PACKAGEABLE_ELEMENT: {
				PackageableElement packageableElement = (PackageableElement)theEObject;
				T result = casePackageableElement(packageableElement);
				if (result == null) result = caseNamedElement(packageableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.WEB_MODEL_RELATIONSHIP: {
				webModelRelationship webModelRelationship = (webModelRelationship)theEObject;
				T result = casewebModelRelationship(webModelRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.WEB_CONTAINER_ELEMENT: {
				WebContainerElement webContainerElement = (WebContainerElement)theEObject;
				T result = caseWebContainerElement(webContainerElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.INTERFACE_ELEMENT: {
				InterfaceElement interfaceElement = (InterfaceElement)theEObject;
				T result = caseInterfaceElement(interfaceElement);
				if (result == null) result = caseClassifierElement(interfaceElement);
				if (result == null) result = caseClassifier(interfaceElement);
				if (result == null) result = caseType(interfaceElement);
				if (result == null) result = casePackageableElement(interfaceElement);
				if (result == null) result = caseNamedElement(interfaceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.AGGREGATION: {
				Aggregation aggregation = (Aggregation)theEObject;
				T result = caseAggregation(aggregation);
				if (result == null) result = caseAssociation(aggregation);
				if (result == null) result = caseClassifier(aggregation);
				if (result == null) result = caseType(aggregation);
				if (result == null) result = casePackageableElement(aggregation);
				if (result == null) result = caseNamedElement(aggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.REALIZATION: {
				Realization realization = (Realization)theEObject;
				T result = caseRealization(realization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.CLASSIFIER_ELEMENT: {
				ClassifierElement classifierElement = (ClassifierElement)theEObject;
				T result = caseClassifierElement(classifierElement);
				if (result == null) result = caseClassifier(classifierElement);
				if (result == null) result = caseType(classifierElement);
				if (result == null) result = casePackageableElement(classifierElement);
				if (result == null) result = caseNamedElement(classifierElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClient(Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>J2EE Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>J2EE Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJ2EEServer(J2EEServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Browser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Browser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrowser(Browser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationClient(ApplicationClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebContainer(WebContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EJB Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EJB Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEJBContainer(EJBContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EJB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EJB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEJB(EJB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityBean(EntityBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Session Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Session Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSessionBean(SessionBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Driven Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Driven Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDrivenBean(MessageDrivenBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stateless Session Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stateless Session Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatelessSessionBean(StatelessSessionBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stateful Session Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stateful Session Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatefulSessionBean(StatefulSessionBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Servlet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Servlet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServlet(Servlet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSP Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSP Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSPPage(JSPPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Releationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Releationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerReleationship(ContainerReleationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Releationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Releationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebReleationship(WebReleationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Releationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Releationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppReleationship(AppReleationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Releationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Releationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataReleationship(DataReleationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassElement(ClassElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageElement(PackageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralization(Generalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageableElement(PackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>web Model Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>web Model Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewebModelRelationship(webModelRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Container Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Container Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebContainerElement(WebContainerElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceElement(InterfaceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregation(Aggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealization(Realization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierElement(ClassifierElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ComponentsSwitch
