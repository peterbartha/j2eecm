package components.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import components.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class ModelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createTypes1Group());
		paletteRoot.add(createJavaBeans2Group());
		paletteRoot.add(createFeatures3Group());
		paletteRoot.add(createRelationships4Group());
	}

	/**
	 * Creates "Types" palette tool group
	 * @generated
	 */
	private PaletteContainer createTypes1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Types1Group_title);
		paletteContainer.setId("createTypes1Group"); //$NON-NLS-1$
		paletteContainer.add(createClass1CreationTool());
		paletteContainer.add(createPackage2CreationTool());
		paletteContainer.add(createInterface3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "JavaBeans" palette tool group
	 * @generated
	 */
	private PaletteContainer createJavaBeans2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.JavaBeans2Group_title);
		paletteContainer.setId("createJavaBeans2Group"); //$NON-NLS-1$
		paletteContainer.add(createEntityBean1CreationTool());
		paletteContainer.add(createMessageDrivenBean2CreationTool());
		paletteContainer.add(createStatelessSessionBean3CreationTool());
		paletteContainer.add(createStatefulSessionBean4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Features" palette tool group
	 * @generated
	 */
	private PaletteContainer createFeatures3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Features3Group_title);
		paletteContainer.setId("createFeatures3Group"); //$NON-NLS-1$
		paletteContainer.add(createOperation1CreationTool());
		paletteContainer.add(createProperty2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Relationships" palette tool group
	 * @generated
	 */
	private PaletteContainer createRelationships4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Relationships4Group_title);
		paletteContainer.setId("createRelationships4Group"); //$NON-NLS-1$
		paletteContainer.add(createAssociation1CreationTool());
		paletteContainer.add(createGeneralization2CreationTool());
		paletteContainer.add(createAggregation3CreationTool());
		paletteContainer.add(createRealization4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClass1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ModelElementTypes.ClassElement_3016);
		types.add(ModelElementTypes.ClassElement_2011);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Class1CreationTool_title,
				Messages.Class1CreationTool_desc, types);
		entry.setId("createClass1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.ClassElement_3016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPackage2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Package2CreationTool_title,
				Messages.Package2CreationTool_desc,
				Collections
						.singletonList(ModelElementTypes.PackageElement_2009));
		entry.setId("createPackage2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.PackageElement_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInterface3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Interface3CreationTool_title,
				Messages.Interface3CreationTool_desc,
				Collections
						.singletonList(ModelElementTypes.InterfaceElement_2012));
		entry.setId("createInterface3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.InterfaceElement_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntityBean1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EntityBean1CreationTool_title,
				Messages.EntityBean1CreationTool_desc,
				Collections.singletonList(ModelElementTypes.EntityBean_2002));
		entry.setId("createEntityBean1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.EntityBean_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessageDrivenBean2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MessageDrivenBean2CreationTool_title,
				Messages.MessageDrivenBean2CreationTool_desc,
				Collections
						.singletonList(ModelElementTypes.MessageDrivenBean_2003));
		entry.setId("createMessageDrivenBean2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.MessageDrivenBean_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStatelessSessionBean3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StatelessSessionBean3CreationTool_title,
				Messages.StatelessSessionBean3CreationTool_desc,
				Collections
						.singletonList(ModelElementTypes.StatelessSessionBean_2007));
		entry.setId("createStatelessSessionBean3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.StatelessSessionBean_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStatefulSessionBean4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StatefulSessionBean4CreationTool_title,
				Messages.StatefulSessionBean4CreationTool_desc,
				Collections
						.singletonList(ModelElementTypes.StatefulSessionBean_2006));
		entry.setId("createStatefulSessionBean4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.StatefulSessionBean_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperation1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(ModelElementTypes.Operation_3004);
		types.add(ModelElementTypes.Operation_3006);
		types.add(ModelElementTypes.Operation_3008);
		types.add(ModelElementTypes.Operation_3010);
		types.add(ModelElementTypes.Operation_3012);
		types.add(ModelElementTypes.Operation_3015);
		types.add(ModelElementTypes.Operation_3018);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Operation1CreationTool_title,
				Messages.Operation1CreationTool_desc, types);
		entry.setId("createOperation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.Operation_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProperty2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(ModelElementTypes.Property_3003);
		types.add(ModelElementTypes.Property_3005);
		types.add(ModelElementTypes.Property_3007);
		types.add(ModelElementTypes.Property_3009);
		types.add(ModelElementTypes.Property_3011);
		types.add(ModelElementTypes.Property_3014);
		types.add(ModelElementTypes.Property_3017);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Property2CreationTool_title,
				Messages.Property2CreationTool_desc, types);
		entry.setId("createProperty2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.Property_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssociation1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Association1CreationTool_title,
				Messages.Association1CreationTool_desc,
				Collections.singletonList(ModelElementTypes.Association_4004));
		entry.setId("createAssociation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.Association_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneralization2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Generalization2CreationTool_title,
				Messages.Generalization2CreationTool_desc,
				Collections
						.singletonList(ModelElementTypes.Generalization_4002));
		entry.setId("createGeneralization2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.Generalization_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAggregation3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Aggregation3CreationTool_title,
				Messages.Aggregation3CreationTool_desc,
				Collections.singletonList(ModelElementTypes.Aggregation_4003));
		entry.setId("createAggregation3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.Aggregation_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRealization4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Realization4CreationTool_title,
				Messages.Realization4CreationTool_desc,
				Collections.singletonList(ModelElementTypes.Realization_4001));
		entry.setId("createRealization4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.Realization_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
