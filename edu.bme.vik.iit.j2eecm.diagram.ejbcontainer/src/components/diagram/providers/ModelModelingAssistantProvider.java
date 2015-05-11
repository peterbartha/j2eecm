package components.diagram.providers;

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

import components.diagram.edit.parts.ClassElement2EditPart;
import components.diagram.edit.parts.ClassElementEditPart;
import components.diagram.edit.parts.EJBContainerEditPart;
import components.diagram.edit.parts.EntityBeanEditPart;
import components.diagram.edit.parts.InterfaceElementEditPart;
import components.diagram.edit.parts.MessageDrivenBeanEditPart;
import components.diagram.edit.parts.PackageElementEditPart;
import components.diagram.edit.parts.StatefulSessionBeanEditPart;
import components.diagram.edit.parts.StatelessSessionBeanEditPart;
import components.diagram.part.Messages;
import components.diagram.part.ModelDiagramEditorPlugin;

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
		if (editPart instanceof EJBContainerEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(7);
			types.add(ModelElementTypes.InterfaceElement_2012);
			types.add(ModelElementTypes.EntityBean_2002);
			types.add(ModelElementTypes.MessageDrivenBean_2003);
			types.add(ModelElementTypes.StatefulSessionBean_2006);
			types.add(ModelElementTypes.StatelessSessionBean_2007);
			types.add(ModelElementTypes.PackageElement_2009);
			types.add(ModelElementTypes.ClassElement_2011);
			return types;
		}
		if (editPart instanceof InterfaceElementEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ModelElementTypes.Property_3003);
			types.add(ModelElementTypes.Operation_3004);
			return types;
		}
		if (editPart instanceof EntityBeanEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ModelElementTypes.Property_3005);
			types.add(ModelElementTypes.Operation_3006);
			return types;
		}
		if (editPart instanceof MessageDrivenBeanEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ModelElementTypes.Property_3007);
			types.add(ModelElementTypes.Operation_3008);
			return types;
		}
		if (editPart instanceof StatefulSessionBeanEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ModelElementTypes.Property_3009);
			types.add(ModelElementTypes.Operation_3010);
			return types;
		}
		if (editPart instanceof StatelessSessionBeanEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ModelElementTypes.Property_3011);
			types.add(ModelElementTypes.Operation_3012);
			return types;
		}
		if (editPart instanceof PackageElementEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ModelElementTypes.ClassElement_3016);
			return types;
		}
		if (editPart instanceof ClassElementEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ModelElementTypes.Property_3017);
			types.add(ModelElementTypes.Operation_3018);
			return types;
		}
		if (editPart instanceof ClassElement2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ModelElementTypes.Property_3014);
			types.add(ModelElementTypes.Operation_3015);
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
		if (sourceEditPart instanceof InterfaceElementEditPart) {
			return ((InterfaceElementEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EntityBeanEditPart) {
			return ((EntityBeanEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MessageDrivenBeanEditPart) {
			return ((MessageDrivenBeanEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StatefulSessionBeanEditPart) {
			return ((StatefulSessionBeanEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StatelessSessionBeanEditPart) {
			return ((StatelessSessionBeanEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PackageElementEditPart) {
			return ((PackageElementEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ClassElementEditPart) {
			return ((ClassElementEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ClassElement2EditPart) {
			return ((ClassElement2EditPart) sourceEditPart)
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
		if (targetEditPart instanceof InterfaceElementEditPart) {
			return ((InterfaceElementEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EntityBeanEditPart) {
			return ((EntityBeanEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof MessageDrivenBeanEditPart) {
			return ((MessageDrivenBeanEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StatefulSessionBeanEditPart) {
			return ((StatefulSessionBeanEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StatelessSessionBeanEditPart) {
			return ((StatelessSessionBeanEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof PackageElementEditPart) {
			return ((PackageElementEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ClassElementEditPart) {
			return ((ClassElementEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ClassElement2EditPart) {
			return ((ClassElement2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
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
		if (sourceEditPart instanceof InterfaceElementEditPart) {
			return ((InterfaceElementEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EntityBeanEditPart) {
			return ((EntityBeanEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MessageDrivenBeanEditPart) {
			return ((MessageDrivenBeanEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StatefulSessionBeanEditPart) {
			return ((StatefulSessionBeanEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StatelessSessionBeanEditPart) {
			return ((StatelessSessionBeanEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PackageElementEditPart) {
			return ((PackageElementEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ClassElementEditPart) {
			return ((ClassElementEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ClassElement2EditPart) {
			return ((ClassElement2EditPart) sourceEditPart)
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
		if (targetEditPart instanceof InterfaceElementEditPart) {
			return ((InterfaceElementEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EntityBeanEditPart) {
			return ((EntityBeanEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof MessageDrivenBeanEditPart) {
			return ((MessageDrivenBeanEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StatefulSessionBeanEditPart) {
			return ((StatefulSessionBeanEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StatelessSessionBeanEditPart) {
			return ((StatelessSessionBeanEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof PackageElementEditPart) {
			return ((PackageElementEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ClassElementEditPart) {
			return ((ClassElementEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ClassElement2EditPart) {
			return ((ClassElement2EditPart) targetEditPart)
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
		if (sourceEditPart instanceof InterfaceElementEditPart) {
			return ((InterfaceElementEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EntityBeanEditPart) {
			return ((EntityBeanEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MessageDrivenBeanEditPart) {
			return ((MessageDrivenBeanEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StatefulSessionBeanEditPart) {
			return ((StatefulSessionBeanEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StatelessSessionBeanEditPart) {
			return ((StatelessSessionBeanEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PackageElementEditPart) {
			return ((PackageElementEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ClassElementEditPart) {
			return ((ClassElementEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ClassElement2EditPart) {
			return ((ClassElement2EditPart) sourceEditPart)
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
