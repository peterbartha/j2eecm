/**
 */
package components;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Releationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link components.WebReleationship#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link components.WebReleationship#getBrowser <em>Browser</em>}</li>
 *   <li>{@link components.WebReleationship#getWebContainer <em>Web Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see components.ComponentsPackage#getWebReleationship()
 * @model
 * @generated
 */
public interface WebReleationship extends EObject {
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
	 * @see components.ComponentsPackage#getWebReleationship_Protocol()
	 * @model
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link components.WebReleationship#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Browser</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Browser</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browser</em>' reference.
	 * @see #setBrowser(Browser)
	 * @see components.ComponentsPackage#getWebReleationship_Browser()
	 * @model required="true"
	 * @generated
	 */
	Browser getBrowser();

	/**
	 * Sets the value of the '{@link components.WebReleationship#getBrowser <em>Browser</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browser</em>' reference.
	 * @see #getBrowser()
	 * @generated
	 */
	void setBrowser(Browser value);

	/**
	 * Returns the value of the '<em><b>Web Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Container</em>' reference.
	 * @see #setWebContainer(WebContainer)
	 * @see components.ComponentsPackage#getWebReleationship_WebContainer()
	 * @model required="true"
	 * @generated
	 */
	WebContainer getWebContainer();

	/**
	 * Sets the value of the '{@link components.WebReleationship#getWebContainer <em>Web Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Container</em>' reference.
	 * @see #getWebContainer()
	 * @generated
	 */
	void setWebContainer(WebContainer value);

} // WebReleationship
