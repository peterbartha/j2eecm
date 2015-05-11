/**
 */
package components;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see components.ComponentsFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "components";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "components";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "components";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentsPackage eINSTANCE = components.impl.ComponentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link components.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.ModelImpl
	 * @see components.impl.ComponentsPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Client</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SERVER = 1;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DATABASE = 2;

	/**
	 * The feature id for the '<em><b>Web Realtion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__WEB_REALTION = 3;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DATA_RELATION = 4;

	/**
	 * The feature id for the '<em><b>App Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__APP_RELATION = 5;

	/**
	 * The feature id for the '<em><b>Container Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTAINER_RELATION = 6;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link components.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.ClientImpl
	 * @see components.impl.ComponentsPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 1;

	/**
	 * The feature id for the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Browser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__BROWSER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__OS = 3;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link components.impl.J2EEServerImpl <em>J2EE Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.J2EEServerImpl
	 * @see components.impl.ComponentsPackageImpl#getJ2EEServer()
	 * @generated
	 */
	int J2EE_SERVER = 2;

	/**
	 * The feature id for the '<em><b>Ejb Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int J2EE_SERVER__EJB_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Web Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int J2EE_SERVER__WEB_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int J2EE_SERVER__NAME = 2;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int J2EE_SERVER__OS = 3;

	/**
	 * The number of structural features of the '<em>J2EE Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int J2EE_SERVER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>J2EE Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int J2EE_SERVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link components.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.DatabaseImpl
	 * @see components.impl.ComponentsPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__OS = 1;

	/**
	 * The feature id for the '<em><b>Database Engine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__DATABASE_ENGINE = 2;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link components.impl.BrowserImpl <em>Browser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.BrowserImpl
	 * @see components.impl.ComponentsPackageImpl#getBrowser()
	 * @generated
	 */
	int BROWSER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Browser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Browser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link components.impl.ApplicationClientImpl <em>Application Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.ApplicationClientImpl
	 * @see components.impl.ComponentsPackageImpl#getApplicationClient()
	 * @generated
	 */
	int APPLICATION_CLIENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CLIENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CLIENT__LANGUAGE = 1;

	/**
	 * The number of structural features of the '<em>Application Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CLIENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Application Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CLIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link components.impl.WebContainerImpl <em>Web Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.WebContainerImpl
	 * @see components.impl.ComponentsPackageImpl#getWebContainer()
	 * @generated
	 */
	int WEB_CONTAINER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Server App</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CONTAINER__SERVER_APP = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CONTAINER__ELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Web Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CONTAINER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Web Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link components.impl.EJBContainerImpl <em>EJB Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.EJBContainerImpl
	 * @see components.impl.ComponentsPackageImpl#getEJBContainer()
	 * @generated
	 */
	int EJB_CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Generalization Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_CONTAINER__GENERALIZATION_RELATIONSHIP = 1;

	/**
	 * The feature id for the '<em><b>Named Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_CONTAINER__NAMED_ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_CONTAINER__CLASSIFIERS = 3;

	/**
	 * The feature id for the '<em><b>Relization Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_CONTAINER__RELIZATION_RELATIONSHIP = 4;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_CONTAINER__ASSOCIATIONS = 5;

	/**
	 * The number of structural features of the '<em>EJB Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_CONTAINER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>EJB Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link components.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.NamedElementImpl
	 * @see components.impl.ComponentsPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__VISIBILITY = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link components.impl.PackageableElementImpl <em>Packageable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.PackageableElementImpl
	 * @see components.impl.ComponentsPackageImpl#getPackageableElement()
	 * @generated
	 */
	int PACKAGEABLE_ELEMENT = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__VISIBILITY = NAMED_ELEMENT__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link components.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.TypeImpl
	 * @see components.impl.ComponentsPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__VISIBILITY = PACKAGEABLE_ELEMENT__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link components.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.ClassifierImpl
	 * @see components.impl.ComponentsPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__VISIBILITY = TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAMESPACE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link components.impl.ClassifierElementImpl <em>Classifier Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.ClassifierElementImpl
	 * @see components.impl.ComponentsPackageImpl#getClassifierElement()
	 * @generated
	 */
	int CLASSIFIER_ELEMENT = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ELEMENT__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ELEMENT__VISIBILITY = CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ELEMENT__NAMESPACE = CLASSIFIER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ELEMENT__OWNED_OPERATION = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ELEMENT__OWNED_PROPERTY = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Classifier Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ELEMENT_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Classifier Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ELEMENT_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link components.impl.ClassElementImpl <em>Class Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.ClassElementImpl
	 * @see components.impl.ComponentsPackageImpl#getClassElement()
	 * @generated
	 */
	int CLASS_ELEMENT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ELEMENT__NAME = CLASSIFIER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ELEMENT__VISIBILITY = CLASSIFIER_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ELEMENT__NAMESPACE = CLASSIFIER_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ELEMENT__OWNED_OPERATION = CLASSIFIER_ELEMENT__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ELEMENT__OWNED_PROPERTY = CLASSIFIER_ELEMENT__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ELEMENT__SUPER_CLASS = CLASSIFIER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is ABstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ELEMENT__IS_ABSTRACT = CLASSIFIER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ELEMENT_FEATURE_COUNT = CLASSIFIER_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Class Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ELEMENT_OPERATION_COUNT = CLASSIFIER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link components.impl.EJBImpl <em>EJB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.EJBImpl
	 * @see components.impl.ComponentsPackageImpl#getEJB()
	 * @generated
	 */
	int EJB = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB__NAME = CLASS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB__VISIBILITY = CLASS_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB__NAMESPACE = CLASS_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB__OWNED_OPERATION = CLASS_ELEMENT__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB__OWNED_PROPERTY = CLASS_ELEMENT__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB__SUPER_CLASS = CLASS_ELEMENT__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Is ABstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB__IS_ABSTRACT = CLASS_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>View Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB__VIEW_TYPE = CLASS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EJB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_FEATURE_COUNT = CLASS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EJB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_OPERATION_COUNT = CLASS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link components.impl.EntityBeanImpl <em>Entity Bean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.EntityBeanImpl
	 * @see components.impl.ComponentsPackageImpl#getEntityBean()
	 * @generated
	 */
	int ENTITY_BEAN = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__NAME = EJB__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__VISIBILITY = EJB__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__NAMESPACE = EJB__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__OWNED_OPERATION = EJB__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__OWNED_PROPERTY = EJB__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__SUPER_CLASS = EJB__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Is ABstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__IS_ABSTRACT = EJB__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>View Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__VIEW_TYPE = EJB__VIEW_TYPE;

	/**
	 * The number of structural features of the '<em>Entity Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_FEATURE_COUNT = EJB_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entity Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_OPERATION_COUNT = EJB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link components.impl.SessionBeanImpl <em>Session Bean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.SessionBeanImpl
	 * @see components.impl.ComponentsPackageImpl#getSessionBean()
	 * @generated
	 */
	int SESSION_BEAN = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__NAME = EJB__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__VISIBILITY = EJB__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__NAMESPACE = EJB__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__OWNED_OPERATION = EJB__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__OWNED_PROPERTY = EJB__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__SUPER_CLASS = EJB__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Is ABstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__IS_ABSTRACT = EJB__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>View Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__VIEW_TYPE = EJB__VIEW_TYPE;

	/**
	 * The number of structural features of the '<em>Session Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_FEATURE_COUNT = EJB_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Session Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_OPERATION_COUNT = EJB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link components.impl.MessageDrivenBeanImpl <em>Message Driven Bean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.MessageDrivenBeanImpl
	 * @see components.impl.ComponentsPackageImpl#getMessageDrivenBean()
	 * @generated
	 */
	int MESSAGE_DRIVEN_BEAN = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__NAME = EJB__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__VISIBILITY = EJB__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__NAMESPACE = EJB__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__OWNED_OPERATION = EJB__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__OWNED_PROPERTY = EJB__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__SUPER_CLASS = EJB__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Is ABstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__IS_ABSTRACT = EJB__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>View Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__VIEW_TYPE = EJB__VIEW_TYPE;

	/**
	 * The number of structural features of the '<em>Message Driven Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_FEATURE_COUNT = EJB_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message Driven Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_OPERATION_COUNT = EJB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link components.impl.StatelessSessionBeanImpl <em>Stateless Session Bean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.StatelessSessionBeanImpl
	 * @see components.impl.ComponentsPackageImpl#getStatelessSessionBean()
	 * @generated
	 */
	int STATELESS_SESSION_BEAN = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATELESS_SESSION_BEAN__NAME = SESSION_BEAN__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATELESS_SESSION_BEAN__VISIBILITY = SESSION_BEAN__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATELESS_SESSION_BEAN__NAMESPACE = SESSION_BEAN__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATELESS_SESSION_BEAN__OWNED_OPERATION = SESSION_BEAN__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATELESS_SESSION_BEAN__OWNED_PROPERTY = SESSION_BEAN__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATELESS_SESSION_BEAN__SUPER_CLASS = SESSION_BEAN__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Is ABstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATELESS_SESSION_BEAN__IS_ABSTRACT = SESSION_BEAN__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>View Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATELESS_SESSION_BEAN__VIEW_TYPE = SESSION_BEAN__VIEW_TYPE;

	/**
	 * The number of structural features of the '<em>Stateless Session Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATELESS_SESSION_BEAN_FEATURE_COUNT = SESSION_BEAN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stateless Session Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATELESS_SESSION_BEAN_OPERATION_COUNT = SESSION_BEAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link components.impl.StatefulSessionBeanImpl <em>Stateful Session Bean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.StatefulSessionBeanImpl
	 * @see components.impl.ComponentsPackageImpl#getStatefulSessionBean()
	 * @generated
	 */
	int STATEFUL_SESSION_BEAN = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SESSION_BEAN__NAME = SESSION_BEAN__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SESSION_BEAN__VISIBILITY = SESSION_BEAN__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SESSION_BEAN__NAMESPACE = SESSION_BEAN__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SESSION_BEAN__OWNED_OPERATION = SESSION_BEAN__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SESSION_BEAN__OWNED_PROPERTY = SESSION_BEAN__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SESSION_BEAN__SUPER_CLASS = SESSION_BEAN__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Is ABstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SESSION_BEAN__IS_ABSTRACT = SESSION_BEAN__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>View Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SESSION_BEAN__VIEW_TYPE = SESSION_BEAN__VIEW_TYPE;

	/**
	 * The number of structural features of the '<em>Stateful Session Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SESSION_BEAN_FEATURE_COUNT = SESSION_BEAN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stateful Session Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SESSION_BEAN_OPERATION_COUNT = SESSION_BEAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link components.impl.WebContainerElementImpl <em>Web Container Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.WebContainerElementImpl
	 * @see components.impl.ComponentsPackageImpl#getWebContainerElement()
	 * @generated
	 */
	int WEB_CONTAINER_ELEMENT = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CONTAINER_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Web Container Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CONTAINER_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Web Container Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CONTAINER_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link components.impl.ServletImpl <em>Servlet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.ServletImpl
	 * @see components.impl.ComponentsPackageImpl#getServlet()
	 * @generated
	 */
	int SERVLET = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET__NAME = WEB_CONTAINER_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Servlet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_FEATURE_COUNT = WEB_CONTAINER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Servlet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_OPERATION_COUNT = WEB_CONTAINER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link components.impl.JSPPageImpl <em>JSP Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.JSPPageImpl
	 * @see components.impl.ComponentsPackageImpl#getJSPPage()
	 * @generated
	 */
	int JSP_PAGE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_PAGE__NAME = WEB_CONTAINER_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>JSP Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_PAGE_FEATURE_COUNT = WEB_CONTAINER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>JSP Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_PAGE_OPERATION_COUNT = WEB_CONTAINER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link components.impl.ContainerReleationshipImpl <em>Container Releationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.ContainerReleationshipImpl
	 * @see components.impl.ComponentsPackageImpl#getContainerReleationship()
	 * @generated
	 */
	int CONTAINER_RELEATIONSHIP = 16;

	/**
	 * The feature id for the '<em><b>Ejbs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_RELEATIONSHIP__EJBS = 0;

	/**
	 * The feature id for the '<em><b>Web</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_RELEATIONSHIP__WEB = 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_RELEATIONSHIP__PROTOCOL = 2;

	/**
	 * The number of structural features of the '<em>Container Releationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_RELEATIONSHIP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Container Releationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_RELEATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link components.impl.WebReleationshipImpl <em>Web Releationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.WebReleationshipImpl
	 * @see components.impl.ComponentsPackageImpl#getWebReleationship()
	 * @generated
	 */
	int WEB_RELEATIONSHIP = 17;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RELEATIONSHIP__PROTOCOL = 0;

	/**
	 * The feature id for the '<em><b>Browser</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RELEATIONSHIP__BROWSER = 1;

	/**
	 * The feature id for the '<em><b>Web Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RELEATIONSHIP__WEB_CONTAINER = 2;

	/**
	 * The number of structural features of the '<em>Web Releationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RELEATIONSHIP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Web Releationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RELEATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link components.impl.AppReleationshipImpl <em>App Releationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.AppReleationshipImpl
	 * @see components.impl.ComponentsPackageImpl#getAppReleationship()
	 * @generated
	 */
	int APP_RELEATIONSHIP = 18;

	/**
	 * The feature id for the '<em><b>App</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_RELEATIONSHIP__APP = 0;

	/**
	 * The feature id for the '<em><b>Ejbs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_RELEATIONSHIP__EJBS = 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_RELEATIONSHIP__PROTOCOL = 2;

	/**
	 * The number of structural features of the '<em>App Releationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_RELEATIONSHIP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>App Releationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_RELEATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link components.impl.DataReleationshipImpl <em>Data Releationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.DataReleationshipImpl
	 * @see components.impl.ComponentsPackageImpl#getDataReleationship()
	 * @generated
	 */
	int DATA_RELEATIONSHIP = 19;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELEATIONSHIP__SERVER = 0;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELEATIONSHIP__DATABASE = 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELEATIONSHIP__PROTOCOL = 2;

	/**
	 * The number of structural features of the '<em>Data Releationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELEATIONSHIP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Releationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELEATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link components.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.OperationImpl
	 * @see components.impl.ComponentsPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__VISIBILITY = PACKAGEABLE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETERS = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opeartion Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPEARTION_TYPE = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link components.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.PropertyImpl
	 * @see components.impl.ComponentsPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VISIBILITY = PACKAGEABLE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PROPERTY_TYPE = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link components.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.AssociationImpl
	 * @see components.impl.ComponentsPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__VISIBILITY = CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAMESPACE = CLASSIFIER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__LOWER_BOUND = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__UPPER_BOUND = CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link components.impl.PackageElementImpl <em>Package Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.PackageElementImpl
	 * @see components.impl.ComponentsPackageImpl#getPackageElement()
	 * @generated
	 */
	int PACKAGE_ELEMENT = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__VISIBILITY = CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__NAMESPACE = CLASSIFIER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Packaged Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__PACKAGED_ASSOCIATION = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__PACKAGED_ELEMENT = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Package Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link components.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.GeneralizationImpl
	 * @see components.impl.ComponentsPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 27;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__GENERAL = 0;

	/**
	 * The feature id for the '<em><b>Specific</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SPECIFIC = 1;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link components.impl.webModelRelationshipImpl <em>web Model Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.webModelRelationshipImpl
	 * @see components.impl.ComponentsPackageImpl#getwebModelRelationship()
	 * @generated
	 */
	int WEB_MODEL_RELATIONSHIP = 30;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_MODEL_RELATIONSHIP__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_MODEL_RELATIONSHIP__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_MODEL_RELATIONSHIP__LABEL = 2;

	/**
	 * The number of structural features of the '<em>web Model Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_MODEL_RELATIONSHIP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>web Model Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_MODEL_RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link components.impl.InterfaceElementImpl <em>Interface Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.InterfaceElementImpl
	 * @see components.impl.ComponentsPackageImpl#getInterfaceElement()
	 * @generated
	 */
	int INTERFACE_ELEMENT = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__NAME = CLASSIFIER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__VISIBILITY = CLASSIFIER_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__NAMESPACE = CLASSIFIER_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__OWNED_OPERATION = CLASSIFIER_ELEMENT__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__OWNED_PROPERTY = CLASSIFIER_ELEMENT__OWNED_PROPERTY;

	/**
	 * The number of structural features of the '<em>Interface Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT_FEATURE_COUNT = CLASSIFIER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT_OPERATION_COUNT = CLASSIFIER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link components.impl.AggregationImpl <em>Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.AggregationImpl
	 * @see components.impl.ComponentsPackageImpl#getAggregation()
	 * @generated
	 */
	int AGGREGATION = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__NAME = ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__VISIBILITY = ASSOCIATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__NAMESPACE = ASSOCIATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__TARGET = ASSOCIATION__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__SOURCE = ASSOCIATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__LOWER_BOUND = ASSOCIATION__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__UPPER_BOUND = ASSOCIATION__UPPER_BOUND;

	/**
	 * The number of structural features of the '<em>Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_OPERATION_COUNT = ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link components.impl.RealizationImpl <em>Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.impl.RealizationImpl
	 * @see components.impl.ComponentsPackageImpl#getRealization()
	 * @generated
	 */
	int REALIZATION = 34;

	/**
	 * The feature id for the '<em><b>Interface Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__INTERFACE_ELEM = 0;

	/**
	 * The feature id for the '<em><b>Class Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__CLASS_ELEM = 1;

	/**
	 * The number of structural features of the '<em>Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link components.VisibilityKind <em>Visibility Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.VisibilityKind
	 * @see components.impl.ComponentsPackageImpl#getVisibilityKind()
	 * @generated
	 */
	int VISIBILITY_KIND = 36;

	/**
	 * The meta object id for the '{@link components.ViewTypeKind <em>View Type Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see components.ViewTypeKind
	 * @see components.impl.ComponentsPackageImpl#getViewTypeKind()
	 * @generated
	 */
	int VIEW_TYPE_KIND = 37;


	/**
	 * Returns the meta object for class '{@link components.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see components.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link components.Model#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Client</em>'.
	 * @see components.Model#getClient()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Client();

	/**
	 * Returns the meta object for the containment reference '{@link components.Model#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Server</em>'.
	 * @see components.Model#getServer()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Server();

	/**
	 * Returns the meta object for the containment reference '{@link components.Model#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database</em>'.
	 * @see components.Model#getDatabase()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Database();

	/**
	 * Returns the meta object for the containment reference '{@link components.Model#getWebRealtion <em>Web Realtion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Web Realtion</em>'.
	 * @see components.Model#getWebRealtion()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_WebRealtion();

	/**
	 * Returns the meta object for the containment reference '{@link components.Model#getDataRelation <em>Data Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Relation</em>'.
	 * @see components.Model#getDataRelation()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_DataRelation();

	/**
	 * Returns the meta object for the containment reference '{@link components.Model#getAppRelation <em>App Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>App Relation</em>'.
	 * @see components.Model#getAppRelation()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_AppRelation();

	/**
	 * Returns the meta object for the containment reference '{@link components.Model#getContainerRelation <em>Container Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container Relation</em>'.
	 * @see components.Model#getContainerRelation()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_ContainerRelation();

	/**
	 * Returns the meta object for class '{@link components.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see components.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the containment reference '{@link components.Client#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application</em>'.
	 * @see components.Client#getApplication()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Application();

	/**
	 * Returns the meta object for the containment reference '{@link components.Client#getBrowser <em>Browser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Browser</em>'.
	 * @see components.Client#getBrowser()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Browser();

	/**
	 * Returns the meta object for the attribute '{@link components.Client#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see components.Client#getName()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Name();

	/**
	 * Returns the meta object for the attribute '{@link components.Client#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see components.Client#getOs()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Os();

	/**
	 * Returns the meta object for class '{@link components.J2EEServer <em>J2EE Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>J2EE Server</em>'.
	 * @see components.J2EEServer
	 * @generated
	 */
	EClass getJ2EEServer();

	/**
	 * Returns the meta object for the containment reference '{@link components.J2EEServer#getEjbContainer <em>Ejb Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Container</em>'.
	 * @see components.J2EEServer#getEjbContainer()
	 * @see #getJ2EEServer()
	 * @generated
	 */
	EReference getJ2EEServer_EjbContainer();

	/**
	 * Returns the meta object for the containment reference '{@link components.J2EEServer#getWebContainer <em>Web Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Web Container</em>'.
	 * @see components.J2EEServer#getWebContainer()
	 * @see #getJ2EEServer()
	 * @generated
	 */
	EReference getJ2EEServer_WebContainer();

	/**
	 * Returns the meta object for the attribute '{@link components.J2EEServer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see components.J2EEServer#getName()
	 * @see #getJ2EEServer()
	 * @generated
	 */
	EAttribute getJ2EEServer_Name();

	/**
	 * Returns the meta object for the attribute '{@link components.J2EEServer#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see components.J2EEServer#getOs()
	 * @see #getJ2EEServer()
	 * @generated
	 */
	EAttribute getJ2EEServer_Os();

	/**
	 * Returns the meta object for class '{@link components.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see components.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the attribute '{@link components.Database#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see components.Database#getName()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Name();

	/**
	 * Returns the meta object for the attribute '{@link components.Database#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see components.Database#getOs()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Os();

	/**
	 * Returns the meta object for the attribute '{@link components.Database#getDatabaseEngine <em>Database Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Engine</em>'.
	 * @see components.Database#getDatabaseEngine()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_DatabaseEngine();

	/**
	 * Returns the meta object for class '{@link components.Browser <em>Browser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Browser</em>'.
	 * @see components.Browser
	 * @generated
	 */
	EClass getBrowser();

	/**
	 * Returns the meta object for the attribute '{@link components.Browser#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see components.Browser#getName()
	 * @see #getBrowser()
	 * @generated
	 */
	EAttribute getBrowser_Name();

	/**
	 * Returns the meta object for class '{@link components.ApplicationClient <em>Application Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Client</em>'.
	 * @see components.ApplicationClient
	 * @generated
	 */
	EClass getApplicationClient();

	/**
	 * Returns the meta object for the attribute '{@link components.ApplicationClient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see components.ApplicationClient#getName()
	 * @see #getApplicationClient()
	 * @generated
	 */
	EAttribute getApplicationClient_Name();

	/**
	 * Returns the meta object for the attribute '{@link components.ApplicationClient#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see components.ApplicationClient#getLanguage()
	 * @see #getApplicationClient()
	 * @generated
	 */
	EAttribute getApplicationClient_Language();

	/**
	 * Returns the meta object for class '{@link components.WebContainer <em>Web Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Container</em>'.
	 * @see components.WebContainer
	 * @generated
	 */
	EClass getWebContainer();

	/**
	 * Returns the meta object for the attribute '{@link components.WebContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see components.WebContainer#getName()
	 * @see #getWebContainer()
	 * @generated
	 */
	EAttribute getWebContainer_Name();

	/**
	 * Returns the meta object for the attribute '{@link components.WebContainer#getServerApp <em>Server App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server App</em>'.
	 * @see components.WebContainer#getServerApp()
	 * @see #getWebContainer()
	 * @generated
	 */
	EAttribute getWebContainer_ServerApp();

	/**
	 * Returns the meta object for the containment reference list '{@link components.WebContainer#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see components.WebContainer#getElements()
	 * @see #getWebContainer()
	 * @generated
	 */
	EReference getWebContainer_Elements();

	/**
	 * Returns the meta object for class '{@link components.EJBContainer <em>EJB Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EJB Container</em>'.
	 * @see components.EJBContainer
	 * @generated
	 */
	EClass getEJBContainer();

	/**
	 * Returns the meta object for the attribute '{@link components.EJBContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see components.EJBContainer#getName()
	 * @see #getEJBContainer()
	 * @generated
	 */
	EAttribute getEJBContainer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link components.EJBContainer#getGeneralizationRelationship <em>Generalization Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generalization Relationship</em>'.
	 * @see components.EJBContainer#getGeneralizationRelationship()
	 * @see #getEJBContainer()
	 * @generated
	 */
	EReference getEJBContainer_GeneralizationRelationship();

	/**
	 * Returns the meta object for the containment reference list '{@link components.EJBContainer#getNamedElements <em>Named Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Elements</em>'.
	 * @see components.EJBContainer#getNamedElements()
	 * @see #getEJBContainer()
	 * @generated
	 */
	EReference getEJBContainer_NamedElements();

	/**
	 * Returns the meta object for the containment reference list '{@link components.EJBContainer#getClassifiers <em>Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classifiers</em>'.
	 * @see components.EJBContainer#getClassifiers()
	 * @see #getEJBContainer()
	 * @generated
	 */
	EReference getEJBContainer_Classifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link components.EJBContainer#getRelizationRelationship <em>Relization Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relization Relationship</em>'.
	 * @see components.EJBContainer#getRelizationRelationship()
	 * @see #getEJBContainer()
	 * @generated
	 */
	EReference getEJBContainer_RelizationRelationship();

	/**
	 * Returns the meta object for the containment reference list '{@link components.EJBContainer#getAssociations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Associations</em>'.
	 * @see components.EJBContainer#getAssociations()
	 * @see #getEJBContainer()
	 * @generated
	 */
	EReference getEJBContainer_Associations();

	/**
	 * Returns the meta object for class '{@link components.EJB <em>EJB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EJB</em>'.
	 * @see components.EJB
	 * @generated
	 */
	EClass getEJB();

	/**
	 * Returns the meta object for the attribute '{@link components.EJB#getViewType <em>View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Type</em>'.
	 * @see components.EJB#getViewType()
	 * @see #getEJB()
	 * @generated
	 */
	EAttribute getEJB_ViewType();

	/**
	 * Returns the meta object for class '{@link components.EntityBean <em>Entity Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Bean</em>'.
	 * @see components.EntityBean
	 * @generated
	 */
	EClass getEntityBean();

	/**
	 * Returns the meta object for class '{@link components.SessionBean <em>Session Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session Bean</em>'.
	 * @see components.SessionBean
	 * @generated
	 */
	EClass getSessionBean();

	/**
	 * Returns the meta object for class '{@link components.MessageDrivenBean <em>Message Driven Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Driven Bean</em>'.
	 * @see components.MessageDrivenBean
	 * @generated
	 */
	EClass getMessageDrivenBean();

	/**
	 * Returns the meta object for class '{@link components.StatelessSessionBean <em>Stateless Session Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stateless Session Bean</em>'.
	 * @see components.StatelessSessionBean
	 * @generated
	 */
	EClass getStatelessSessionBean();

	/**
	 * Returns the meta object for class '{@link components.StatefulSessionBean <em>Stateful Session Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stateful Session Bean</em>'.
	 * @see components.StatefulSessionBean
	 * @generated
	 */
	EClass getStatefulSessionBean();

	/**
	 * Returns the meta object for class '{@link components.Servlet <em>Servlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servlet</em>'.
	 * @see components.Servlet
	 * @generated
	 */
	EClass getServlet();

	/**
	 * Returns the meta object for class '{@link components.JSPPage <em>JSP Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSP Page</em>'.
	 * @see components.JSPPage
	 * @generated
	 */
	EClass getJSPPage();

	/**
	 * Returns the meta object for class '{@link components.ContainerReleationship <em>Container Releationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Releationship</em>'.
	 * @see components.ContainerReleationship
	 * @generated
	 */
	EClass getContainerReleationship();

	/**
	 * Returns the meta object for the reference '{@link components.ContainerReleationship#getEjbs <em>Ejbs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ejbs</em>'.
	 * @see components.ContainerReleationship#getEjbs()
	 * @see #getContainerReleationship()
	 * @generated
	 */
	EReference getContainerReleationship_Ejbs();

	/**
	 * Returns the meta object for the reference '{@link components.ContainerReleationship#getWeb <em>Web</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Web</em>'.
	 * @see components.ContainerReleationship#getWeb()
	 * @see #getContainerReleationship()
	 * @generated
	 */
	EReference getContainerReleationship_Web();

	/**
	 * Returns the meta object for the attribute '{@link components.ContainerReleationship#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see components.ContainerReleationship#getProtocol()
	 * @see #getContainerReleationship()
	 * @generated
	 */
	EAttribute getContainerReleationship_Protocol();

	/**
	 * Returns the meta object for class '{@link components.WebReleationship <em>Web Releationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Releationship</em>'.
	 * @see components.WebReleationship
	 * @generated
	 */
	EClass getWebReleationship();

	/**
	 * Returns the meta object for the attribute '{@link components.WebReleationship#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see components.WebReleationship#getProtocol()
	 * @see #getWebReleationship()
	 * @generated
	 */
	EAttribute getWebReleationship_Protocol();

	/**
	 * Returns the meta object for the reference '{@link components.WebReleationship#getBrowser <em>Browser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Browser</em>'.
	 * @see components.WebReleationship#getBrowser()
	 * @see #getWebReleationship()
	 * @generated
	 */
	EReference getWebReleationship_Browser();

	/**
	 * Returns the meta object for the reference '{@link components.WebReleationship#getWebContainer <em>Web Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Web Container</em>'.
	 * @see components.WebReleationship#getWebContainer()
	 * @see #getWebReleationship()
	 * @generated
	 */
	EReference getWebReleationship_WebContainer();

	/**
	 * Returns the meta object for class '{@link components.AppReleationship <em>App Releationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Releationship</em>'.
	 * @see components.AppReleationship
	 * @generated
	 */
	EClass getAppReleationship();

	/**
	 * Returns the meta object for the reference '{@link components.AppReleationship#getApp <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App</em>'.
	 * @see components.AppReleationship#getApp()
	 * @see #getAppReleationship()
	 * @generated
	 */
	EReference getAppReleationship_App();

	/**
	 * Returns the meta object for the reference '{@link components.AppReleationship#getEjbs <em>Ejbs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ejbs</em>'.
	 * @see components.AppReleationship#getEjbs()
	 * @see #getAppReleationship()
	 * @generated
	 */
	EReference getAppReleationship_Ejbs();

	/**
	 * Returns the meta object for the attribute '{@link components.AppReleationship#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see components.AppReleationship#getProtocol()
	 * @see #getAppReleationship()
	 * @generated
	 */
	EAttribute getAppReleationship_Protocol();

	/**
	 * Returns the meta object for class '{@link components.DataReleationship <em>Data Releationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Releationship</em>'.
	 * @see components.DataReleationship
	 * @generated
	 */
	EClass getDataReleationship();

	/**
	 * Returns the meta object for the reference '{@link components.DataReleationship#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server</em>'.
	 * @see components.DataReleationship#getServer()
	 * @see #getDataReleationship()
	 * @generated
	 */
	EReference getDataReleationship_Server();

	/**
	 * Returns the meta object for the reference '{@link components.DataReleationship#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see components.DataReleationship#getDatabase()
	 * @see #getDataReleationship()
	 * @generated
	 */
	EReference getDataReleationship_Database();

	/**
	 * Returns the meta object for the attribute '{@link components.DataReleationship#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see components.DataReleationship#getProtocol()
	 * @see #getDataReleationship()
	 * @generated
	 */
	EAttribute getDataReleationship_Protocol();

	/**
	 * Returns the meta object for class '{@link components.ClassElement <em>Class Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Element</em>'.
	 * @see components.ClassElement
	 * @generated
	 */
	EClass getClassElement();

	/**
	 * Returns the meta object for the reference list '{@link components.ClassElement#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Class</em>'.
	 * @see components.ClassElement#getSuperClass()
	 * @see #getClassElement()
	 * @generated
	 */
	EReference getClassElement_SuperClass();

	/**
	 * Returns the meta object for the attribute '{@link components.ClassElement#isIsABstract <em>Is ABstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is ABstract</em>'.
	 * @see components.ClassElement#isIsABstract()
	 * @see #getClassElement()
	 * @generated
	 */
	EAttribute getClassElement_IsABstract();

	/**
	 * Returns the meta object for class '{@link components.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see components.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for the attribute '{@link components.Classifier#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see components.Classifier#getNamespace()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_Namespace();

	/**
	 * Returns the meta object for class '{@link components.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see components.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link components.Operation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see components.Operation#getParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link components.Operation#getOpeartionType <em>Opeartion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opeartion Type</em>'.
	 * @see components.Operation#getOpeartionType()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_OpeartionType();

	/**
	 * Returns the meta object for class '{@link components.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see components.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link components.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see components.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the containment reference '{@link components.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see components.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link components.Property#getPropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Type</em>'.
	 * @see components.Property#getPropertyType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_PropertyType();

	/**
	 * Returns the meta object for class '{@link components.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see components.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the reference '{@link components.Association#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see components.Association#getTarget()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Target();

	/**
	 * Returns the meta object for the reference '{@link components.Association#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see components.Association#getSource()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Source();

	/**
	 * Returns the meta object for the attribute '{@link components.Association#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see components.Association#getLowerBound()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link components.Association#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see components.Association#getUpperBound()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_UpperBound();

	/**
	 * Returns the meta object for class '{@link components.PackageElement <em>Package Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Element</em>'.
	 * @see components.PackageElement
	 * @generated
	 */
	EClass getPackageElement();

	/**
	 * Returns the meta object for the containment reference list '{@link components.PackageElement#getPackagedAssociation <em>Packaged Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packaged Association</em>'.
	 * @see components.PackageElement#getPackagedAssociation()
	 * @see #getPackageElement()
	 * @generated
	 */
	EReference getPackageElement_PackagedAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link components.PackageElement#getPackagedElement <em>Packaged Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packaged Element</em>'.
	 * @see components.PackageElement#getPackagedElement()
	 * @see #getPackageElement()
	 * @generated
	 */
	EReference getPackageElement_PackagedElement();

	/**
	 * Returns the meta object for class '{@link components.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see components.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for the reference '{@link components.Generalization#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>General</em>'.
	 * @see components.Generalization#getGeneral()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_General();

	/**
	 * Returns the meta object for the reference '{@link components.Generalization#getSpecific <em>Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specific</em>'.
	 * @see components.Generalization#getSpecific()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Specific();

	/**
	 * Returns the meta object for class '{@link components.PackageableElement <em>Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packageable Element</em>'.
	 * @see components.PackageableElement
	 * @generated
	 */
	EClass getPackageableElement();

	/**
	 * Returns the meta object for class '{@link components.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see components.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link components.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see components.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link components.NamedElement#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see components.NamedElement#getVisibility()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Visibility();

	/**
	 * Returns the meta object for class '{@link components.webModelRelationship <em>web Model Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>web Model Relationship</em>'.
	 * @see components.webModelRelationship
	 * @generated
	 */
	EClass getwebModelRelationship();

	/**
	 * Returns the meta object for the reference '{@link components.webModelRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see components.webModelRelationship#getTarget()
	 * @see #getwebModelRelationship()
	 * @generated
	 */
	EReference getwebModelRelationship_Target();

	/**
	 * Returns the meta object for the reference '{@link components.webModelRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see components.webModelRelationship#getSource()
	 * @see #getwebModelRelationship()
	 * @generated
	 */
	EReference getwebModelRelationship_Source();

	/**
	 * Returns the meta object for the attribute '{@link components.webModelRelationship#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see components.webModelRelationship#getLabel()
	 * @see #getwebModelRelationship()
	 * @generated
	 */
	EAttribute getwebModelRelationship_Label();

	/**
	 * Returns the meta object for class '{@link components.WebContainerElement <em>Web Container Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Container Element</em>'.
	 * @see components.WebContainerElement
	 * @generated
	 */
	EClass getWebContainerElement();

	/**
	 * Returns the meta object for the attribute '{@link components.WebContainerElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see components.WebContainerElement#getName()
	 * @see #getWebContainerElement()
	 * @generated
	 */
	EAttribute getWebContainerElement_Name();

	/**
	 * Returns the meta object for class '{@link components.InterfaceElement <em>Interface Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Element</em>'.
	 * @see components.InterfaceElement
	 * @generated
	 */
	EClass getInterfaceElement();

	/**
	 * Returns the meta object for class '{@link components.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation</em>'.
	 * @see components.Aggregation
	 * @generated
	 */
	EClass getAggregation();

	/**
	 * Returns the meta object for class '{@link components.Realization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realization</em>'.
	 * @see components.Realization
	 * @generated
	 */
	EClass getRealization();

	/**
	 * Returns the meta object for the reference '{@link components.Realization#getInterfaceElem <em>Interface Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface Elem</em>'.
	 * @see components.Realization#getInterfaceElem()
	 * @see #getRealization()
	 * @generated
	 */
	EReference getRealization_InterfaceElem();

	/**
	 * Returns the meta object for the reference '{@link components.Realization#getClassElem <em>Class Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class Elem</em>'.
	 * @see components.Realization#getClassElem()
	 * @see #getRealization()
	 * @generated
	 */
	EReference getRealization_ClassElem();

	/**
	 * Returns the meta object for class '{@link components.ClassifierElement <em>Classifier Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Element</em>'.
	 * @see components.ClassifierElement
	 * @generated
	 */
	EClass getClassifierElement();

	/**
	 * Returns the meta object for the containment reference list '{@link components.ClassifierElement#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Operation</em>'.
	 * @see components.ClassifierElement#getOwnedOperation()
	 * @see #getClassifierElement()
	 * @generated
	 */
	EReference getClassifierElement_OwnedOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link components.ClassifierElement#getOwnedProperty <em>Owned Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Property</em>'.
	 * @see components.ClassifierElement#getOwnedProperty()
	 * @see #getClassifierElement()
	 * @generated
	 */
	EReference getClassifierElement_OwnedProperty();

	/**
	 * Returns the meta object for enum '{@link components.VisibilityKind <em>Visibility Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility Kind</em>'.
	 * @see components.VisibilityKind
	 * @generated
	 */
	EEnum getVisibilityKind();

	/**
	 * Returns the meta object for enum '{@link components.ViewTypeKind <em>View Type Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>View Type Kind</em>'.
	 * @see components.ViewTypeKind
	 * @generated
	 */
	EEnum getViewTypeKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentsFactory getComponentsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link components.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.ModelImpl
		 * @see components.impl.ComponentsPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CLIENT = eINSTANCE.getModel_Client();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SERVER = eINSTANCE.getModel_Server();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DATABASE = eINSTANCE.getModel_Database();

		/**
		 * The meta object literal for the '<em><b>Web Realtion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__WEB_REALTION = eINSTANCE.getModel_WebRealtion();

		/**
		 * The meta object literal for the '<em><b>Data Relation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DATA_RELATION = eINSTANCE.getModel_DataRelation();

		/**
		 * The meta object literal for the '<em><b>App Relation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__APP_RELATION = eINSTANCE.getModel_AppRelation();

		/**
		 * The meta object literal for the '<em><b>Container Relation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONTAINER_RELATION = eINSTANCE.getModel_ContainerRelation();

		/**
		 * The meta object literal for the '{@link components.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.ClientImpl
		 * @see components.impl.ComponentsPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__APPLICATION = eINSTANCE.getClient_Application();

		/**
		 * The meta object literal for the '<em><b>Browser</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__BROWSER = eINSTANCE.getClient_Browser();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__NAME = eINSTANCE.getClient_Name();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__OS = eINSTANCE.getClient_Os();

		/**
		 * The meta object literal for the '{@link components.impl.J2EEServerImpl <em>J2EE Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.J2EEServerImpl
		 * @see components.impl.ComponentsPackageImpl#getJ2EEServer()
		 * @generated
		 */
		EClass J2EE_SERVER = eINSTANCE.getJ2EEServer();

		/**
		 * The meta object literal for the '<em><b>Ejb Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference J2EE_SERVER__EJB_CONTAINER = eINSTANCE.getJ2EEServer_EjbContainer();

		/**
		 * The meta object literal for the '<em><b>Web Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference J2EE_SERVER__WEB_CONTAINER = eINSTANCE.getJ2EEServer_WebContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute J2EE_SERVER__NAME = eINSTANCE.getJ2EEServer_Name();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute J2EE_SERVER__OS = eINSTANCE.getJ2EEServer_Os();

		/**
		 * The meta object literal for the '{@link components.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.DatabaseImpl
		 * @see components.impl.ComponentsPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__NAME = eINSTANCE.getDatabase_Name();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__OS = eINSTANCE.getDatabase_Os();

		/**
		 * The meta object literal for the '<em><b>Database Engine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__DATABASE_ENGINE = eINSTANCE.getDatabase_DatabaseEngine();

		/**
		 * The meta object literal for the '{@link components.impl.BrowserImpl <em>Browser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.BrowserImpl
		 * @see components.impl.ComponentsPackageImpl#getBrowser()
		 * @generated
		 */
		EClass BROWSER = eINSTANCE.getBrowser();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROWSER__NAME = eINSTANCE.getBrowser_Name();

		/**
		 * The meta object literal for the '{@link components.impl.ApplicationClientImpl <em>Application Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.ApplicationClientImpl
		 * @see components.impl.ComponentsPackageImpl#getApplicationClient()
		 * @generated
		 */
		EClass APPLICATION_CLIENT = eINSTANCE.getApplicationClient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_CLIENT__NAME = eINSTANCE.getApplicationClient_Name();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_CLIENT__LANGUAGE = eINSTANCE.getApplicationClient_Language();

		/**
		 * The meta object literal for the '{@link components.impl.WebContainerImpl <em>Web Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.WebContainerImpl
		 * @see components.impl.ComponentsPackageImpl#getWebContainer()
		 * @generated
		 */
		EClass WEB_CONTAINER = eINSTANCE.getWebContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_CONTAINER__NAME = eINSTANCE.getWebContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Server App</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_CONTAINER__SERVER_APP = eINSTANCE.getWebContainer_ServerApp();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_CONTAINER__ELEMENTS = eINSTANCE.getWebContainer_Elements();

		/**
		 * The meta object literal for the '{@link components.impl.EJBContainerImpl <em>EJB Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.EJBContainerImpl
		 * @see components.impl.ComponentsPackageImpl#getEJBContainer()
		 * @generated
		 */
		EClass EJB_CONTAINER = eINSTANCE.getEJBContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_CONTAINER__NAME = eINSTANCE.getEJBContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Generalization Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_CONTAINER__GENERALIZATION_RELATIONSHIP = eINSTANCE.getEJBContainer_GeneralizationRelationship();

		/**
		 * The meta object literal for the '<em><b>Named Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_CONTAINER__NAMED_ELEMENTS = eINSTANCE.getEJBContainer_NamedElements();

		/**
		 * The meta object literal for the '<em><b>Classifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_CONTAINER__CLASSIFIERS = eINSTANCE.getEJBContainer_Classifiers();

		/**
		 * The meta object literal for the '<em><b>Relization Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_CONTAINER__RELIZATION_RELATIONSHIP = eINSTANCE.getEJBContainer_RelizationRelationship();

		/**
		 * The meta object literal for the '<em><b>Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_CONTAINER__ASSOCIATIONS = eINSTANCE.getEJBContainer_Associations();

		/**
		 * The meta object literal for the '{@link components.impl.EJBImpl <em>EJB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.EJBImpl
		 * @see components.impl.ComponentsPackageImpl#getEJB()
		 * @generated
		 */
		EClass EJB = eINSTANCE.getEJB();

		/**
		 * The meta object literal for the '<em><b>View Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB__VIEW_TYPE = eINSTANCE.getEJB_ViewType();

		/**
		 * The meta object literal for the '{@link components.impl.EntityBeanImpl <em>Entity Bean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.EntityBeanImpl
		 * @see components.impl.ComponentsPackageImpl#getEntityBean()
		 * @generated
		 */
		EClass ENTITY_BEAN = eINSTANCE.getEntityBean();

		/**
		 * The meta object literal for the '{@link components.impl.SessionBeanImpl <em>Session Bean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.SessionBeanImpl
		 * @see components.impl.ComponentsPackageImpl#getSessionBean()
		 * @generated
		 */
		EClass SESSION_BEAN = eINSTANCE.getSessionBean();

		/**
		 * The meta object literal for the '{@link components.impl.MessageDrivenBeanImpl <em>Message Driven Bean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.MessageDrivenBeanImpl
		 * @see components.impl.ComponentsPackageImpl#getMessageDrivenBean()
		 * @generated
		 */
		EClass MESSAGE_DRIVEN_BEAN = eINSTANCE.getMessageDrivenBean();

		/**
		 * The meta object literal for the '{@link components.impl.StatelessSessionBeanImpl <em>Stateless Session Bean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.StatelessSessionBeanImpl
		 * @see components.impl.ComponentsPackageImpl#getStatelessSessionBean()
		 * @generated
		 */
		EClass STATELESS_SESSION_BEAN = eINSTANCE.getStatelessSessionBean();

		/**
		 * The meta object literal for the '{@link components.impl.StatefulSessionBeanImpl <em>Stateful Session Bean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.StatefulSessionBeanImpl
		 * @see components.impl.ComponentsPackageImpl#getStatefulSessionBean()
		 * @generated
		 */
		EClass STATEFUL_SESSION_BEAN = eINSTANCE.getStatefulSessionBean();

		/**
		 * The meta object literal for the '{@link components.impl.ServletImpl <em>Servlet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.ServletImpl
		 * @see components.impl.ComponentsPackageImpl#getServlet()
		 * @generated
		 */
		EClass SERVLET = eINSTANCE.getServlet();

		/**
		 * The meta object literal for the '{@link components.impl.JSPPageImpl <em>JSP Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.JSPPageImpl
		 * @see components.impl.ComponentsPackageImpl#getJSPPage()
		 * @generated
		 */
		EClass JSP_PAGE = eINSTANCE.getJSPPage();

		/**
		 * The meta object literal for the '{@link components.impl.ContainerReleationshipImpl <em>Container Releationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.ContainerReleationshipImpl
		 * @see components.impl.ComponentsPackageImpl#getContainerReleationship()
		 * @generated
		 */
		EClass CONTAINER_RELEATIONSHIP = eINSTANCE.getContainerReleationship();

		/**
		 * The meta object literal for the '<em><b>Ejbs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_RELEATIONSHIP__EJBS = eINSTANCE.getContainerReleationship_Ejbs();

		/**
		 * The meta object literal for the '<em><b>Web</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_RELEATIONSHIP__WEB = eINSTANCE.getContainerReleationship_Web();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_RELEATIONSHIP__PROTOCOL = eINSTANCE.getContainerReleationship_Protocol();

		/**
		 * The meta object literal for the '{@link components.impl.WebReleationshipImpl <em>Web Releationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.WebReleationshipImpl
		 * @see components.impl.ComponentsPackageImpl#getWebReleationship()
		 * @generated
		 */
		EClass WEB_RELEATIONSHIP = eINSTANCE.getWebReleationship();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RELEATIONSHIP__PROTOCOL = eINSTANCE.getWebReleationship_Protocol();

		/**
		 * The meta object literal for the '<em><b>Browser</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_RELEATIONSHIP__BROWSER = eINSTANCE.getWebReleationship_Browser();

		/**
		 * The meta object literal for the '<em><b>Web Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_RELEATIONSHIP__WEB_CONTAINER = eINSTANCE.getWebReleationship_WebContainer();

		/**
		 * The meta object literal for the '{@link components.impl.AppReleationshipImpl <em>App Releationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.AppReleationshipImpl
		 * @see components.impl.ComponentsPackageImpl#getAppReleationship()
		 * @generated
		 */
		EClass APP_RELEATIONSHIP = eINSTANCE.getAppReleationship();

		/**
		 * The meta object literal for the '<em><b>App</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_RELEATIONSHIP__APP = eINSTANCE.getAppReleationship_App();

		/**
		 * The meta object literal for the '<em><b>Ejbs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_RELEATIONSHIP__EJBS = eINSTANCE.getAppReleationship_Ejbs();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_RELEATIONSHIP__PROTOCOL = eINSTANCE.getAppReleationship_Protocol();

		/**
		 * The meta object literal for the '{@link components.impl.DataReleationshipImpl <em>Data Releationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.DataReleationshipImpl
		 * @see components.impl.ComponentsPackageImpl#getDataReleationship()
		 * @generated
		 */
		EClass DATA_RELEATIONSHIP = eINSTANCE.getDataReleationship();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RELEATIONSHIP__SERVER = eINSTANCE.getDataReleationship_Server();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RELEATIONSHIP__DATABASE = eINSTANCE.getDataReleationship_Database();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RELEATIONSHIP__PROTOCOL = eINSTANCE.getDataReleationship_Protocol();

		/**
		 * The meta object literal for the '{@link components.impl.ClassElementImpl <em>Class Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.ClassElementImpl
		 * @see components.impl.ComponentsPackageImpl#getClassElement()
		 * @generated
		 */
		EClass CLASS_ELEMENT = eINSTANCE.getClassElement();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_ELEMENT__SUPER_CLASS = eINSTANCE.getClassElement_SuperClass();

		/**
		 * The meta object literal for the '<em><b>Is ABstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_ELEMENT__IS_ABSTRACT = eINSTANCE.getClassElement_IsABstract();

		/**
		 * The meta object literal for the '{@link components.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.ClassifierImpl
		 * @see components.impl.ComponentsPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__NAMESPACE = eINSTANCE.getClassifier_Namespace();

		/**
		 * The meta object literal for the '{@link components.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.OperationImpl
		 * @see components.impl.ComponentsPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Opeartion Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__OPEARTION_TYPE = eINSTANCE.getOperation_OpeartionType();

		/**
		 * The meta object literal for the '{@link components.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.TypeImpl
		 * @see components.impl.ComponentsPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link components.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.PropertyImpl
		 * @see components.impl.ComponentsPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Property Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__PROPERTY_TYPE = eINSTANCE.getProperty_PropertyType();

		/**
		 * The meta object literal for the '{@link components.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.AssociationImpl
		 * @see components.impl.ComponentsPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__TARGET = eINSTANCE.getAssociation_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__SOURCE = eINSTANCE.getAssociation_Source();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__LOWER_BOUND = eINSTANCE.getAssociation_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__UPPER_BOUND = eINSTANCE.getAssociation_UpperBound();

		/**
		 * The meta object literal for the '{@link components.impl.PackageElementImpl <em>Package Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.PackageElementImpl
		 * @see components.impl.ComponentsPackageImpl#getPackageElement()
		 * @generated
		 */
		EClass PACKAGE_ELEMENT = eINSTANCE.getPackageElement();

		/**
		 * The meta object literal for the '<em><b>Packaged Association</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_ELEMENT__PACKAGED_ASSOCIATION = eINSTANCE.getPackageElement_PackagedAssociation();

		/**
		 * The meta object literal for the '<em><b>Packaged Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_ELEMENT__PACKAGED_ELEMENT = eINSTANCE.getPackageElement_PackagedElement();

		/**
		 * The meta object literal for the '{@link components.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.GeneralizationImpl
		 * @see components.impl.ComponentsPackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__GENERAL = eINSTANCE.getGeneralization_General();

		/**
		 * The meta object literal for the '<em><b>Specific</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__SPECIFIC = eINSTANCE.getGeneralization_Specific();

		/**
		 * The meta object literal for the '{@link components.impl.PackageableElementImpl <em>Packageable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.PackageableElementImpl
		 * @see components.impl.ComponentsPackageImpl#getPackageableElement()
		 * @generated
		 */
		EClass PACKAGEABLE_ELEMENT = eINSTANCE.getPackageableElement();

		/**
		 * The meta object literal for the '{@link components.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.NamedElementImpl
		 * @see components.impl.ComponentsPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__VISIBILITY = eINSTANCE.getNamedElement_Visibility();

		/**
		 * The meta object literal for the '{@link components.impl.webModelRelationshipImpl <em>web Model Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.webModelRelationshipImpl
		 * @see components.impl.ComponentsPackageImpl#getwebModelRelationship()
		 * @generated
		 */
		EClass WEB_MODEL_RELATIONSHIP = eINSTANCE.getwebModelRelationship();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_MODEL_RELATIONSHIP__TARGET = eINSTANCE.getwebModelRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_MODEL_RELATIONSHIP__SOURCE = eINSTANCE.getwebModelRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_MODEL_RELATIONSHIP__LABEL = eINSTANCE.getwebModelRelationship_Label();

		/**
		 * The meta object literal for the '{@link components.impl.WebContainerElementImpl <em>Web Container Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.WebContainerElementImpl
		 * @see components.impl.ComponentsPackageImpl#getWebContainerElement()
		 * @generated
		 */
		EClass WEB_CONTAINER_ELEMENT = eINSTANCE.getWebContainerElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_CONTAINER_ELEMENT__NAME = eINSTANCE.getWebContainerElement_Name();

		/**
		 * The meta object literal for the '{@link components.impl.InterfaceElementImpl <em>Interface Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.InterfaceElementImpl
		 * @see components.impl.ComponentsPackageImpl#getInterfaceElement()
		 * @generated
		 */
		EClass INTERFACE_ELEMENT = eINSTANCE.getInterfaceElement();

		/**
		 * The meta object literal for the '{@link components.impl.AggregationImpl <em>Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.AggregationImpl
		 * @see components.impl.ComponentsPackageImpl#getAggregation()
		 * @generated
		 */
		EClass AGGREGATION = eINSTANCE.getAggregation();

		/**
		 * The meta object literal for the '{@link components.impl.RealizationImpl <em>Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.RealizationImpl
		 * @see components.impl.ComponentsPackageImpl#getRealization()
		 * @generated
		 */
		EClass REALIZATION = eINSTANCE.getRealization();

		/**
		 * The meta object literal for the '<em><b>Interface Elem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZATION__INTERFACE_ELEM = eINSTANCE.getRealization_InterfaceElem();

		/**
		 * The meta object literal for the '<em><b>Class Elem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZATION__CLASS_ELEM = eINSTANCE.getRealization_ClassElem();

		/**
		 * The meta object literal for the '{@link components.impl.ClassifierElementImpl <em>Classifier Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.impl.ClassifierElementImpl
		 * @see components.impl.ComponentsPackageImpl#getClassifierElement()
		 * @generated
		 */
		EClass CLASSIFIER_ELEMENT = eINSTANCE.getClassifierElement();

		/**
		 * The meta object literal for the '<em><b>Owned Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_ELEMENT__OWNED_OPERATION = eINSTANCE.getClassifierElement_OwnedOperation();

		/**
		 * The meta object literal for the '<em><b>Owned Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_ELEMENT__OWNED_PROPERTY = eINSTANCE.getClassifierElement_OwnedProperty();

		/**
		 * The meta object literal for the '{@link components.VisibilityKind <em>Visibility Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.VisibilityKind
		 * @see components.impl.ComponentsPackageImpl#getVisibilityKind()
		 * @generated
		 */
		EEnum VISIBILITY_KIND = eINSTANCE.getVisibilityKind();

		/**
		 * The meta object literal for the '{@link components.ViewTypeKind <em>View Type Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see components.ViewTypeKind
		 * @see components.impl.ComponentsPackageImpl#getViewTypeKind()
		 * @generated
		 */
		EEnum VIEW_TYPE_KIND = eINSTANCE.getViewTypeKind();

	}

} //ComponentsPackage
