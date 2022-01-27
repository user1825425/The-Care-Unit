/**
 */
package thecareunit;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see thecareunit.ThecareunitPackage
 * @generated
 */
public interface ThecareunitFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ThecareunitFactory eINSTANCE = thecareunit.impl.ThecareunitFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>The Care Unit System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>The Care Unit System</em>'.
	 * @generated
	 */
	TheCareUnitSystem createTheCareUnitSystem();

	/**
	 * Returns a new object of class '<em>Admin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Admin</em>'.
	 * @generated
	 */
	Admin createAdmin();

	/**
	 * Returns a new object of class '<em>Discussion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discussion</em>'.
	 * @generated
	 */
	Discussion createDiscussion();

	/**
	 * Returns a new object of class '<em>Doctor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doctor</em>'.
	 * @generated
	 */
	Doctor createDoctor();

	/**
	 * Returns a new object of class '<em>Post</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Post</em>'.
	 * @generated
	 */
	Post createPost();

	/**
	 * Returns a new object of class '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query</em>'.
	 * @generated
	 */
	Query createQuery();

	/**
	 * Returns a new object of class '<em>Newsfeed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Newsfeed</em>'.
	 * @generated
	 */
	Newsfeed createNewsfeed();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>Research Paper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Research Paper</em>'.
	 * @generated
	 */
	ResearchPaper createResearchPaper();

	/**
	 * Returns a new object of class '<em>Article</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Article</em>'.
	 * @generated
	 */
	Article createArticle();

	/**
	 * Returns a new object of class '<em>Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Report</em>'.
	 * @generated
	 */
	Report createReport();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ThecareunitPackage getThecareunitPackage();

} //ThecareunitFactory
