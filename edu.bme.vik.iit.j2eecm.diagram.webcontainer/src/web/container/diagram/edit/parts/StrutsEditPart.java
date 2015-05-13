package web.container.diagram.edit.parts;

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
import org.eclipse.swt.graphics.Color;

import web.container.diagram.edit.policies.StrutsItemSemanticEditPolicy;
import web.container.diagram.part.ModelVisualIDRegistry;
import web.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class StrutsEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2011;

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
	public StrutsEditPart(View view) {
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
				new StrutsItemSemanticEditPolicy());
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
		return primaryShape = new StrutsFigure();
	}

	/**
	 * @generated
	 */
	public StrutsFigure getPrimaryShape() {
		return (StrutsFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof StrutsNameEditPart) {
			((StrutsNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureStrutsNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof StrutsNameEditPart) {
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
				.getType(StrutsNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ModelElementTypes.StrutsLinkRelation_4004);
		types.add(ModelElementTypes.StrutsRelation_4005);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ModelElementTypes.StrutsLinkRelation_4004) {
			types.add(ModelElementTypes.LinkElement_3002);
		} else if (relationshipType == ModelElementTypes.StrutsRelation_4005) {
			types.add(ModelElementTypes.StrutsOperation_3001);
			types.add(ModelElementTypes.EventCall_3004);
			types.add(ModelElementTypes.ExceptionHandling_3007);
			types.add(ModelElementTypes.EventCall_3009);
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
			if (type == ModelElementTypes.StrutsOperation_3001) {
				return getChildBySemanticHint(ModelVisualIDRegistry
						.getType(StrutsStructsOperationCompartmentEditPart.VISUAL_ID));
			}
			if (type == ModelElementTypes.EventCall_3004) {
				return getChildBySemanticHint(ModelVisualIDRegistry
						.getType(StrutsExceptionHandlingCompartmentEditPart.VISUAL_ID));
			}
			if (type == ModelElementTypes.ExceptionHandling_3007) {
				return getChildBySemanticHint(ModelVisualIDRegistry
						.getType(StrutsExceptionHandlingCompartment2EditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class StrutsFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureStrutsNameFigure;

		/**
		 * @generated
		 */
		public StrutsFigure() {

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
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(15), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(15)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure strutsElementHeader0 = new RectangleFigure();

			strutsElementHeader0.setOutline(false);
			strutsElementHeader0.setFill(false);
			strutsElementHeader0.setOpaque(false);

			this.add(strutsElementHeader0);

			GridLayout layoutStrutsElementHeader0 = new GridLayout();
			layoutStrutsElementHeader0.numColumns = 1;
			layoutStrutsElementHeader0.makeColumnsEqualWidth = true;
			strutsElementHeader0.setLayoutManager(layoutStrutsElementHeader0);

			WrappingLabel strutsTypeName1 = new WrappingLabel();

			strutsTypeName1.setText("«Struts»");

			GridData constraintStrutsTypeName1 = new GridData();
			constraintStrutsTypeName1.verticalAlignment = GridData.CENTER;
			constraintStrutsTypeName1.horizontalAlignment = GridData.CENTER;
			constraintStrutsTypeName1.horizontalIndent = 0;
			constraintStrutsTypeName1.horizontalSpan = 1;
			constraintStrutsTypeName1.verticalSpan = 1;
			constraintStrutsTypeName1.grabExcessHorizontalSpace = true;
			constraintStrutsTypeName1.grabExcessVerticalSpace = true;
			strutsElementHeader0
					.add(strutsTypeName1, constraintStrutsTypeName1);

			fFigureStrutsNameFigure = new WrappingLabel();

			fFigureStrutsNameFigure.setText("<...>");

			GridData constraintFFigureStrutsNameFigure = new GridData();
			constraintFFigureStrutsNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureStrutsNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureStrutsNameFigure.horizontalIndent = 0;
			constraintFFigureStrutsNameFigure.horizontalSpan = 1;
			constraintFFigureStrutsNameFigure.verticalSpan = 1;
			constraintFFigureStrutsNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureStrutsNameFigure.grabExcessVerticalSpace = true;
			strutsElementHeader0.add(fFigureStrutsNameFigure,
					constraintFFigureStrutsNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStrutsNameFigure() {
			return fFigureStrutsNameFigure;
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

}
