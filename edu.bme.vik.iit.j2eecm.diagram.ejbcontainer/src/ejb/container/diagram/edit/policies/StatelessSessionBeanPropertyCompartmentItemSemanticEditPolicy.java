package ejb.container.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ejb.container.diagram.edit.commands.Property6CreateCommand;
import ejb.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class StatelessSessionBeanPropertyCompartmentItemSemanticEditPolicy
		extends ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StatelessSessionBeanPropertyCompartmentItemSemanticEditPolicy() {
		super(ModelElementTypes.StatelessSessionBean_2007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.Property_3011 == req.getElementType()) {
			return getGEFWrapper(new Property6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
