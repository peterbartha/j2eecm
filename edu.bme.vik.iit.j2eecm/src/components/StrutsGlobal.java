/**
 */
package components;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struts Global</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link components.StrutsGlobal#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see components.ComponentsPackage#getStrutsGlobal()
 * @model
 * @generated
 */
public interface StrutsGlobal extends EObject {

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link components.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see components.ComponentsPackage#getStrutsGlobal_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();
} // StrutsGlobal
