/**
 */
package components;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Releationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link components.ContainerReleationship#getEjbs <em>Ejbs</em>}</li>
 *   <li>{@link components.ContainerReleationship#getWeb <em>Web</em>}</li>
 *   <li>{@link components.ContainerReleationship#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see components.ComponentsPackage#getContainerReleationship()
 * @model
 * @generated
 */
public interface ContainerReleationship extends EObject {
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
	 * @see components.ComponentsPackage#getContainerReleationship_Ejbs()
	 * @model required="true"
	 * @generated
	 */
	EJBContainer getEjbs();

	/**
	 * Sets the value of the '{@link components.ContainerReleationship#getEjbs <em>Ejbs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejbs</em>' reference.
	 * @see #getEjbs()
	 * @generated
	 */
	void setEjbs(EJBContainer value);

	/**
	 * Returns the value of the '<em><b>Web</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web</em>' reference.
	 * @see #setWeb(WebContainer)
	 * @see components.ComponentsPackage#getContainerReleationship_Web()
	 * @model required="true"
	 * @generated
	 */
	WebContainer getWeb();

	/**
	 * Sets the value of the '{@link components.ContainerReleationship#getWeb <em>Web</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web</em>' reference.
	 * @see #getWeb()
	 * @generated
	 */
	void setWeb(WebContainer value);

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
	 * @see components.ComponentsPackage#getContainerReleationship_Protocol()
	 * @model
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link components.ContainerReleationship#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

} // ContainerReleationship
