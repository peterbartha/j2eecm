/**
 */
package components;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link components.Operation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link components.Operation#getOpeartionType <em>Opeartion Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see components.ComponentsPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends PackageableElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute.
	 * @see #setParameters(String)
	 * @see components.ComponentsPackage#getOperation_Parameters()
	 * @model
	 * @generated
	 */
	String getParameters();

	/**
	 * Sets the value of the '{@link components.Operation#getParameters <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' attribute.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(String value);

	/**
	 * Returns the value of the '<em><b>Opeartion Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opeartion Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opeartion Type</em>' attribute.
	 * @see #setOpeartionType(String)
	 * @see components.ComponentsPackage#getOperation_OpeartionType()
	 * @model
	 * @generated
	 */
	String getOpeartionType();

	/**
	 * Sets the value of the '{@link components.Operation#getOpeartionType <em>Opeartion Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opeartion Type</em>' attribute.
	 * @see #getOpeartionType()
	 * @generated
	 */
	void setOpeartionType(String value);

} // Operation
