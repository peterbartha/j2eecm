/**
 */
package components;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Releationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link components.AppReleationship#getApp <em>App</em>}</li>
 *   <li>{@link components.AppReleationship#getEjbs <em>Ejbs</em>}</li>
 *   <li>{@link components.AppReleationship#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see components.ComponentsPackage#getAppReleationship()
 * @model
 * @generated
 */
public interface AppReleationship extends EObject {
	/**
	 * Returns the value of the '<em><b>App</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App</em>' reference.
	 * @see #setApp(ApplicationClient)
	 * @see components.ComponentsPackage#getAppReleationship_App()
	 * @model required="true"
	 * @generated
	 */
	ApplicationClient getApp();

	/**
	 * Sets the value of the '{@link components.AppReleationship#getApp <em>App</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App</em>' reference.
	 * @see #getApp()
	 * @generated
	 */
	void setApp(ApplicationClient value);

	/**
	 * Returns the value of the '<em><b>Ejbs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejbs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejbs</em>' reference.
	 * @see #setEjbs(EJBContainer)
	 * @see components.ComponentsPackage#getAppReleationship_Ejbs()
	 * @model required="true"
	 * @generated
	 */
	EJBContainer getEjbs();

	/**
	 * Sets the value of the '{@link components.AppReleationship#getEjbs <em>Ejbs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejbs</em>' reference.
	 * @see #getEjbs()
	 * @generated
	 */
	void setEjbs(EJBContainer value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see components.ComponentsPackage#getAppReleationship_Protocol()
	 * @model
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link components.AppReleationship#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

} // AppReleationship
