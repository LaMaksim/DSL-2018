/*
 * 
 */
package er.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import er.diagram.providers.ErElementTypes;
import er.diagram.providers.ErModelingAssistantProvider;

/**
 * @generated
 */
public class ErModelingAssistantProviderOfERModelEditPart extends
		ErModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(8);
		types.add(ErElementTypes.Entity_2004);
		types.add(ErElementTypes.Relationship_2005);
		types.add(ErElementTypes.ISA_2006);
		types.add(ErElementTypes.Categorisation_2007);
		types.add(ErElementTypes.IdentificationDependency_2008);
		types.add(ErElementTypes.Gerund_2009);
		types.add(ErElementTypes.Domain_2002);
		types.add(ErElementTypes.Attribute_2003);
		return types;
	}

}
