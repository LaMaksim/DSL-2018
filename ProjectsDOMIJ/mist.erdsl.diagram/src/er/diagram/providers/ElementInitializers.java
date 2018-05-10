/*
 * 
 */
package er.diagram.providers;

import er.diagram.part.ErDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ErDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			ErDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
