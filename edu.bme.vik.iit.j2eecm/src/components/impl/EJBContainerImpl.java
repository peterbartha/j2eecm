/**
 */
package components.impl;

import components.Association;
import components.Classifier;
import components.ComponentsPackage;
import components.EJBContainer;
import components.Generalization;
import components.NamedElement;
import components.Realization;

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
 * An implementation of the model object '<em><b>EJB Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link components.impl.EJBContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link components.impl.EJBContainerImpl#getGeneralizationRelationship <em>Generalization Relationship</em>}</li>
 *   <li>{@link components.impl.EJBContainerImpl#getNamedElements <em>Named Elements</em>}</li>
 *   <li>{@link components.impl.EJBContainerImpl#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link components.impl.EJBContainerImpl#getRelizationRelationship <em>Relization Relationship</em>}</li>
 *   <li>{@link components.impl.EJBContainerImpl#getAssociations <em>Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EJBContainerImpl extends MinimalEObjectImpl.Container implements EJBContainer {
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
	 * The cached value of the '{@link #getGeneralizationRelationship() <em>Generalization Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizationRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalizationRelationship;

	/**
	 * The cached value of the '{@link #getNamedElements() <em>Named Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> namedElements;

	/**
	 * The cached value of the '{@link #getClassifiers() <em>Classifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> classifiers;

	/**
	 * The cached value of the '{@link #getRelizationRelationship() <em>Relization Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelizationRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Realization> relizationRelationship;

	/**
	 * The cached value of the '{@link #getAssociations() <em>Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> associations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EJBContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.EJB_CONTAINER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.EJB_CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralizationRelationship() {
		if (generalizationRelationship == null) {
			generalizationRelationship = new EObjectContainmentEList<Generalization>(Generalization.class, this, ComponentsPackage.EJB_CONTAINER__GENERALIZATION_RELATIONSHIP);
		}
		return generalizationRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getNamedElements() {
		if (namedElements == null) {
			namedElements = new EObjectContainmentEList<NamedElement>(NamedElement.class, this, ComponentsPackage.EJB_CONTAINER__NAMED_ELEMENTS);
		}
		return namedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getClassifiers() {
		if (classifiers == null) {
			classifiers = new EObjectContainmentEList<Classifier>(Classifier.class, this, ComponentsPackage.EJB_CONTAINER__CLASSIFIERS);
		}
		return classifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Realization> getRelizationRelationship() {
		if (relizationRelationship == null) {
			relizationRelationship = new EObjectContainmentEList<Realization>(Realization.class, this, ComponentsPackage.EJB_CONTAINER__RELIZATION_RELATIONSHIP);
		}
		return relizationRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getAssociations() {
		if (associations == null) {
			associations = new EObjectContainmentEList<Association>(Association.class, this, ComponentsPackage.EJB_CONTAINER__ASSOCIATIONS);
		}
		return associations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentsPackage.EJB_CONTAINER__GENERALIZATION_RELATIONSHIP:
				return ((InternalEList<?>)getGeneralizationRelationship()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.EJB_CONTAINER__NAMED_ELEMENTS:
				return ((InternalEList<?>)getNamedElements()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.EJB_CONTAINER__CLASSIFIERS:
				return ((InternalEList<?>)getClassifiers()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.EJB_CONTAINER__RELIZATION_RELATIONSHIP:
				return ((InternalEList<?>)getRelizationRelationship()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.EJB_CONTAINER__ASSOCIATIONS:
				return ((InternalEList<?>)getAssociations()).basicRemove(otherEnd, msgs);
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
			case ComponentsPackage.EJB_CONTAINER__NAME:
				return getName();
			case ComponentsPackage.EJB_CONTAINER__GENERALIZATION_RELATIONSHIP:
				return getGeneralizationRelationship();
			case ComponentsPackage.EJB_CONTAINER__NAMED_ELEMENTS:
				return getNamedElements();
			case ComponentsPackage.EJB_CONTAINER__CLASSIFIERS:
				return getClassifiers();
			case ComponentsPackage.EJB_CONTAINER__RELIZATION_RELATIONSHIP:
				return getRelizationRelationship();
			case ComponentsPackage.EJB_CONTAINER__ASSOCIATIONS:
				return getAssociations();
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
			case ComponentsPackage.EJB_CONTAINER__NAME:
				setName((String)newValue);
				return;
			case ComponentsPackage.EJB_CONTAINER__GENERALIZATION_RELATIONSHIP:
				getGeneralizationRelationship().clear();
				getGeneralizationRelationship().addAll((Collection<? extends Generalization>)newValue);
				return;
			case ComponentsPackage.EJB_CONTAINER__NAMED_ELEMENTS:
				getNamedElements().clear();
				getNamedElements().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case ComponentsPackage.EJB_CONTAINER__CLASSIFIERS:
				getClassifiers().clear();
				getClassifiers().addAll((Collection<? extends Classifier>)newValue);
				return;
			case ComponentsPackage.EJB_CONTAINER__RELIZATION_RELATIONSHIP:
				getRelizationRelationship().clear();
				getRelizationRelationship().addAll((Collection<? extends Realization>)newValue);
				return;
			case ComponentsPackage.EJB_CONTAINER__ASSOCIATIONS:
				getAssociations().clear();
				getAssociations().addAll((Collection<? extends Association>)newValue);
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
			case ComponentsPackage.EJB_CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComponentsPackage.EJB_CONTAINER__GENERALIZATION_RELATIONSHIP:
				getGeneralizationRelationship().clear();
				return;
			case ComponentsPackage.EJB_CONTAINER__NAMED_ELEMENTS:
				getNamedElements().clear();
				return;
			case ComponentsPackage.EJB_CONTAINER__CLASSIFIERS:
				getClassifiers().clear();
				return;
			case ComponentsPackage.EJB_CONTAINER__RELIZATION_RELATIONSHIP:
				getRelizationRelationship().clear();
				return;
			case ComponentsPackage.EJB_CONTAINER__ASSOCIATIONS:
				getAssociations().clear();
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
			case ComponentsPackage.EJB_CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComponentsPackage.EJB_CONTAINER__GENERALIZATION_RELATIONSHIP:
				return generalizationRelationship != null && !generalizationRelationship.isEmpty();
			case ComponentsPackage.EJB_CONTAINER__NAMED_ELEMENTS:
				return namedElements != null && !namedElements.isEmpty();
			case ComponentsPackage.EJB_CONTAINER__CLASSIFIERS:
				return classifiers != null && !classifiers.isEmpty();
			case ComponentsPackage.EJB_CONTAINER__RELIZATION_RELATIONSHIP:
				return relizationRelationship != null && !relizationRelationship.isEmpty();
			case ComponentsPackage.EJB_CONTAINER__ASSOCIATIONS:
				return associations != null && !associations.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //EJBContainerImpl
