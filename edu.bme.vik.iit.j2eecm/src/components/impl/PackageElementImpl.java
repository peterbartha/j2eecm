/**
 */
package components.impl;

import components.Association;
import components.ClassifierElement;
import components.ComponentsPackage;
import components.PackageElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link components.impl.PackageElementImpl#getPackagedAssociation <em>Packaged Association</em>}</li>
 *   <li>{@link components.impl.PackageElementImpl#getPackagedElement <em>Packaged Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageElementImpl extends ClassifierImpl implements PackageElement {
	/**
	 * The cached value of the '{@link #getPackagedAssociation() <em>Packaged Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagedAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> packagedAssociation;

	/**
	 * The cached value of the '{@link #getPackagedElement() <em>Packaged Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassifierElement> packagedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.PACKAGE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getPackagedAssociation() {
		if (packagedAssociation == null) {
			packagedAssociation = new EObjectContainmentEList<Association>(Association.class, this, ComponentsPackage.PACKAGE_ELEMENT__PACKAGED_ASSOCIATION);
		}
		return packagedAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassifierElement> getPackagedElement() {
		if (packagedElement == null) {
			packagedElement = new EObjectContainmentEList<ClassifierElement>(ClassifierElement.class, this, ComponentsPackage.PACKAGE_ELEMENT__PACKAGED_ELEMENT);
		}
		return packagedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentsPackage.PACKAGE_ELEMENT__PACKAGED_ASSOCIATION:
				return ((InternalEList<?>)getPackagedAssociation()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.PACKAGE_ELEMENT__PACKAGED_ELEMENT:
				return ((InternalEList<?>)getPackagedElement()).basicRemove(otherEnd, msgs);
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
			case ComponentsPackage.PACKAGE_ELEMENT__PACKAGED_ASSOCIATION:
				return getPackagedAssociation();
			case ComponentsPackage.PACKAGE_ELEMENT__PACKAGED_ELEMENT:
				return getPackagedElement();
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
			case ComponentsPackage.PACKAGE_ELEMENT__PACKAGED_ASSOCIATION:
				getPackagedAssociation().clear();
				getPackagedAssociation().addAll((Collection<? extends Association>)newValue);
				return;
			case ComponentsPackage.PACKAGE_ELEMENT__PACKAGED_ELEMENT:
				getPackagedElement().clear();
				getPackagedElement().addAll((Collection<? extends ClassifierElement>)newValue);
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
			case ComponentsPackage.PACKAGE_ELEMENT__PACKAGED_ASSOCIATION:
				getPackagedAssociation().clear();
				return;
			case ComponentsPackage.PACKAGE_ELEMENT__PACKAGED_ELEMENT:
				getPackagedElement().clear();
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
			case ComponentsPackage.PACKAGE_ELEMENT__PACKAGED_ASSOCIATION:
				return packagedAssociation != null && !packagedAssociation.isEmpty();
			case ComponentsPackage.PACKAGE_ELEMENT__PACKAGED_ELEMENT:
				return packagedElement != null && !packagedElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageElementImpl
