/**
 */
package components;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link components.ActionRelationship#getActionElem <em>Action Elem</em>}</li>
 *   <li>{@link components.ActionRelationship#getPageElem <em>Page Elem</em>}</li>
 * </ul>
 * </p>
 *
 * @see components.ComponentsPackage#getActionRelationship()
 * @model
 * @generated
 */
public interface ActionRelationship extends WebContainerRelations {
	/**
	 * Returns the value of the '<em><b>Action Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Elem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Elem</em>' reference.
	 * @see #setActionElem(Action)
	 * @see components.ComponentsPackage#getActionRelationship_ActionElem()
	 * @model required="true"
	 * @generated
	 */
	Action getActionElem();

	/**
	 * Sets the value of the '{@link components.ActionRelationship#getActionElem <em>Action Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Elem</em>' reference.
	 * @see #getActionElem()
	 * @generated
	 */
	void setActionElem(Action value);

	/**
	 * Returns the value of the '<em><b>Page Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Elem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Elem</em>' reference.
	 * @see #setPageElem(JSPPage)
	 * @see components.ComponentsPackage#getActionRelationship_PageElem()
	 * @model required="true"
	 * @generated
	 */
	JSPPage getPageElem();

	/**
	 * Sets the value of the '{@link components.ActionRelationship#getPageElem <em>Page Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Elem</em>' reference.
	 * @see #getPageElem()
	 * @generated
	 */
	void setPageElem(JSPPage value);

} // ActionRelationship
