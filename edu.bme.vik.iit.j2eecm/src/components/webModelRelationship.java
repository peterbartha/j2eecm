/**
 */
package components;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>web Model Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link components.webModelRelationship#getTarget <em>Target</em>}</li>
 *   <li>{@link components.webModelRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link components.webModelRelationship#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see components.ComponentsPackage#getwebModelRelationship()
 * @model
 * @generated
 */
public interface webModelRelationship extends WebContainerRelations {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(WebContainerElement)
	 * @see components.ComponentsPackage#getwebModelRelationship_Target()
	 * @model required="true"
	 * @generated
	 */
	WebContainerElement getTarget();

	/**
	 * Sets the value of the '{@link components.webModelRelationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(WebContainerElement value);

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
	 * @see components.ComponentsPackage#getwebModelRelationship_Source()
	 * @model required="true"
	 * @generated
	 */
	WebContainerElement getSource();

	/**
	 * Sets the value of the '{@link components.webModelRelationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(WebContainerElement value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see components.ComponentsPackage#getwebModelRelationship_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link components.webModelRelationship#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // webModelRelationship
