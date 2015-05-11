package components.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import components.diagram.edit.commands.ApplicationClientCreateCommand;
import components.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class ClientApplicationCompartmentItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClientApplicationCompartmentItemSemanticEditPolicy() {
		super(ModelElementTypes.Client_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.ApplicationClient_3002 == req.getElementType()) {
			return getGEFWrapper(new ApplicationClientCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
