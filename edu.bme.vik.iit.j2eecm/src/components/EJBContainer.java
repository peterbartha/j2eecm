/**
 */
package components;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EJB Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link components.EJBContainer#getName <em>Name</em>}</li>
 *   <li>{@link components.EJBContainer#getGeneralizationRelationship <em>Generalization Relationship</em>}</li>
 *   <li>{@link components.EJBContainer#getNamedElements <em>Named Elements</em>}</li>
 *   <li>{@link components.EJBContainer#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link components.EJBContainer#getRelizationRelationship <em>Relization Relationship</em>}</li>
 *   <li>{@link components.EJBContainer#getAssociations <em>Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @see components.ComponentsPackage#getEJBContainer()
 * @model
 * @generated
 */
public interface EJBContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see components.ComponentsPackage#getEJBContainer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link components.EJBContainer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Generalization Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link components.Generalization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization Relationship</em>' containment reference list.
	 * @see components.ComponentsPackage#getEJBContainer_GeneralizationRelationship()
	 * @model containment="true"
	 * @generated
	 */
	EList<Generalization> getGeneralizationRelationship();

	/**
	 * Returns the value of the '<em><b>Named Elements</b></em>' containment reference list.
	 * The list contents are of type {@link components.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Elements</em>' containment reference list.
	 * @see components.ComponentsPackage#getEJBContainer_NamedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedElement> getNamedElements();

	/**
	 * Returns the value of the '<em><b>Classifiers</b></em>' containment reference list.
	 * The list contents are of type {@link components.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifiers</em>' containment reference list.
	 * @see components.ComponentsPackage#getEJBContainer_Classifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classifier> getClassifiers();

	/**
	 * Returns the value of the '<em><b>Relization Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link components.Realization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relization Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relization Relationship</em>' containment reference list.
	 * @see components.ComponentsPackage#getEJBContainer_RelizationRelationship()
	 * @model containment="true"
	 * @generated
	 */
	EList<Realization> getRelizationRelationship();

	/**
	 * Returns the value of the '<em><b>Associations</b></em>' containment reference list.
	 * The list contents are of type {@link components.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations</em>' containment reference list.
	 * @see components.ComponentsPackage#getEJBContainer_Associations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Association> getAssociations();

} // EJBContainer
