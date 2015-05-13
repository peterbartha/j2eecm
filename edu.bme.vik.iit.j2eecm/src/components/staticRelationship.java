/**
 */
package components;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>static Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link components.staticRelationship#getTarget <em>Target</em>}</li>
 *   <li>{@link components.staticRelationship#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see components.ComponentsPackage#getstaticRelationship()
 * @model
 * @generated
 */
public interface staticRelationship extends WebContainerRelations {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(StaticWebElement)
	 * @see components.ComponentsPackage#getstaticRelationship_Target()
	 * @model required="true"
	 * @generated
	 */
	StaticWebElement getTarget();

	/**
	 * Sets the value of the '{@link components.staticRelationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(StaticWebElement value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(WebContainerElement)
	 * @see components.ComponentsPackage#getstaticRelationship_Source()
	 * @model required="true"
	 * @generated
	 */
	WebContainerElement getSource();

	/**
	 * Sets the value of the '{@link components.staticRelationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(WebContainerElement value);

} // staticRelationship
