/**
 */
package components;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link components.PackageElement#getPackagedAssociation <em>Packaged Association</em>}</li>
 *   <li>{@link components.PackageElement#getPackagedElement <em>Packaged Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see components.ComponentsPackage#getPackageElement()
 * @model
 * @generated
 */
public interface PackageElement extends Classifier, PackageableElement {
	/**
	 * Returns the value of the '<em><b>Packaged Association</b></em>' containment reference list.
	 * The list contents are of type {@link components.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packaged Association</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packaged Association</em>' containment reference list.
	 * @see components.ComponentsPackage#getPackageElement_PackagedAssociation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Association> getPackagedAssociation();

	/**
	 * Returns the value of the '<em><b>Packaged Element</b></em>' containment reference list.
	 * The list contents are of type {@link components.ClassifierElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packaged Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packaged Element</em>' containment reference list.
	 * @see components.ComponentsPackage#getPackageElement_PackagedElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassifierElement> getPackagedElement();

} // PackageElement
