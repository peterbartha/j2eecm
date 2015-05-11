/**
 */
package components.impl;

import components.ComponentsPackage;
import components.ContainerReleationship;
import components.EJBContainer;
import components.WebContainer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Releationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link components.impl.ContainerReleationshipImpl#getEjbs <em>Ejbs</em>}</li>
 *   <li>{@link components.impl.ContainerReleationshipImpl#getWeb <em>Web</em>}</li>
 *   <li>{@link components.impl.ContainerReleationshipImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerReleationshipImpl extends MinimalEObjectImpl.Container implements ContainerReleationship {
	/**
	 * The cached value of the '{@link #getEjbs() <em>Ejbs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbs()
	 * @generated
	 * @ordered
	 */
	protected EJBContainer ejbs;

	/**
	 * The cached value of the '{@link #getWeb() <em>Web</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeb()
	 * @generated
	 * @ordered
	 */
	protected WebContainer web;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerReleationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.CONTAINER_RELEATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EJBContainer getEjbs() {
		if (ejbs != null && ejbs.eIsProxy()) {
			InternalEObject oldEjbs = (InternalEObject)ejbs;
			ejbs = (EJBContainer)eResolveProxy(oldEjbs);
			if (ejbs != oldEjbs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.CONTAINER_RELEATIONSHIP__EJBS, oldEjbs, ejbs));
			}
		}
		return ejbs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EJBContainer basicGetEjbs() {
		return ejbs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbs(EJBContainer newEjbs) {
		EJBContainer oldEjbs = ejbs;
		ejbs = newEjbs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONTAINER_RELEATIONSHIP__EJBS, oldEjbs, ejbs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebContainer getWeb() {
		if (web != null && web.eIsProxy()) {
			InternalEObject oldWeb = (InternalEObject)web;
			web = (WebContainer)eResolveProxy(oldWeb);
			if (web != oldWeb) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.CONTAINER_RELEATIONSHIP__WEB, oldWeb, web));
			}
		}
		return web;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebContainer basicGetWeb() {
		return web;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeb(WebContainer newWeb) {
		WebContainer oldWeb = web;
		web = newWeb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONTAINER_RELEATIONSHIP__WEB, oldWeb, web));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONTAINER_RELEATIONSHIP__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.CONTAINER_RELEATIONSHIP__EJBS:
				if (resolve) return getEjbs();
				return basicGetEjbs();
			case ComponentsPackage.CONTAINER_RELEATIONSHIP__WEB:
				if (resolve) return getWeb();
				return basicGetWeb();
			case ComponentsPackage.CONTAINER_RELEATIONSHIP__PROTOCOL:
				return getProtocol();
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
			case ComponentsPackage.CONTAINER_RELEATIONSHIP__EJBS:
				setEjbs((EJBContainer)newValue);
				return;
			case ComponentsPackage.CONTAINER_RELEATIONSHIP__WEB:
				setWeb((WebContainer)newValue);
				return;
			case ComponentsPackage.CONTAINER_RELEATIONSHIP__PROTOCOL:
				setProtocol((String)newValue);
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
			case ComponentsPackage.CONTAINER_RELEATIONSHIP__EJBS:
				setEjbs((EJBContainer)null);
				return;
			case ComponentsPackage.CONTAINER_RELEATIONSHIP__WEB:
				setWeb((WebContainer)null);
				return;
			case ComponentsPackage.CONTAINER_RELEATIONSHIP__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
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
			case ComponentsPackage.CONTAINER_RELEATIONSHIP__EJBS:
				return ejbs != null;
			case ComponentsPackage.CONTAINER_RELEATIONSHIP__WEB:
				return web != null;
			case ComponentsPackage.CONTAINER_RELEATIONSHIP__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
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
		result.append(" (protocol: ");
		result.append(protocol);
		result.append(')');
		return result.toString();
	}

} //ContainerReleationshipImpl
