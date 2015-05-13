package ejb.container.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import ejb.container.diagram.part.ModelVisualIDRegistry;

/**
 * @generated
 */
public class ModelEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ModelVisualIDRegistry.getVisualID(view)) {

			case EJBContainerEditPart.VISUAL_ID:
				return new EJBContainerEditPart(view);

			case InterfaceElementEditPart.VISUAL_ID:
				return new InterfaceElementEditPart(view);

			case InterfaceElementNameEditPart.VISUAL_ID:
				return new InterfaceElementNameEditPart(view);

			case EntityBeanEditPart.VISUAL_ID:
				return new EntityBeanEditPart(view);

			case EntityBeanNameEditPart.VISUAL_ID:
				return new EntityBeanNameEditPart(view);

			case EntityBeanVisibilityEditPart.VISUAL_ID:
				return new EntityBeanVisibilityEditPart(view);

			case MessageDrivenBeanEditPart.VISUAL_ID:
				return new MessageDrivenBeanEditPart(view);

			case MessageDrivenBeanNameEditPart.VISUAL_ID:
				return new MessageDrivenBeanNameEditPart(view);

			case MessageDrivenBeanVisibilityEditPart.VISUAL_ID:
				return new MessageDrivenBeanVisibilityEditPart(view);

			case StatefulSessionBeanEditPart.VISUAL_ID:
				return new StatefulSessionBeanEditPart(view);

			case StatefulSessionBeanNameEditPart.VISUAL_ID:
				return new StatefulSessionBeanNameEditPart(view);

			case StatefulSessionBeanVisibilityEditPart.VISUAL_ID:
				return new StatefulSessionBeanVisibilityEditPart(view);

			case StatelessSessionBeanEditPart.VISUAL_ID:
				return new StatelessSessionBeanEditPart(view);

			case StatelessSessionBeanNameEditPart.VISUAL_ID:
				return new StatelessSessionBeanNameEditPart(view);

			case StatelessSessionBeanVisibilityEditPart.VISUAL_ID:
				return new StatelessSessionBeanVisibilityEditPart(view);

			case PackageElementEditPart.VISUAL_ID:
				return new PackageElementEditPart(view);

			case PackageElementNameEditPart.VISUAL_ID:
				return new PackageElementNameEditPart(view);

			case ClassElementEditPart.VISUAL_ID:
				return new ClassElementEditPart(view);

			case ClassElementNameEditPart.VISUAL_ID:
				return new ClassElementNameEditPart(view);

			case EnumElementEditPart.VISUAL_ID:
				return new EnumElementEditPart(view);

			case EnumElementNameEditPart.VISUAL_ID:
				return new EnumElementNameEditPart(view);

			case Property2EditPart.VISUAL_ID:
				return new Property2EditPart(view);

			case PropertyNamePropertyTypeEditPart.VISUAL_ID:
				return new PropertyNamePropertyTypeEditPart(view);

			case Operation2EditPart.VISUAL_ID:
				return new Operation2EditPart(view);

			case OperationNameParametersOpeartionEditPart.VISUAL_ID:
				return new OperationNameParametersOpeartionEditPart(view);

			case Property3EditPart.VISUAL_ID:
				return new Property3EditPart(view);

			case PropertyNamePropertyType2EditPart.VISUAL_ID:
				return new PropertyNamePropertyType2EditPart(view);

			case Operation3EditPart.VISUAL_ID:
				return new Operation3EditPart(view);

			case OperationNameParametersOpeartion2EditPart.VISUAL_ID:
				return new OperationNameParametersOpeartion2EditPart(view);

			case Property4EditPart.VISUAL_ID:
				return new Property4EditPart(view);

			case PropertyNamePropertyType3EditPart.VISUAL_ID:
				return new PropertyNamePropertyType3EditPart(view);

			case Operation4EditPart.VISUAL_ID:
				return new Operation4EditPart(view);

			case OperationNameParametersOpeartion3EditPart.VISUAL_ID:
				return new OperationNameParametersOpeartion3EditPart(view);

			case Property5EditPart.VISUAL_ID:
				return new Property5EditPart(view);

			case PropertyNamePropertyType4EditPart.VISUAL_ID:
				return new PropertyNamePropertyType4EditPart(view);

			case Operation5EditPart.VISUAL_ID:
				return new Operation5EditPart(view);

			case OperationNameParametersOpeartion4EditPart.VISUAL_ID:
				return new OperationNameParametersOpeartion4EditPart(view);

			case Property6EditPart.VISUAL_ID:
				return new Property6EditPart(view);

			case PropertyNamePropertyType5EditPart.VISUAL_ID:
				return new PropertyNamePropertyType5EditPart(view);

			case Operation6EditPart.VISUAL_ID:
				return new Operation6EditPart(view);

