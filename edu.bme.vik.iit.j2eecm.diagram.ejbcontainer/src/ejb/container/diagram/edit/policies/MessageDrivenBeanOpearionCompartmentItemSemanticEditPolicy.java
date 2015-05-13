package ejb.container.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ejb.container.diagram.edit.commands.Operation4CreateCommand;
import ejb.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class MessageDrivenBeanOpearionCompartmentItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MessageDrivenBeanOpearionCompartmentItemSemanticEditPolicy() {
		super(ModelElementTypes.MessageDrivenBean_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.Operation_3008 == req.getElementType()) {
			return getGEFWrapper(new Operation4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
