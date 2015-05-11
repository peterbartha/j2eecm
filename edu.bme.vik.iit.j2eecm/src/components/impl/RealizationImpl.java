/**
 */
package components.impl;

import components.ClassElement;
import components.ComponentsPackage;
import components.InterfaceElement;
import components.Realization;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link components.impl.RealizationImpl#getInterfaceElem <em>Interface Elem</em>}</li>
 *   <li>{@link components.impl.RealizationImpl#getClassElem <em>Class Elem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealizationImpl extends MinimalEObjectImpl.Container implements Realization {
	/**
	 * The cached value of the '{@link #getInterfaceElem() <em>Interface Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceElem()
	 * @generated
	 * @ordered
	 */
	protected InterfaceElement interfaceElem;

	/**
	 * The cached value of the '{@link #getClassElem() <em>Class Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassElem()
	 * @generated
	 * @ordered
	 */
	protected ClassElement classElem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceElement getInterfaceElem() {
		if (interfaceElem != null && interfaceElem.eIsProxy()) {
			InternalEObject oldInterfaceElem = (InternalEObject)interfaceElem;
			interfaceElem = (InterfaceElement)eResolveProxy(oldInterfaceElem);
			if (interfaceElem != oldInterfaceElem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.REALIZATION__INTERFACE_ELEM, oldInterfaceElem, interfaceElem));
			}
		}
		return interfaceElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceElement basicGetInterfaceElem() {
		return interfaceElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceElem(InterfaceElement newInterfaceElem) {
		InterfaceElement oldInterfaceElem = interfaceElem;
		interfaceElem = newInterfaceElem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.REALIZATION__INTERFACE_ELEM, oldInterfaceElem, interfaceElem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassElement getClassElem() {
		if (classElem != null && classElem.eIsProxy()) {
			InternalEObject oldClassElem = (InternalEObject)classElem;
			classElem = (ClassElement)eResolveProxy(oldClassElem);
			if (classElem != oldClassElem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.REALIZATION__CLASS_ELEM, oldClassElem, classElem));
			}
		}
		return classElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassElement basicGetClassElem() {
		return classElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassElem(ClassElement newClassElem) {
		ClassElement oldClassElem = classElem;
		classElem = newClassElem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.REALIZATION__CLASS_ELEM, oldClassElem, classElem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.REALIZATION__INTERFACE_ELEM:
				if (resolve) return getInterfaceElem();
				return basicGetInterfaceElem();
			case ComponentsPackage.REALIZATION__CLASS_ELEM:
				if (resolve) return getClassElem();
				return basicGetClassElem();
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
			case ComponentsPackage.REALIZATION__INTERFACE_ELEM:
				setInterfaceElem((InterfaceElement)newValue);
				return;
			case ComponentsPackage.REALIZATION__CLASS_ELEM:
				setClassElem((ClassElement)newValue);
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
			case ComponentsPackage.REALIZATION__INTERFACE_ELEM:
				setInterfaceElem((InterfaceElement)null);
				return;
			case ComponentsPackage.REALIZATION__CLASS_ELEM:
				setClassElem((ClassElement)null);
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
			case ComponentsPackage.REALIZATION__INTERFACE_ELEM:
				return interfaceElem != null;
			case ComponentsPackage.REALIZATION__CLASS_ELEM:
				return classElem != null;
		}
		return super.eIsSet(featureID);
	}

} //RealizationImpl
