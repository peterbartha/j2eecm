package web.container.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import web.container.diagram.edit.commands.HTML5CreateCommand;
import web.container.diagram.edit.commands.JSPPageCreateCommand;
import web.container.diagram.edit.commands.ServletCreateCommand;
import web.container.diagram.edit.commands.StrutsCreateCommand;
import web.container.diagram.edit.commands.StrutsGlobalCreateCommand;
import web.container.diagram.edit.commands.XMLConfigCreateCommand;
import web.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class WebContainerItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public WebContainerItemSemanticEditPolicy() {
		super(ModelElementTypes.WebContainer_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.JSPPage_2001 == req.getElementType()) {
			return getGEFWrapper(new JSPPageCreateCommand(req));
		}
		if (ModelElementTypes.Servlet_2002 == req.getElementType()) {
			return getGEFWrapper(new ServletCreateCommand(req));
		}
		if (ModelElementTypes.HTML5_2003 == req.getElementType()) {
			return getGEFWrapper(new HTML5CreateCommand(req));
		}
		if (ModelElementTypes.XMLConfig_2006 == req.getElementType()) {
			return getGEFWrapper(new XMLConfigCreateCommand(req));
		}
		if (ModelElementTypes.Struts_2011 == req.getElementType()) {
			return getGEFWrapper(new StrutsCreateCommand(req));
		}
		if (ModelElementTypes.StrutsGlobal_2014 == req.getElementType()) {
			return getGEFWrapper(new StrutsGlobalCreateCommand(req));
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
