package components.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
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

import components.diagram.edit.policies.InterfaceElementItemSemanticEditPolicy;
import components.diagram.part.ModelVisualIDRegistry;
import components.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class InterfaceElementEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2012;

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
	public InterfaceElementEditPart(View view) {
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
				new InterfaceElementItemSemanticEditPolicy());
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
		return primaryShape = new InterfaceElementFigure();
	}

	/**
	 * @generated
	 */
	public InterfaceElementFigure getPrimaryShape() {
		return (InterfaceElementFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InterfaceElementNameEditPart) {
			((InterfaceElementNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureInterfaceElementNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InterfaceElementNameEditPart) {
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
				.getType(InterfaceElementNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
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
		if (targetEditPart instanceof components.diagram.edit.parts.InterfaceElementEditPart) {
			types.add(ModelElementTypes.Generalization_4002);
		}
		if (targetEditPart instanceof EntityBeanEditPart) {
			types.add(ModelElementTypes.Generalization_4002);
		}
		if (targetEditPart instanceof MessageDrivenBeanEditPart) {
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
		if (targetEditPart instanceof components.diagram.edit.parts.InterfaceElementEditPart) {
			types.add(ModelElementTypes.Aggregation_4003);
		}
		if (targetEditPart instanceof EntityBeanEditPart) {
			types.add(ModelElementTypes.Aggregation_4003);
		}
		if (targetEditPart instanceof MessageDrivenBeanEditPart) {
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
		if (targetEditPart instanceof components.diagram.edit.parts.InterfaceElementEditPart) {
			types.add(ModelElementTypes.Association_4004);
		}
		if (targetEditPart instanceof EntityBeanEditPart) {
			types.add(ModelElementTypes.Association_4004);
		}
		if (targetEditPart instanceof MessageDrivenBeanEditPart) {
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
	public List<IElementType> getMARelTypesOnTarget() {
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
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ModelElementTypes.Realization_4001) {
			types.add(ModelElementTypes.EntityBean_2002);
			types.add(ModelElementTypes.MessageDrivenBean_2003);
			types.add(ModelElementTypes.StatefulSessionBean_2006);
			types.add(ModelElementTypes.StatelessSessionBean_2007);
			types.add(ModelElementTypes.ClassElement_2011);
			types.add(ModelElementTypes.ClassElement_3016);
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
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == ModelElementTypes.Property_3003) {
				return getChildBySemanticHint(ModelVisualIDRegistry
						.getType(InterfaceElementPropertyCompartmentEditPart.VISUAL_ID));
			}
			if (type == ModelElementTypes.Operation_3004) {
				return getChildBySemanticHint(ModelVisualIDRegistry
						.getType(InterfaceElementOpearionCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class InterfaceElementFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureInterfaceElementNameFigure;

		/**
		 * @generated
		 */
		public InterfaceElementFigure() {

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
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure interfaceElementHeader0 = new RectangleFigure();

			interfaceElementHeader0.setOutline(false);
			interfaceElementHeader0.setFill(false);
			interfaceElementHeader0.setOpaque(false);

			this.add(interfaceElementHeader0);

			GridLayout layoutInterfaceElementHeader0 = new GridLayout();
			layoutInterfaceElementHeader0.numColumns = 1;
			layoutInterfaceElementHeader0.makeColumnsEqualWidth = true;
			interfaceElementHeader0
					.setLayoutManager(layoutInterfaceElementHeader0);

			WrappingLabel interfaceClassName1 = new WrappingLabel();

			interfaceClassName1.setText("«Interface»");

			GridData constraintInterfaceClassName1 = new GridData();
			constraintInterfaceClassName1.verticalAlignment = GridData.CENTER;
			constraintInterfaceClassName1.horizontalAlignment = GridData.CENTER;
			constraintInterfaceClassName1.horizontalIndent = 0;
			constraintInterfaceClassName1.horizontalSpan = 1;
			constraintInterfaceClassName1.verticalSpan = 1;
			constraintInterfaceClassName1.grabExcessHorizontalSpace = true;
			constraintInterfaceClassName1.grabExcessVerticalSpace = true;
			interfaceElementHeader0.add(interfaceClassName1,
					constraintInterfaceClassName1);

			fFigureInterfaceElementNameFigure = new WrappingLabel();

			fFigureInterfaceElementNameFigure.setText("<...>");

			GridData constraintFFigureInterfaceElementNameFigure = new GridData();
			constraintFFigureInterfaceElementNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureInterfaceElementNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureInterfaceElementNameFigure.horizontalIndent = 0;
			constraintFFigureInterfaceElementNameFigure.horizontalSpan = 1;
			constraintFFigureInterfaceElementNameFigure.verticalSpan = 1;
			constraintFFigureInterfaceElementNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureInterfaceElementNameFigure.grabExcessVerticalSpace = true;
			interfaceElementHeader0.add(fFigureInterfaceElementNameFigure,
					constraintFFigureInterfaceElementNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInterfaceElementNameFigure() {
			return fFigureInterfaceElementNameFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 173, 127, 168);

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 247, 242, 246);

}
