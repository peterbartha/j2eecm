/**
 */
package components;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>J2EE Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link components.J2EEServer#getEjbContainer <em>Ejb Container</em>}</li>
 *   <li>{@link components.J2EEServer#getWebContainer <em>Web Container</em>}</li>
 *   <li>{@link components.J2EEServer#getName <em>Name</em>}</li>
 *   <li>{@link components.J2EEServer#getOs <em>Os</em>}</li>
 * </ul>
 * </p>
 *
 * @see components.ComponentsPackage#getJ2EEServer()
 * @model
 * @generated
 */
public interface J2EEServer extends EObject {
	/**
	 * Returns the value of the '<em><b>Ejb Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Container</em>' containment reference.
	 * @see #setEjbContainer(EJBContainer)
	 * @see components.ComponentsPackage#getJ2EEServer_EjbContainer()
	 * @model containment="true"
	 * @generated
	 */
	EJBContainer getEjbContainer();

	/**
	 * Sets the value of the '{@link components.J2EEServer#getEjbContainer <em>Ejb Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Container</em>' containment reference.
	 * @see #getEjbContainer()
	 * @generated
	 */
	void setEjbContainer(EJBContainer value);

	/**
	 * Returns the value of the '<em><b>Web Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Container</em>' containment reference.
	 * @see #setWebContainer(WebContainer)
	 * @see components.ComponentsPackage#getJ2EEServer_WebContainer()
	 * @model containment="true"
	 * @generated
	 */
	WebContainer getWebContainer();

	/**
	 * Sets the value of the '{@link components.J2EEServer#getWebContainer <em>Web Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Container</em>' containment reference.
	 * @see #getWebContainer()
	 * @generated
	 */
	void setWebContainer(WebContainer value);

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
	 * @see components.ComponentsPackage#getJ2EEServer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link components.J2EEServer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see #setOs(String)
	 * @see components.ComponentsPackage#getJ2EEServer_Os()
	 * @model
	 * @generated
	 */
	String getOs();

	/**
	 * Sets the value of the '{@link components.J2EEServer#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(String value);

} // J2EEServer
