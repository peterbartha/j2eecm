package web.container.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import web.container.diagram.edit.parts.EventCall2EditPart;
import web.container.diagram.edit.parts.EventCallEditPart;
import web.container.diagram.edit.parts.ExceptionHandlingEditPart;
import web.container.diagram.edit.parts.HTML5EditPart;
import web.container.diagram.edit.parts.JSPPageEditPart;
import web.container.diagram.edit.parts.LinkElementEditPart;
import web.container.diagram.edit.parts.ServletEditPart;
import web.container.diagram.edit.parts.StrutsEditPart;
import web.container.diagram.edit.parts.StrutsGlobalEditPart;
import web.container.diagram.edit.parts.StrutsOperationEditPart;
import web.container.diagram.edit.parts.WebContainerEditPart;
import web.container.diagram.edit.parts.XMLConfigEditPart;
import web.container.diagram.part.Messages;
import web.container.diagram.part.ModelDiagramEditorPlugin;

/**
 * @generated
 */
public class ModelModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof WebContainerEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ModelElementTypes.JSPPage_2001);
			types.add(ModelElementTypes.Servlet_2002);
			types.add(ModelElementTypes.HTML5_2003);
			types.add(ModelElementTypes.XMLConfig_2006);
			types.add(ModelElementTypes.Struts_2011);
			types.add(ModelElementTypes.StrutsGlobal_2014);
			return types;
		}
		if (editPart instanceof JSPPageEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ModelElementTypes.LinkElement_3002);
			return types;
		}
		if (editPart instanceof StrutsEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(ModelElementTypes.StrutsOperation_3001);
			types.add(ModelElementTypes.EventCall_3004);
			types.add(ModelElementTypes.ExceptionHandling_3007);
			return types;
		}
		if (editPart instanceof StrutsGlobalEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ModelElementTypes.EventCall_3009);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof JSPPageEditPart) {
			return ((JSPPageEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ServletEditPart) {
			return ((ServletEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof LinkElementEditPart) {
			return ((LinkElementEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StrutsOperationEditPart) {
			return ((StrutsOperationEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EventCallEditPart) {
			return ((EventCallEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ExceptionHandlingEditPart) {
			return ((ExceptionHandlingEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EventCall2EditPart) {
			return ((EventCall2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof JSPPageEditPart) {
			return ((JSPPageEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ServletEditPart) {
			return ((ServletEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof HTML5EditPart) {
			return ((HTML5EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof XMLConfigEditPart) {
			return ((XMLConfigEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StrutsEditPart) {
			return ((StrutsEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof JSPPageEditPart) {
			return ((JSPPageEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ServletEditPart) {
			return ((ServletEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof LinkElementEditPart) {
			return ((LinkElementEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StrutsOperationEditPart) {
			return ((StrutsOperationEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EventCallEditPart) {
			return ((EventCallEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ExceptionHandlingEditPart) {
			return ((ExceptionHandlingEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EventCall2EditPart) {
			return ((EventCall2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof JSPPageEditPart) {
			return ((JSPPageEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ServletEditPart) {
			return ((ServletEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof HTML5EditPart) {
			return ((HTML5EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof XMLConfigEditPart) {
			return ((XMLConfigEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StrutsEditPart) {
			return ((StrutsEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof JSPPageEditPart) {
			return ((JSPPageEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ServletEditPart) {
			return ((ServletEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof LinkElementEditPart) {
			return ((LinkElementEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StrutsOperationEditPart) {
			return ((StrutsOperationEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EventCallEditPart) {
			return ((EventCallEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ExceptionHandlingEditPart) {
			return ((ExceptionHandlingEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EventCall2EditPart) {
			return ((EventCall2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				ModelDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.ModelModelingAssistantProviderMessage);
		dialog.setTitle(Messages.ModelModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
