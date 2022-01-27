/**
 */
package thecareunit.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import thecareunit.Admin;
import thecareunit.Article;
import thecareunit.Comment;
import thecareunit.Discussion;
import thecareunit.Doctor;
import thecareunit.Message;
import thecareunit.Newsfeed;
import thecareunit.Post;
import thecareunit.Query;
import thecareunit.Recommendations;
import thecareunit.Report;
import thecareunit.ResearchPaper;
import thecareunit.TheCareUnitSystem;
import thecareunit.ThecareunitFactory;
import thecareunit.ThecareunitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThecareunitPackageImpl extends EPackageImpl implements ThecareunitPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass theCareUnitSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adminEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discussionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doctorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recommendationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newsfeedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass researchPaperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass articleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see thecareunit.ThecareunitPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ThecareunitPackageImpl() {
		super(eNS_URI, ThecareunitFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ThecareunitPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ThecareunitPackage init() {
		if (isInited)
			return (ThecareunitPackage) EPackage.Registry.INSTANCE.getEPackage(ThecareunitPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredThecareunitPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ThecareunitPackageImpl theThecareunitPackage = registeredThecareunitPackage instanceof ThecareunitPackageImpl
				? (ThecareunitPackageImpl) registeredThecareunitPackage
				: new ThecareunitPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theThecareunitPackage.createPackageContents();

		// Initialize created meta-data
		theThecareunitPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theThecareunitPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ThecareunitPackage.eNS_URI, theThecareunitPackage);
		return theThecareunitPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTheCareUnitSystem() {
		return theCareUnitSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTheCareUnitSystem_Admin() {
		return (EReference) theCareUnitSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTheCareUnitSystem_Discussions() {
		return (EReference) theCareUnitSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTheCareUnitSystem_Doctors() {
		return (EReference) theCareUnitSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTheCareUnitSystem_Recommendations() {
		return (EReference) theCareUnitSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTheCareUnitSystem_Newsfeed() {
		return (EReference) theCareUnitSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTheCareUnitSystem_Posts() {
		return (EReference) theCareUnitSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTheCareUnitSystem_Comments() {
		return (EReference) theCareUnitSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTheCareUnitSystem_Queries() {
		return (EReference) theCareUnitSystemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTheCareUnitSystem_Messages() {
		return (EReference) theCareUnitSystemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdmin() {
		return adminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdmin_Name() {
		return (EAttribute) adminEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdmin_Queries() {
		return (EReference) adminEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdmin__HandleQueries() {
		return adminEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscussion() {
		return discussionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscussion_Title() {
		return (EAttribute) discussionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscussion_Messages() {
		return (EReference) discussionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiscussion__CreateNewDiscussion() {
		return discussionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiscussion__ViewDiscussions() {
		return discussionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoctor() {
		return doctorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoctor_Name() {
		return (EAttribute) doctorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoctor_Email() {
		return (EAttribute) doctorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoctor_Specialization() {
		return (EAttribute) doctorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoctor_FieldOfInterest() {
		return (EAttribute) doctorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoctor_Hospital() {
		return (EAttribute) doctorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoctor_Location() {
		return (EAttribute) doctorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoctor_Contact() {
		return (EAttribute) doctorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctor_Comments() {
		return (EReference) doctorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctor_Recommendations() {
		return (EReference) doctorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctor_Discussions() {
		return (EReference) doctorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctor_Messages() {
		return (EReference) doctorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctor_Newsfeed() {
		return (EReference) doctorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctor_Posts() {
		return (EReference) doctorEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctor_Queries() {
		return (EReference) doctorEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDoctor__SearchDoctor__String() {
		return doctorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDoctor__Followdoctor() {
		return doctorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDoctor__EditProfileInformation() {
		return doctorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDoctor__ViewProfile() {
		return doctorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDoctor__SendQuery() {
		return doctorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDoctor__ViewRecommendations() {
		return doctorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPost() {
		return postEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPost_Content() {
		return (EAttribute) postEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPost_Comments() {
		return (EReference) postEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPost__CreatePost__String() {
		return postEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPost__EditPost() {
		return postEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPost__DeletePost() {
		return postEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuery() {
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Title() {
		return (EAttribute) queryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Query() {
		return (EAttribute) queryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getQuery__ViewQuery() {
		return queryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecommendations() {
		return recommendationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecommendations_Title() {
		return (EAttribute) recommendationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecommendations_Author() {
		return (EAttribute) recommendationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecommendations_Doctors() {
		return (EReference) recommendationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewsfeed() {
		return newsfeedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNewsfeed_Notification() {
		return (EAttribute) newsfeedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewsfeed_Posts() {
		return (EReference) newsfeedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNewsfeed__ViewNewsfeed() {
		return newsfeedEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNewsfeed__ViewNotifications() {
		return newsfeedEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Comment() {
		return (EAttribute) commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComment__AddComment__String() {
		return commentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComment__EditComment() {
		return commentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComment__DeleteComment() {
		return commentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Message() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessage__SendMessage() {
		return messageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessage__ViewMessages() {
		return messageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResearchPaper() {
		return researchPaperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResearchPaper__ViewResearchPaper() {
		return researchPaperEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResearchPaper__DownloadPaper() {
		return researchPaperEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArticle() {
		return articleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArticle__ViewArticle() {
		return articleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArticle__DownloadArticle() {
		return articleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReport() {
		return reportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReport__ViewReport() {
		return reportEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReport__DownloadReport() {
		return reportEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThecareunitFactory getThecareunitFactory() {
		return (ThecareunitFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		theCareUnitSystemEClass = createEClass(THE_CARE_UNIT_SYSTEM);
		createEReference(theCareUnitSystemEClass, THE_CARE_UNIT_SYSTEM__ADMIN);
		createEReference(theCareUnitSystemEClass, THE_CARE_UNIT_SYSTEM__DISCUSSIONS);
		createEReference(theCareUnitSystemEClass, THE_CARE_UNIT_SYSTEM__DOCTORS);
		createEReference(theCareUnitSystemEClass, THE_CARE_UNIT_SYSTEM__RECOMMENDATIONS);
		createEReference(theCareUnitSystemEClass, THE_CARE_UNIT_SYSTEM__NEWSFEED);
		createEReference(theCareUnitSystemEClass, THE_CARE_UNIT_SYSTEM__POSTS);
		createEReference(theCareUnitSystemEClass, THE_CARE_UNIT_SYSTEM__COMMENTS);
		createEReference(theCareUnitSystemEClass, THE_CARE_UNIT_SYSTEM__QUERIES);
		createEReference(theCareUnitSystemEClass, THE_CARE_UNIT_SYSTEM__MESSAGES);

		adminEClass = createEClass(ADMIN);
		createEAttribute(adminEClass, ADMIN__NAME);
		createEReference(adminEClass, ADMIN__QUERIES);
		createEOperation(adminEClass, ADMIN___HANDLE_QUERIES);

		discussionEClass = createEClass(DISCUSSION);
		createEAttribute(discussionEClass, DISCUSSION__TITLE);
		createEReference(discussionEClass, DISCUSSION__MESSAGES);
		createEOperation(discussionEClass, DISCUSSION___CREATE_NEW_DISCUSSION);
		createEOperation(discussionEClass, DISCUSSION___VIEW_DISCUSSIONS);

		doctorEClass = createEClass(DOCTOR);
		createEAttribute(doctorEClass, DOCTOR__NAME);
		createEAttribute(doctorEClass, DOCTOR__EMAIL);
		createEAttribute(doctorEClass, DOCTOR__SPECIALIZATION);
		createEAttribute(doctorEClass, DOCTOR__FIELD_OF_INTEREST);
		createEAttribute(doctorEClass, DOCTOR__HOSPITAL);
		createEAttribute(doctorEClass, DOCTOR__LOCATION);
		createEAttribute(doctorEClass, DOCTOR__CONTACT);
		createEReference(doctorEClass, DOCTOR__COMMENTS);
		createEReference(doctorEClass, DOCTOR__RECOMMENDATIONS);
		createEReference(doctorEClass, DOCTOR__DISCUSSIONS);
		createEReference(doctorEClass, DOCTOR__MESSAGES);
		createEReference(doctorEClass, DOCTOR__NEWSFEED);
		createEReference(doctorEClass, DOCTOR__POSTS);
		createEReference(doctorEClass, DOCTOR__QUERIES);
		createEOperation(doctorEClass, DOCTOR___SEARCH_DOCTOR__STRING);
		createEOperation(doctorEClass, DOCTOR___FOLLOWDOCTOR);
		createEOperation(doctorEClass, DOCTOR___EDIT_PROFILE_INFORMATION);
		createEOperation(doctorEClass, DOCTOR___VIEW_PROFILE);
		createEOperation(doctorEClass, DOCTOR___SEND_QUERY);
		createEOperation(doctorEClass, DOCTOR___VIEW_RECOMMENDATIONS);

		postEClass = createEClass(POST);
		createEAttribute(postEClass, POST__CONTENT);
		createEReference(postEClass, POST__COMMENTS);
		createEOperation(postEClass, POST___CREATE_POST__STRING);
		createEOperation(postEClass, POST___EDIT_POST);
		createEOperation(postEClass, POST___DELETE_POST);

		queryEClass = createEClass(QUERY);
		createEAttribute(queryEClass, QUERY__TITLE);
		createEAttribute(queryEClass, QUERY__QUERY);
		createEOperation(queryEClass, QUERY___VIEW_QUERY);

		recommendationsEClass = createEClass(RECOMMENDATIONS);
		createEAttribute(recommendationsEClass, RECOMMENDATIONS__TITLE);
		createEAttribute(recommendationsEClass, RECOMMENDATIONS__AUTHOR);
		createEReference(recommendationsEClass, RECOMMENDATIONS__DOCTORS);

		newsfeedEClass = createEClass(NEWSFEED);
		createEAttribute(newsfeedEClass, NEWSFEED__NOTIFICATION);
		createEReference(newsfeedEClass, NEWSFEED__POSTS);
		createEOperation(newsfeedEClass, NEWSFEED___VIEW_NEWSFEED);
		createEOperation(newsfeedEClass, NEWSFEED___VIEW_NOTIFICATIONS);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__COMMENT);
		createEOperation(commentEClass, COMMENT___ADD_COMMENT__STRING);
		createEOperation(commentEClass, COMMENT___EDIT_COMMENT);
		createEOperation(commentEClass, COMMENT___DELETE_COMMENT);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__MESSAGE);
		createEOperation(messageEClass, MESSAGE___SEND_MESSAGE);
		createEOperation(messageEClass, MESSAGE___VIEW_MESSAGES);

		researchPaperEClass = createEClass(RESEARCH_PAPER);
		createEOperation(researchPaperEClass, RESEARCH_PAPER___VIEW_RESEARCH_PAPER);
		createEOperation(researchPaperEClass, RESEARCH_PAPER___DOWNLOAD_PAPER);

		articleEClass = createEClass(ARTICLE);
		createEOperation(articleEClass, ARTICLE___VIEW_ARTICLE);
		createEOperation(articleEClass, ARTICLE___DOWNLOAD_ARTICLE);

		reportEClass = createEClass(REPORT);
		createEOperation(reportEClass, REPORT___VIEW_REPORT);
		createEOperation(reportEClass, REPORT___DOWNLOAD_REPORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		researchPaperEClass.getESuperTypes().add(this.getRecommendations());
		articleEClass.getESuperTypes().add(this.getRecommendations());
		reportEClass.getESuperTypes().add(this.getRecommendations());

		// Initialize classes, features, and operations; add parameters
		initEClass(theCareUnitSystemEClass, TheCareUnitSystem.class, "TheCareUnitSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTheCareUnitSystem_Admin(), this.getAdmin(), null, "admin", null, 0, 1,
				TheCareUnitSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTheCareUnitSystem_Discussions(), this.getDiscussion(), null, "discussions", null, 0, -1,
				TheCareUnitSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTheCareUnitSystem_Doctors(), this.getDoctor(), null, "doctors", null, 0, -1,
				TheCareUnitSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTheCareUnitSystem_Recommendations(), this.getRecommendations(), null, "recommendations", null,
				0, -1, TheCareUnitSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTheCareUnitSystem_Newsfeed(), this.getNewsfeed(), null, "newsfeed", null, 0, -1,
				TheCareUnitSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTheCareUnitSystem_Posts(), this.getPost(), null, "posts", null, 0, -1,
				TheCareUnitSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTheCareUnitSystem_Comments(), this.getComment(), null, "comments", null, 0, -1,
				TheCareUnitSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTheCareUnitSystem_Queries(), this.getQuery(), null, "queries", null, 0, -1,
				TheCareUnitSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTheCareUnitSystem_Messages(), this.getMessage(), null, "messages", null, 0, -1,
				TheCareUnitSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adminEClass, Admin.class, "Admin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdmin_Name(), ecorePackage.getEString(), "name", null, 0, 1, Admin.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdmin_Queries(), this.getQuery(), null, "queries", null, 0, -1, Admin.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getAdmin__HandleQueries(), null, "handleQueries", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(discussionEClass, Discussion.class, "Discussion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscussion_Title(), ecorePackage.getEString(), "title", null, 0, 1, Discussion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscussion_Messages(), this.getMessage(), null, "messages", null, 0, -1, Discussion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDiscussion__CreateNewDiscussion(), null, "createNewDiscussion", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDiscussion__ViewDiscussions(), null, "viewDiscussions", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(doctorEClass, Doctor.class, "Doctor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoctor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Doctor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoctor_Email(), ecorePackage.getEString(), "email", null, 0, 1, Doctor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoctor_Specialization(), ecorePackage.getEString(), "specialization", null, 0, 1,
				Doctor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoctor_FieldOfInterest(), ecorePackage.getEString(), "fieldOfInterest", null, 0, 1,
				Doctor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoctor_Hospital(), ecorePackage.getEString(), "hospital", null, 0, 1, Doctor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoctor_Location(), ecorePackage.getEString(), "location", null, 0, 1, Doctor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoctor_Contact(), ecorePackage.getEInt(), "contact", null, 0, 1, Doctor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctor_Comments(), this.getComment(), null, "comments", null, 0, -1, Doctor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctor_Recommendations(), this.getRecommendations(), this.getRecommendations_Doctors(),
				"recommendations", null, 0, -1, Doctor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctor_Discussions(), this.getDiscussion(), null, "discussions", null, 0, -1, Doctor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctor_Messages(), this.getMessage(), null, "messages", null, 0, -1, Doctor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctor_Newsfeed(), this.getNewsfeed(), null, "newsfeed", null, 0, 1, Doctor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctor_Posts(), this.getPost(), null, "posts", null, 0, -1, Doctor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDoctor_Queries(), this.getQuery(), null, "queries", null, 0, -1, Doctor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		EOperation op = initEOperation(getDoctor__SearchDoctor__String(), null, "searchDoctor", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDoctor__Followdoctor(), null, "followdoctor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDoctor__EditProfileInformation(), null, "editProfileInformation", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getDoctor__ViewProfile(), null, "viewProfile", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDoctor__SendQuery(), null, "sendQuery", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDoctor__ViewRecommendations(), null, "viewRecommendations", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(postEClass, Post.class, "Post", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPost_Content(), ecorePackage.getEString(), "content", null, 0, 1, Post.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPost_Comments(), this.getComment(), null, "comments", null, 0, 1, Post.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(getPost__CreatePost__String(), null, "createPost", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPost__EditPost(), null, "editPost", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPost__DeletePost(), null, "deletePost", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuery_Title(), ecorePackage.getEString(), "title", null, 0, 1, Query.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_Query(), ecorePackage.getEString(), "query", null, 0, 1, Query.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getQuery__ViewQuery(), null, "viewQuery", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(recommendationsEClass, Recommendations.class, "Recommendations", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecommendations_Title(), ecorePackage.getEString(), "title", null, 0, 1,
				Recommendations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecommendations_Author(), ecorePackage.getEString(), "author", null, 0, 1,
				Recommendations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRecommendations_Doctors(), this.getDoctor(), this.getDoctor_Recommendations(), "doctors",
				null, 0, -1, Recommendations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newsfeedEClass, Newsfeed.class, "Newsfeed", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNewsfeed_Notification(), ecorePackage.getEString(), "notification", null, 0, 1,
				Newsfeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getNewsfeed_Posts(), this.getPost(), null, "posts", null, 0, -1, Newsfeed.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getNewsfeed__ViewNewsfeed(), null, "viewNewsfeed", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNewsfeed__ViewNotifications(), null, "viewNotifications", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Comment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getComment__AddComment__String(), null, "addComment", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getComment__EditComment(), null, "editComment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getComment__DeleteComment(), null, "deleteComment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_Message(), ecorePackage.getEString(), "message", null, 0, 1, Message.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMessage__SendMessage(), null, "sendMessage", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMessage__ViewMessages(), null, "viewMessages", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(researchPaperEClass, ResearchPaper.class, "ResearchPaper", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getResearchPaper__ViewResearchPaper(), null, "viewResearchPaper", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getResearchPaper__DownloadPaper(), null, "downloadPaper", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(articleEClass, Article.class, "Article", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getArticle__ViewArticle(), null, "viewArticle", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getArticle__DownloadArticle(), null, "downloadArticle", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reportEClass, Report.class, "Report", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getReport__ViewReport(), null, "viewReport", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReport__DownloadReport(), null, "downloadReport", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ThecareunitPackageImpl
