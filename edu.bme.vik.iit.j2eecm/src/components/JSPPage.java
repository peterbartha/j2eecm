/**
 */
package components;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSP Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link components.JSPPage#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see components.ComponentsPackage#getJSPPage()
 * @model
 * @generated
 */
public interface JSPPage extends WebContainerElement {

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link components.LinkElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see components.ComponentsPackage#getJSPPage_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkElement> getLinks();
} // JSPPage
