/**
 */
package components.impl;

import components.Action;
import components.ComponentsPackage;
import components.LinkElement;
import components.StaticWebElement;
import components.Struts;
import components.StrutsGlobal;
import components.WebContainer;
import components.WebContainerElement;

import components.WebContainerRelations;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link components.impl.WebContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link components.impl.WebContainerImpl#getServerApp <em>Server App</em>}</li>
 *   <li>{@link components.impl.WebContainerImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link components.impl.WebContainerImpl#getStruts <em>Struts</em>}</li>
 *   <li>{@link components.impl.WebContainerImpl#getStaticElements <em>Static Elements</em>}</li>
 *   <li>{@link components.impl.WebContainerImpl#getStrutsActions <em>Struts Actions</em>}</li>
 *   <li>{@link components.impl.WebContainerImpl#getWebrelations <em>Webrelations</em>}</li>
 *   <li>{@link components.impl.WebContainerImpl#getLinkElements <em>Link Elements</em>}</li>
 *   <li>{@link components.impl.WebContainerImpl#getGlobal <em>Global</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebContainerImpl extends MinimalEObjectImpl.Container implements WebContainer {
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
	 * The default value of the '{@link #getServerApp() <em>Server App</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerApp()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_APP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerApp() <em>Server App</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerApp()
	 * @generated
	 * @ordered
	 */
	protected String serverApp = SERVER_APP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<WebContainerElement> elements;

	/**
	 * The cached value of the '{@link #getStruts() <em>Struts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStruts()
	 * @generated
	 * @ordered
	 */
	protected EList<Struts> struts;

	/**
	 * The cached value of the '{@link #getStaticElements() <em>Static Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticElements()
	 * @generated
	 * @ordered
	 */
	protected EList<StaticWebElement> staticElements;

	/**
	 * The cached value of the '{@link #getStrutsActions() <em>Struts Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrutsActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> strutsActions;

	/**
	 * The cached value of the '{@link #getWebrelations() <em>Webrelations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebrelations()
	 * @generated
	 * @ordered
	 */
	protected EList<WebContainerRelations> webrelations;

	/**
	 * The cached value of the '{@link #getLinkElements() <em>Link Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkElements()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkElement> linkElements;

	/**
	 * The cached value of the '{@link #getGlobal() <em>Global</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobal()
	 * @generated
	 * @ordered
	 */
	protected StrutsGlobal global;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.WEB_CONTAINER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.WEB_CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerApp() {
		return serverApp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerApp(String newServerApp) {
		String oldServerApp = serverApp;
		serverApp = newServerApp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.WEB_CONTAINER__SERVER_APP, oldServerApp, serverApp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WebContainerElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<WebContainerElement>(WebContainerElement.class, this, ComponentsPackage.WEB_CONTAINER__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Struts> getStruts() {
		if (struts == null) {
			struts = new EObjectContainmentEList<Struts>(Struts.class, this, ComponentsPackage.WEB_CONTAINER__STRUTS);
		}
		return struts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StaticWebElement> getStaticElements() {
		if (staticElements == null) {
			staticElements = new EObjectContainmentEList<StaticWebElement>(StaticWebElement.class, this, ComponentsPackage.WEB_CONTAINER__STATIC_ELEMENTS);
		}
		return staticElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getStrutsActions() {
		if (strutsActions == null) {
			strutsActions = new EObjectContainmentEList<Action>(Action.class, this, ComponentsPackage.WEB_CONTAINER__STRUTS_ACTIONS);
		}
		return strutsActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WebContainerRelations> getWebrelations() {
		if (webrelations == null) {
			webrelations = new EObjectContainmentEList<WebContainerRelations>(WebContainerRelations.class, this, ComponentsPackage.WEB_CONTAINER__WEBRELATIONS);
		}
		return webrelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkElement> getLinkElements() {
		if (linkElements == null) {
			linkElements = new EObjectContainmentEList<LinkElement>(LinkElement.class, this, ComponentsPackage.WEB_CONTAINER__LINK_ELEMENTS);
		}
		return linkElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrutsGlobal getGlobal() {
		return global;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobal(StrutsGlobal newGlobal, NotificationChain msgs) {
		StrutsGlobal oldGlobal = global;
		global = newGlobal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentsPackage.WEB_CONTAINER__GLOBAL, oldGlobal, newGlobal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobal(StrutsGlobal newGlobal) {
		if (newGlobal != global) {
			NotificationChain msgs = null;
			if (global != null)
				msgs = ((InternalEObject)global).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.WEB_CONTAINER__GLOBAL, null, msgs);
			if (newGlobal != null)
				msgs = ((InternalEObject)newGlobal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.WEB_CONTAINER__GLOBAL, null, msgs);
			msgs = basicSetGlobal(newGlobal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.WEB_CONTAINER__GLOBAL, newGlobal, newGlobal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentsPackage.WEB_CONTAINER__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.WEB_CONTAINER__STRUTS:
				return ((InternalEList<?>)getStruts()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.WEB_CONTAINER__STATIC_ELEMENTS:
				return ((InternalEList<?>)getStaticElements()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.WEB_CONTAINER__STRUTS_ACTIONS:
				return ((InternalEList<?>)getStrutsActions()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.WEB_CONTAINER__WEBRELATIONS:
				return ((InternalEList<?>)getWebrelations()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.WEB_CONTAINER__LINK_ELEMENTS:
				return ((InternalEList<?>)getLinkElements()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.WEB_CONTAINER__GLOBAL:
				return basicSetGlobal(null, msgs);
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
			case ComponentsPackage.WEB_CONTAINER__NAME:
				return getName();
			case ComponentsPackage.WEB_CONTAINER__SERVER_APP:
				return getServerApp();
			case ComponentsPackage.WEB_CONTAINER__ELEMENTS:
				return getElements();
			case ComponentsPackage.WEB_CONTAINER__STRUTS:
				return getStruts();
			case ComponentsPackage.WEB_CONTAINER__STATIC_ELEMENTS:
				return getStaticElements();
			case ComponentsPackage.WEB_CONTAINER__STRUTS_ACTIONS:
				return getStrutsActions();
			case ComponentsPackage.WEB_CONTAINER__WEBRELATIONS:
				return getWebrelations();
			case ComponentsPackage.WEB_CONTAINER__LINK_ELEMENTS:
				return getLinkElements();
			case ComponentsPackage.WEB_CONTAINER__GLOBAL:
				return getGlobal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComponentsPackage.WEB_CONTAINER__NAME:
				setName((String)newValue);
				return;
			case ComponentsPackage.WEB_CONTAINER__SERVER_APP:
				setServerApp((String)newValue);
				return;
			case ComponentsPackage.WEB_CONTAINER__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends WebContainerElement>)newValue);
				return;
			case ComponentsPackage.WEB_CONTAINER__STRUTS:
				getStruts().clear();
				getStruts().addAll((Collection<? extends Struts>)newValue);
				return;
			case ComponentsPackage.WEB_CONTAINER__STATIC_ELEMENTS:
				getStaticElements().clear();
				getStaticElements().addAll((Collection<? extends StaticWebElement>)newValue);
				return;
			case ComponentsPackage.WEB_CONTAINER__STRUTS_ACTIONS:
				getStrutsActions().clear();
				getStrutsActions().addAll((Collection<? extends Action>)newValue);
				return;
			case ComponentsPackage.WEB_CONTAINER__WEBRELATIONS:
				getWebrelations().clear();
				getWebrelations().addAll((Collection<? extends WebContainerRelations>)newValue);
				return;
			case ComponentsPackage.WEB_CONTAINER__LINK_ELEMENTS:
				getLinkElements().clear();
				getLinkElements().addAll((Collection<? extends LinkElement>)newValue);
				return;
			case ComponentsPackage.WEB_CONTAINER__GLOBAL:
				setGlobal((StrutsGlobal)newValue);
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
			case ComponentsPackage.WEB_CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComponentsPackage.WEB_CONTAINER__SERVER_APP:
				setServerApp(SERVER_APP_EDEFAULT);
				return;
			case ComponentsPackage.WEB_CONTAINER__ELEMENTS:
				getElements().clear();
				return;
			case ComponentsPackage.WEB_CONTAINER__STRUTS:
				getStruts().clear();
				return;
			case ComponentsPackage.WEB_CONTAINER__STATIC_ELEMENTS:
				getStaticElements().clear();
				return;
			case ComponentsPackage.WEB_CONTAINER__STRUTS_ACTIONS:
				getStrutsActions().clear();
				return;
			case ComponentsPackage.WEB_CONTAINER__WEBRELATIONS:
				getWebrelations().clear();
				return;
			case ComponentsPackage.WEB_CONTAINER__LINK_ELEMENTS:
				getLinkElements().clear();
				return;
			case ComponentsPackage.WEB_CONTAINER__GLOBAL:
				setGlobal((StrutsGlobal)null);
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
			case ComponentsPackage.WEB_CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComponentsPackage.WEB_CONTAINER__SERVER_APP:
				return SERVER_APP_EDEFAULT == null ? serverApp != null : !SERVER_APP_EDEFAULT.equals(serverApp);
			case ComponentsPackage.WEB_CONTAINER__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case ComponentsPackage.WEB_CONTAINER__STRUTS:
				return struts != null && !struts.isEmpty();
			case ComponentsPackage.WEB_CONTAINER__STATIC_ELEMENTS:
				return staticElements != null && !staticElements.isEmpty();
			case ComponentsPackage.WEB_CONTAINER__STRUTS_ACTIONS:
				return strutsActions != null && !strutsActions.isEmpty();
			case ComponentsPackage.WEB_CONTAINER__WEBRELATIONS:
				return webrelations != null && !webrelations.isEmpty();
			case ComponentsPackage.WEB_CONTAINER__LINK_ELEMENTS:
				return linkElements != null && !linkElements.isEmpty();
			case ComponentsPackage.WEB_CONTAINER__GLOBAL:
				return global != null;
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
		result.append(", serverApp: ");
		result.append(serverApp);
		result.append(')');
		return result.toString();
	}

} //WebContainerImpl
