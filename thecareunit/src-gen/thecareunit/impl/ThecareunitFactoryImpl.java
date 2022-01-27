/**
 */
package thecareunit.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import thecareunit.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThecareunitFactoryImpl extends EFactoryImpl implements ThecareunitFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ThecareunitFactory init() {
		try {
			ThecareunitFactory theThecareunitFactory = (ThecareunitFactory) EPackage.Registry.INSTANCE
					.getEFactory(ThecareunitPackage.eNS_URI);
			if (theThecareunitFactory != null) {
				return theThecareunitFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ThecareunitFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThecareunitFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM:
			return createTheCareUnitSystem();
		case ThecareunitPackage.ADMIN:
			return createAdmin();
		case ThecareunitPackage.DISCUSSION:
			return createDiscussion();
		case ThecareunitPackage.DOCTOR:
			return createDoctor();
		case ThecareunitPackage.POST:
			return createPost();
		case ThecareunitPackage.QUERY:
			return createQuery();
		case ThecareunitPackage.NEWSFEED:
			return createNewsfeed();
		case ThecareunitPackage.COMMENT:
			return createComment();
		case ThecareunitPackage.MESSAGE:
			return createMessage();
		case ThecareunitPackage.RESEARCH_PAPER:
			return createResearchPaper();
		case ThecareunitPackage.ARTICLE:
			return createArticle();
		case ThecareunitPackage.REPORT:
			return createReport();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheCareUnitSystem createTheCareUnitSystem() {
		TheCareUnitSystemImpl theCareUnitSystem = new TheCareUnitSystemImpl();
		return theCareUnitSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Admin createAdmin() {
		AdminImpl admin = new AdminImpl();
		return admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discussion createDiscussion() {
		DiscussionImpl discussion = new DiscussionImpl();
		return discussion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Doctor createDoctor() {
		DoctorImpl doctor = new DoctorImpl();
		return doctor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Post createPost() {
		PostImpl post = new PostImpl();
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Newsfeed createNewsfeed() {
		NewsfeedImpl newsfeed = new NewsfeedImpl();
		return newsfeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchPaper createResearchPaper() {
		ResearchPaperImpl researchPaper = new ResearchPaperImpl();
		return researchPaper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Article createArticle() {
		ArticleImpl article = new ArticleImpl();
		return article;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Report createReport() {
		ReportImpl report = new ReportImpl();
		return report;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThecareunitPackage getThecareunitPackage() {
		return (ThecareunitPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ThecareunitPackage getPackage() {
		return ThecareunitPackage.eINSTANCE;
	}

} //ThecareunitFactoryImpl
