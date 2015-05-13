package ejb.container.diagram.edit.parts;

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

import ejb.container.diagram.edit.policies.MessageDrivenBeanItemSemanticEditPolicy;
import ejb.container.diagram.part.ModelVisualIDRegistry;
import ejb.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class MessageDrivenBeanEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2003;

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
	public MessageDrivenBeanEditPart(View view) {
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
				new MessageDrivenBeanItemSemanticEditPolicy());
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
		return primaryShape = new MessageDrivenBeanFigure();
	}

	/**
	 * @generated
	 */
	public MessageDrivenBeanFigure getPrimaryShape() {
		return (MessageDrivenBeanFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof MessageDrivenBeanNameEditPart) {
			((MessageDrivenBeanNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMessageDrivenBeanNameFigure());
			return true;
		}
		if (childEditPart instanceof MessageDrivenBeanVisibilityEditPart) {
			((MessageDrivenBeanVisibilityEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMessageDrivenBeanViewTypeFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof MessageDrivenBeanNameEditPart) {
			return true;
		}
		if (childEditPart instanceof MessageDrivenBeanVisibilityEditPart) {
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
				.getType(MessageDrivenBeanNameEditPart.VISUAL_ID));
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
		if (targetEditPart instanceof ejb.container.diagram.edit.parts.MessageDrivenBeanEditPart) {
			types.add(ModelElementTypes.Generalization_4002);
		}
		if (targetEditPart instanceof StatefulSessionBeanEditPart) {
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
		if (targetEditPart instanceof ejb.container.diagram.edit.parts.MessageDrivenBeanEditPart) {
			types.add(ModelElementTypes.Aggregation_4003);
		}
		if (targetEditPart instanceof StatefulSessionBeanEditPart) {
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
		if (targetEditPart instanceof ejb.container.diagram.edit.parts.MessageDrivenBeanEditPart) {
			types.add(ModelElementTypes.Association_4004);
		}
		if (targetEditPart instanceof StatefulSessionBeanEditPart) {
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
			if (type == ModelElementTypes.Property_3007) {
				return getChildBySemanticHint(ModelVisualIDRegistry
						.getType(MessageDrivenBeanPropertyCompartmentEditPart.VISUAL_ID));
			}
			if (type == ModelElementTypes.Operation_3008) {
				return getChildBySemanticHint(ModelVisualIDRegistry
						.getType(MessageDrivenBeanOpearionCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class MessageDrivenBeanFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMessageDrivenBeanNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMessageDrivenBeanViewTypeFigure;

		/**
		 * @generated
		 */
		public MessageDrivenBeanFigure() {

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

			RectangleFigure messageDrivenBeanHeader0 = new RectangleFigure();

			messageDrivenBeanHeader0.setOutline(false);
			messageDrivenBeanHeader0.setFill(false);
			messageDrivenBeanHeader0.setOpaque(false);
			messageDrivenBeanHeader0.setBorder(new MarginBorder(getMapMode()
					.DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));

			this.add(messageDrivenBeanHeader0);

			GridLayout layoutMessageDrivenBeanHeader0 = new GridLayout();
			layoutMessageDrivenBeanHeader0.numColumns = 1;
			layoutMessageDrivenBeanHeader0.makeColumnsEqualWidth = true;
			messageDrivenBeanHeader0
					.setLayoutManager(layoutMessageDrivenBeanHeader0);

			WrappingLabel messageDrivenTypeLabel1 = new WrappingLabel();

			messageDrivenTypeLabel1.setText("«Message-Driven»");

			GridData constraintMessageDrivenTypeLabel1 = new GridData();
			constraintMessageDrivenTypeLabel1.verticalAlignment = GridData.CENTER;
			constraintMessageDrivenTypeLabel1.horizontalAlignment = GridData.CENTER;
			constraintMessageDrivenTypeLabel1.horizontalIndent = 0;
			constraintMessageDrivenTypeLabel1.horizontalSpan = 1;
			constraintMessageDrivenTypeLabel1.verticalSpan = 1;
			constraintMessageDrivenTypeLabel1.grabExcessHorizontalSpace = true;
			constraintMessageDrivenTypeLabel1.grabExcessVerticalSpace = true;
			messageDrivenBeanHeader0.add(messageDrivenTypeLabel1,
					constraintMessageDrivenTypeLabel1);

			fFigureMessageDrivenBeanNameFigure = new WrappingLabel();

			fFigureMessageDrivenBeanNameFigure.setText("<...>");

			GridData constraintFFigureMessageDrivenBeanNameFigure = new GridData();
			constraintFFigureMessageDrivenBeanNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureMessageDrivenBeanNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureMessageDrivenBeanNameFigure.horizontalIndent = 0;
			constraintFFigureMessageDrivenBeanNameFigure.horizontalSpan = 1;
			constraintFFigureMessageDrivenBeanNameFigure.verticalSpan = 1;
			constraintFFigureMessageDrivenBeanNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureMessageDrivenBeanNameFigure.grabExcessVerticalSpace = true;
			messageDrivenBeanHeader0.add(fFigureMessageDrivenBeanNameFigure,
					constraintFFigureMessageDrivenBeanNameFigure);

			fFigureMessageDrivenBeanViewTypeFigure = new WrappingLabel();

			fFigureMessageDrivenBeanViewTypeFigure.setText("<...>");

			fFigureMessageDrivenBeanViewTypeFigure
					.setFont(FFIGUREMESSAGEDRIVENBEANVIEWTYPEFIGURE_FONT);

			GridData constraintFFigureMessageDrivenBeanViewTypeFigure = new GridData();
			constraintFFigureMessageDrivenBeanViewTypeFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureMessageDrivenBeanViewTypeFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureMessageDrivenBeanViewTypeFigure.horizontalIndent = 0;
			constraintFFigureMessageDrivenBeanViewTypeFigure.horizontalSpan = 1;
			constraintFFigureMessageDrivenBeanViewTypeFigure.verticalSpan = 1;
			constraintFFigureMessageDrivenBeanViewTypeFigure.grabExcessHorizontalSpace = true;
			constraintFFigureMessageDrivenBeanViewTypeFigure.grabExcessVerticalSpace = true;
			messageDrivenBeanHeader0.add(
					fFigureMessageDrivenBeanViewTypeFigure,
					constraintFFigureMessageDrivenBeanViewTypeFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMessageDrivenBeanNameFigure() {
			return fFigureMessageDrivenBeanNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMessageDrivenBeanViewTypeFigure() {
			return fFigureMessageDrivenBeanViewTypeFigure;
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
	static final Font FFIGUREMESSAGEDRIVENBEANVIEWTYPEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 6, SWT.NORMAL);

}
