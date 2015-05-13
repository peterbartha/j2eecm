package web.container.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import web.container.diagram.edit.commands.EventCall2CreateCommand;
import web.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class StrutsGlobalEventCallCompartmentItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StrutsGlobalEventCallCompartmentItemSemanticEditPolicy() {
		super(ModelElementTypes.StrutsGlobal_2014);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.EventCall_3009 == req.getElementType()) {
			return getGEFWrapper(new EventCall2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
