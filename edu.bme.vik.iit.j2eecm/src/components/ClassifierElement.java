/**
 */
package components;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link components.ClassifierElement#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link components.ClassifierElement#getOwnedProperty <em>Owned Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see components.ComponentsPackage#getClassifierElement()
 * @model abstract="true"
 * @generated
 */
public interface ClassifierElement extends Classifier {
	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link components.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see components.ComponentsPackage#getClassifierElement_OwnedOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

	/**
	 * Returns the value of the '<em><b>Owned Property</b></em>' containment reference list.
	 * The list contents are of type {@link components.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Property</em>' containment reference list.
	 * @see components.ComponentsPackage#getClassifierElement_OwnedProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getOwnedProperty();

} // ClassifierElement
