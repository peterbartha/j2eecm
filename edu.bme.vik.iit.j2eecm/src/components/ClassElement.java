/**
 */
package components;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link components.ClassElement#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link components.ClassElement#isIsABstract <em>Is ABstract</em>}</li>
 * </ul>
 * </p>
 *
 * @see components.ComponentsPackage#getClassElement()
 * @model
 * @generated
 */
public interface ClassElement extends ClassifierElement {
	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference list.
	 * The list contents are of type {@link components.ClassElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference list.
	 * @see components.ComponentsPackage#getClassElement_SuperClass()
	 * @model
	 * @generated
	 */
	EList<ClassElement> getSuperClass();

	/**
	 * Returns the value of the '<em><b>Is ABstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is ABstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is ABstract</em>' attribute.
	 * @see #setIsABstract(boolean)
	 * @see components.ComponentsPackage#getClassElement_IsABstract()
	 * @model
	 * @generated
	 */
	boolean isIsABstract();

	/**
	 * Sets the value of the '{@link components.ClassElement#isIsABstract <em>Is ABstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is ABstract</em>' attribute.
	 * @see #isIsABstract()
	 * @generated
	 */
	void setIsABstract(boolean value);

} // ClassElement
