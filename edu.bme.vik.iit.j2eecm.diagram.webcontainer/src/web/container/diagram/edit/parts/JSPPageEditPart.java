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

import web.container.diagram.edit.policies.JSPPageItemSemanticEditPolicy;
import web.container.diagram.part.ModelVisualIDRegistry;
import web.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class JSPPageEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

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
	public JSPPageEditPart(View view) {
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
				new JSPPageItemSemanticEditPolicy());
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
		return primaryShape = new JSPPageFigure();
	}

	/**
	 * @generated
	 */
	public JSPPageFigure getPrimaryShape() {
		return (JSPPageFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof JSPPageNameEditPart) {
			((JSPPageNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureJSPPageNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof JSPPageNameEditPart) {
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
				.getType(JSPPageNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ModelElementTypes.StaticRelationship_4001);
		types.add(ModelElementTypes.WebModelRelationship_4006);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof HTML5EditPart) {
			types.add(ModelElementTypes.StaticRelationship_4001);
		}
		if (targetEditPart instanceof XMLConfigEditPart) {
			types.add(ModelElementTypes.StaticRelationship_4001);
		}
		if (targetEditPart instanceof web.container.diagram.edit.parts.JSPPageEditPart) {
			types.add(ModelElementTypes.WebModelRelationship_4006);
		}
		if (targetEditPart instanceof ServletEditPart) {
			types.add(ModelElementTypes.WebModelRelationship_4006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ModelElementTypes.StaticRelationship_4001) {
			types.add(ModelElementTypes.HTML5_2003);
			types.add(ModelElementTypes.XMLConfig_2006);
		} else if (relationshipType == ModelElementTypes.WebModelRelationship_4006) {
			types.add(ModelElementTypes.JSPPage_2001);
			types.add(ModelElementTypes.Servlet_2002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ModelElementTypes.ActionRelationship_4002);
		types.add(ModelElementTypes.LinkRelationship_4003);
		types.add(ModelElementTypes.WebModelRelationship_4006);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ModelElementTypes.ActionRelationship_4002) {
			types.add(ModelElementTypes.StrutsOperation_3001);
			types.add(ModelElementTypes.EventCall_3004);
			types.add(ModelElementTypes.ExceptionHandling_3007);
			types.add(ModelElementTypes.EventCall_3009);
		} else if (relationshipType == ModelElementTypes.LinkRelationship_4003) {
			types.add(ModelElementTypes.LinkElement_3002);
		} else if (relationshipType == ModelElementTypes.WebModelRelationship_4006) {
			types.add(ModelElementTypes.JSPPage_2001);
			types.add(ModelElementTypes.Servlet_2002);
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
			if (type == ModelElementTypes.LinkElement_3002) {
				return getChildBySemanticHint(ModelVisualIDRegistry
						.getType(JSPPageLinkElementCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class JSPPageFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureJSPPageNameFigure;

		/**
		 * @generated
		 */
		public JSPPageFigure() {

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
					getMapMode().DPtoLP(80)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(15), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(15)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure jSPPageElementHeader0 = new RectangleFigure();

			jSPPageElementHeader0.setOutline(false);
			jSPPageElementHeader0.setFill(false);
			jSPPageElementHeader0.setOpaque(false);

			this.add(jSPPageElementHeader0);

			GridLayout layoutJSPPageElementHeader0 = new GridLayout();
			layoutJSPPageElementHeader0.numColumns = 1;
			layoutJSPPageElementHeader0.makeColumnsEqualWidth = true;
			jSPPageElementHeader0.setLayoutManager(layoutJSPPageElementHeader0);

			WrappingLabel jSPTypeName1 = new WrappingLabel();

			jSPTypeName1.setText("«JSP»");

			GridData constraintJSPTypeName1 = new GridData();
			constraintJSPTypeName1.verticalAlignment = GridData.CENTER;
			constraintJSPTypeName1.horizontalAlignment = GridData.CENTER;
			constraintJSPTypeName1.horizontalIndent = 0;
			constraintJSPTypeName1.horizontalSpan = 1;
			constraintJSPTypeName1.verticalSpan = 1;
			constraintJSPTypeName1.grabExcessHorizontalSpace = true;
			constraintJSPTypeName1.grabExcessVerticalSpace = true;
			jSPPageElementHeader0.add(jSPTypeName1, constraintJSPTypeName1);

			fFigureJSPPageNameFigure = new WrappingLabel();

			fFigureJSPPageNameFigure.setText("<...>");

			GridData constraintFFigureJSPPageNameFigure = new GridData();
			constraintFFigureJSPPageNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureJSPPageNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureJSPPageNameFigure.horizontalIndent = 0;
			constraintFFigureJSPPageNameFigure.horizontalSpan = 1;
			constraintFFigureJSPPageNameFigure.verticalSpan = 1;
			constraintFFigureJSPPageNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureJSPPageNameFigure.grabExcessVerticalSpace = true;
			jSPPageElementHeader0.add(fFigureJSPPageNameFigure,
					constraintFFigureJSPPageNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureJSPPageNameFigure() {
			return fFigureJSPPageNameFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 39, 76, 114);

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 229, 241, 236);

}
