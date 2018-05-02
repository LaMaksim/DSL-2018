/**
 */
package FileTransferPackage.provider;


import FileTransferPackage.FileTransferPackageFactory;
import FileTransferPackage.FileTransferPackagePackage;
import FileTransferPackage.Link;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link FileTransferPackage.Link} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAndPropertyDescriptor(object);
			addOrPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the And feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Link_and_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Link_and_feature", "_UI_Link_type"),
				 FileTransferPackagePackage.Literals.LINK__AND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Or feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Link_or_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Link_or_feature", "_UI_Link_type"),
				 FileTransferPackagePackage.Literals.LINK__OR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FileTransferPackagePackage.Literals.LINK__ELEMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Link.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Link"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Link link = (Link)object;
		return getString("_UI_Link_type") + " " + link.isAnd();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Link.class)) {
			case FileTransferPackagePackage.LINK__AND:
			case FileTransferPackagePackage.LINK__OR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FileTransferPackagePackage.LINK__ELEMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(FileTransferPackagePackage.Literals.LINK__ELEMENT,
				 FileTransferPackageFactory.eINSTANCE.createOnName()));

		newChildDescriptors.add
			(createChildParameter
				(FileTransferPackagePackage.Literals.LINK__ELEMENT,
				 FileTransferPackageFactory.eINSTANCE.createOnExtension()));

		newChildDescriptors.add
			(createChildParameter
				(FileTransferPackagePackage.Literals.LINK__ELEMENT,
				 FileTransferPackageFactory.eINSTANCE.createOnTime()));

		newChildDescriptors.add
			(createChildParameter
				(FileTransferPackagePackage.Literals.LINK__ELEMENT,
				 FileTransferPackageFactory.eINSTANCE.createOnAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(FileTransferPackagePackage.Literals.LINK__ELEMENT,
				 FileTransferPackageFactory.eINSTANCE.createOnTags()));

		newChildDescriptors.add
			(createChildParameter
				(FileTransferPackagePackage.Literals.LINK__ELEMENT,
				 FileTransferPackageFactory.eINSTANCE.createOnSize()));

		newChildDescriptors.add
			(createChildParameter
				(FileTransferPackagePackage.Literals.LINK__ELEMENT,
				 FileTransferPackageFactory.eINSTANCE.createFilterContainer()));

		newChildDescriptors.add
			(createChildParameter
				(FileTransferPackagePackage.Literals.LINK__ELEMENT,
				 FileTransferPackageFactory.eINSTANCE.createIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(FileTransferPackagePackage.Literals.LINK__ELEMENT,
				 FileTransferPackageFactory.eINSTANCE.createOnType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return File_transfer_metamodelEditPlugin.INSTANCE;
	}

}
