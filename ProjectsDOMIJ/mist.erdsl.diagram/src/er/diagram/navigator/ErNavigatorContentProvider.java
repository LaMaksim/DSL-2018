/*
 * 
 */
package er.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import er.diagram.edit.parts.AttributeDomainDomainEditPart;
import er.diagram.edit.parts.AttributeEditPart;
import er.diagram.edit.parts.CategoriesEditPart;
import er.diagram.edit.parts.CategoriesEntitiesEditPart;
import er.diagram.edit.parts.CategorisationCategorisedEntityEditPart;
import er.diagram.edit.parts.CategorisationEditPart;
import er.diagram.edit.parts.DomainEditPart;
import er.diagram.edit.parts.ERModelEditPart;
import er.diagram.edit.parts.EntityEditPart;
import er.diagram.edit.parts.EntityEntityAttributesEditPart;
import er.diagram.edit.parts.EntityEntityKeySetCompartmentEditPart;
import er.diagram.edit.parts.EntityPrimaryKeyEditPart;
import er.diagram.edit.parts.GerundEditPart;
import er.diagram.edit.parts.GerundGerundRelationshipCompartmentEditPart;
import er.diagram.edit.parts.ISAClassificationAttributeEditPart;
import er.diagram.edit.parts.ISAEditPart;
import er.diagram.edit.parts.ISASubtypesEditPart;
import er.diagram.edit.parts.IdentificationDependencyEditPart;
import er.diagram.edit.parts.IdentificationDependencyWeakEntityEditPart;
import er.diagram.edit.parts.KeyEditPart;
import er.diagram.edit.parts.KeyKeyAttributesEditPart;
import er.diagram.edit.parts.RegularEntity2EditPart;
import er.diagram.edit.parts.RegularEntity3EditPart;
import er.diagram.edit.parts.RegularEntityEditPart;
import er.diagram.edit.parts.RegularEntityEntityEditPart;
import er.diagram.edit.parts.Relationship2EditPart;
import er.diagram.edit.parts.RelationshipEditPart;
import er.diagram.edit.parts.RelationshipRelationshipAttributesEditPart;
import er.diagram.part.ErVisualIDRegistry;
import er.diagram.part.Messages;

/**
 * @generated
 */
