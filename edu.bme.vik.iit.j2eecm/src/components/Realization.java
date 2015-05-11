/**
 */
package components;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link components.Realization#getInterfaceElem <em>Interface Elem</em>}</li>
 *   <li>{@link components.Realization#getClassElem <em>Class Elem</em>}</li>
 * </ul>
 * </p>
 *
 * @see components.ComponentsPackage#getRealization()
 * @model
 * @generated
 */
public interface Realization extends EObject {
	/**
	 * Returns the value of the '<em><b>Interface Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Elem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Elem</em>' reference.
	 * @see #setInterfaceElem(InterfaceElement)
	 * @see components.ComponentsPackage#getRealization_InterfaceElem()
	 * @model required="true"
	 * @generated
	 */
	InterfaceElement getInterfaceElem();

	/**
	 * Sets the value of the '{@link components.Realization#getInterfaceElem <em>Interface Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Elem</em>' reference.
	 * @see #getInterfaceElem()
	 * @generated
	 */
	void setInterfaceElem(InterfaceElement value);

	/**
	 * Returns the value of the '<em><b>Class Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Elem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Elem</em>' reference.
	 * @see #setClassElem(ClassElement)
	 * @see components.ComponentsPackage#getRealization_ClassElem()
	 * @model required="true"
	 * @generated
	 */
	ClassElement getClassElem();

	/**
	 * Sets the value of the '{@link components.Realization#getClassElem <em>Class Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Elem</em>' reference.
	 * @see #getClassElem()
	 * @generated
	 */
	void setClassElem(ClassElement value);

} // Realization
