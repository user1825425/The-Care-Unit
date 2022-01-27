/**
 */
package thecareunit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discussion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thecareunit.Discussion#getTitle <em>Title</em>}</li>
 *   <li>{@link thecareunit.Discussion#getMessages <em>Messages</em>}</li>
 * </ul>
 *
 * @see thecareunit.ThecareunitPackage#getDiscussion()
 * @model
 * @generated
 */
public interface Discussion extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see thecareunit.ThecareunitPackage#getDiscussion_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link thecareunit.Discussion#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' reference list.
	 * The list contents are of type {@link thecareunit.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' reference list.
	 * @see thecareunit.ThecareunitPackage#getDiscussion_Messages()
	 * @model
	 * @generated
	 */
	EList<Message> getMessages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createNewDiscussion();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void viewDiscussions();

} // Discussion
