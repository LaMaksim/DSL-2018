/*
 * 
 */
package er.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import er.diagram.edit.parts.ERModelEditPart;
import er.diagram.edit.parts.ErEditPartFactory;
import er.diagram.part.ErVisualIDRegistry;

/**
 * @generated
 */
public class ErEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public ErEditPartProvider() {
		super(new ErEditPartFactory(), ErVisualIDRegistry.TYPED_INSTANCE,
				ERModelEditPart.MODEL_ID);
	}

}
