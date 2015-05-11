package components.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import components.diagram.edit.commands.BrowserCreateCommand;
import components.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class ClientBrowserCompartmentItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClientBrowserCompartmentItemSemanticEditPolicy() {
		super(ModelElementTypes.Client_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.Browser_3001 == req.getElementType()) {
			return getGEFWrapper(new BrowserCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
