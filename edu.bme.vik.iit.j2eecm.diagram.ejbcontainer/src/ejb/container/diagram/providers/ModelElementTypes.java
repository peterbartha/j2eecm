package ejb.container.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import components.ComponentsPackage;

import ejb.container.diagram.edit.parts.AggregationEditPart;
import ejb.container.diagram.edit.parts.AssociationEditPart;
import ejb.container.diagram.edit.parts.ClassElement2EditPart;
import ejb.container.diagram.edit.parts.ClassElementEditPart;
import ejb.container.diagram.edit.parts.EJBContainerEditPart;
import ejb.container.diagram.edit.parts.EntityBeanEditPart;
import ejb.container.diagram.edit.parts.EnumElementEditPart;
import ejb.container.diagram.edit.parts.EnumLiteralEditPart;
import ejb.container.diagram.edit.parts.GeneralizationEditPart;
import ejb.container.diagram.edit.parts.InterfaceElementEditPart;
import ejb.container.diagram.edit.parts.MessageDrivenBeanEditPart;
import ejb.container.diagram.edit.parts.Operation2EditPart;
import ejb.container.diagram.edit.parts.Operation3EditPart;
import ejb.container.diagram.edit.parts.Operation4EditPart;
import ejb.container.diagram.edit.parts.Operation5EditPart;
import ejb.container.diagram.edit.parts.Operation6EditPart;
import ejb.container.diagram.edit.parts.Operation7EditPart;
import ejb.container.diagram.edit.parts.Operation8EditPart;
import ejb.container.diagram.edit.parts.PackageElementEditPart;
import ejb.container.diagram.edit.parts.Property2EditPart;
import ejb.container.diagram.edit.parts.Property3EditPart;
import ejb.container.diagram.edit.parts.Property4EditPart;
import ejb.container.diagram.edit.parts.Property5EditPart;
import ejb.container.diagram.edit.parts.Property6EditPart;
import ejb.container.diagram.edit.parts.Property7EditPart;
import ejb.container.diagram.edit.parts.Property8EditPart;
import ejb.container.diagram.edit.parts.RealizationEditPart;
import ejb.container.diagram.edit.parts.StatefulSessionBeanEditPart;
import ejb.container.diagram.edit.parts.StatelessSessionBeanEditPart;
import ejb.container.diagram.part.ModelDiagramEditorPlugin;

/**
 * @generated
 */
public class ModelElementTypes {

	/**
	 * @generated
	 */
	private ModelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType EJBContainer_1000 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.EJBContainer_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InterfaceElement_2012 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.InterfaceElement_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntityBean_2002 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.EntityBean_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MessageDrivenBean_2003 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.MessageDrivenBean_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StatefulSessionBean_2006 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.StatefulSessionBean_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StatelessSessionBean_2007 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.StatelessSessionBean_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PackageElement_2009 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.PackageElement_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ClassElement_2011 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.ClassElement_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EnumElement_2013 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.EnumElement_2013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Property_3003 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.Property_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operation_3004 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.Operation_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Property_3005 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.Property_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operation_3006 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.Operation_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Property_3007 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.Property_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operation_3008 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.Operation_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Property_3009 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.Property_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operation_3010 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.Operation_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Property_3011 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.Property_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operation_3012 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.Operation_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ClassElement_3016 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.ClassElement_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Property_3014 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.Property_3014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operation_3015 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.Operation_3015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Property_3017 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.Property_3017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operation_3018 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.Operation_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EnumLiteral_3019 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.EnumLiteral_3019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Realization_4001 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.Realization_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Generalization_4002 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.Generalization_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Aggregation_4003 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.Aggregation_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Association_4004 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ejbcontainer.Association_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return ModelDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(EJBContainer_1000,
					ComponentsPackage.eINSTANCE.getEJBContainer());

			elements.put(InterfaceElement_2012,
					ComponentsPackage.eINSTANCE.getInterfaceElement());

			elements.put(EntityBean_2002,
					ComponentsPackage.eINSTANCE.getEntityBean());

			elements.put(MessageDrivenBean_2003,
					ComponentsPackage.eINSTANCE.getMessageDrivenBean());

			elements.put(StatefulSessionBean_2006,
					ComponentsPackage.eINSTANCE.getStatefulSessionBean());

			elements.put(StatelessSessionBean_2007,
					ComponentsPackage.eINSTANCE.getStatelessSessionBean());

			elements.put(PackageElement_2009,
					ComponentsPackage.eINSTANCE.getPackageElement());

			elements.put(ClassElement_2011,
					ComponentsPackage.eINSTANCE.getClassElement());

			elements.put(EnumElement_2013,
					ComponentsPackage.eINSTANCE.getEnumElement());

			elements.put(Property_3003,
					ComponentsPackage.eINSTANCE.getProperty());

			elements.put(Operation_3004,
					ComponentsPackage.eINSTANCE.getOperation());

			elements.put(Property_3005,
					ComponentsPackage.eINSTANCE.getProperty());

			elements.put(Operation_3006,
					ComponentsPackage.eINSTANCE.getOperation());

			elements.put(Property_3007,
					ComponentsPackage.eINSTANCE.getProperty());

			elements.put(Operation_3008,
					ComponentsPackage.eINSTANCE.getOperation());

			elements.put(Property_3009,
					ComponentsPackage.eINSTANCE.getProperty());

			elements.put(Operation_3010,
					ComponentsPackage.eINSTANCE.getOperation());

			elements.put(Property_3011,
					ComponentsPackage.eINSTANCE.getProperty());

			elements.put(Operation_3012,
					ComponentsPackage.eINSTANCE.getOperation());

