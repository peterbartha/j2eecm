/**
 */
package components.impl;

import components.ComponentsPackage;
import components.EJBContainer;
import components.J2EEServer;
import components.WebContainer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>J2EE Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link components.impl.J2EEServerImpl#getEjbContainer <em>Ejb Container</em>}</li>
 *   <li>{@link components.impl.J2EEServerImpl#getWebContainer <em>Web Container</em>}</li>
 *   <li>{@link components.impl.J2EEServerImpl#getName <em>Name</em>}</li>
 *   <li>{@link components.impl.J2EEServerImpl#getOs <em>Os</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class J2EEServerImpl extends MinimalEObjectImpl.Container implements J2EEServer {
	/**
	 * The cached value of the '{@link #getEjbContainer() <em>Ejb Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbContainer()
	 * @generated
	 * @ordered
	 */
	protected EJBContainer ejbContainer;

	/**
	 * The cached value of the '{@link #getWebContainer() <em>Web Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebContainer()
	 * @generated
	 * @ordered
	 */
	protected WebContainer webContainer;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected String os = OS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected J2EEServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.J2EE_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EJBContainer getEjbContainer() {
		return ejbContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbContainer(EJBContainer newEjbContainer, NotificationChain msgs) {
		EJBContainer oldEjbContainer = ejbContainer;
		ejbContainer = newEjbContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentsPackage.J2EE_SERVER__EJB_CONTAINER, oldEjbContainer, newEjbContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbContainer(EJBContainer newEjbContainer) {
		if (newEjbContainer != ejbContainer) {
			NotificationChain msgs = null;
			if (ejbContainer != null)
				msgs = ((InternalEObject)ejbContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.J2EE_SERVER__EJB_CONTAINER, null, msgs);
			if (newEjbContainer != null)
				msgs = ((InternalEObject)newEjbContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.J2EE_SERVER__EJB_CONTAINER, null, msgs);
			msgs = basicSetEjbContainer(newEjbContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.J2EE_SERVER__EJB_CONTAINER, newEjbContainer, newEjbContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebContainer getWebContainer() {
		return webContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWebContainer(WebContainer newWebContainer, NotificationChain msgs) {
		WebContainer oldWebContainer = webContainer;
		webContainer = newWebContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentsPackage.J2EE_SERVER__WEB_CONTAINER, oldWebContainer, newWebContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebContainer(WebContainer newWebContainer) {
		if (newWebContainer != webContainer) {
			NotificationChain msgs = null;
			if (webContainer != null)
				msgs = ((InternalEObject)webContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.J2EE_SERVER__WEB_CONTAINER, null, msgs);
			if (newWebContainer != null)
				msgs = ((InternalEObject)newWebContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.J2EE_SERVER__WEB_CONTAINER, null, msgs);
			msgs = basicSetWebContainer(newWebContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.J2EE_SERVER__WEB_CONTAINER, newWebContainer, newWebContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.J2EE_SERVER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOs() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOs(String newOs) {
		String oldOs = os;
		os = newOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.J2EE_SERVER__OS, oldOs, os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentsPackage.J2EE_SERVER__EJB_CONTAINER:
				return basicSetEjbContainer(null, msgs);
			case ComponentsPackage.J2EE_SERVER__WEB_CONTAINER:
				return basicSetWebContainer(null, msgs);
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
			case ComponentsPackage.J2EE_SERVER__EJB_CONTAINER:
				return getEjbContainer();
			case ComponentsPackage.J2EE_SERVER__WEB_CONTAINER:
				return getWebContainer();
			case ComponentsPackage.J2EE_SERVER__NAME:
				return getName();
			case ComponentsPackage.J2EE_SERVER__OS:
				return getOs();
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
			case ComponentsPackage.J2EE_SERVER__EJB_CONTAINER:
				setEjbContainer((EJBContainer)newValue);
				return;
			case ComponentsPackage.J2EE_SERVER__WEB_CONTAINER:
				setWebContainer((WebContainer)newValue);
				return;
			case ComponentsPackage.J2EE_SERVER__NAME:
				setName((String)newValue);
				return;
			case ComponentsPackage.J2EE_SERVER__OS:
				setOs((String)newValue);
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
			case ComponentsPackage.J2EE_SERVER__EJB_CONTAINER:
				setEjbContainer((EJBContainer)null);
				return;
			case ComponentsPackage.J2EE_SERVER__WEB_CONTAINER:
				setWebContainer((WebContainer)null);
				return;
			case ComponentsPackage.J2EE_SERVER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComponentsPackage.J2EE_SERVER__OS:
				setOs(OS_EDEFAULT);
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
			case ComponentsPackage.J2EE_SERVER__EJB_CONTAINER:
				return ejbContainer != null;
			case ComponentsPackage.J2EE_SERVER__WEB_CONTAINER:
				return webContainer != null;
			case ComponentsPackage.J2EE_SERVER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComponentsPackage.J2EE_SERVER__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", os: ");
		result.append(os);
		result.append(')');
		return result.toString();
	}

} //J2EEServerImpl
