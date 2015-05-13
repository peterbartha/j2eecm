package web.container.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import web.container.diagram.edit.commands.StrutsOperationCreateCommand;
import web.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class StrutsStructsOperationCompartmentItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StrutsStructsOperationCompartmentItemSemanticEditPolicy() {
		super(ModelElementTypes.Struts_2011);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.StrutsOperation_3001 == req.getElementType()) {
			return getGEFWrapper(new StrutsOperationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
