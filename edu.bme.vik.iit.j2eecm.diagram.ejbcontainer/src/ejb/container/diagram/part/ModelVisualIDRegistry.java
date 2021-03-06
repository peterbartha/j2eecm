package ejb.container.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import components.ComponentsPackage;
import components.EJBContainer;

import ejb.container.diagram.edit.parts.AggregationEditPart;
import ejb.container.diagram.edit.parts.AggregationLowerBoundUpperBoundEditPart;
import ejb.container.diagram.edit.parts.AggregationNameEditPart;
import ejb.container.diagram.edit.parts.AssociationEditPart;
import ejb.container.diagram.edit.parts.AssociationLowerBoundUpperBoundEditPart;
import ejb.container.diagram.edit.parts.AssociationNameEditPart;
import ejb.container.diagram.edit.parts.ClassElement2EditPart;
import ejb.container.diagram.edit.parts.ClassElementEditPart;
import ejb.container.diagram.edit.parts.ClassElementName2EditPart;
import ejb.container.diagram.edit.parts.ClassElementNameEditPart;
import ejb.container.diagram.edit.parts.ClassElementOpearionCompartment2EditPart;
import ejb.container.diagram.edit.parts.ClassElementOpearionCompartmentEditPart;
import ejb.container.diagram.edit.parts.ClassElementPropertyCompartment2EditPart;
import ejb.container.diagram.edit.parts.ClassElementPropertyCompartmentEditPart;
import ejb.container.diagram.edit.parts.EJBContainerEditPart;
import ejb.container.diagram.edit.parts.EntityBeanEditPart;
import ejb.container.diagram.edit.parts.EntityBeanNameEditPart;
import ejb.container.diagram.edit.parts.EntityBeanOpearionCompartmentEditPart;
import ejb.container.diagram.edit.parts.EntityBeanPropertyCompartmentEditPart;
import ejb.container.diagram.edit.parts.EntityBeanVisibilityEditPart;
import ejb.container.diagram.edit.parts.EnumElementEditPart;
import ejb.container.diagram.edit.parts.EnumElementEnumLiteralCompartmentEditPart;
import ejb.container.diagram.edit.parts.EnumElementNameEditPart;
import ejb.container.diagram.edit.parts.EnumLiteralEditPart;
import ejb.container.diagram.edit.parts.EnumLiteralNameEditPart;
import ejb.container.diagram.edit.parts.GeneralizationEditPart;
import ejb.container.diagram.edit.parts.InterfaceElementEditPart;
import ejb.container.diagram.edit.parts.InterfaceElementNameEditPart;
import ejb.container.diagram.edit.parts.InterfaceElementOpearionCompartmentEditPart;
import ejb.container.diagram.edit.parts.InterfaceElementPropertyCompartmentEditPart;
import ejb.container.diagram.edit.parts.MessageDrivenBeanEditPart;
import ejb.container.diagram.edit.parts.MessageDrivenBeanNameEditPart;
import ejb.container.diagram.edit.parts.MessageDrivenBeanOpearionCompartmentEditPart;
import ejb.container.diagram.edit.parts.MessageDrivenBeanPropertyCompartmentEditPart;
import ejb.container.diagram.edit.parts.MessageDrivenBeanVisibilityEditPart;
import ejb.container.diagram.edit.parts.Operation2EditPart;
import ejb.container.diagram.edit.parts.Operation3EditPart;
import ejb.container.diagram.edit.parts.Operation4EditPart;
import ejb.container.diagram.edit.parts.Operation5EditPart;
import ejb.container.diagram.edit.parts.Operation6EditPart;
import ejb.container.diagram.edit.parts.Operation7EditPart;
import ejb.container.diagram.edit.parts.Operation8EditPart;
import ejb.container.diagram.edit.parts.OperationNameParametersOpeartion2EditPart;
import ejb.container.diagram.edit.parts.OperationNameParametersOpeartion3EditPart;
import ejb.container.diagram.edit.parts.OperationNameParametersOpeartion4EditPart;
import ejb.container.diagram.edit.parts.OperationNameParametersOpeartion5EditPart;
import ejb.container.diagram.edit.parts.OperationNameParametersOpeartion6EditPart;
import ejb.container.diagram.edit.parts.OperationNameParametersOpeartionEditPart;
import ejb.container.diagram.edit.parts.OperationNameVisibilityEditPart;
import ejb.container.diagram.edit.parts.PackageElementClassElementCompartmentEditPart;
import ejb.container.diagram.edit.parts.PackageElementEditPart;
import ejb.container.diagram.edit.parts.PackageElementNameEditPart;
import ejb.container.diagram.edit.parts.Property2EditPart;
import ejb.container.diagram.edit.parts.Property3EditPart;
import ejb.container.diagram.edit.parts.Property4EditPart;
import ejb.container.diagram.edit.parts.Property5EditPart;
import ejb.container.diagram.edit.parts.Property6EditPart;
import ejb.container.diagram.edit.parts.Property7EditPart;
import ejb.container.diagram.edit.parts.Property8EditPart;
import ejb.container.diagram.edit.parts.PropertyNamePropertyType2EditPart;
import ejb.container.diagram.edit.parts.PropertyNamePropertyType3EditPart;
import ejb.container.diagram.edit.parts.PropertyNamePropertyType4EditPart;
import ejb.container.diagram.edit.parts.PropertyNamePropertyType5EditPart;
import ejb.container.diagram.edit.parts.PropertyNamePropertyType6EditPart;
import ejb.container.diagram.edit.parts.PropertyNamePropertyTypeEditPart;
import ejb.container.diagram.edit.parts.PropertyNameVisibilityEditPart;
import ejb.container.diagram.edit.parts.RealizationEditPart;
import ejb.container.diagram.edit.parts.StatefulSessionBeanEditPart;
import ejb.container.diagram.edit.parts.StatefulSessionBeanNameEditPart;
import ejb.container.diagram.edit.parts.StatefulSessionBeanOpearionCompartmentEditPart;
import ejb.container.diagram.edit.parts.StatefulSessionBeanPropertyCompartmentEditPart;
import ejb.container.diagram.edit.parts.StatefulSessionBeanVisibilityEditPart;
import ejb.container.diagram.edit.parts.StatelessSessionBeanEditPart;
import ejb.container.diagram.edit.parts.StatelessSessionBeanNameEditPart;
import ejb.container.diagram.edit.parts.StatelessSessionBeanOpearionCompartmentEditPart;
import ejb.container.diagram.edit.parts.StatelessSessionBeanPropertyCompartmentEditPart;
import ejb.container.diagram.edit.parts.StatelessSessionBeanVisibilityEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ModelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "edu.bme.vik.iit.j2eecm.diagram.ejbcontainer/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (EJBContainerEditPart.MODEL_ID.equals(view.getType())) {
				return EJBContainerEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return ejb.container.diagram.part.ModelVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				ModelDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ComponentsPackage.eINSTANCE.getEJBContainer().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((EJBContainer) domainElement)) {
			return EJBContainerEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = ejb.container.diagram.part.ModelVisualIDRegistry
				.getModelID(containerView);
		if (!EJBContainerEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (EJBContainerEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ejb.container.diagram.part.ModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = EJBContainerEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case EJBContainerEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getInterfaceElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return InterfaceElementEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getEntityBean().isSuperTypeOf(
					domainElement.eClass())) {
				return EntityBeanEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getMessageDrivenBean()
					.isSuperTypeOf(domainElement.eClass())) {
				return MessageDrivenBeanEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getStatefulSessionBean()
					.isSuperTypeOf(domainElement.eClass())) {
				return StatefulSessionBeanEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getStatelessSessionBean()
					.isSuperTypeOf(domainElement.eClass())) {
				return StatelessSessionBeanEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getPackageElement().isSuperTypeOf(
					domainElement.eClass())) {
				return PackageElementEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getClassElement().isSuperTypeOf(
					domainElement.eClass())) {
				return ClassElementEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getEnumElement().isSuperTypeOf(
					domainElement.eClass())) {
				return EnumElementEditPart.VISUAL_ID;
			}
			break;
		case InterfaceElementPropertyCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return Property2EditPart.VISUAL_ID;
			}
			break;
		case InterfaceElementOpearionCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return Operation2EditPart.VISUAL_ID;
			}
			break;
		case EntityBeanPropertyCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return Property3EditPart.VISUAL_ID;
			}
			break;
		case EntityBeanOpearionCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return Operation3EditPart.VISUAL_ID;
			}
			break;
		case MessageDrivenBeanPropertyCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return Property4EditPart.VISUAL_ID;
			}
			break;
		case MessageDrivenBeanOpearionCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return Operation4EditPart.VISUAL_ID;
			}
			break;
		case StatefulSessionBeanPropertyCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return Property5EditPart.VISUAL_ID;
			}
			break;
		case StatefulSessionBeanOpearionCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return Operation5EditPart.VISUAL_ID;
			}
			break;
		case StatelessSessionBeanPropertyCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return Property6EditPart.VISUAL_ID;
			}
			break;
		case StatelessSessionBeanOpearionCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return Operation6EditPart.VISUAL_ID;
			}
			break;
		case PackageElementClassElementCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getClassElement().isSuperTypeOf(
					domainElement.eClass())) {
				return ClassElement2EditPart.VISUAL_ID;
			}
			break;
		case ClassElementPropertyCompartment2EditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return Property7EditPart.VISUAL_ID;
			}
			break;
		case ClassElementOpearionCompartment2EditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return Operation7EditPart.VISUAL_ID;
			}
			break;
		case ClassElementPropertyCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return Property8EditPart.VISUAL_ID;
			}
			break;
		case ClassElementOpearionCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return Operation8EditPart.VISUAL_ID;
			}
			break;
		case EnumElementEnumLiteralCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getEnumLiteral().isSuperTypeOf(
					domainElement.eClass())) {
				return EnumLiteralEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = ejb.container.diagram.part.ModelVisualIDRegistry
				.getModelID(containerView);
		if (!EJBContainerEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (EJBContainerEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ejb.container.diagram.part.ModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = EJBContainerEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case EJBContainerEditPart.VISUAL_ID:
			if (InterfaceElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntityBeanEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MessageDrivenBeanEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StatefulSessionBeanEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StatelessSessionBeanEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackageElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnumElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterfaceElementEditPart.VISUAL_ID:
			if (InterfaceElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceElementPropertyCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceElementOpearionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityBeanEditPart.VISUAL_ID:
			if (EntityBeanNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntityBeanVisibilityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntityBeanPropertyCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntityBeanOpearionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MessageDrivenBeanEditPart.VISUAL_ID:
			if (MessageDrivenBeanNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MessageDrivenBeanVisibilityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MessageDrivenBeanPropertyCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MessageDrivenBeanOpearionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StatefulSessionBeanEditPart.VISUAL_ID:
			if (StatefulSessionBeanNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StatefulSessionBeanVisibilityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StatefulSessionBeanPropertyCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StatefulSessionBeanOpearionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StatelessSessionBeanEditPart.VISUAL_ID:
			if (StatelessSessionBeanNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StatelessSessionBeanVisibilityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StatelessSessionBeanPropertyCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StatelessSessionBeanOpearionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageElementEditPart.VISUAL_ID:
			if (PackageElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackageElementClassElementCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassElementEditPart.VISUAL_ID:
			if (ClassElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassElementPropertyCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassElementOpearionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumElementEditPart.VISUAL_ID:
			if (EnumElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnumElementEnumLiteralCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Property2EditPart.VISUAL_ID:
			if (PropertyNamePropertyTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Operation2EditPart.VISUAL_ID:
			if (OperationNameParametersOpeartionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Property3EditPart.VISUAL_ID:
			if (PropertyNamePropertyType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Operation3EditPart.VISUAL_ID:
			if (OperationNameParametersOpeartion2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Property4EditPart.VISUAL_ID:
			if (PropertyNamePropertyType3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Operation4EditPart.VISUAL_ID:
			if (OperationNameParametersOpeartion3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Property5EditPart.VISUAL_ID:
			if (PropertyNamePropertyType4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Operation5EditPart.VISUAL_ID:
			if (OperationNameParametersOpeartion4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Property6EditPart.VISUAL_ID:
			if (PropertyNamePropertyType5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Operation6EditPart.VISUAL_ID:
			if (OperationNameParametersOpeartion5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassElement2EditPart.VISUAL_ID:
			if (ClassElementName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassElementPropertyCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassElementOpearionCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Property7EditPart.VISUAL_ID:
			if (PropertyNamePropertyType6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Operation7EditPart.VISUAL_ID:
			if (OperationNameParametersOpeartion6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Property8EditPart.VISUAL_ID:
			if (PropertyNameVisibilityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Operation8EditPart.VISUAL_ID:
			if (OperationNameVisibilityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumLiteralEditPart.VISUAL_ID:
			if (EnumLiteralNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterfaceElementPropertyCompartmentEditPart.VISUAL_ID:
			if (Property2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterfaceElementOpearionCompartmentEditPart.VISUAL_ID:
			if (Operation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityBeanPropertyCompartmentEditPart.VISUAL_ID:
			if (Property3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityBeanOpearionCompartmentEditPart.VISUAL_ID:
			if (Operation3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MessageDrivenBeanPropertyCompartmentEditPart.VISUAL_ID:
			if (Property4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MessageDrivenBeanOpearionCompartmentEditPart.VISUAL_ID:
			if (Operation4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StatefulSessionBeanPropertyCompartmentEditPart.VISUAL_ID:
			if (Property5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StatefulSessionBeanOpearionCompartmentEditPart.VISUAL_ID:
			if (Operation5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StatelessSessionBeanPropertyCompartmentEditPart.VISUAL_ID:
			if (Property6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StatelessSessionBeanOpearionCompartmentEditPart.VISUAL_ID:
			if (Operation6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageElementClassElementCompartmentEditPart.VISUAL_ID:
			if (ClassElement2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassElementPropertyCompartment2EditPart.VISUAL_ID:
			if (Property7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassElementOpearionCompartment2EditPart.VISUAL_ID:
			if (Operation7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassElementPropertyCompartmentEditPart.VISUAL_ID:
			if (Property8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassElementOpearionCompartmentEditPart.VISUAL_ID:
			if (Operation8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumElementEnumLiteralCompartmentEditPart.VISUAL_ID:
			if (EnumLiteralEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AggregationEditPart.VISUAL_ID:
			if (AggregationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregationLowerBoundUpperBoundEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationEditPart.VISUAL_ID:
			if (AssociationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationLowerBoundUpperBoundEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ComponentsPackage.eINSTANCE.getRealization().isSuperTypeOf(
				domainElement.eClass())) {
			return RealizationEditPart.VISUAL_ID;
		}
		if (ComponentsPackage.eINSTANCE.getGeneralization().isSuperTypeOf(
				domainElement.eClass())) {
			return GeneralizationEditPart.VISUAL_ID;
		}
		if (ComponentsPackage.eINSTANCE.getAggregation().isSuperTypeOf(
				domainElement.eClass())) {
			return AggregationEditPart.VISUAL_ID;
		}
		if (ComponentsPackage.eINSTANCE.getAssociation().isSuperTypeOf(
				domainElement.eClass())) {
			return AssociationEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(EJBContainer element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case InterfaceElementPropertyCompartmentEditPart.VISUAL_ID:
		case InterfaceElementOpearionCompartmentEditPart.VISUAL_ID:
		case EntityBeanPropertyCompartmentEditPart.VISUAL_ID:
		case EntityBeanOpearionCompartmentEditPart.VISUAL_ID:
		case MessageDrivenBeanPropertyCompartmentEditPart.VISUAL_ID:
		case MessageDrivenBeanOpearionCompartmentEditPart.VISUAL_ID:
		case StatefulSessionBeanPropertyCompartmentEditPart.VISUAL_ID:
		case StatefulSessionBeanOpearionCompartmentEditPart.VISUAL_ID:
		case StatelessSessionBeanPropertyCompartmentEditPart.VISUAL_ID:
		case StatelessSessionBeanOpearionCompartmentEditPart.VISUAL_ID:
		case PackageElementClassElementCompartmentEditPart.VISUAL_ID:
		case ClassElementPropertyCompartment2EditPart.VISUAL_ID:
		case ClassElementOpearionCompartment2EditPart.VISUAL_ID:
		case ClassElementPropertyCompartmentEditPart.VISUAL_ID:
		case ClassElementOpearionCompartmentEditPart.VISUAL_ID:
		case EnumElementEnumLiteralCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case EJBContainerEditPart.VISUAL_ID:
			return false;
		case Property2EditPart.VISUAL_ID:
		case Operation2EditPart.VISUAL_ID:
		case Property3EditPart.VISUAL_ID:
		case Operation3EditPart.VISUAL_ID:
		case Property4EditPart.VISUAL_ID:
		case Operation4EditPart.VISUAL_ID:
		case Property5EditPart.VISUAL_ID:
		case Operation5EditPart.VISUAL_ID:
		case Property6EditPart.VISUAL_ID:
		case Operation6EditPart.VISUAL_ID:
		case Property7EditPart.VISUAL_ID:
		case Operation7EditPart.VISUAL_ID:
		case Property8EditPart.VISUAL_ID:
		case Operation8EditPart.VISUAL_ID:
		case EnumLiteralEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */

		public int getVisualID(View view) {
			return ejb.container.diagram.part.ModelVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */

		public String getModelID(View view) {
			return ejb.container.diagram.part.ModelVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return ejb.container.diagram.part.ModelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */

		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return ejb.container.diagram.part.ModelVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */

		public boolean isCompartmentVisualID(int visualID) {
			return ejb.container.diagram.part.ModelVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */

		public boolean isSemanticLeafVisualID(int visualID) {
			return ejb.container.diagram.part.ModelVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
