/**
 */
package components;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>link Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link components.linkRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link components.linkRelationship#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see components.ComponentsPackage#getlinkRelationship()
 * @model
 * @generated
 */
public interface linkRelationship extends WebContainerRelations {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(LinkElement)
	 * @see components.ComponentsPackage#getlinkRelationship_Source()
	 * @model required="true"
	 * @generated
	 */
	LinkElement getSource();

	/**
	 * Sets the value of the '{@link components.linkRelationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(LinkElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(JSPPage)
	 * @see components.ComponentsPackage#getlinkRelationship_Target()
	 * @model required="true"
	 * @generated
	 */
	JSPPage getTarget();

	/**
	 * Sets the value of the '{@link components.linkRelationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(JSPPage value);

} // linkRelationship
