package web.container.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import web.container.diagram.edit.commands.ExceptionHandlingCreateCommand;
import web.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class StrutsExceptionHandlingCompartment2ItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StrutsExceptionHandlingCompartment2ItemSemanticEditPolicy() {
		super(ModelElementTypes.Struts_2011);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.ExceptionHandling_3007 == req.getElementType()) {
			return getGEFWrapper(new ExceptionHandlingCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
