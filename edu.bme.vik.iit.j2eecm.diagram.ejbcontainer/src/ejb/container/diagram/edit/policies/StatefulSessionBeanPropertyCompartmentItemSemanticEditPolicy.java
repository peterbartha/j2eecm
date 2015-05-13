package ejb.container.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ejb.container.diagram.edit.commands.Property5CreateCommand;
import ejb.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class StatefulSessionBeanPropertyCompartmentItemSemanticEditPolicy
		extends ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StatefulSessionBeanPropertyCompartmentItemSemanticEditPolicy() {
		super(ModelElementTypes.StatefulSessionBean_2006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.Property_3009 == req.getElementType()) {
			return getGEFWrapper(new Property5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
