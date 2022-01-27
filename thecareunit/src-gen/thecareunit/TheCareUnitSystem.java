/**
 */
package thecareunit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>The Care Unit System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thecareunit.TheCareUnitSystem#getAdmin <em>Admin</em>}</li>
 *   <li>{@link thecareunit.TheCareUnitSystem#getDiscussions <em>Discussions</em>}</li>
 *   <li>{@link thecareunit.TheCareUnitSystem#getDoctors <em>Doctors</em>}</li>
 *   <li>{@link thecareunit.TheCareUnitSystem#getRecommendations <em>Recommendations</em>}</li>
 *   <li>{@link thecareunit.TheCareUnitSystem#getNewsfeed <em>Newsfeed</em>}</li>
 *   <li>{@link thecareunit.TheCareUnitSystem#getPosts <em>Posts</em>}</li>
 *   <li>{@link thecareunit.TheCareUnitSystem#getComments <em>Comments</em>}</li>
 *   <li>{@link thecareunit.TheCareUnitSystem#getQueries <em>Queries</em>}</li>
 *   <li>{@link thecareunit.TheCareUnitSystem#getMessages <em>Messages</em>}</li>
 * </ul>
 *
 * @see thecareunit.ThecareunitPackage#getTheCareUnitSystem()
 * @model
 * @generated
 */
public interface TheCareUnitSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin</em>' containment reference.
	 * @see #setAdmin(Admin)
	 * @see thecareunit.ThecareunitPackage#getTheCareUnitSystem_Admin()
	 * @model containment="true"
	 * @generated
	 */
	Admin getAdmin();

	/**
	 * Sets the value of the '{@link thecareunit.TheCareUnitSystem#getAdmin <em>Admin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin</em>' containment reference.
	 * @see #getAdmin()
	 * @generated
	 */
	void setAdmin(Admin value);

	/**
	 * Returns the value of the '<em><b>Discussions</b></em>' containment reference list.
	 * The list contents are of type {@link thecareunit.Discussion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discussions</em>' containment reference list.
	 * @see thecareunit.ThecareunitPackage#getTheCareUnitSystem_Discussions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Discussion> getDiscussions();

	/**
	 * Returns the value of the '<em><b>Doctors</b></em>' containment reference list.
	 * The list contents are of type {@link thecareunit.Doctor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doctors</em>' containment reference list.
	 * @see thecareunit.ThecareunitPackage#getTheCareUnitSystem_Doctors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Doctor> getDoctors();

	/**
	 * Returns the value of the '<em><b>Recommendations</b></em>' containment reference list.
	 * The list contents are of type {@link thecareunit.Recommendations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommendations</em>' containment reference list.
	 * @see thecareunit.ThecareunitPackage#getTheCareUnitSystem_Recommendations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Recommendations> getRecommendations();

	/**
	 * Returns the value of the '<em><b>Newsfeed</b></em>' containment reference list.
	 * The list contents are of type {@link thecareunit.Newsfeed}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Newsfeed</em>' containment reference list.
	 * @see thecareunit.ThecareunitPackage#getTheCareUnitSystem_Newsfeed()
	 * @model containment="true"
	 * @generated
	 */
	EList<Newsfeed> getNewsfeed();

	/**
	 * Returns the value of the '<em><b>Posts</b></em>' containment reference list.
	 * The list contents are of type {@link thecareunit.Post}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posts</em>' containment reference list.
	 * @see thecareunit.ThecareunitPackage#getTheCareUnitSystem_Posts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Post> getPosts();

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link thecareunit.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see thecareunit.ThecareunitPackage#getTheCareUnitSystem_Comments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getComments();

	/**
	 * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
	 * The list contents are of type {@link thecareunit.Query}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queries</em>' containment reference list.
	 * @see thecareunit.ThecareunitPackage#getTheCareUnitSystem_Queries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Query> getQueries();

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link thecareunit.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see thecareunit.ThecareunitPackage#getTheCareUnitSystem_Messages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getMessages();

} // TheCareUnitSystem
