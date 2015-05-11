/**
 */
package components.impl;

import components.AppReleationship;
import components.Client;
import components.ComponentsPackage;
import components.ContainerReleationship;
import components.DataReleationship;
import components.Database;
import components.J2EEServer;
import components.Model;
import components.WebReleationship;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link components.impl.ModelImpl#getClient <em>Client</em>}</li>
 *   <li>{@link components.impl.ModelImpl#getServer <em>Server</em>}</li>
 *   <li>{@link components.impl.ModelImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link components.impl.ModelImpl#getWebRealtion <em>Web Realtion</em>}</li>
 *   <li>{@link components.impl.ModelImpl#getDataRelation <em>Data Relation</em>}</li>
 *   <li>{@link components.impl.ModelImpl#getAppRelation <em>App Relation</em>}</li>
 *   <li>{@link components.impl.ModelImpl#getContainerRelation <em>Container Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected Client client;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected J2EEServer server;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected Database database;

	/**
	 * The cached value of the '{@link #getWebRealtion() <em>Web Realtion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebRealtion()
	 * @generated
	 * @ordered
	 */
	protected WebReleationship webRealtion;

	/**
	 * The cached value of the '{@link #getDataRelation() <em>Data Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRelation()
	 * @generated
	 * @ordered
	 */
	protected DataReleationship dataRelation;

	/**
	 * The cached value of the '{@link #getAppRelation() <em>App Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppRelation()
	 * @generated
	 * @ordered
	 */
	protected AppReleationship appRelation;

	/**
	 * The cached value of the '{@link #getContainerRelation() <em>Container Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerRelation()
	 * @generated
	 * @ordered
	 */
	protected ContainerReleationship containerRelation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClient(Client newClient, NotificationChain msgs) {
		Client oldClient = client;
		client = newClient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODEL__CLIENT, oldClient, newClient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(Client newClient) {
		if (newClient != client) {
			NotificationChain msgs = null;
			if (client != null)
				msgs = ((InternalEObject)client).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.MODEL__CLIENT, null, msgs);
			if (newClient != null)
				msgs = ((InternalEObject)newClient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.MODEL__CLIENT, null, msgs);
			msgs = basicSetClient(newClient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODEL__CLIENT, newClient, newClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public J2EEServer getServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServer(J2EEServer newServer, NotificationChain msgs) {
		J2EEServer oldServer = server;
		server = newServer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODEL__SERVER, oldServer, newServer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(J2EEServer newServer) {
		if (newServer != server) {
			NotificationChain msgs = null;
			if (server != null)
				msgs = ((InternalEObject)server).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.MODEL__SERVER, null, msgs);
			if (newServer != null)
				msgs = ((InternalEObject)newServer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.MODEL__SERVER, null, msgs);
			msgs = basicSetServer(newServer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODEL__SERVER, newServer, newServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database getDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabase(Database newDatabase, NotificationChain msgs) {
		Database oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODEL__DATABASE, oldDatabase, newDatabase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(Database newDatabase) {
		if (newDatabase != database) {
			NotificationChain msgs = null;
			if (database != null)
				msgs = ((InternalEObject)database).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.MODEL__DATABASE, null, msgs);
			if (newDatabase != null)
				msgs = ((InternalEObject)newDatabase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.MODEL__DATABASE, null, msgs);
			msgs = basicSetDatabase(newDatabase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODEL__DATABASE, newDatabase, newDatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebReleationship getWebRealtion() {
		return webRealtion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWebRealtion(WebReleationship newWebRealtion, NotificationChain msgs) {
		WebReleationship oldWebRealtion = webRealtion;
		webRealtion = newWebRealtion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODEL__WEB_REALTION, oldWebRealtion, newWebRealtion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebRealtion(WebReleationship newWebRealtion) {
		if (newWebRealtion != webRealtion) {
			NotificationChain msgs = null;
			if (webRealtion != null)
				msgs = ((InternalEObject)webRealtion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.MODEL__WEB_REALTION, null, msgs);
			if (newWebRealtion != null)
				msgs = ((InternalEObject)newWebRealtion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.MODEL__WEB_REALTION, null, msgs);
			msgs = basicSetWebRealtion(newWebRealtion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODEL__WEB_REALTION, newWebRealtion, newWebRealtion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataReleationship getDataRelation() {
		return dataRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataRelation(DataReleationship newDataRelation, NotificationChain msgs) {
		DataReleationship oldDataRelation = dataRelation;
		dataRelation = newDataRelation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODEL__DATA_RELATION, oldDataRelation, newDataRelation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataRelation(DataReleationship newDataRelation) {
		if (newDataRelation != dataRelation) {
			NotificationChain msgs = null;
			if (dataRelation != null)
				msgs = ((InternalEObject)dataRelation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.MODEL__DATA_RELATION, null, msgs);
			if (newDataRelation != null)
				msgs = ((InternalEObject)newDataRelation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.MODEL__DATA_RELATION, null, msgs);
			msgs = basicSetDataRelation(newDataRelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODEL__DATA_RELATION, newDataRelation, newDataRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppReleationship getAppRelation() {
		return appRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppRelation(AppReleationship newAppRelation, NotificationChain msgs) {
		AppReleationship oldAppRelation = appRelation;
		appRelation = newAppRelation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODEL__APP_RELATION, oldAppRelation, newAppRelation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppRelation(AppReleationship newAppRelation) {
		if (newAppRelation != appRelation) {
			NotificationChain msgs = null;
			if (appRelation != null)
				msgs = ((InternalEObject)appRelation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.MODEL__APP_RELATION, null, msgs);
			if (newAppRelation != null)
				msgs = ((InternalEObject)newAppRelation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.MODEL__APP_RELATION, null, msgs);
			msgs = basicSetAppRelation(newAppRelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODEL__APP_RELATION, newAppRelation, newAppRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerReleationship getContainerRelation() {
		return containerRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerRelation(ContainerReleationship newContainerRelation, NotificationChain msgs) {
		ContainerReleationship oldContainerRelation = containerRelation;
		containerRelation = newContainerRelation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODEL__CONTAINER_RELATION, oldContainerRelation, newContainerRelation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerRelation(ContainerReleationship newContainerRelation) {
		if (newContainerRelation != containerRelation) {
			NotificationChain msgs = null;
			if (containerRelation != null)
				msgs = ((InternalEObject)containerRelation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.MODEL__CONTAINER_RELATION, null, msgs);
			if (newContainerRelation != null)
				msgs = ((InternalEObject)newContainerRelation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.MODEL__CONTAINER_RELATION, null, msgs);
			msgs = basicSetContainerRelation(newContainerRelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODEL__CONTAINER_RELATION, newContainerRelation, newContainerRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentsPackage.MODEL__CLIENT:
				return basicSetClient(null, msgs);
			case ComponentsPackage.MODEL__SERVER:
				return basicSetServer(null, msgs);
			case ComponentsPackage.MODEL__DATABASE:
				return basicSetDatabase(null, msgs);
			case ComponentsPackage.MODEL__WEB_REALTION:
				return basicSetWebRealtion(null, msgs);
			case ComponentsPackage.MODEL__DATA_RELATION:
				return basicSetDataRelation(null, msgs);
			case ComponentsPackage.MODEL__APP_RELATION:
				return basicSetAppRelation(null, msgs);
			case ComponentsPackage.MODEL__CONTAINER_RELATION:
				return basicSetContainerRelation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.MODEL__CLIENT:
				return getClient();
			case ComponentsPackage.MODEL__SERVER:
				return getServer();
			case ComponentsPackage.MODEL__DATABASE:
				return getDatabase();
			case ComponentsPackage.MODEL__WEB_REALTION:
				return getWebRealtion();
			case ComponentsPackage.MODEL__DATA_RELATION:
				return getDataRelation();
			case ComponentsPackage.MODEL__APP_RELATION:
				return getAppRelation();
			case ComponentsPackage.MODEL__CONTAINER_RELATION:
				return getContainerRelation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComponentsPackage.MODEL__CLIENT:
				setClient((Client)newValue);
				return;
			case ComponentsPackage.MODEL__SERVER:
				setServer((J2EEServer)newValue);
				return;
			case ComponentsPackage.MODEL__DATABASE:
				setDatabase((Database)newValue);
				return;
			case ComponentsPackage.MODEL__WEB_REALTION:
				setWebRealtion((WebReleationship)newValue);
				return;
			case ComponentsPackage.MODEL__DATA_RELATION:
				setDataRelation((DataReleationship)newValue);
				return;
			case ComponentsPackage.MODEL__APP_RELATION:
				setAppRelation((AppReleationship)newValue);
				return;
			case ComponentsPackage.MODEL__CONTAINER_RELATION:
				setContainerRelation((ContainerReleationship)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ComponentsPackage.MODEL__CLIENT:
				setClient((Client)null);
				return;
			case ComponentsPackage.MODEL__SERVER:
				setServer((J2EEServer)null);
				return;
			case ComponentsPackage.MODEL__DATABASE:
				setDatabase((Database)null);
				return;
			case ComponentsPackage.MODEL__WEB_REALTION:
				setWebRealtion((WebReleationship)null);
				return;
			case ComponentsPackage.MODEL__DATA_RELATION:
				setDataRelation((DataReleationship)null);
				return;
			case ComponentsPackage.MODEL__APP_RELATION:
				setAppRelation((AppReleationship)null);
				return;
			case ComponentsPackage.MODEL__CONTAINER_RELATION:
				setContainerRelation((ContainerReleationship)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ComponentsPackage.MODEL__CLIENT:
				return client != null;
			case ComponentsPackage.MODEL__SERVER:
				return server != null;
			case ComponentsPackage.MODEL__DATABASE:
				return database != null;
			case ComponentsPackage.MODEL__WEB_REALTION:
				return webRealtion != null;
			case ComponentsPackage.MODEL__DATA_RELATION:
				return dataRelation != null;
			case ComponentsPackage.MODEL__APP_RELATION:
				return appRelation != null;
			case ComponentsPackage.MODEL__CONTAINER_RELATION:
				return containerRelation != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
