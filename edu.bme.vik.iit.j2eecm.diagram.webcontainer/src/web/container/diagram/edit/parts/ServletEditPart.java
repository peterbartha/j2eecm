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
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import web.container.diagram.edit.policies.ServletItemSemanticEditPolicy;
import web.container.diagram.part.ModelVisualIDRegistry;
import web.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class ServletEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

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
	public ServletEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ServletItemSemanticEditPolicy());
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
		return primaryShape = new ServletFigure();
	}

	/**
	 * @generated
	 */
	public ServletFigure getPrimaryShape() {
		return (ServletFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ServletNameEditPart) {
			((ServletNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureServletNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ServletNameEditPart) {
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
				.getType(ServletNameEditPart.VISUAL_ID));
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
		if (targetEditPart instanceof JSPPageEditPart) {
			types.add(ModelElementTypes.WebModelRelationship_4006);
		}
		if (targetEditPart instanceof web.container.diagram.edit.parts.ServletEditPart) {
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
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ModelElementTypes.WebModelRelationship_4006);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ModelElementTypes.WebModelRelationship_4006) {
			types.add(ModelElementTypes.JSPPage_2001);
			types.add(ModelElementTypes.Servlet_2002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class ServletFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureServletNameFigure;

		/**
		 * @generated
		 */
		public ServletFigure() {

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
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(10), getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(10)));
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

			WrappingLabel servletTypeName1 = new WrappingLabel();

			servletTypeName1.setText("«JSP»");

			GridData constraintServletTypeName1 = new GridData();
			constraintServletTypeName1.verticalAlignment = GridData.CENTER;
			constraintServletTypeName1.horizontalAlignment = GridData.CENTER;
			constraintServletTypeName1.horizontalIndent = 0;
			constraintServletTypeName1.horizontalSpan = 1;
			constraintServletTypeName1.verticalSpan = 1;
			constraintServletTypeName1.grabExcessHorizontalSpace = true;
			constraintServletTypeName1.grabExcessVerticalSpace = true;
			jSPPageElementHeader0.add(servletTypeName1,
					constraintServletTypeName1);

			fFigureServletNameFigure = new WrappingLabel();

			fFigureServletNameFigure.setText("<...>");

			GridData constraintFFigureServletNameFigure = new GridData();
			constraintFFigureServletNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureServletNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureServletNameFigure.horizontalIndent = 0;
			constraintFFigureServletNameFigure.horizontalSpan = 1;
			constraintFFigureServletNameFigure.verticalSpan = 1;
			constraintFFigureServletNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureServletNameFigure.grabExcessVerticalSpace = true;
			jSPPageElementHeader0.add(fFigureServletNameFigure,
					constraintFFigureServletNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureServletNameFigure() {
			return fFigureServletNameFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 120, 120, 120);

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 240, 240, 240);

}
