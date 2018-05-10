/*
 * 
 */
package er.diagram.part;

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

import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;
import er.diagram.providers.ErElementTypes;

/**
 * @generated
 */
public class ErPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAttribute1CreationTool());
		paletteContainer.add(createAttributeDomain2CreationTool());
		paletteContainer.add(createCategories3CreationTool());
		paletteContainer.add(createCategorisation4CreationTool());
		paletteContainer.add(createDomain5CreationTool());
		paletteContainer.add(createERModel6CreationTool());
		paletteContainer.add(createEntity7CreationTool());
		paletteContainer.add(createGerund8CreationTool());
		paletteContainer.add(createISA9CreationTool());
		paletteContainer.add(createIdentificationDependency10CreationTool());
		paletteContainer.add(createKey11CreationTool());
		paletteContainer.add(createRegularEntity12CreationTool());
		paletteContainer.add(createRelationship13CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createCategorisedEntity1CreationTool());
		paletteContainer.add(createClassificationAttribute2CreationTool());
		paletteContainer.add(createDomain3CreationTool());
		paletteContainer.add(createEntities4CreationTool());
		paletteContainer.add(createEntity5CreationTool());
		paletteContainer.add(createEntityAttributes6CreationTool());
		paletteContainer.add(createKeyAttributes7CreationTool());
		paletteContainer.add(createPrimaryKey8CreationTool());
		paletteContainer.add(createRelationshipAttributes9CreationTool());
		paletteContainer.add(createSubtypes10CreationTool());
		paletteContainer.add(createWeakEntity11CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Attribute1CreationTool_title,
				Messages.Attribute1CreationTool_desc,
				Collections.singletonList(ErElementTypes.Attribute_2003));
		entry.setId("createAttribute1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ErElementTypes
				.getImageDescriptor(ErElementTypes.Attribute_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributeDomain2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.AttributeDomain2CreationTool_title,
				Messages.AttributeDomain2CreationTool_desc, null, null) {
		};
		entry.setId("createAttributeDomain2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCategories3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Categories3CreationTool_title,
				Messages.Categories3CreationTool_desc,
				Collections.singletonList(ErElementTypes.Categories_3008));
		entry.setId("createCategories3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ErElementTypes
				.getImageDescriptor(ErElementTypes.Categories_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCategorisation4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Categorisation4CreationTool_title,
				Messages.Categorisation4CreationTool_desc,
				Collections.singletonList(ErElementTypes.Categorisation_2007));
		entry.setId("createCategorisation4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ErElementTypes
				.getImageDescriptor(ErElementTypes.Categorisation_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomain5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Domain5CreationTool_title,
				Messages.Domain5CreationTool_desc,
				Collections.singletonList(ErElementTypes.Domain_2002));
		entry.setId("createDomain5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ErElementTypes
				.getImageDescriptor(ErElementTypes.Domain_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createERModel6CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.ERModel6CreationTool_title,
				Messages.ERModel6CreationTool_desc, null, null) {
		};
		entry.setId("createERModel6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntity7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Entity7CreationTool_title,
				Messages.Entity7CreationTool_desc,
				Collections.singletonList(ErElementTypes.Entity_2004));
		entry.setId("createEntity7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ErElementTypes
				.getImageDescriptor(ErElementTypes.Entity_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGerund8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Gerund8CreationTool_title,
				Messages.Gerund8CreationTool_desc,
				Collections.singletonList(ErElementTypes.Gerund_2009));
		entry.setId("createGerund8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ErElementTypes
				.getImageDescriptor(ErElementTypes.Gerund_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createISA9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ISA9CreationTool_title,
				Messages.ISA9CreationTool_desc,
				Collections.singletonList(ErElementTypes.ISA_2006));
		entry.setId("createISA9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ErElementTypes
				.getImageDescriptor(ErElementTypes.ISA_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIdentificationDependency10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.IdentificationDependency10CreationTool_title,
				Messages.IdentificationDependency10CreationTool_desc,
				Collections
						.singletonList(ErElementTypes.IdentificationDependency_2008));
		entry.setId("createIdentificationDependency10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ErElementTypes
				.getImageDescriptor(ErElementTypes.IdentificationDependency_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createKey11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Key11CreationTool_title,
				Messages.Key11CreationTool_desc,
				Collections.singletonList(ErElementTypes.Key_3004));
		entry.setId("createKey11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ErElementTypes
				.getImageDescriptor(ErElementTypes.Key_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegularEntity12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ErElementTypes.RegularEntity_3005);
		types.add(ErElementTypes.RegularEntity_3007);
		types.add(ErElementTypes.RegularEntity_3010);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.RegularEntity12CreationTool_title,
				Messages.RegularEntity12CreationTool_desc, types);
		entry.setId("createRegularEntity12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ErElementTypes
				.getImageDescriptor(ErElementTypes.RegularEntity_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationship13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ErElementTypes.Relationship_2005);
		types.add(ErElementTypes.Relationship_3011);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Relationship13CreationTool_title,
				Messages.Relationship13CreationTool_desc, types);
		entry.setId("createRelationship13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ErElementTypes
				.getImageDescriptor(ErElementTypes.Relationship_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCategorisedEntity1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.CategorisedEntity1CreationTool_title,
				Messages.CategorisedEntity1CreationTool_desc,
				Collections
						.singletonList(ErElementTypes.CategorisationCategorisedEntity_4005));
		entry.setId("createCategorisedEntity1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ErElementTypes
				.getImageDescriptor(ErElementTypes.CategorisationCategorisedEntity_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClassificationAttribute2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ClassificationAttribute2CreationTool_title,
				Messages.ClassificationAttribute2CreationTool_desc,
				Collections
						.singletonList(ErElementTypes.ISAClassificationAttribute_4004));
		entry.setId("createClassificationAttribute2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ErElementTypes
				.getImageDescriptor(ErElementTypes.ISAClassificationAttribute_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomain3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Domain3CreationTool_title,
				Messages.Domain3CreationTool_desc,
				Collections
						.singletonList(ErElementTypes.AttributeDomainDomain_4011));
		entry.setId("createDomain3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ErElementTypes
				.getImageDescriptor(ErElementTypes.AttributeDomainDomain_4011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntities4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Entities4CreationTool_title,
				Messages.Entities4CreationTool_desc,
				Collections
						.singletonList(ErElementTypes.CategoriesEntities_4008));
		entry.setId("createEntities4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ErElementTypes
				.getImageDescriptor(ErElementTypes.CategoriesEntities_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntity5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Entity5CreationTool_title,
				Messages.Entity5CreationTool_desc,
				Collections
						.singletonList(ErElementTypes.RegularEntityEntity_4007));
		entry.setId("createEntity5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ErElementTypes
				.getImageDescriptor(ErElementTypes.RegularEntityEntity_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntityAttributes6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.EntityAttributes6CreationTool_title,
				Messages.EntityAttributes6CreationTool_desc,
				Collections
						.singletonList(ErElementTypes.EntityEntityAttributes_4012));
		entry.setId("createEntityAttributes6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ErElementTypes
				.getImageDescriptor(ErElementTypes.EntityEntityAttributes_4012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createKeyAttributes7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.KeyAttributes7CreationTool_title,
				Messages.KeyAttributes7CreationTool_desc,
				Collections.singletonList(ErElementTypes.KeyKeyAttributes_4009));
		entry.setId("createKeyAttributes7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ErElementTypes
				.getImageDescriptor(ErElementTypes.KeyKeyAttributes_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrimaryKey8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.PrimaryKey8CreationTool_title,
				Messages.PrimaryKey8CreationTool_desc,
				Collections.singletonList(ErElementTypes.EntityPrimaryKey_4001));
		entry.setId("createPrimaryKey8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ErElementTypes
				.getImageDescriptor(ErElementTypes.EntityPrimaryKey_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationshipAttributes9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.RelationshipAttributes9CreationTool_title,
				Messages.RelationshipAttributes9CreationTool_desc,
				Collections
						.singletonList(ErElementTypes.RelationshipRelationshipAttributes_4013));
		entry.setId("createRelationshipAttributes9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ErElementTypes
				.getImageDescriptor(ErElementTypes.RelationshipRelationshipAttributes_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubtypes10CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Subtypes10CreationTool_title,
				Messages.Subtypes10CreationTool_desc,
				Collections.singletonList(ErElementTypes.ISASubtypes_4003));
		entry.setId("createSubtypes10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ErElementTypes
				.getImageDescriptor(ErElementTypes.ISASubtypes_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWeakEntity11CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.WeakEntity11CreationTool_title,
				Messages.WeakEntity11CreationTool_desc,
				Collections
						.singletonList(ErElementTypes.IdentificationDependencyWeakEntity_4006));
		entry.setId("createWeakEntity11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ErElementTypes
				.getImageDescriptor(ErElementTypes.IdentificationDependencyWeakEntity_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
}
