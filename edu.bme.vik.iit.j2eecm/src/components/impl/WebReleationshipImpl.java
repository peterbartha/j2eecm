/**
 */
package components.impl;

import components.Browser;
import components.ComponentsPackage;
import components.WebContainer;
import components.WebReleationship;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Releationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link components.impl.WebReleationshipImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link components.impl.WebReleationshipImpl#getBrowser <em>Browser</em>}</li>
 *   <li>{@link components.impl.WebReleationshipImpl#getWebContainer <em>Web Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebReleationshipImpl extends MinimalEObjectImpl.Container implements WebReleationship {
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
	 * The cached value of the '{@link #getBrowser() <em>Browser</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowser()
	 * @generated
	 * @ordered
	 */
	protected Browser browser;

	/**
	 * The cached value of the '{@link #getWebContainer() <em>Web Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebContainer()
	 * @generated
	 * @ordered
	 */
	protected WebContainer webContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebReleationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.WEB_RELEATIONSHIP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.WEB_RELEATIONSHIP__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Browser getBrowser() {
		if (browser != null && browser.eIsProxy()) {
			InternalEObject oldBrowser = (InternalEObject)browser;
			browser = (Browser)eResolveProxy(oldBrowser);
			if (browser != oldBrowser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.WEB_RELEATIONSHIP__BROWSER, oldBrowser, browser));
			}
		}
		return browser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Browser basicGetBrowser() {
		return browser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrowser(Browser newBrowser) {
		Browser oldBrowser = browser;
		browser = newBrowser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.WEB_RELEATIONSHIP__BROWSER, oldBrowser, browser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebContainer getWebContainer() {
		if (webContainer != null && webContainer.eIsProxy()) {
			InternalEObject oldWebContainer = (InternalEObject)webContainer;
			webContainer = (WebContainer)eResolveProxy(oldWebContainer);
			if (webContainer != oldWebContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.WEB_RELEATIONSHIP__WEB_CONTAINER, oldWebContainer, webContainer));
			}
		}
		return webContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebContainer basicGetWebContainer() {
		return webContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebContainer(WebContainer newWebContainer) {
		WebContainer oldWebContainer = webContainer;
		webContainer = newWebContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.WEB_RELEATIONSHIP__WEB_CONTAINER, oldWebContainer, webContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.WEB_RELEATIONSHIP__PROTOCOL:
				return getProtocol();
			case ComponentsPackage.WEB_RELEATIONSHIP__BROWSER:
				if (resolve) return getBrowser();
				return basicGetBrowser();
			case ComponentsPackage.WEB_RELEATIONSHIP__WEB_CONTAINER:
				if (resolve) return getWebContainer();
				return basicGetWebContainer();
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
			case ComponentsPackage.WEB_RELEATIONSHIP__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case ComponentsPackage.WEB_RELEATIONSHIP__BROWSER:
				setBrowser((Browser)newValue);
				return;
			case ComponentsPackage.WEB_RELEATIONSHIP__WEB_CONTAINER:
				setWebContainer((WebContainer)newValue);
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
			case ComponentsPackage.WEB_RELEATIONSHIP__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case ComponentsPackage.WEB_RELEATIONSHIP__BROWSER:
				setBrowser((Browser)null);
				return;
			case ComponentsPackage.WEB_RELEATIONSHIP__WEB_CONTAINER:
				setWebContainer((WebContainer)null);
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
			case ComponentsPackage.WEB_RELEATIONSHIP__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case ComponentsPackage.WEB_RELEATIONSHIP__BROWSER:
				return browser != null;
			case ComponentsPackage.WEB_RELEATIONSHIP__WEB_CONTAINER:
				return webContainer != null;
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

} //WebReleationshipImpl
