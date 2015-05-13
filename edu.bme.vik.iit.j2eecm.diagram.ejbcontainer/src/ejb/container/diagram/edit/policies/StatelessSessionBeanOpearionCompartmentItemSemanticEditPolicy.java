package ejb.container.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ejb.container.diagram.edit.commands.Operation6CreateCommand;
import ejb.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class StatelessSessionBeanOpearionCompartmentItemSemanticEditPolicy
		extends ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StatelessSessionBeanOpearionCompartmentItemSemanticEditPolicy() {
		super(ModelElementTypes.StatelessSessionBean_2007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.Operation_3012 == req.getElementType()) {
			return getGEFWrapper(new Operation6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