			elements.put(ClassElement_3016,
					ComponentsPackage.eINSTANCE.getClassElement());

			elements.put(Property_3014,
					ComponentsPackage.eINSTANCE.getProperty());

			elements.put(Operation_3015,
					ComponentsPackage.eINSTANCE.getOperation());

			elements.put(Property_3017,
					ComponentsPackage.eINSTANCE.getProperty());

			elements.put(Operation_3018,
					ComponentsPackage.eINSTANCE.getOperation());

			elements.put(EnumLiteral_3019,
					ComponentsPackage.eINSTANCE.getEnumLiteral());

			elements.put(Realization_4001,
					ComponentsPackage.eINSTANCE.getRealization());

			elements.put(Generalization_4002,
					ComponentsPackage.eINSTANCE.getGeneralization());

			elements.put(Aggregation_4003,
					ComponentsPackage.eINSTANCE.getAggregation());

			elements.put(Association_4004,
					ComponentsPackage.eINSTANCE.getAssociation());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(EJBContainer_1000);
			KNOWN_ELEMENT_TYPES.add(InterfaceElement_2012);
			KNOWN_ELEMENT_TYPES.add(EntityBean_2002);
			KNOWN_ELEMENT_TYPES.add(MessageDrivenBean_2003);
			KNOWN_ELEMENT_TYPES.add(StatefulSessionBean_2006);
			KNOWN_ELEMENT_TYPES.add(StatelessSessionBean_2007);
			KNOWN_ELEMENT_TYPES.add(PackageElement_2009);
			KNOWN_ELEMENT_TYPES.add(ClassElement_2011);
			KNOWN_ELEMENT_TYPES.add(EnumElement_2013);
			KNOWN_ELEMENT_TYPES.add(Property_3003);
			KNOWN_ELEMENT_TYPES.add(Operation_3004);
			KNOWN_ELEMENT_TYPES.add(Property_3005);
			KNOWN_ELEMENT_TYPES.add(Operation_3006);
			KNOWN_ELEMENT_TYPES.add(Property_3007);
			KNOWN_ELEMENT_TYPES.add(Operation_3008);
			KNOWN_ELEMENT_TYPES.add(Property_3009);
			KNOWN_ELEMENT_TYPES.add(Operation_3010);
			KNOWN_ELEMENT_TYPES.add(Property_3011);
			KNOWN_ELEMENT_TYPES.add(Operation_3012);
			KNOWN_ELEMENT_TYPES.add(ClassElement_3016);
			KNOWN_ELEMENT_TYPES.add(Property_3014);
			KNOWN_ELEMENT_TYPES.add(Operation_3015);
			KNOWN_ELEMENT_TYPES.add(Property_3017);
			KNOWN_ELEMENT_TYPES.add(Operation_3018);
			KNOWN_ELEMENT_TYPES.add(EnumLiteral_3019);
			KNOWN_ELEMENT_TYPES.add(Realization_4001);
			KNOWN_ELEMENT_TYPES.add(Generalization_4002);
			KNOWN_ELEMENT_TYPES.add(Aggregation_4003);
			KNOWN_ELEMENT_TYPES.add(Association_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case EJBContainerEditPart.VISUAL_ID:
			return EJBContainer_1000;
		case InterfaceElementEditPart.VISUAL_ID:
			return InterfaceElement_2012;
		case EntityBeanEditPart.VISUAL_ID:
			return EntityBean_2002;
		case MessageDrivenBeanEditPart.VISUAL_ID:
			return MessageDrivenBean_2003;
		case StatefulSessionBeanEditPart.VISUAL_ID:
			return StatefulSessionBean_2006;
		case StatelessSessionBeanEditPart.VISUAL_ID:
			return StatelessSessionBean_2007;
		case PackageElementEditPart.VISUAL_ID:
			return PackageElement_2009;
		case ClassElementEditPart.VISUAL_ID:
			return ClassElement_2011;
		case EnumElementEditPart.VISUAL_ID:
			return EnumElement_2013;
		case Property2EditPart.VISUAL_ID:
			return Property_3003;
		case Operation2EditPart.VISUAL_ID:
			return Operation_3004;
		case Property3EditPart.VISUAL_ID:
			return Property_3005;
		case Operation3EditPart.VISUAL_ID:
			return Operation_3006;
		case Property4EditPart.VISUAL_ID:
			return Property_3007;
		case Operation4EditPart.VISUAL_ID:
			return Operation_3008;
		case Property5EditPart.VISUAL_ID:
			return Property_3009;
		case Operation5EditPart.VISUAL_ID:
			return Operation_3010;
		case Property6EditPart.VISUAL_ID:
			return Property_3011;
		case Operation6EditPart.VISUAL_ID:
			return Operation_3012;
		case ClassElement2EditPart.VISUAL_ID:
			return ClassElement_3016;
		case Property7EditPart.VISUAL_ID:
			return Property_3014;
		case Operation7EditPart.VISUAL_ID:
			return Operation_3015;
		case Property8EditPart.VISUAL_ID:
			return Property_3017;
		case Operation8EditPart.VISUAL_ID:
			return Operation_3018;
		case EnumLiteralEditPart.VISUAL_ID:
			return EnumLiteral_3019;
		case RealizationEditPart.VISUAL_ID:
			return Realization_4001;
		case GeneralizationEditPart.VISUAL_ID:
			return Generalization_4002;
		case AggregationEditPart.VISUAL_ID:
			return Aggregation_4003;
		case AssociationEditPart.VISUAL_ID:
			return Association_4004;
		}
		return null;
	}

}
