package components.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import components.EJBContainer;
import components.diagram.edit.parts.AggregationEditPart;
import components.diagram.edit.parts.AggregationNameEditPart;
import components.diagram.edit.parts.AssociationEditPart;
import components.diagram.edit.parts.AssociationNameEditPart;
import components.diagram.edit.parts.ClassElement2EditPart;
import components.diagram.edit.parts.ClassElementEditPart;
import components.diagram.edit.parts.ClassElementName2EditPart;
import components.diagram.edit.parts.ClassElementNameEditPart;
import components.diagram.edit.parts.EJBContainerEditPart;
import components.diagram.edit.parts.EntityBeanEditPart;
import components.diagram.edit.parts.EntityBeanNameEditPart;
import components.diagram.edit.parts.GeneralizationEditPart;
import components.diagram.edit.parts.InterfaceElementEditPart;
import components.diagram.edit.parts.InterfaceElementNameEditPart;
import components.diagram.edit.parts.MessageDrivenBeanEditPart;
import components.diagram.edit.parts.MessageDrivenBeanNameEditPart;
import components.diagram.edit.parts.Operation2EditPart;
import components.diagram.edit.parts.Operation3EditPart;
import components.diagram.edit.parts.Operation4EditPart;
import components.diagram.edit.parts.Operation5EditPart;
import components.diagram.edit.parts.Operation6EditPart;
import components.diagram.edit.parts.Operation7EditPart;
import components.diagram.edit.parts.Operation8EditPart;
import components.diagram.edit.parts.OperationNameParametersOpeartion2EditPart;
import components.diagram.edit.parts.OperationNameParametersOpeartion3EditPart;
import components.diagram.edit.parts.OperationNameParametersOpeartion4EditPart;
import components.diagram.edit.parts.OperationNameParametersOpeartion5EditPart;
import components.diagram.edit.parts.OperationNameParametersOpeartion6EditPart;
import components.diagram.edit.parts.OperationNameParametersOpeartionEditPart;
import components.diagram.edit.parts.OperationNameVisibilityEditPart;
import components.diagram.edit.parts.PackageElementEditPart;
import components.diagram.edit.parts.PackageElementNameEditPart;
import components.diagram.edit.parts.Property2EditPart;
import components.diagram.edit.parts.Property3EditPart;
import components.diagram.edit.parts.Property4EditPart;
import components.diagram.edit.parts.Property5EditPart;
import components.diagram.edit.parts.Property6EditPart;
import components.diagram.edit.parts.Property7EditPart;
import components.diagram.edit.parts.Property8EditPart;
import components.diagram.edit.parts.PropertyNamePropertyType2EditPart;
import components.diagram.edit.parts.PropertyNamePropertyType3EditPart;
import components.diagram.edit.parts.PropertyNamePropertyType4EditPart;
import components.diagram.edit.parts.PropertyNamePropertyType5EditPart;
import components.diagram.edit.parts.PropertyNamePropertyType6EditPart;
import components.diagram.edit.parts.PropertyNamePropertyTypeEditPart;
import components.diagram.edit.parts.PropertyNameVisibilityEditPart;
import components.diagram.edit.parts.RealizationEditPart;
import components.diagram.edit.parts.StatefulSessionBeanEditPart;
import components.diagram.edit.parts.StatefulSessionBeanNameEditPart;
import components.diagram.edit.parts.StatelessSessionBeanEditPart;
import components.diagram.edit.parts.StatelessSessionBeanNameEditPart;
import components.diagram.part.ModelDiagramEditorPlugin;
import components.diagram.part.ModelVisualIDRegistry;
import components.diagram.providers.ModelElementTypes;
import components.diagram.providers.ModelParserProvider;

/**
 * @generated
 */
