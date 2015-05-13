package web.container.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import web.container.diagram.edit.commands.LinkElementCreateCommand;
import web.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class JSPPageLinkElementCompartmentItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public JSPPageLinkElementCompartmentItemSemanticEditPolicy() {
		super(ModelElementTypes.JSPPage_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.LinkElement_3002 == req.getElementType()) {
			return getGEFWrapper(new LinkElementCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