			case OperationNameParametersOpeartion5EditPart.VISUAL_ID:
				return new OperationNameParametersOpeartion5EditPart(view);

			case ClassElement2EditPart.VISUAL_ID:
				return new ClassElement2EditPart(view);

			case ClassElementName2EditPart.VISUAL_ID:
				return new ClassElementName2EditPart(view);

			case Property7EditPart.VISUAL_ID:
				return new Property7EditPart(view);

			case PropertyNamePropertyType6EditPart.VISUAL_ID:
				return new PropertyNamePropertyType6EditPart(view);

			case Operation7EditPart.VISUAL_ID:
				return new Operation7EditPart(view);

			case OperationNameParametersOpeartion6EditPart.VISUAL_ID:
				return new OperationNameParametersOpeartion6EditPart(view);

			case Property8EditPart.VISUAL_ID:
				return new Property8EditPart(view);

			case PropertyNameVisibilityEditPart.VISUAL_ID:
				return new PropertyNameVisibilityEditPart(view);

			case Operation8EditPart.VISUAL_ID:
				return new Operation8EditPart(view);

			case OperationNameVisibilityEditPart.VISUAL_ID:
				return new OperationNameVisibilityEditPart(view);

			case EnumLiteralEditPart.VISUAL_ID:
				return new EnumLiteralEditPart(view);

			case EnumLiteralNameEditPart.VISUAL_ID:
				return new EnumLiteralNameEditPart(view);

			case InterfaceElementPropertyCompartmentEditPart.VISUAL_ID:
				return new InterfaceElementPropertyCompartmentEditPart(view);

			case InterfaceElementOpearionCompartmentEditPart.VISUAL_ID:
				return new InterfaceElementOpearionCompartmentEditPart(view);

			case EntityBeanPropertyCompartmentEditPart.VISUAL_ID:
				return new EntityBeanPropertyCompartmentEditPart(view);

			case EntityBeanOpearionCompartmentEditPart.VISUAL_ID:
				return new EntityBeanOpearionCompartmentEditPart(view);

			case MessageDrivenBeanPropertyCompartmentEditPart.VISUAL_ID:
				return new MessageDrivenBeanPropertyCompartmentEditPart(view);

			case MessageDrivenBeanOpearionCompartmentEditPart.VISUAL_ID:
				return new MessageDrivenBeanOpearionCompartmentEditPart(view);

			case StatefulSessionBeanPropertyCompartmentEditPart.VISUAL_ID:
				return new StatefulSessionBeanPropertyCompartmentEditPart(view);

			case StatefulSessionBeanOpearionCompartmentEditPart.VISUAL_ID:
				return new StatefulSessionBeanOpearionCompartmentEditPart(view);

			case StatelessSessionBeanPropertyCompartmentEditPart.VISUAL_ID:
				return new StatelessSessionBeanPropertyCompartmentEditPart(view);

			case StatelessSessionBeanOpearionCompartmentEditPart.VISUAL_ID:
				return new StatelessSessionBeanOpearionCompartmentEditPart(view);

			case PackageElementClassElementCompartmentEditPart.VISUAL_ID:
				return new PackageElementClassElementCompartmentEditPart(view);

			case ClassElementPropertyCompartment2EditPart.VISUAL_ID:
				return new ClassElementPropertyCompartment2EditPart(view);

			case ClassElementOpearionCompartment2EditPart.VISUAL_ID:
				return new ClassElementOpearionCompartment2EditPart(view);

			case ClassElementPropertyCompartmentEditPart.VISUAL_ID:
				return new ClassElementPropertyCompartmentEditPart(view);

			case ClassElementOpearionCompartmentEditPart.VISUAL_ID:
				return new ClassElementOpearionCompartmentEditPart(view);

			case EnumElementEnumLiteralCompartmentEditPart.VISUAL_ID:
				return new EnumElementEnumLiteralCompartmentEditPart(view);

			case RealizationEditPart.VISUAL_ID:
				return new RealizationEditPart(view);

			case GeneralizationEditPart.VISUAL_ID:
				return new GeneralizationEditPart(view);

			case AggregationEditPart.VISUAL_ID:
				return new AggregationEditPart(view);

			case AggregationNameEditPart.VISUAL_ID:
				return new AggregationNameEditPart(view);

			case AggregationLowerBoundUpperBoundEditPart.VISUAL_ID:
				return new AggregationLowerBoundUpperBoundEditPart(view);

			case AssociationEditPart.VISUAL_ID:
				return new AssociationEditPart(view);

			case AssociationNameEditPart.VISUAL_ID:
				return new AssociationNameEditPart(view);

			case AssociationLowerBoundUpperBoundEditPart.VISUAL_ID:
				return new AssociationLowerBoundUpperBoundEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
