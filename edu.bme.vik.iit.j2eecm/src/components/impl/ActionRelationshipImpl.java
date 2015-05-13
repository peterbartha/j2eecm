/**
 */
package components.impl;

import components.Action;
import components.ActionRelationship;
import components.ComponentsPackage;
import components.JSPPage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link components.impl.ActionRelationshipImpl#getActionElem <em>Action Elem</em>}</li>
 *   <li>{@link components.impl.ActionRelationshipImpl#getPageElem <em>Page Elem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionRelationshipImpl extends WebContainerRelationsImpl implements ActionRelationship {
	/**
	 * The cached value of the '{@link #getActionElem() <em>Action Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionElem()
	 * @generated
	 * @ordered
	 */
	protected Action actionElem;

	/**
	 * The cached value of the '{@link #getPageElem() <em>Page Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageElem()
	 * @generated
	 * @ordered
	 */
	protected JSPPage pageElem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.ACTION_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getActionElem() {
		if (actionElem != null && actionElem.eIsProxy()) {
			InternalEObject oldActionElem = (InternalEObject)actionElem;
			actionElem = (Action)eResolveProxy(oldActionElem);
			if (actionElem != oldActionElem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.ACTION_RELATIONSHIP__ACTION_ELEM, oldActionElem, actionElem));
			}
		}
		return actionElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetActionElem() {
		return actionElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionElem(Action newActionElem) {
		Action oldActionElem = actionElem;
		actionElem = newActionElem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.ACTION_RELATIONSHIP__ACTION_ELEM, oldActionElem, actionElem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSPPage getPageElem() {
		if (pageElem != null && pageElem.eIsProxy()) {
			InternalEObject oldPageElem = (InternalEObject)pageElem;
			pageElem = (JSPPage)eResolveProxy(oldPageElem);
			if (pageElem != oldPageElem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.ACTION_RELATIONSHIP__PAGE_ELEM, oldPageElem, pageElem));
			}
		}
		return pageElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSPPage basicGetPageElem() {
		return pageElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageElem(JSPPage newPageElem) {
		JSPPage oldPageElem = pageElem;
		pageElem = newPageElem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.ACTION_RELATIONSHIP__PAGE_ELEM, oldPageElem, pageElem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.ACTION_RELATIONSHIP__ACTION_ELEM:
				if (resolve) return getActionElem();
				return basicGetActionElem();
			case ComponentsPackage.ACTION_RELATIONSHIP__PAGE_ELEM:
				if (resolve) return getPageElem();
				return basicGetPageElem();
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
			case ComponentsPackage.ACTION_RELATIONSHIP__ACTION_ELEM:
				setActionElem((Action)newValue);
				return;
			case ComponentsPackage.ACTION_RELATIONSHIP__PAGE_ELEM:
				setPageElem((JSPPage)newValue);
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
			case ComponentsPackage.ACTION_RELATIONSHIP__ACTION_ELEM:
				setActionElem((Action)null);
				return;
			case ComponentsPackage.ACTION_RELATIONSHIP__PAGE_ELEM:
				setPageElem((JSPPage)null);
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
			case ComponentsPackage.ACTION_RELATIONSHIP__ACTION_ELEM:
				return actionElem != null;
			case ComponentsPackage.ACTION_RELATIONSHIP__PAGE_ELEM:
				return pageElem != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionRelationshipImpl
