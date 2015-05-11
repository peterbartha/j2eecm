/**
 */
package components;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link components.Model#getClient <em>Client</em>}</li>
 *   <li>{@link components.Model#getServer <em>Server</em>}</li>
 *   <li>{@link components.Model#getDatabase <em>Database</em>}</li>
 *   <li>{@link components.Model#getWebRealtion <em>Web Realtion</em>}</li>
 *   <li>{@link components.Model#getDataRelation <em>Data Relation</em>}</li>
 *   <li>{@link components.Model#getAppRelation <em>App Relation</em>}</li>
 *   <li>{@link components.Model#getContainerRelation <em>Container Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see components.ComponentsPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Client</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' containment reference.
	 * @see #setClient(Client)
	 * @see components.ComponentsPackage#getModel_Client()
	 * @model containment="true"
	 * @generated
	 */
	Client getClient();

	/**
	 * Sets the value of the '{@link components.Model#getClient <em>Client</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' containment reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(Client value);

	/**
	 * Returns the value of the '<em><b>Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' containment reference.
	 * @see #setServer(J2EEServer)
	 * @see components.ComponentsPackage#getModel_Server()
	 * @model containment="true"
	 * @generated
	 */
	J2EEServer getServer();

	/**
	 * Sets the value of the '{@link components.Model#getServer <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' containment reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(J2EEServer value);

	/**
	 * Returns the value of the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' containment reference.
	 * @see #setDatabase(Database)
	 * @see components.ComponentsPackage#getModel_Database()
	 * @model containment="true"
	 * @generated
	 */
	Database getDatabase();

	/**
	 * Sets the value of the '{@link components.Model#getDatabase <em>Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' containment reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(Database value);

	/**
	 * Returns the value of the '<em><b>Web Realtion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Realtion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Realtion</em>' containment reference.
	 * @see #setWebRealtion(WebReleationship)
	 * @see components.ComponentsPackage#getModel_WebRealtion()
	 * @model containment="true"
	 * @generated
	 */
	WebReleationship getWebRealtion();

	/**
	 * Sets the value of the '{@link components.Model#getWebRealtion <em>Web Realtion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Realtion</em>' containment reference.
	 * @see #getWebRealtion()
	 * @generated
	 */
	void setWebRealtion(WebReleationship value);

	/**
	 * Returns the value of the '<em><b>Data Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Relation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Relation</em>' containment reference.
	 * @see #setDataRelation(DataReleationship)
	 * @see components.ComponentsPackage#getModel_DataRelation()
	 * @model containment="true"
	 * @generated
	 */
	DataReleationship getDataRelation();

	/**
	 * Sets the value of the '{@link components.Model#getDataRelation <em>Data Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Relation</em>' containment reference.
	 * @see #getDataRelation()
	 * @generated
	 */
	void setDataRelation(DataReleationship value);

	/**
	 * Returns the value of the '<em><b>App Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Relation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Relation</em>' containment reference.
	 * @see #setAppRelation(AppReleationship)
	 * @see components.ComponentsPackage#getModel_AppRelation()
	 * @model containment="true"
	 * @generated
	 */
	AppReleationship getAppRelation();

	/**
	 * Sets the value of the '{@link components.Model#getAppRelation <em>App Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Relation</em>' containment reference.
	 * @see #getAppRelation()
	 * @generated
	 */
	void setAppRelation(AppReleationship value);

	/**
	 * Returns the value of the '<em><b>Container Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Relation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Relation</em>' containment reference.
	 * @see #setContainerRelation(ContainerReleationship)
	 * @see components.ComponentsPackage#getModel_ContainerRelation()
	 * @model containment="true"
	 * @generated
	 */
	ContainerReleationship getContainerRelation();

	/**
	 * Sets the value of the '{@link components.Model#getContainerRelation <em>Container Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Relation</em>' containment reference.
	 * @see #getContainerRelation()
	 * @generated
	 */
	void setContainerRelation(ContainerReleationship value);

} // Model
