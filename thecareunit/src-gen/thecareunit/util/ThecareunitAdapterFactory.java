/**
 */
package thecareunit.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import thecareunit.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see thecareunit.ThecareunitPackage
 * @generated
 */
public class ThecareunitAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ThecareunitPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThecareunitAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ThecareunitPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThecareunitSwitch<Adapter> modelSwitch = new ThecareunitSwitch<Adapter>() {
		@Override
		public Adapter caseTheCareUnitSystem(TheCareUnitSystem object) {
			return createTheCareUnitSystemAdapter();
		}

		@Override
		public Adapter caseAdmin(Admin object) {
			return createAdminAdapter();
		}

		@Override
		public Adapter caseDiscussion(Discussion object) {
			return createDiscussionAdapter();
		}

		@Override
		public Adapter caseDoctor(Doctor object) {
			return createDoctorAdapter();
		}

		@Override
		public Adapter casePost(Post object) {
			return createPostAdapter();
		}

		@Override
		public Adapter caseQuery(Query object) {
			return createQueryAdapter();
		}

		@Override
		public Adapter caseRecommendations(Recommendations object) {
			return createRecommendationsAdapter();
		}

		@Override
		public Adapter caseNewsfeed(Newsfeed object) {
			return createNewsfeedAdapter();
		}

		@Override
		public Adapter caseComment(Comment object) {
			return createCommentAdapter();
		}

		@Override
		public Adapter caseMessage(Message object) {
			return createMessageAdapter();
		}

		@Override
		public Adapter caseResearchPaper(ResearchPaper object) {
			return createResearchPaperAdapter();
		}

		@Override
		public Adapter caseArticle(Article object) {
			return createArticleAdapter();
		}

		@Override
		public Adapter caseReport(Report object) {
			return createReportAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link thecareunit.TheCareUnitSystem <em>The Care Unit System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see thecareunit.TheCareUnitSystem
	 * @generated
	 */
	public Adapter createTheCareUnitSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link thecareunit.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see thecareunit.Admin
	 * @generated
	 */
	public Adapter createAdminAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link thecareunit.Discussion <em>Discussion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see thecareunit.Discussion
	 * @generated
	 */
	public Adapter createDiscussionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link thecareunit.Doctor <em>Doctor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see thecareunit.Doctor
	 * @generated
	 */
	public Adapter createDoctorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link thecareunit.Post <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see thecareunit.Post
	 * @generated
	 */
	public Adapter createPostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link thecareunit.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see thecareunit.Query
	 * @generated
	 */
	public Adapter createQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link thecareunit.Recommendations <em>Recommendations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see thecareunit.Recommendations
	 * @generated
	 */
	public Adapter createRecommendationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link thecareunit.Newsfeed <em>Newsfeed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see thecareunit.Newsfeed
	 * @generated
	 */
	public Adapter createNewsfeedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link thecareunit.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see thecareunit.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link thecareunit.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see thecareunit.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link thecareunit.ResearchPaper <em>Research Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see thecareunit.ResearchPaper
	 * @generated
	 */
	public Adapter createResearchPaperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link thecareunit.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see thecareunit.Article
	 * @generated
	 */
	public Adapter createArticleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link thecareunit.Report <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see thecareunit.Report
	 * @generated
	 */
	public Adapter createReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ThecareunitAdapterFactory
