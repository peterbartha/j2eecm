/**
 */
package components.impl;

import components.ClassElement;
import components.ComponentsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link components.impl.ClassElementImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link components.impl.ClassElementImpl#isIsABstract <em>Is ABstract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassElementImpl extends ClassifierElementImpl implements ClassElement {
	/**
	 * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClass()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassElement> superClass;

	/**
	 * The default value of the '{@link #isIsABstract() <em>Is ABstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsABstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsABstract() <em>Is ABstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsABstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isABstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.CLASS_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassElement> getSuperClass() {
		if (superClass == null) {
			superClass = new EObjectResolvingEList<ClassElement>(ClassElement.class, this, ComponentsPackage.CLASS_ELEMENT__SUPER_CLASS);
		}
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsABstract() {
		return isABstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsABstract(boolean newIsABstract) {
		boolean oldIsABstract = isABstract;
		isABstract = newIsABstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CLASS_ELEMENT__IS_ABSTRACT, oldIsABstract, isABstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.CLASS_ELEMENT__SUPER_CLASS:
				return getSuperClass();
			case ComponentsPackage.CLASS_ELEMENT__IS_ABSTRACT:
				return isIsABstract();
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
			case ComponentsPackage.CLASS_ELEMENT__SUPER_CLASS:
				getSuperClass().clear();
				getSuperClass().addAll((Collection<? extends ClassElement>)newValue);
				return;
			case ComponentsPackage.CLASS_ELEMENT__IS_ABSTRACT:
				setIsABstract((Boolean)newValue);
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
			case ComponentsPackage.CLASS_ELEMENT__SUPER_CLASS:
				getSuperClass().clear();
				return;
			case ComponentsPackage.CLASS_ELEMENT__IS_ABSTRACT:
				setIsABstract(IS_ABSTRACT_EDEFAULT);
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
			case ComponentsPackage.CLASS_ELEMENT__SUPER_CLASS:
				return superClass != null && !superClass.isEmpty();
			case ComponentsPackage.CLASS_ELEMENT__IS_ABSTRACT:
				return isABstract != IS_ABSTRACT_EDEFAULT;
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
		result.append(" (isABstract: ");
		result.append(isABstract);
		result.append(')');
		return result.toString();
	}

} //ClassElementImpl