public class ModelNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ModelNavigatorItem
				&& !isOwnView(((ModelNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ModelNavigatorGroup) {
			ModelNavigatorGroup group = (ModelNavigatorGroup) element;
			return ModelDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof ModelNavigatorItem) {
			ModelNavigatorItem navigatorItem = (ModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case EJBContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?components?EJBContainer", ModelElementTypes.EJBContainer_1000); //$NON-NLS-1$
		case Operation3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?components?Operation", ModelElementTypes.Operation_3006); //$NON-NLS-1$
		case AggregationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?components?Aggregation", ModelElementTypes.Aggregation_4003); //$NON-NLS-1$
		case GeneralizationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?components?Generalization", ModelElementTypes.Generalization_4002); //$NON-NLS-1$
		case RealizationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?components?Realization", ModelElementTypes.Realization_4001); //$NON-NLS-1$
		case ClassElement2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?components?ClassElement", ModelElementTypes.ClassElement_3016); //$NON-NLS-1$
		case Operation5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?components?Operation", ModelElementTypes.Operation_3010); //$NON-NLS-1$
		case Operation6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?components?Operation", ModelElementTypes.Operation_3012); //$NON-NLS-1$
		case Property8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?components?Property", ModelElementTypes.Property_3017); //$NON-NLS-1$
		case ClassElementEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?components?ClassElement", ModelElementTypes.ClassElement_2011); //$NON-NLS-1$
		case Operation4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?components?Operation", ModelElementTypes.Operation_3008); //$NON-NLS-1$
		case StatelessSessionBeanEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?components?StatelessSessionBean", ModelElementTypes.StatelessSessionBean_2007); //$NON-NLS-1$
		case InterfaceElementEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?components?InterfaceElement", ModelElementTypes.InterfaceElement_2012); //$NON-NLS-1$
		case Property7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?components?Property", ModelElementTypes.Property_3014); //$NON-NLS-1$
		case Property6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?components?Property", ModelElementTypes.Property_3011); //$NON-NLS-1$
		case Property2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?components?Property", ModelElementTypes.Property_3003); //$NON-NLS-1$
		case Property4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?components?Property", ModelElementTypes.Property_3007); //$NON-NLS-1$
		case Property3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?components?Property", ModelElementTypes.Property_3005); //$NON-NLS-1$
		case Operation2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?components?Operation", ModelElementTypes.Operation_3004); //$NON-NLS-1$
		case StatefulSessionBeanEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?components?StatefulSessionBean", ModelElementTypes.StatefulSessionBean_2006); //$NON-NLS-1$
		case Property5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?components?Property", ModelElementTypes.Property_3009); //$NON-NLS-1$
		case AssociationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?components?Association", ModelElementTypes.Association_4004); //$NON-NLS-1$
		case MessageDrivenBeanEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?components?MessageDrivenBean", ModelElementTypes.MessageDrivenBean_2003); //$NON-NLS-1$
		case Operation8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?components?Operation", ModelElementTypes.Operation_3018); //$NON-NLS-1$
		case EntityBeanEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?components?EntityBean", ModelElementTypes.EntityBean_2002); //$NON-NLS-1$
		case PackageElementEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?components?PackageElement", ModelElementTypes.PackageElement_2009); //$NON-NLS-1$
		case Operation7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?components?Operation", ModelElementTypes.Operation_3015); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ModelDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ModelElementTypes.isKnownElementType(elementType)) {
			image = ModelElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof ModelNavigatorGroup) {
			ModelNavigatorGroup group = (ModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ModelNavigatorItem) {
			ModelNavigatorItem navigatorItem = (ModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case EJBContainerEditPart.VISUAL_ID:
			return getEJBContainer_1000Text(view);
		case Operation3EditPart.VISUAL_ID:
			return getOperation_3006Text(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4003Text(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4002Text(view);
		case RealizationEditPart.VISUAL_ID:
			return getRealization_4001Text(view);
		case ClassElement2EditPart.VISUAL_ID:
			return getClassElement_3016Text(view);
		case Operation5EditPart.VISUAL_ID:
			return getOperation_3010Text(view);
		case Operation6EditPart.VISUAL_ID:
			return getOperation_3012Text(view);
		case Property8EditPart.VISUAL_ID:
			return getProperty_3017Text(view);
		case ClassElementEditPart.VISUAL_ID:
			return getClassElement_2011Text(view);
		case Operation4EditPart.VISUAL_ID:
			return getOperation_3008Text(view);
		case StatelessSessionBeanEditPart.VISUAL_ID:
			return getStatelessSessionBean_2007Text(view);
		case InterfaceElementEditPart.VISUAL_ID:
			return getInterfaceElement_2012Text(view);
		case Property7EditPart.VISUAL_ID:
			return getProperty_3014Text(view);
		case Property6EditPart.VISUAL_ID:
			return getProperty_3011Text(view);
		case Property2EditPart.VISUAL_ID:
			return getProperty_3003Text(view);
		case Property4EditPart.VISUAL_ID:
			return getProperty_3007Text(view);
		case Property3EditPart.VISUAL_ID:
			return getProperty_3005Text(view);
		case Operation2EditPart.VISUAL_ID:
			return getOperation_3004Text(view);
		case StatefulSessionBeanEditPart.VISUAL_ID:
			return getStatefulSessionBean_2006Text(view);
		case Property5EditPart.VISUAL_ID:
			return getProperty_3009Text(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4004Text(view);
		case MessageDrivenBeanEditPart.VISUAL_ID:
			return getMessageDrivenBean_2003Text(view);
		case Operation8EditPart.VISUAL_ID:
			return getOperation_3018Text(view);
		case EntityBeanEditPart.VISUAL_ID:
			return getEntityBean_2002Text(view);
		case PackageElementEditPart.VISUAL_ID:
			return getPackageElement_2009Text(view);
		case Operation7EditPart.VISUAL_ID:
			return getOperation_3015Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getStatefulSessionBean_2006Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.StatefulSessionBean_2006,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(StatefulSessionBeanNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_3011Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.Property_3011,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(PropertyNamePropertyType5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRealization_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getProperty_3009Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.Property_3009,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(PropertyNamePropertyType4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_3005Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.Property_3005,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(PropertyNamePropertyType2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAggregation_4003Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.Aggregation_4003,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(AggregationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClassElement_2011Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.ClassElement_2011,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(ClassElementNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperation_3004Text(View view) {
		IParser parser = ModelParserProvider
				.getParser(
						ModelElementTypes.Operation_3004,
						view.getElement() != null ? view.getElement() : view,
						ModelVisualIDRegistry
								.getType(OperationNameParametersOpeartionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperation_3012Text(View view) {
		IParser parser = ModelParserProvider
				.getParser(
						ModelElementTypes.Operation_3012,
						view.getElement() != null ? view.getElement() : view,
						ModelVisualIDRegistry
								.getType(OperationNameParametersOpeartion5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEJBContainer_1000Text(View view) {
		EJBContainer domainModelElement = (EJBContainer) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperation_3015Text(View view) {
		IParser parser = ModelParserProvider
				.getParser(
						ModelElementTypes.Operation_3015,
						view.getElement() != null ? view.getElement() : view,
						ModelVisualIDRegistry
								.getType(OperationNameParametersOpeartion6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPackageElement_2009Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.PackageElement_2009,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(PackageElementNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperation_3006Text(View view) {
		IParser parser = ModelParserProvider
				.getParser(
						ModelElementTypes.Operation_3006,
						view.getElement() != null ? view.getElement() : view,
						ModelVisualIDRegistry
								.getType(OperationNameParametersOpeartion2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClassElement_3016Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.ClassElement_3016,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(ClassElementName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_3014Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.Property_3014,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(PropertyNamePropertyType6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperation_3010Text(View view) {
		IParser parser = ModelParserProvider
				.getParser(
						ModelElementTypes.Operation_3010,
						view.getElement() != null ? view.getElement() : view,
						ModelVisualIDRegistry
								.getType(OperationNameParametersOpeartion4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMessageDrivenBean_2003Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.MessageDrivenBean_2003,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(MessageDrivenBeanNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInterfaceElement_2012Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.InterfaceElement_2012,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(InterfaceElementNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssociation_4004Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.Association_4004,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(AssociationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperation_3018Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.Operation_3018,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(OperationNameVisibilityEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGeneralization_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOperation_3008Text(View view) {
		IParser parser = ModelParserProvider
				.getParser(
						ModelElementTypes.Operation_3008,
						view.getElement() != null ? view.getElement() : view,
						ModelVisualIDRegistry
								.getType(OperationNameParametersOpeartion3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_3007Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.Property_3007,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(PropertyNamePropertyType3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStatelessSessionBean_2007Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.StatelessSessionBean_2007,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(StatelessSessionBeanNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_3017Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.Property_3017,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(PropertyNameVisibilityEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_3003Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.Property_3003,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(PropertyNamePropertyTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntityBean_2002Text(View view) {
		IParser parser = ModelParserProvider
				.getParser(ModelElementTypes.EntityBean_2002,
						view.getElement() != null ? view.getElement() : view,
						ModelVisualIDRegistry
								.getType(EntityBeanNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return EJBContainerEditPart.MODEL_ID.equals(ModelVisualIDRegistry
				.getModelID(view));
	}

}
