package components.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import components.diagram.edit.commands.WebContainerCreateCommand;
import components.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class J2EEServerWebContainerCompartmentItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public J2EEServerWebContainerCompartmentItemSemanticEditPolicy() {
		super(ModelElementTypes.J2EEServer_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.WebContainer_3003 == req.getElementType()) {
			return getGEFWrapper(new WebContainerCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
