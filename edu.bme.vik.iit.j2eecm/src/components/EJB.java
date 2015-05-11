/**
 */
package components;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EJB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link components.EJB#getViewType <em>View Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see components.ComponentsPackage#getEJB()
 * @model abstract="true"
 * @generated
 */
public interface EJB extends ClassElement {
	/**
	 * Returns the value of the '<em><b>View Type</b></em>' attribute.
	 * The literals are from the enumeration {@link components.ViewTypeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Type</em>' attribute.
	 * @see components.ViewTypeKind
	 * @see #setViewType(ViewTypeKind)
	 * @see components.ComponentsPackage#getEJB_ViewType()
	 * @model
	 * @generated
	 */
	ViewTypeKind getViewType();

	/**
	 * Sets the value of the '{@link components.EJB#getViewType <em>View Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Type</em>' attribute.
	 * @see components.ViewTypeKind
	 * @see #getViewType()
	 * @generated
	 */
	void setViewType(ViewTypeKind value);

} // EJB
