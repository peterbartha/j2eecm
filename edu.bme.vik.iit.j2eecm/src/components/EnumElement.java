/**
 */
package components;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link components.EnumElement#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see components.ComponentsPackage#getEnumElement()
 * @model
 * @generated
 */
public interface EnumElement extends PackageableElement {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link components.EnumLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see components.ComponentsPackage#getEnumElement_Literals()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumLiteral> getLiterals();

} // EnumElement
