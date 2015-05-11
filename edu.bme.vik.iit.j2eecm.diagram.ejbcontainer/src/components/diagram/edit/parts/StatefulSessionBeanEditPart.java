package components.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import components.diagram.edit.policies.StatefulSessionBeanItemSemanticEditPolicy;
import components.diagram.part.ModelVisualIDRegistry;
import components.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class StatefulSessionBeanEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2006;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public StatefulSessionBeanEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						ModelVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new StatefulSessionBeanItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new StatefulSessionBeanFigure();
	}

	/**
	 * @generated
	 */
	public StatefulSessionBeanFigure getPrimaryShape() {
		return (StatefulSessionBeanFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof StatefulSessionBeanNameEditPart) {
			((StatefulSessionBeanNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureStatefulSessionBeanNameFigure());
			return true;
		}
		if (childEditPart instanceof StatefulSessionBeanVisibilityEditPart) {
			((StatefulSessionBeanVisibilityEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureStatefulSessionBeanViewTypeFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof StatefulSessionBeanNameEditPart) {
			return true;
		}
		if (childEditPart instanceof StatefulSessionBeanVisibilityEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(ModelVisualIDRegistry
				.getType(StatefulSessionBeanNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(ModelElementTypes.Realization_4001);
		types.add(ModelElementTypes.Generalization_4002);
		types.add(ModelElementTypes.Aggregation_4003);
		types.add(ModelElementTypes.Association_4004);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof InterfaceElementEditPart) {
			types.add(ModelElementTypes.Realization_4001);
		}
		if (targetEditPart instanceof InterfaceElementEditPart) {
			types.add(ModelElementTypes.Generalization_4002);
		}
		if (targetEditPart instanceof EntityBeanEditPart) {
			types.add(ModelElementTypes.Generalization_4002);
		}
		if (targetEditPart instanceof MessageDrivenBeanEditPart) {
			types.add(ModelElementTypes.Generalization_4002);
		}
		if (targetEditPart instanceof components.diagram.edit.parts.StatefulSessionBeanEditPart) {
			types.add(ModelElementTypes.Generalization_4002);
		}
		if (targetEditPart instanceof StatelessSessionBeanEditPart) {
			types.add(ModelElementTypes.Generalization_4002);
		}
		if (targetEditPart instanceof PackageElementEditPart) {
			types.add(ModelElementTypes.Generalization_4002);
		}
		if (targetEditPart instanceof ClassElementEditPart) {
			types.add(ModelElementTypes.Generalization_4002);
		}
		if (targetEditPart instanceof ClassElement2EditPart) {
			types.add(ModelElementTypes.Generalization_4002);
		}
		if (targetEditPart instanceof InterfaceElementEditPart) {
			types.add(ModelElementTypes.Aggregation_4003);
		}
		if (targetEditPart instanceof EntityBeanEditPart) {
			types.add(ModelElementTypes.Aggregation_4003);
		}
		if (targetEditPart instanceof MessageDrivenBeanEditPart) {
			types.add(ModelElementTypes.Aggregation_4003);
		}
		if (targetEditPart instanceof components.diagram.edit.parts.StatefulSessionBeanEditPart) {
			types.add(ModelElementTypes.Aggregation_4003);
		}
		if (targetEditPart instanceof StatelessSessionBeanEditPart) {
			types.add(ModelElementTypes.Aggregation_4003);
		}
		if (targetEditPart instanceof ClassElementEditPart) {
			types.add(ModelElementTypes.Aggregation_4003);
		}
		if (targetEditPart instanceof ClassElement2EditPart) {
			types.add(ModelElementTypes.Aggregation_4003);
		}
		if (targetEditPart instanceof InterfaceElementEditPart) {
			types.add(ModelElementTypes.Association_4004);
		}
		if (targetEditPart instanceof EntityBeanEditPart) {
			types.add(ModelElementTypes.Association_4004);
		}
		if (targetEditPart instanceof MessageDrivenBeanEditPart) {
			types.add(ModelElementTypes.Association_4004);
		}
		if (targetEditPart instanceof components.diagram.edit.parts.StatefulSessionBeanEditPart) {
			types.add(ModelElementTypes.Association_4004);
		}
		if (targetEditPart instanceof StatelessSessionBeanEditPart) {
			types.add(ModelElementTypes.Association_4004);
		}
		if (targetEditPart instanceof ClassElementEditPart) {
			types.add(ModelElementTypes.Association_4004);
		}
		if (targetEditPart instanceof ClassElement2EditPart) {
			types.add(ModelElementTypes.Association_4004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ModelElementTypes.Realization_4001) {
			types.add(ModelElementTypes.InterfaceElement_2012);
		} else if (relationshipType == ModelElementTypes.Generalization_4002) {
			types.add(ModelElementTypes.InterfaceElement_2012);
			types.add(ModelElementTypes.EntityBean_2002);
			types.add(ModelElementTypes.MessageDrivenBean_2003);
			types.add(ModelElementTypes.StatefulSessionBean_2006);
			types.add(ModelElementTypes.StatelessSessionBean_2007);
			types.add(ModelElementTypes.PackageElement_2009);
			types.add(ModelElementTypes.ClassElement_2011);
			types.add(ModelElementTypes.ClassElement_3016);
		} else if (relationshipType == ModelElementTypes.Aggregation_4003) {
			types.add(ModelElementTypes.InterfaceElement_2012);
			types.add(ModelElementTypes.EntityBean_2002);
			types.add(ModelElementTypes.MessageDrivenBean_2003);
			types.add(ModelElementTypes.StatefulSessionBean_2006);
			types.add(ModelElementTypes.StatelessSessionBean_2007);
			types.add(ModelElementTypes.ClassElement_2011);
			types.add(ModelElementTypes.ClassElement_3016);
		} else if (relationshipType == ModelElementTypes.Association_4004) {
			types.add(ModelElementTypes.InterfaceElement_2012);
			types.add(ModelElementTypes.EntityBean_2002);
			types.add(ModelElementTypes.MessageDrivenBean_2003);
			types.add(ModelElementTypes.StatefulSessionBean_2006);
			types.add(ModelElementTypes.StatelessSessionBean_2007);
			types.add(ModelElementTypes.ClassElement_2011);
			types.add(ModelElementTypes.ClassElement_3016);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ModelElementTypes.Generalization_4002);
		types.add(ModelElementTypes.Aggregation_4003);
		types.add(ModelElementTypes.Association_4004);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ModelElementTypes.Generalization_4002) {
			types.add(ModelElementTypes.InterfaceElement_2012);
			types.add(ModelElementTypes.EntityBean_2002);
			types.add(ModelElementTypes.MessageDrivenBean_2003);
			types.add(ModelElementTypes.StatefulSessionBean_2006);
			types.add(ModelElementTypes.StatelessSessionBean_2007);
			types.add(ModelElementTypes.PackageElement_2009);
			types.add(ModelElementTypes.ClassElement_2011);
			types.add(ModelElementTypes.ClassElement_3016);
		} else if (relationshipType == ModelElementTypes.Aggregation_4003) {
			types.add(ModelElementTypes.InterfaceElement_2012);
			types.add(ModelElementTypes.EntityBean_2002);
			types.add(ModelElementTypes.MessageDrivenBean_2003);
			types.add(ModelElementTypes.StatefulSessionBean_2006);
			types.add(ModelElementTypes.StatelessSessionBean_2007);
			types.add(ModelElementTypes.ClassElement_2011);
			types.add(ModelElementTypes.ClassElement_3016);
		} else if (relationshipType == ModelElementTypes.Association_4004) {
			types.add(ModelElementTypes.InterfaceElement_2012);
			types.add(ModelElementTypes.EntityBean_2002);
			types.add(ModelElementTypes.MessageDrivenBean_2003);
			types.add(ModelElementTypes.StatefulSessionBean_2006);
			types.add(ModelElementTypes.StatelessSessionBean_2007);
			types.add(ModelElementTypes.ClassElement_2011);
			types.add(ModelElementTypes.ClassElement_3016);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == ModelElementTypes.Property_3009) {
				return getChildBySemanticHint(ModelVisualIDRegistry
						.getType(StatefulSessionBeanPropertyCompartmentEditPart.VISUAL_ID));
			}
			if (type == ModelElementTypes.Operation_3010) {
				return getChildBySemanticHint(ModelVisualIDRegistry
						.getType(StatefulSessionBeanOpearionCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class StatefulSessionBeanFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureStatefulSessionBeanNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureStatefulSessionBeanViewTypeFigure;

		/**
		 * @generated
		 */
		public StatefulSessionBeanFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			this.setForegroundColor(THIS_FORE);
			this.setBackgroundColor(THIS_BACK);
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(150),
					getMapMode().DPtoLP(150)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure statefulSessionBeanHeader0 = new RectangleFigure();

			statefulSessionBeanHeader0.setOutline(false);
			statefulSessionBeanHeader0.setFill(false);
			statefulSessionBeanHeader0.setOpaque(false);
			statefulSessionBeanHeader0.setBorder(new MarginBorder(getMapMode()
					.DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));

			this.add(statefulSessionBeanHeader0);

			GridLayout layoutStatefulSessionBeanHeader0 = new GridLayout();
			layoutStatefulSessionBeanHeader0.numColumns = 1;
			layoutStatefulSessionBeanHeader0.makeColumnsEqualWidth = true;
			statefulSessionBeanHeader0
					.setLayoutManager(layoutStatefulSessionBeanHeader0);

			WrappingLabel statefulSessionBeanTypeLabel1 = new WrappingLabel();

			statefulSessionBeanTypeLabel1.setText("«Stateful Session»");

			GridData constraintStatefulSessionBeanTypeLabel1 = new GridData();
			constraintStatefulSessionBeanTypeLabel1.verticalAlignment = GridData.CENTER;
			constraintStatefulSessionBeanTypeLabel1.horizontalAlignment = GridData.CENTER;
			constraintStatefulSessionBeanTypeLabel1.horizontalIndent = 0;
			constraintStatefulSessionBeanTypeLabel1.horizontalSpan = 1;
			constraintStatefulSessionBeanTypeLabel1.verticalSpan = 1;
			constraintStatefulSessionBeanTypeLabel1.grabExcessHorizontalSpace = true;
			constraintStatefulSessionBeanTypeLabel1.grabExcessVerticalSpace = true;
			statefulSessionBeanHeader0.add(statefulSessionBeanTypeLabel1,
					constraintStatefulSessionBeanTypeLabel1);

			fFigureStatefulSessionBeanNameFigure = new WrappingLabel();

			fFigureStatefulSessionBeanNameFigure.setText("<...>");

			GridData constraintFFigureStatefulSessionBeanNameFigure = new GridData();
			constraintFFigureStatefulSessionBeanNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureStatefulSessionBeanNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureStatefulSessionBeanNameFigure.horizontalIndent = 0;
			constraintFFigureStatefulSessionBeanNameFigure.horizontalSpan = 1;
			constraintFFigureStatefulSessionBeanNameFigure.verticalSpan = 1;
			constraintFFigureStatefulSessionBeanNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureStatefulSessionBeanNameFigure.grabExcessVerticalSpace = true;
			statefulSessionBeanHeader0.add(
					fFigureStatefulSessionBeanNameFigure,
					constraintFFigureStatefulSessionBeanNameFigure);

			fFigureStatefulSessionBeanViewTypeFigure = new WrappingLabel();

			fFigureStatefulSessionBeanViewTypeFigure.setText("<...>");

			fFigureStatefulSessionBeanViewTypeFigure
					.setFont(FFIGURESTATEFULSESSIONBEANVIEWTYPEFIGURE_FONT);

			GridData constraintFFigureStatefulSessionBeanViewTypeFigure = new GridData();
			constraintFFigureStatefulSessionBeanViewTypeFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureStatefulSessionBeanViewTypeFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureStatefulSessionBeanViewTypeFigure.horizontalIndent = 0;
			constraintFFigureStatefulSessionBeanViewTypeFigure.horizontalSpan = 1;
			constraintFFigureStatefulSessionBeanViewTypeFigure.verticalSpan = 1;
			constraintFFigureStatefulSessionBeanViewTypeFigure.grabExcessHorizontalSpace = true;
			constraintFFigureStatefulSessionBeanViewTypeFigure.grabExcessVerticalSpace = true;
			statefulSessionBeanHeader0.add(
					fFigureStatefulSessionBeanViewTypeFigure,
					constraintFFigureStatefulSessionBeanViewTypeFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStatefulSessionBeanNameFigure() {
			return fFigureStatefulSessionBeanNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStatefulSessionBeanViewTypeFigure() {
			return fFigureStatefulSessionBeanViewTypeFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 20, 137, 77);

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 237, 250, 225);

	/**
	 * @generated
	 */
	static final Font FFIGURESTATEFULSESSIONBEANVIEWTYPEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 6, SWT.NORMAL);

}
