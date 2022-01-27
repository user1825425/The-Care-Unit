/**
 */
package thecareunit.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import thecareunit.Newsfeed;
import thecareunit.Post;
import thecareunit.ThecareunitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Newsfeed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link thecareunit.impl.NewsfeedImpl#getNotification <em>Notification</em>}</li>
 *   <li>{@link thecareunit.impl.NewsfeedImpl#getPosts <em>Posts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NewsfeedImpl extends MinimalEObjectImpl.Container implements Newsfeed {
	/**
	 * The default value of the '{@link #getNotification() <em>Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotification()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotification() <em>Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotification()
	 * @generated
	 * @ordered
	 */
	protected String notification = NOTIFICATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPosts() <em>Posts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosts()
	 * @generated
	 * @ordered
	 */
	protected EList<Post> posts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewsfeedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThecareunitPackage.Literals.NEWSFEED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotification() {
		return notification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotification(String newNotification) {
		String oldNotification = notification;
		notification = newNotification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThecareunitPackage.NEWSFEED__NOTIFICATION,
					oldNotification, notification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Post> getPosts() {
		if (posts == null) {
			posts = new EObjectResolvingEList<Post>(Post.class, this, ThecareunitPackage.NEWSFEED__POSTS);
		}
		return posts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void viewNewsfeed() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void viewNotifications() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ThecareunitPackage.NEWSFEED__NOTIFICATION:
			return getNotification();
		case ThecareunitPackage.NEWSFEED__POSTS:
			return getPosts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ThecareunitPackage.NEWSFEED__NOTIFICATION:
			setNotification((String) newValue);
			return;
		case ThecareunitPackage.NEWSFEED__POSTS:
			getPosts().clear();
			getPosts().addAll((Collection<? extends Post>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ThecareunitPackage.NEWSFEED__NOTIFICATION:
			setNotification(NOTIFICATION_EDEFAULT);
			return;
		case ThecareunitPackage.NEWSFEED__POSTS:
			getPosts().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ThecareunitPackage.NEWSFEED__NOTIFICATION:
			return NOTIFICATION_EDEFAULT == null ? notification != null : !NOTIFICATION_EDEFAULT.equals(notification);
		case ThecareunitPackage.NEWSFEED__POSTS:
			return posts != null && !posts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ThecareunitPackage.NEWSFEED___VIEW_NEWSFEED:
			viewNewsfeed();
			return null;
		case ThecareunitPackage.NEWSFEED___VIEW_NOTIFICATIONS:
			viewNotifications();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (notification: ");
		result.append(notification);
		result.append(')');
		return result.toString();
	}

} //NewsfeedImpl
