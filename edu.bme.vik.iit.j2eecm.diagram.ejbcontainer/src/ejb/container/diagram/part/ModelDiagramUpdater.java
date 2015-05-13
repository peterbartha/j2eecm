package ejb.container.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import components.Aggregation;
import components.Association;
import components.ClassElement;
import components.Classifier;
import components.ClassifierElement;
import components.ComponentsPackage;
import components.EJBContainer;
import components.EntityBean;
import components.EnumElement;
import components.EnumLiteral;
import components.Generalization;
import components.InterfaceElement;
import components.MessageDrivenBean;
import components.NamedElement;
import components.Operation;
import components.PackageElement;
import components.Property;
import components.Realization;
import components.StatefulSessionBean;
import components.StatelessSessionBean;

import ejb.container.diagram.edit.parts.AggregationEditPart;
import ejb.container.diagram.edit.parts.AssociationEditPart;
import ejb.container.diagram.edit.parts.ClassElement2EditPart;
import ejb.container.diagram.edit.parts.ClassElementEditPart;
import ejb.container.diagram.edit.parts.ClassElementOpearionCompartment2EditPart;
import ejb.container.diagram.edit.parts.ClassElementOpearionCompartmentEditPart;
import ejb.container.diagram.edit.parts.ClassElementPropertyCompartment2EditPart;
import ejb.container.diagram.edit.parts.ClassElementPropertyCompartmentEditPart;
import ejb.container.diagram.edit.parts.EJBContainerEditPart;
import ejb.container.diagram.edit.parts.EntityBeanEditPart;
import ejb.container.diagram.edit.parts.EntityBeanOpearionCompartmentEditPart;
import ejb.container.diagram.edit.parts.EntityBeanPropertyCompartmentEditPart;
import ejb.container.diagram.edit.parts.EnumElementEditPart;
import ejb.container.diagram.edit.parts.EnumElementEnumLiteralCompartmentEditPart;
import ejb.container.diagram.edit.parts.EnumLiteralEditPart;
import ejb.container.diagram.edit.parts.GeneralizationEditPart;
import ejb.container.diagram.edit.parts.InterfaceElementEditPart;
import ejb.container.diagram.edit.parts.InterfaceElementOpearionCompartmentEditPart;
import ejb.container.diagram.edit.parts.InterfaceElementPropertyCompartmentEditPart;
import ejb.container.diagram.edit.parts.MessageDrivenBeanEditPart;
import ejb.container.diagram.edit.parts.MessageDrivenBeanOpearionCompartmentEditPart;
import ejb.container.diagram.edit.parts.MessageDrivenBeanPropertyCompartmentEditPart;
import ejb.container.diagram.edit.parts.Operation2EditPart;
import ejb.container.diagram.edit.parts.Operation3EditPart;
import ejb.container.diagram.edit.parts.Operation4EditPart;
import ejb.container.diagram.edit.parts.Operation5EditPart;
import ejb.container.diagram.edit.parts.Operation6EditPart;
import ejb.container.diagram.edit.parts.Operation7EditPart;
import ejb.container.diagram.edit.parts.Operation8EditPart;
import ejb.container.diagram.edit.parts.PackageElementClassElementCompartmentEditPart;
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
import ejb.container.diagram.edit.parts.StatefulSessionBeanOpearionCompartmentEditPart;
import ejb.container.diagram.edit.parts.StatefulSessionBeanPropertyCompartmentEditPart;
import ejb.container.diagram.edit.parts.StatelessSessionBeanEditPart;
import ejb.container.diagram.edit.parts.StatelessSessionBeanOpearionCompartmentEditPart;
import ejb.container.diagram.edit.parts.StatelessSessionBeanPropertyCompartmentEditPart;
import ejb.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class ModelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getSemanticChildren(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case EJBContainerEditPart.VISUAL_ID:
			return getEJBContainer_1000SemanticChildren(view);
		case InterfaceElementPropertyCompartmentEditPart.VISUAL_ID:
			return getInterfaceElementPropertyCompartment_7005SemanticChildren(view);
		case InterfaceElementOpearionCompartmentEditPart.VISUAL_ID:
			return getInterfaceElementOpearionCompartment_7006SemanticChildren(view);
		case EntityBeanPropertyCompartmentEditPart.VISUAL_ID:
			return getEntityBeanPropertyCompartment_7007SemanticChildren(view);
		case EntityBeanOpearionCompartmentEditPart.VISUAL_ID:
			return getEntityBeanOpearionCompartment_7008SemanticChildren(view);
		case MessageDrivenBeanPropertyCompartmentEditPart.VISUAL_ID:
			return getMessageDrivenBeanPropertyCompartment_7009SemanticChildren(view);
		case MessageDrivenBeanOpearionCompartmentEditPart.VISUAL_ID:
			return getMessageDrivenBeanOpearionCompartment_7010SemanticChildren(view);
		case StatefulSessionBeanPropertyCompartmentEditPart.VISUAL_ID:
			return getStatefulSessionBeanPropertyCompartment_7011SemanticChildren(view);
		case StatefulSessionBeanOpearionCompartmentEditPart.VISUAL_ID:
			return getStatefulSessionBeanOpearionCompartment_7012SemanticChildren(view);
		case StatelessSessionBeanPropertyCompartmentEditPart.VISUAL_ID:
			return getStatelessSessionBeanPropertyCompartment_7003SemanticChildren(view);
		case StatelessSessionBeanOpearionCompartmentEditPart.VISUAL_ID:
			return getStatelessSessionBeanOpearionCompartment_7004SemanticChildren(view);
		case PackageElementClassElementCompartmentEditPart.VISUAL_ID:
			return getPackageElementClassElementCompartment_7013SemanticChildren(view);
		case ClassElementPropertyCompartment2EditPart.VISUAL_ID:
			return getClassElementPropertyCompartment_7014SemanticChildren(view);
		case ClassElementOpearionCompartment2EditPart.VISUAL_ID:
			return getClassElementOpearionCompartment_7015SemanticChildren(view);
		case ClassElementPropertyCompartmentEditPart.VISUAL_ID:
			return getClassElementPropertyCompartment_7001SemanticChildren(view);
		case ClassElementOpearionCompartmentEditPart.VISUAL_ID:
			return getClassElementOpearionCompartment_7002SemanticChildren(view);
		case EnumElementEnumLiteralCompartmentEditPart.VISUAL_ID:
			return getEnumElementEnumLiteralCompartment_7016SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getEJBContainer_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		EJBContainer modelElement = (EJBContainer) view.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getClassifiers().iterator(); it
				.hasNext();) {
			Classifier childElement = (Classifier) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InterfaceElementEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClassElementEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNamedElements().iterator(); it
				.hasNext();) {
			NamedElement childElement = (NamedElement) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EntityBeanEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MessageDrivenBeanEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StatefulSessionBeanEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StatelessSessionBeanEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PackageElementEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEnums().iterator(); it.hasNext();) {
			EnumElement childElement = (EnumElement) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EnumElementEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getInterfaceElementPropertyCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InterfaceElement modelElement = (InterfaceElement) containerView
				.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedProperty().iterator(); it
				.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Property2EditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getInterfaceElementOpearionCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InterfaceElement modelElement = (InterfaceElement) containerView
				.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedOperation().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Operation2EditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getEntityBeanPropertyCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EntityBean modelElement = (EntityBean) containerView.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedProperty().iterator(); it
				.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Property3EditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getEntityBeanOpearionCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EntityBean modelElement = (EntityBean) containerView.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedOperation().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Operation3EditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getMessageDrivenBeanPropertyCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MessageDrivenBean modelElement = (MessageDrivenBean) containerView
				.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedProperty().iterator(); it
				.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Property4EditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getMessageDrivenBeanOpearionCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MessageDrivenBean modelElement = (MessageDrivenBean) containerView
				.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedOperation().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Operation4EditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getStatefulSessionBeanPropertyCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StatefulSessionBean modelElement = (StatefulSessionBean) containerView
				.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedProperty().iterator(); it
				.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Property5EditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getStatefulSessionBeanOpearionCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StatefulSessionBean modelElement = (StatefulSessionBean) containerView
				.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedOperation().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Operation5EditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getStatelessSessionBeanPropertyCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StatelessSessionBean modelElement = (StatelessSessionBean) containerView
				.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedProperty().iterator(); it
				.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Property6EditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getStatelessSessionBeanOpearionCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StatelessSessionBean modelElement = (StatelessSessionBean) containerView
				.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedOperation().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Operation6EditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getPackageElementClassElementCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PackageElement modelElement = (PackageElement) containerView
				.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPackagedElement().iterator(); it
				.hasNext();) {
			ClassifierElement childElement = (ClassifierElement) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ClassElement2EditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getClassElementPropertyCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ClassElement modelElement = (ClassElement) containerView.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedProperty().iterator(); it
				.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Property7EditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getClassElementOpearionCompartment_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ClassElement modelElement = (ClassElement) containerView.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedOperation().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Operation7EditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getClassElementPropertyCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ClassElement modelElement = (ClassElement) containerView.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedProperty().iterator(); it
				.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Property8EditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getClassElementOpearionCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ClassElement modelElement = (ClassElement) containerView.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedOperation().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Operation8EditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getEnumElementEnumLiteralCompartment_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EnumElement modelElement = (EnumElement) containerView.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLiterals().iterator(); it
				.hasNext();) {
			EnumLiteral childElement = (EnumLiteral) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EnumLiteralEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getContainedLinks(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case EJBContainerEditPart.VISUAL_ID:
			return getEJBContainer_1000ContainedLinks(view);
		case InterfaceElementEditPart.VISUAL_ID:
			return getInterfaceElement_2012ContainedLinks(view);
		case EntityBeanEditPart.VISUAL_ID:
			return getEntityBean_2002ContainedLinks(view);
		case MessageDrivenBeanEditPart.VISUAL_ID:
			return getMessageDrivenBean_2003ContainedLinks(view);
		case StatefulSessionBeanEditPart.VISUAL_ID:
			return getStatefulSessionBean_2006ContainedLinks(view);
		case StatelessSessionBeanEditPart.VISUAL_ID:
			return getStatelessSessionBean_2007ContainedLinks(view);
		case PackageElementEditPart.VISUAL_ID:
			return getPackageElement_2009ContainedLinks(view);
		case ClassElementEditPart.VISUAL_ID:
			return getClassElement_2011ContainedLinks(view);
		case EnumElementEditPart.VISUAL_ID:
			return getEnumElement_2013ContainedLinks(view);
		case Property2EditPart.VISUAL_ID:
			return getProperty_3003ContainedLinks(view);
		case Operation2EditPart.VISUAL_ID:
			return getOperation_3004ContainedLinks(view);
		case Property3EditPart.VISUAL_ID:
			return getProperty_3005ContainedLinks(view);
		case Operation3EditPart.VISUAL_ID:
			return getOperation_3006ContainedLinks(view);
		case Property4EditPart.VISUAL_ID:
			return getProperty_3007ContainedLinks(view);
		case Operation4EditPart.VISUAL_ID:
			return getOperation_3008ContainedLinks(view);
		case Property5EditPart.VISUAL_ID:
			return getProperty_3009ContainedLinks(view);
		case Operation5EditPart.VISUAL_ID:
			return getOperation_3010ContainedLinks(view);
		case Property6EditPart.VISUAL_ID:
			return getProperty_3011ContainedLinks(view);
		case Operation6EditPart.VISUAL_ID:
			return getOperation_3012ContainedLinks(view);
		case ClassElement2EditPart.VISUAL_ID:
			return getClassElement_3016ContainedLinks(view);
		case Property7EditPart.VISUAL_ID:
			return getProperty_3014ContainedLinks(view);
		case Operation7EditPart.VISUAL_ID:
			return getOperation_3015ContainedLinks(view);
		case Property8EditPart.VISUAL_ID:
			return getProperty_3017ContainedLinks(view);
		case Operation8EditPart.VISUAL_ID:
			return getOperation_3018ContainedLinks(view);
		case EnumLiteralEditPart.VISUAL_ID:
			return getEnumLiteral_3019ContainedLinks(view);
		case RealizationEditPart.VISUAL_ID:
			return getRealization_4001ContainedLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4002ContainedLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4003ContainedLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getIncomingLinks(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case InterfaceElementEditPart.VISUAL_ID:
			return getInterfaceElement_2012IncomingLinks(view);
		case EntityBeanEditPart.VISUAL_ID:
			return getEntityBean_2002IncomingLinks(view);
		case MessageDrivenBeanEditPart.VISUAL_ID:
			return getMessageDrivenBean_2003IncomingLinks(view);
		case StatefulSessionBeanEditPart.VISUAL_ID:
			return getStatefulSessionBean_2006IncomingLinks(view);
		case StatelessSessionBeanEditPart.VISUAL_ID:
			return getStatelessSessionBean_2007IncomingLinks(view);
		case PackageElementEditPart.VISUAL_ID:
			return getPackageElement_2009IncomingLinks(view);
		case ClassElementEditPart.VISUAL_ID:
			return getClassElement_2011IncomingLinks(view);
		case EnumElementEditPart.VISUAL_ID:
			return getEnumElement_2013IncomingLinks(view);
		case Property2EditPart.VISUAL_ID:
			return getProperty_3003IncomingLinks(view);
		case Operation2EditPart.VISUAL_ID:
			return getOperation_3004IncomingLinks(view);
		case Property3EditPart.VISUAL_ID:
			return getProperty_3005IncomingLinks(view);
		case Operation3EditPart.VISUAL_ID:
			return getOperation_3006IncomingLinks(view);
		case Property4EditPart.VISUAL_ID:
			return getProperty_3007IncomingLinks(view);
		case Operation4EditPart.VISUAL_ID:
			return getOperation_3008IncomingLinks(view);
		case Property5EditPart.VISUAL_ID:
			return getProperty_3009IncomingLinks(view);
		case Operation5EditPart.VISUAL_ID:
			return getOperation_3010IncomingLinks(view);
		case Property6EditPart.VISUAL_ID:
			return getProperty_3011IncomingLinks(view);
		case Operation6EditPart.VISUAL_ID:
			return getOperation_3012IncomingLinks(view);
		case ClassElement2EditPart.VISUAL_ID:
			return getClassElement_3016IncomingLinks(view);
		case Property7EditPart.VISUAL_ID:
			return getProperty_3014IncomingLinks(view);
		case Operation7EditPart.VISUAL_ID:
			return getOperation_3015IncomingLinks(view);
		case Property8EditPart.VISUAL_ID:
			return getProperty_3017IncomingLinks(view);
		case Operation8EditPart.VISUAL_ID:
			return getOperation_3018IncomingLinks(view);
		case EnumLiteralEditPart.VISUAL_ID:
			return getEnumLiteral_3019IncomingLinks(view);
		case RealizationEditPart.VISUAL_ID:
			return getRealization_4001IncomingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4002IncomingLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4003IncomingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getOutgoingLinks(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case InterfaceElementEditPart.VISUAL_ID:
			return getInterfaceElement_2012OutgoingLinks(view);
		case EntityBeanEditPart.VISUAL_ID:
			return getEntityBean_2002OutgoingLinks(view);
		case MessageDrivenBeanEditPart.VISUAL_ID:
			return getMessageDrivenBean_2003OutgoingLinks(view);
		case StatefulSessionBeanEditPart.VISUAL_ID:
			return getStatefulSessionBean_2006OutgoingLinks(view);
		case StatelessSessionBeanEditPart.VISUAL_ID:
			return getStatelessSessionBean_2007OutgoingLinks(view);
		case PackageElementEditPart.VISUAL_ID:
			return getPackageElement_2009OutgoingLinks(view);
		case ClassElementEditPart.VISUAL_ID:
			return getClassElement_2011OutgoingLinks(view);
		case EnumElementEditPart.VISUAL_ID:
			return getEnumElement_2013OutgoingLinks(view);
		case Property2EditPart.VISUAL_ID:
			return getProperty_3003OutgoingLinks(view);
		case Operation2EditPart.VISUAL_ID:
			return getOperation_3004OutgoingLinks(view);
		case Property3EditPart.VISUAL_ID:
			return getProperty_3005OutgoingLinks(view);
		case Operation3EditPart.VISUAL_ID:
			return getOperation_3006OutgoingLinks(view);
		case Property4EditPart.VISUAL_ID:
			return getProperty_3007OutgoingLinks(view);
		case Operation4EditPart.VISUAL_ID:
			return getOperation_3008OutgoingLinks(view);
		case Property5EditPart.VISUAL_ID:
			return getProperty_3009OutgoingLinks(view);
		case Operation5EditPart.VISUAL_ID:
			return getOperation_3010OutgoingLinks(view);
		case Property6EditPart.VISUAL_ID:
			return getProperty_3011OutgoingLinks(view);
		case Operation6EditPart.VISUAL_ID:
			return getOperation_3012OutgoingLinks(view);
		case ClassElement2EditPart.VISUAL_ID:
			return getClassElement_3016OutgoingLinks(view);
		case Property7EditPart.VISUAL_ID:
			return getProperty_3014OutgoingLinks(view);
		case Operation7EditPart.VISUAL_ID:
			return getOperation_3015OutgoingLinks(view);
		case Property8EditPart.VISUAL_ID:
			return getProperty_3017OutgoingLinks(view);
		case Operation8EditPart.VISUAL_ID:
			return getOperation_3018OutgoingLinks(view);
		case EnumLiteralEditPart.VISUAL_ID:
			return getEnumLiteral_3019OutgoingLinks(view);
		case RealizationEditPart.VISUAL_ID:
			return getRealization_4001OutgoingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4002OutgoingLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4003OutgoingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getEJBContainer_1000ContainedLinks(
			View view) {
		EJBContainer modelElement = (EJBContainer) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Realization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Aggregation_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getInterfaceElement_2012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getEntityBean_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getMessageDrivenBean_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getStatefulSessionBean_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getStatelessSessionBean_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getPackageElement_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getClassElement_2011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getEnumElement_2013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getProperty_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getOperation_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getProperty_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getOperation_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getProperty_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getOperation_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getProperty_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getOperation_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getProperty_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getOperation_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getClassElement_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getProperty_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getOperation_3015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getProperty_3017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getOperation_3018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getEnumLiteral_3019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getRealization_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getGeneralization_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getAggregation_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getAssociation_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getInterfaceElement_2012IncomingLinks(
			View view) {
		InterfaceElement modelElement = (InterfaceElement) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getEntityBean_2002IncomingLinks(
			View view) {
		EntityBean modelElement = (EntityBean) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getMessageDrivenBean_2003IncomingLinks(
			View view) {
		MessageDrivenBean modelElement = (MessageDrivenBean) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getStatefulSessionBean_2006IncomingLinks(
			View view) {
		StatefulSessionBean modelElement = (StatefulSessionBean) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getStatelessSessionBean_2007IncomingLinks(
			View view) {
		StatelessSessionBean modelElement = (StatelessSessionBean) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getPackageElement_2009IncomingLinks(
			View view) {
		PackageElement modelElement = (PackageElement) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getClassElement_2011IncomingLinks(
			View view) {
		ClassElement modelElement = (ClassElement) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getEnumElement_2013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getProperty_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getOperation_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getProperty_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getOperation_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getProperty_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getOperation_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getProperty_3009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getOperation_3010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getProperty_3011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getOperation_3012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getClassElement_3016IncomingLinks(
			View view) {
		ClassElement modelElement = (ClassElement) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getProperty_3014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getOperation_3015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getProperty_3017IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getOperation_3018IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getEnumLiteral_3019IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getRealization_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getGeneralization_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getAggregation_4003IncomingLinks(
			View view) {
		Aggregation modelElement = (Aggregation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getAssociation_4004IncomingLinks(
			View view) {
		Association modelElement = (Association) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getInterfaceElement_2012OutgoingLinks(
			View view) {
		InterfaceElement modelElement = (InterfaceElement) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getEntityBean_2002OutgoingLinks(
			View view) {
		EntityBean modelElement = (EntityBean) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getMessageDrivenBean_2003OutgoingLinks(
			View view) {
		MessageDrivenBean modelElement = (MessageDrivenBean) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getStatefulSessionBean_2006OutgoingLinks(
			View view) {
		StatefulSessionBean modelElement = (StatefulSessionBean) view
				.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getStatelessSessionBean_2007OutgoingLinks(
			View view) {
		StatelessSessionBean modelElement = (StatelessSessionBean) view
				.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getPackageElement_2009OutgoingLinks(
			View view) {
		PackageElement modelElement = (PackageElement) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getClassElement_2011OutgoingLinks(
			View view) {
		ClassElement modelElement = (ClassElement) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getEnumElement_2013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getProperty_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getOperation_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getProperty_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getOperation_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getProperty_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getOperation_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getProperty_3009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getOperation_3010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getProperty_3011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getOperation_3012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getClassElement_3016OutgoingLinks(
			View view) {
		ClassElement modelElement = (ClassElement) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getProperty_3014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getOperation_3015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getProperty_3017OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getOperation_3018OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getEnumLiteral_3019OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getRealization_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getGeneralization_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getAggregation_4003OutgoingLinks(
			View view) {
		Aggregation modelElement = (Aggregation) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getAssociation_4004OutgoingLinks(
			View view) {
		Association modelElement = (Association) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getContainedTypeModelFacetLinks_Realization_4001(
			EJBContainer container) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> links = container.getRelizationRelationship()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Realization) {
				continue;
			}
			Realization link = (Realization) linkObject;
			if (RealizationEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			InterfaceElement dst = link.getInterfaceElem();
			ClassElement src = link.getClassElem();
			result.add(new ModelLinkDescriptor(src, dst, link,
					ModelElementTypes.Realization_4001,
					RealizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getContainedTypeModelFacetLinks_Generalization_4002(
			EJBContainer container) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> links = container.getGeneralizationRelationship()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) linkObject;
			if (GeneralizationEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier dst = link.getGeneral();
			Classifier src = link.getSpecific();
			result.add(new ModelLinkDescriptor(src, dst, link,
					ModelElementTypes.Generalization_4002,
					GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getContainedTypeModelFacetLinks_Aggregation_4003(
			EJBContainer container) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> links = container.getAssociations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Aggregation) {
				continue;
			}
			Aggregation link = (Aggregation) linkObject;
			if (AggregationEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassifierElement dst = link.getTarget();
			ClassifierElement src = link.getSource();
			result.add(new ModelLinkDescriptor(src, dst, link,
					ModelElementTypes.Aggregation_4003,
					AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getContainedTypeModelFacetLinks_Association_4004(
			EJBContainer container) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> links = container.getAssociations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassifierElement dst = link.getTarget();
			ClassifierElement src = link.getSource();
			result.add(new ModelLinkDescriptor(src, dst, link,
					ModelElementTypes.Association_4004,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingTypeModelFacetLinks_Realization_4001(
			InterfaceElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComponentsPackage.eINSTANCE
					.getRealization_InterfaceElem()
					|| false == setting.getEObject() instanceof Realization) {
				continue;
			}
			Realization link = (Realization) setting.getEObject();
			if (RealizationEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassElement src = link.getClassElem();
			result.add(new ModelLinkDescriptor(src, target, link,
					ModelElementTypes.Realization_4001,
					RealizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingTypeModelFacetLinks_Generalization_4002(
			Classifier target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComponentsPackage.eINSTANCE
					.getGeneralization_General()
					|| false == setting.getEObject() instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) setting.getEObject();
			if (GeneralizationEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier src = link.getSpecific();
			result.add(new ModelLinkDescriptor(src, target, link,
					ModelElementTypes.Generalization_4002,
					GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingTypeModelFacetLinks_Aggregation_4003(
			ClassifierElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComponentsPackage.eINSTANCE
					.getAssociation_Target()
					|| false == setting.getEObject() instanceof Aggregation) {
				continue;
			}
			Aggregation link = (Aggregation) setting.getEObject();
			if (AggregationEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassifierElement src = link.getSource();
			result.add(new ModelLinkDescriptor(src, target, link,
					ModelElementTypes.Aggregation_4003,
					AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingTypeModelFacetLinks_Association_4004(
			ClassifierElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComponentsPackage.eINSTANCE
					.getAssociation_Target()
					|| false == setting.getEObject() instanceof Association) {
				continue;
			}
			Association link = (Association) setting.getEObject();
			if (AssociationEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassifierElement src = link.getSource();
			result.add(new ModelLinkDescriptor(src, target, link,
					ModelElementTypes.Association_4004,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getOutgoingTypeModelFacetLinks_Realization_4001(
			ClassElement source) {
		EJBContainer container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof EJBContainer) {
				container = (EJBContainer) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> links = container.getRelizationRelationship()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Realization) {
				continue;
			}
			Realization link = (Realization) linkObject;
			if (RealizationEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			InterfaceElement dst = link.getInterfaceElem();
			ClassElement src = link.getClassElem();
			if (src != source) {
				continue;
			}
			result.add(new ModelLinkDescriptor(src, dst, link,
					ModelElementTypes.Realization_4001,
					RealizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getOutgoingTypeModelFacetLinks_Generalization_4002(
			Classifier source) {
		EJBContainer container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof EJBContainer) {
				container = (EJBContainer) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> links = container.getGeneralizationRelationship()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) linkObject;
			if (GeneralizationEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier dst = link.getGeneral();
			Classifier src = link.getSpecific();
			if (src != source) {
				continue;
			}
			result.add(new ModelLinkDescriptor(src, dst, link,
					ModelElementTypes.Generalization_4002,
					GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getOutgoingTypeModelFacetLinks_Aggregation_4003(
			ClassifierElement source) {
		EJBContainer container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof EJBContainer) {
				container = (EJBContainer) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> links = container.getAssociations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Aggregation) {
				continue;
			}
			Aggregation link = (Aggregation) linkObject;
			if (AggregationEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassifierElement dst = link.getTarget();
			ClassifierElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ModelLinkDescriptor(src, dst, link,
					ModelElementTypes.Aggregation_4003,
					AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getOutgoingTypeModelFacetLinks_Association_4004(
			ClassifierElement source) {
		EJBContainer container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof EJBContainer) {
				container = (EJBContainer) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> links = container.getAssociations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassifierElement dst = link.getTarget();
			ClassifierElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ModelLinkDescriptor(src, dst, link,
					ModelElementTypes.Association_4004,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */

		public List<ModelNodeDescriptor> getSemanticChildren(View view) {
			return ModelDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */

		public List<ModelLinkDescriptor> getContainedLinks(View view) {
			return ModelDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */

		public List<ModelLinkDescriptor> getIncomingLinks(View view) {
			return ModelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */

		public List<ModelLinkDescriptor> getOutgoingLinks(View view) {
			return ModelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
