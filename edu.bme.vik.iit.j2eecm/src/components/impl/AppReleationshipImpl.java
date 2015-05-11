/**
 */
package components.impl;

import components.AppReleationship;
import components.ApplicationClient;
import components.ComponentsPackage;
import components.EJBContainer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App Releationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link components.impl.AppReleationshipImpl#getApp <em>App</em>}</li>
 *   <li>{@link components.impl.AppReleationshipImpl#getEjbs <em>Ejbs</em>}</li>
 *   <li>{@link components.impl.AppReleationshipImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppReleationshipImpl extends MinimalEObjectImpl.Container implements AppReleationship {
	/**
	 * The cached value of the '{@link #getApp() <em>App</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApp()
	 * @generated
	 * @ordered
	 */
	protected ApplicationClient app;

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
	protected AppReleationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.APP_RELEATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationClient getApp() {
		if (app != null && app.eIsProxy()) {
			InternalEObject oldApp = (InternalEObject)app;
			app = (ApplicationClient)eResolveProxy(oldApp);
			if (app != oldApp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.APP_RELEATIONSHIP__APP, oldApp, app));
			}
		}
		return app;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationClient basicGetApp() {
		return app;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApp(ApplicationClient newApp) {
		ApplicationClient oldApp = app;
		app = newApp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.APP_RELEATIONSHIP__APP, oldApp, app));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.APP_RELEATIONSHIP__EJBS, oldEjbs, ejbs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.APP_RELEATIONSHIP__EJBS, oldEjbs, ejbs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.APP_RELEATIONSHIP__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.APP_RELEATIONSHIP__APP:
				if (resolve) return getApp();
				return basicGetApp();
			case ComponentsPackage.APP_RELEATIONSHIP__EJBS:
				if (resolve) return getEjbs();
				return basicGetEjbs();
			case ComponentsPackage.APP_RELEATIONSHIP__PROTOCOL:
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
			case ComponentsPackage.APP_RELEATIONSHIP__APP:
				setApp((ApplicationClient)newValue);
				return;
			case ComponentsPackage.APP_RELEATIONSHIP__EJBS:
				setEjbs((EJBContainer)newValue);
				return;
			case ComponentsPackage.APP_RELEATIONSHIP__PROTOCOL:
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
			case ComponentsPackage.APP_RELEATIONSHIP__APP:
				setApp((ApplicationClient)null);
				return;
			case ComponentsPackage.APP_RELEATIONSHIP__EJBS:
				setEjbs((EJBContainer)null);
				return;
			case ComponentsPackage.APP_RELEATIONSHIP__PROTOCOL:
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
			case ComponentsPackage.APP_RELEATIONSHIP__APP:
				return app != null;
			case ComponentsPackage.APP_RELEATIONSHIP__EJBS:
				return ejbs != null;
			case ComponentsPackage.APP_RELEATIONSHIP__PROTOCOL:
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

} //AppReleationshipImpl
