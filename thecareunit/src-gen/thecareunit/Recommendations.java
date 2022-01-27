/**
 */
package thecareunit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recommendations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thecareunit.Recommendations#getTitle <em>Title</em>}</li>
 *   <li>{@link thecareunit.Recommendations#getAuthor <em>Author</em>}</li>
 *   <li>{@link thecareunit.Recommendations#getDoctors <em>Doctors</em>}</li>
 * </ul>
 *
 * @see thecareunit.ThecareunitPackage#getRecommendations()
 * @model abstract="true"
 * @generated
 */
public interface Recommendations extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see thecareunit.ThecareunitPackage#getRecommendations_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link thecareunit.Recommendations#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see thecareunit.ThecareunitPackage#getRecommendations_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link thecareunit.Recommendations#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Doctors</b></em>' reference list.
	 * The list contents are of type {@link thecareunit.Doctor}.
	 * It is bidirectional and its opposite is '{@link thecareunit.Doctor#getRecommendations <em>Recommendations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doctors</em>' reference list.
	 * @see thecareunit.ThecareunitPackage#getRecommendations_Doctors()
	 * @see thecareunit.Doctor#getRecommendations
	 * @model opposite="recommendations"
	 * @generated
	 */
	EList<Doctor> getDoctors();

} // Recommendations
