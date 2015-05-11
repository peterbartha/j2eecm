package components.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import components.diagram.edit.commands.ClassElementCreateCommand;
import components.diagram.edit.commands.EntityBeanCreateCommand;
import components.diagram.edit.commands.InterfaceElementCreateCommand;
import components.diagram.edit.commands.MessageDrivenBeanCreateCommand;
import components.diagram.edit.commands.PackageElementCreateCommand;
import components.diagram.edit.commands.StatefulSessionBeanCreateCommand;
import components.diagram.edit.commands.StatelessSessionBeanCreateCommand;
import components.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class EJBContainerItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EJBContainerItemSemanticEditPolicy() {
		super(ModelElementTypes.EJBContainer_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.InterfaceElement_2012 == req.getElementType()) {
			return getGEFWrapper(new InterfaceElementCreateCommand(req));
		}
		if (ModelElementTypes.EntityBean_2002 == req.getElementType()) {
			return getGEFWrapper(new EntityBeanCreateCommand(req));
		}
		if (ModelElementTypes.MessageDrivenBean_2003 == req.getElementType()) {
			return getGEFWrapper(new MessageDrivenBeanCreateCommand(req));
		}
		if (ModelElementTypes.StatefulSessionBean_2006 == req.getElementType()) {
			return getGEFWrapper(new StatefulSessionBeanCreateCommand(req));
		}
		if (ModelElementTypes.StatelessSessionBean_2007 == req.getElementType()) {
			return getGEFWrapper(new StatelessSessionBeanCreateCommand(req));
		}
		if (ModelElementTypes.PackageElement_2009 == req.getElementType()) {
			return getGEFWrapper(new PackageElementCreateCommand(req));
		}
		if (ModelElementTypes.ClassElement_2011 == req.getElementType()) {
			return getGEFWrapper(new ClassElementCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
