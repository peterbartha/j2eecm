package ejb.container.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ejb.container.diagram.edit.commands.Operation5CreateCommand;
import ejb.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class StatefulSessionBeanOpearionCompartmentItemSemanticEditPolicy
		extends ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StatefulSessionBeanOpearionCompartmentItemSemanticEditPolicy() {
		super(ModelElementTypes.StatefulSessionBean_2006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.Operation_3010 == req.getElementType()) {
			return getGEFWrapper(new Operation5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
