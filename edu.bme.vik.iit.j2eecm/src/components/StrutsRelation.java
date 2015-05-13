/**
 */
package components;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struts Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link components.StrutsRelation#getTarget <em>Target</em>}</li>
 *   <li>{@link components.StrutsRelation#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see components.ComponentsPackage#getStrutsRelation()
 * @model
 * @generated
 */
public interface StrutsRelation extends WebContainerRelations {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Struts)
	 * @see components.ComponentsPackage#getStrutsRelation_Target()
	 * @model required="true"
	 * @generated
	 */
	Struts getTarget();

	/**
	 * Sets the value of the '{@link components.StrutsRelation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Struts value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Action)
	 * @see components.ComponentsPackage#getStrutsRelation_Source()
	 * @model required="true"
	 * @generated
	 */
	Action getSource();

	/**
	 * Sets the value of the '{@link components.StrutsRelation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Action value);

} // StrutsRelation
