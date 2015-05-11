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

} // WebContainer
