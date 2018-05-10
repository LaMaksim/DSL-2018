/*
 * 
 */
package er.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import er.diagram.part.ErVisualIDRegistry;

/**
 * @generated
 */
public class ErNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7022;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7021;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof ErNavigatorItem) {
			ErNavigatorItem item = (ErNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ErVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
