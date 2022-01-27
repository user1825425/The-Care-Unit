/**
 */
package thecareunit.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

import thecareunit.Doctor;
import thecareunit.ThecareunitPackage;

/**
 * This is the item provider adapter for a {@link thecareunit.Doctor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DoctorItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoctorItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addEmailPropertyDescriptor(object);
			addSpecializationPropertyDescriptor(object);
			addFieldOfInterestPropertyDescriptor(object);
			addHospitalPropertyDescriptor(object);
			addLocationPropertyDescriptor(object);
			addContactPropertyDescriptor(object);
			addCommentsPropertyDescriptor(object);
			addRecommendationsPropertyDescriptor(object);
			addDiscussionsPropertyDescriptor(object);
			addMessagesPropertyDescriptor(object);
			addNewsfeedPropertyDescriptor(object);
			addPostsPropertyDescriptor(object);
			addQueriesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Doctor_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Doctor_name_feature", "_UI_Doctor_type"),
						ThecareunitPackage.Literals.DOCTOR__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Email feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Doctor_email_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Doctor_email_feature", "_UI_Doctor_type"),
						ThecareunitPackage.Literals.DOCTOR__EMAIL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Specialization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecializationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Doctor_specialization_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Doctor_specialization_feature",
								"_UI_Doctor_type"),
						ThecareunitPackage.Literals.DOCTOR__SPECIALIZATION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Field Of Interest feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFieldOfInterestPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Doctor_fieldOfInterest_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Doctor_fieldOfInterest_feature",
								"_UI_Doctor_type"),
						ThecareunitPackage.Literals.DOCTOR__FIELD_OF_INTEREST, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Hospital feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHospitalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Doctor_hospital_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Doctor_hospital_feature",
								"_UI_Doctor_type"),
						ThecareunitPackage.Literals.DOCTOR__HOSPITAL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Doctor_location_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Doctor_location_feature",
								"_UI_Doctor_type"),
						ThecareunitPackage.Literals.DOCTOR__LOCATION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Contact feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContactPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Doctor_contact_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Doctor_contact_feature",
								"_UI_Doctor_type"),
						ThecareunitPackage.Literals.DOCTOR__CONTACT, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Comments feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Doctor_comments_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Doctor_comments_feature",
								"_UI_Doctor_type"),
						ThecareunitPackage.Literals.DOCTOR__COMMENTS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Recommendations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecommendationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Doctor_recommendations_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Doctor_recommendations_feature",
								"_UI_Doctor_type"),
						ThecareunitPackage.Literals.DOCTOR__RECOMMENDATIONS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Discussions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiscussionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Doctor_discussions_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Doctor_discussions_feature",
								"_UI_Doctor_type"),
						ThecareunitPackage.Literals.DOCTOR__DISCUSSIONS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Messages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Doctor_messages_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Doctor_messages_feature",
								"_UI_Doctor_type"),
						ThecareunitPackage.Literals.DOCTOR__MESSAGES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Newsfeed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNewsfeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Doctor_newsfeed_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Doctor_newsfeed_feature",
								"_UI_Doctor_type"),
						ThecareunitPackage.Literals.DOCTOR__NEWSFEED, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Posts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPostsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Doctor_posts_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Doctor_posts_feature", "_UI_Doctor_type"),
						ThecareunitPackage.Literals.DOCTOR__POSTS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Queries feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQueriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Doctor_queries_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Doctor_queries_feature",
								"_UI_Doctor_type"),
						ThecareunitPackage.Literals.DOCTOR__QUERIES, true, false, true, null, null, null));
	}

	/**
	 * This returns Doctor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Doctor"));
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
		String label = ((Doctor) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Doctor_type")
				: getString("_UI_Doctor_type") + " " + label;
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

		switch (notification.getFeatureID(Doctor.class)) {
		case ThecareunitPackage.DOCTOR__NAME:
		case ThecareunitPackage.DOCTOR__EMAIL:
		case ThecareunitPackage.DOCTOR__SPECIALIZATION:
		case ThecareunitPackage.DOCTOR__FIELD_OF_INTEREST:
		case ThecareunitPackage.DOCTOR__HOSPITAL:
		case ThecareunitPackage.DOCTOR__LOCATION:
		case ThecareunitPackage.DOCTOR__CONTACT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