public class ErNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public ErNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<ErNavigatorItem> result = new ArrayList<ErNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, ERModelEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof ErNavigatorGroup) {
			ErNavigatorGroup group = (ErNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof ErNavigatorItem) {
			ErNavigatorItem navigatorItem = (ErNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (ErVisualIDRegistry.getVisualID(view)) {

		case ERModelEditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			ErNavigatorGroup links = new ErNavigatorGroup(
					Messages.NavigatorGroupName_ERModel_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(EntityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(RelationshipEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(ISAEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(CategorisationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(IdentificationDependencyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(GerundEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(DomainEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(AttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(EntityEntityAttributesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(EntityPrimaryKeyEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(RelationshipRelationshipAttributesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(ISASubtypesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(ISAClassificationAttributeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(CategorisationCategorisedEntityEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(IdentificationDependencyWeakEntityEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(RegularEntityEntityEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(CategoriesEntitiesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(KeyKeyAttributesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(AttributeDomainDomainEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case DomainEditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Node sv = (Node) view;
			ErNavigatorGroup incominglinks = new ErNavigatorGroup(
					Messages.NavigatorGroupName_Domain_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(AttributeDomainDomainEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case AttributeEditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Node sv = (Node) view;
			ErNavigatorGroup incominglinks = new ErNavigatorGroup(
					Messages.NavigatorGroupName_Attribute_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(EntityEntityAttributesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(RelationshipRelationshipAttributesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(ISAClassificationAttributeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(KeyKeyAttributesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case EntityEditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Node sv = (Node) view;
			ErNavigatorGroup outgoinglinks = new ErNavigatorGroup(
					Messages.NavigatorGroupName_Entity_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ErNavigatorGroup incominglinks = new ErNavigatorGroup(
					Messages.NavigatorGroupName_Entity_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(EntityEntityKeySetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ErVisualIDRegistry.getType(KeyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(EntityEntityAttributesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(EntityPrimaryKeyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(ISASubtypesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(CategorisationCategorisedEntityEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(IdentificationDependencyWeakEntityEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(RegularEntityEntityEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(CategoriesEntitiesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case RelationshipEditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Node sv = (Node) view;
			ErNavigatorGroup outgoinglinks = new ErNavigatorGroup(
					Messages.NavigatorGroupName_Relationship_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(RegularEntityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(RelationshipRelationshipAttributesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ISAEditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Node sv = (Node) view;
			ErNavigatorGroup outgoinglinks = new ErNavigatorGroup(
					Messages.NavigatorGroupName_ISA_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(RegularEntity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(ISASubtypesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(ISAClassificationAttributeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CategorisationEditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Node sv = (Node) view;
			ErNavigatorGroup outgoinglinks = new ErNavigatorGroup(
					Messages.NavigatorGroupName_Categorisation_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(CategoriesEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(CategorisationCategorisedEntityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case IdentificationDependencyEditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Node sv = (Node) view;
			ErNavigatorGroup outgoinglinks = new ErNavigatorGroup(
					Messages.NavigatorGroupName_IdentificationDependency_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(RegularEntity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(IdentificationDependencyWeakEntityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case GerundEditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Node sv = (Node) view;
			ErNavigatorGroup incominglinks = new ErNavigatorGroup(
					Messages.NavigatorGroupName_Gerund_2009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(GerundGerundRelationshipCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ErVisualIDRegistry.getType(Relationship2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(CategorisationCategorisedEntityEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(RegularEntityEntityEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(CategoriesEntitiesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case KeyEditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Node sv = (Node) view;
			ErNavigatorGroup incominglinks = new ErNavigatorGroup(
					Messages.NavigatorGroupName_Key_3004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ErNavigatorGroup outgoinglinks = new ErNavigatorGroup(
					Messages.NavigatorGroupName_Key_3004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(EntityPrimaryKeyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(KeyKeyAttributesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RegularEntityEditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Node sv = (Node) view;
			ErNavigatorGroup outgoinglinks = new ErNavigatorGroup(
					Messages.NavigatorGroupName_RegularEntity_3005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(RegularEntityEntityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RegularEntity2EditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Node sv = (Node) view;
			ErNavigatorGroup outgoinglinks = new ErNavigatorGroup(
					Messages.NavigatorGroupName_RegularEntity_3007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(RegularEntityEntityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CategoriesEditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Node sv = (Node) view;
			ErNavigatorGroup outgoinglinks = new ErNavigatorGroup(
					Messages.NavigatorGroupName_Categories_3008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(CategoriesEntitiesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RegularEntity3EditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Node sv = (Node) view;
			ErNavigatorGroup outgoinglinks = new ErNavigatorGroup(
					Messages.NavigatorGroupName_RegularEntity_3010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(RegularEntityEntityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Relationship2EditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Node sv = (Node) view;
			ErNavigatorGroup outgoinglinks = new ErNavigatorGroup(
					Messages.NavigatorGroupName_Relationship_3011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(RegularEntityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(RelationshipRelationshipAttributesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EntityPrimaryKeyEditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ErNavigatorGroup target = new ErNavigatorGroup(
					Messages.NavigatorGroupName_EntityPrimaryKey_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ErNavigatorGroup source = new ErNavigatorGroup(
					Messages.NavigatorGroupName_EntityPrimaryKey_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(KeyEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(EntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ISASubtypesEditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ErNavigatorGroup target = new ErNavigatorGroup(
					Messages.NavigatorGroupName_ISASubtypes_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ErNavigatorGroup source = new ErNavigatorGroup(
					Messages.NavigatorGroupName_ISASubtypes_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(EntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(ISAEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ISAClassificationAttributeEditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ErNavigatorGroup target = new ErNavigatorGroup(
					Messages.NavigatorGroupName_ISAClassificationAttribute_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ErNavigatorGroup source = new ErNavigatorGroup(
					Messages.NavigatorGroupName_ISAClassificationAttribute_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(AttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(ISAEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case CategorisationCategorisedEntityEditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ErNavigatorGroup target = new ErNavigatorGroup(
					Messages.NavigatorGroupName_CategorisationCategorisedEntity_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ErNavigatorGroup source = new ErNavigatorGroup(
					Messages.NavigatorGroupName_CategorisationCategorisedEntity_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(EntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(GerundEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(CategorisationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case IdentificationDependencyWeakEntityEditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ErNavigatorGroup target = new ErNavigatorGroup(
					Messages.NavigatorGroupName_IdentificationDependencyWeakEntity_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ErNavigatorGroup source = new ErNavigatorGroup(
					Messages.NavigatorGroupName_IdentificationDependencyWeakEntity_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(EntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(IdentificationDependencyEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case RegularEntityEntityEditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ErNavigatorGroup target = new ErNavigatorGroup(
					Messages.NavigatorGroupName_RegularEntityEntity_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ErNavigatorGroup source = new ErNavigatorGroup(
					Messages.NavigatorGroupName_RegularEntityEntity_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(EntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(GerundEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(RegularEntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(RegularEntity2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ErVisualIDRegistry
							.getType(RegularEntity3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case CategoriesEntitiesEditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ErNavigatorGroup target = new ErNavigatorGroup(
					Messages.NavigatorGroupName_CategoriesEntities_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ErNavigatorGroup source = new ErNavigatorGroup(
					Messages.NavigatorGroupName_CategoriesEntities_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(EntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(GerundEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(CategoriesEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case KeyKeyAttributesEditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ErNavigatorGroup target = new ErNavigatorGroup(
					Messages.NavigatorGroupName_KeyKeyAttributes_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ErNavigatorGroup source = new ErNavigatorGroup(
					Messages.NavigatorGroupName_KeyKeyAttributes_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(AttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(KeyEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AttributeDomainDomainEditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ErNavigatorGroup target = new ErNavigatorGroup(
					Messages.NavigatorGroupName_AttributeDomainDomain_4011_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(DomainEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}

		case EntityEntityAttributesEditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ErNavigatorGroup target = new ErNavigatorGroup(
					Messages.NavigatorGroupName_EntityEntityAttributes_4012_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ErNavigatorGroup source = new ErNavigatorGroup(
					Messages.NavigatorGroupName_EntityEntityAttributes_4012_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(AttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(EntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case RelationshipRelationshipAttributesEditPart.VISUAL_ID: {
			LinkedList<ErAbstractNavigatorItem> result = new LinkedList<ErAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ErNavigatorGroup target = new ErNavigatorGroup(
					Messages.NavigatorGroupName_RelationshipRelationshipAttributes_4013_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ErNavigatorGroup source = new ErNavigatorGroup(
					Messages.NavigatorGroupName_RelationshipRelationshipAttributes_4013_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(AttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(RelationshipEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ErVisualIDRegistry.getType(Relationship2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ERModelEditPart.MODEL_ID.equals(ErVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<ErNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<ErNavigatorItem> result = new ArrayList<ErNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new ErNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<ErNavigatorItem> getForeignShortcuts(Diagram diagram,
			Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof ErAbstractNavigatorItem) {
			ErAbstractNavigatorItem abstractNavigatorItem = (ErAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
