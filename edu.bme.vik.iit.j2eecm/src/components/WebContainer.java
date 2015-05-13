/**
 */
package components;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link components.WebContainer#getName <em>Name</em>}</li>
 *   <li>{@link components.WebContainer#getServerApp <em>Server App</em>}</li>
 *   <li>{@link components.WebContainer#getElements <em>Elements</em>}</li>
 *   <li>{@link components.WebContainer#getStruts <em>Struts</em>}</li>
 *   <li>{@link components.WebContainer#getStaticElements <em>Static Elements</em>}</li>
 *   <li>{@link components.WebContainer#getStrutsActions <em>Struts Actions</em>}</li>
 *   <li>{@link components.WebContainer#getWebrelations <em>Webrelations</em>}</li>
 *   <li>{@link components.WebContainer#getLinkElements <em>Link Elements</em>}</li>
 *   <li>{@link components.WebContainer#getGlobal <em>Global</em>}</li>
 * </ul>
 * </p>
 *
 * @see components.ComponentsPackage#getWebContainer()
 * @model
 * @generated
 */
public interface WebContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see components.ComponentsPackage#getWebContainer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link components.WebContainer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Server App</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server App</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server App</em>' attribute.
	 * @see #setServerApp(String)
	 * @see components.ComponentsPackage#getWebContainer_ServerApp()
	 * @model
	 * @generated
	 */
	String getServerApp();

	/**
	 * Sets the value of the '{@link components.WebContainer#getServerApp <em>Server App</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server App</em>' attribute.
	 * @see #getServerApp()
	 * @generated
	 */
	void setServerApp(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link components.WebContainerElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see components.ComponentsPackage#getWebContainer_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<WebContainerElement> getElements();

	/**
	 * Returns the value of the '<em><b>Struts</b></em>' containment reference list.
	 * The list contents are of type {@link components.Struts}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struts</em>' containment reference list.
	 * @see components.ComponentsPackage#getWebContainer_Struts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Struts> getStruts();

	/**
	 * Returns the value of the '<em><b>Static Elements</b></em>' containment reference list.
	 * The list contents are of type {@link components.StaticWebElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Elements</em>' containment reference list.
	 * @see components.ComponentsPackage#getWebContainer_StaticElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<StaticWebElement> getStaticElements();

	/**
	 * Returns the value of the '<em><b>Struts Actions</b></em>' containment reference list.
	 * The list contents are of type {@link components.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struts Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struts Actions</em>' containment reference list.
	 * @see components.ComponentsPackage#getWebContainer_StrutsActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getStrutsActions();

	/**
	 * Returns the value of the '<em><b>Webrelations</b></em>' containment reference list.
	 * The list contents are of type {@link components.WebContainerRelations}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Webrelations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webrelations</em>' containment reference list.
	 * @see components.ComponentsPackage#getWebContainer_Webrelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<WebContainerRelations> getWebrelations();

	/**
	 * Returns the value of the '<em><b>Link Elements</b></em>' containment reference list.
	 * The list contents are of type {@link components.LinkElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Elements</em>' containment reference list.
	 * @see components.ComponentsPackage#getWebContainer_LinkElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkElement> getLinkElements();

	/**
	 * Returns the value of the '<em><b>Global</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global</em>' containment reference.
	 * @see #setGlobal(StrutsGlobal)
	 * @see components.ComponentsPackage#getWebContainer_Global()
	 * @model containment="true"
	 * @generated
	 */
	StrutsGlobal getGlobal();

	/**
	 * Sets the value of the '{@link components.WebContainer#getGlobal <em>Global</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global</em>' containment reference.
	 * @see #getGlobal()
	 * @generated
	 */
	void setGlobal(StrutsGlobal value);

} // WebContainer
