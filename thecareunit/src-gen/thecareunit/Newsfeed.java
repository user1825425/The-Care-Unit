/**
 */
package thecareunit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Newsfeed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thecareunit.Newsfeed#getNotification <em>Notification</em>}</li>
 *   <li>{@link thecareunit.Newsfeed#getPosts <em>Posts</em>}</li>
 * </ul>
 *
 * @see thecareunit.ThecareunitPackage#getNewsfeed()
 * @model
 * @generated
 */
public interface Newsfeed extends EObject {
	/**
	 * Returns the value of the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification</em>' attribute.
	 * @see #setNotification(String)
	 * @see thecareunit.ThecareunitPackage#getNewsfeed_Notification()
	 * @model
	 * @generated
	 */
	String getNotification();

	/**
	 * Sets the value of the '{@link thecareunit.Newsfeed#getNotification <em>Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification</em>' attribute.
	 * @see #getNotification()
	 * @generated
	 */
	void setNotification(String value);

	/**
	 * Returns the value of the '<em><b>Posts</b></em>' reference list.
	 * The list contents are of type {@link thecareunit.Post}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posts</em>' reference list.
	 * @see thecareunit.ThecareunitPackage#getNewsfeed_Posts()
	 * @model
	 * @generated
	 */
	EList<Post> getPosts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void viewNewsfeed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void viewNotifications();

} // Newsfeed
