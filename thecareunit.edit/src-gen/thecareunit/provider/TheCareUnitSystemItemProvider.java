/**
 */
package thecareunit.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import thecareunit.TheCareUnitSystem;
import thecareunit.ThecareunitFactory;
import thecareunit.ThecareunitPackage;

/**
 * This is the item provider adapter for a {@link thecareunit.TheCareUnitSystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TheCareUnitSystemItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheCareUnitSystemItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ThecareunitPackage.Literals.THE_CARE_UNIT_SYSTEM__ADMIN);
			childrenFeatures.add(ThecareunitPackage.Literals.THE_CARE_UNIT_SYSTEM__DISCUSSIONS);
			childrenFeatures.add(ThecareunitPackage.Literals.THE_CARE_UNIT_SYSTEM__DOCTORS);
			childrenFeatures.add(ThecareunitPackage.Literals.THE_CARE_UNIT_SYSTEM__RECOMMENDATIONS);
			childrenFeatures.add(ThecareunitPackage.Literals.THE_CARE_UNIT_SYSTEM__NEWSFEED);
			childrenFeatures.add(ThecareunitPackage.Literals.THE_CARE_UNIT_SYSTEM__POSTS);
			childrenFeatures.add(ThecareunitPackage.Literals.THE_CARE_UNIT_SYSTEM__COMMENTS);
			childrenFeatures.add(ThecareunitPackage.Literals.THE_CARE_UNIT_SYSTEM__QUERIES);
			childrenFeatures.add(ThecareunitPackage.Literals.THE_CARE_UNIT_SYSTEM__MESSAGES);
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
	 * This returns TheCareUnitSystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TheCareUnitSystem"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_TheCareUnitSystem_type");
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

		switch (notification.getFeatureID(TheCareUnitSystem.class)) {
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__ADMIN:
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__DISCUSSIONS:
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__DOCTORS:
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__RECOMMENDATIONS:
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__NEWSFEED:
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__POSTS:
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__COMMENTS:
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__QUERIES:
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__MESSAGES:
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

		newChildDescriptors.add(createChildParameter(ThecareunitPackage.Literals.THE_CARE_UNIT_SYSTEM__ADMIN,
				ThecareunitFactory.eINSTANCE.createAdmin()));

		newChildDescriptors.add(createChildParameter(ThecareunitPackage.Literals.THE_CARE_UNIT_SYSTEM__DISCUSSIONS,
				ThecareunitFactory.eINSTANCE.createDiscussion()));

		newChildDescriptors.add(createChildParameter(ThecareunitPackage.Literals.THE_CARE_UNIT_SYSTEM__DOCTORS,
				ThecareunitFactory.eINSTANCE.createDoctor()));

		newChildDescriptors.add(createChildParameter(ThecareunitPackage.Literals.THE_CARE_UNIT_SYSTEM__RECOMMENDATIONS,
				ThecareunitFactory.eINSTANCE.createResearchPaper()));

		newChildDescriptors.add(createChildParameter(ThecareunitPackage.Literals.THE_CARE_UNIT_SYSTEM__RECOMMENDATIONS,
				ThecareunitFactory.eINSTANCE.createArticle()));

		newChildDescriptors.add(createChildParameter(ThecareunitPackage.Literals.THE_CARE_UNIT_SYSTEM__RECOMMENDATIONS,
				ThecareunitFactory.eINSTANCE.createReport()));

		newChildDescriptors.add(createChildParameter(ThecareunitPackage.Literals.THE_CARE_UNIT_SYSTEM__NEWSFEED,
				ThecareunitFactory.eINSTANCE.createNewsfeed()));

		newChildDescriptors.add(createChildParameter(ThecareunitPackage.Literals.THE_CARE_UNIT_SYSTEM__POSTS,
				ThecareunitFactory.eINSTANCE.createPost()));

		newChildDescriptors.add(createChildParameter(ThecareunitPackage.Literals.THE_CARE_UNIT_SYSTEM__COMMENTS,
				ThecareunitFactory.eINSTANCE.createComment()));

		newChildDescriptors.add(createChildParameter(ThecareunitPackage.Literals.THE_CARE_UNIT_SYSTEM__QUERIES,
				ThecareunitFactory.eINSTANCE.createQuery()));

		newChildDescriptors.add(createChildParameter(ThecareunitPackage.Literals.THE_CARE_UNIT_SYSTEM__MESSAGES,
				ThecareunitFactory.eINSTANCE.createMessage()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ThecareunitEditPlugin.INSTANCE;
	}

}
