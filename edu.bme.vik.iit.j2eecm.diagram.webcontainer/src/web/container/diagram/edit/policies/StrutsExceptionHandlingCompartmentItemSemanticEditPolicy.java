package web.container.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import web.container.diagram.edit.commands.EventCallCreateCommand;
import web.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class StrutsExceptionHandlingCompartmentItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StrutsExceptionHandlingCompartmentItemSemanticEditPolicy() {
		super(ModelElementTypes.Struts_2011);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.EventCall_3004 == req.getElementType()) {
			return getGEFWrapper(new EventCallCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
