package components.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import components.diagram.part.ModelVisualIDRegistry;

/**
 * @generated
 */
public class ModelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7006;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof ModelNavigatorItem) {
			ModelNavigatorItem item = (ModelNavigatorItem) element;
			return ModelVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
