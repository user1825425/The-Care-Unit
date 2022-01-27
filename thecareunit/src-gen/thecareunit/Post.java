/**
 */
package thecareunit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thecareunit.Post#getContent <em>Content</em>}</li>
 *   <li>{@link thecareunit.Post#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @see thecareunit.ThecareunitPackage#getPost()
 * @model
 * @generated
 */
public interface Post extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see thecareunit.ThecareunitPackage#getPost_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link thecareunit.Post#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' reference.
	 * @see #setComments(Comment)
	 * @see thecareunit.ThecareunitPackage#getPost_Comments()
	 * @model
	 * @generated
	 */
	Comment getComments();

	/**
	 * Sets the value of the '{@link thecareunit.Post#getComments <em>Comments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' reference.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(Comment value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createPost(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void editPost();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deletePost();

} // Post
