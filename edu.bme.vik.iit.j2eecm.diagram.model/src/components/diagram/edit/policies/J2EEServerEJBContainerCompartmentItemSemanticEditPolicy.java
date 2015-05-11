package components.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import components.diagram.edit.commands.EJBContainerCreateCommand;
import components.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class J2EEServerEJBContainerCompartmentItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public J2EEServerEJBContainerCompartmentItemSemanticEditPolicy() {
		super(ModelElementTypes.J2EEServer_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.EJBContainer_3004 == req.getElementType()) {
			return getGEFWrapper(new EJBContainerCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
