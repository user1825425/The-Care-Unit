/**
 */
package thecareunit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see thecareunit.ThecareunitFactory
 * @model kind="package"
 * @generated
 */
public interface ThecareunitPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "thecareunit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/thecareunit";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "thecareunit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ThecareunitPackage eINSTANCE = thecareunit.impl.ThecareunitPackageImpl.init();

	/**
	 * The meta object id for the '{@link thecareunit.impl.TheCareUnitSystemImpl <em>The Care Unit System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thecareunit.impl.TheCareUnitSystemImpl
	 * @see thecareunit.impl.ThecareunitPackageImpl#getTheCareUnitSystem()
	 * @generated
	 */
	int THE_CARE_UNIT_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_CARE_UNIT_SYSTEM__ADMIN = 0;

	/**
	 * The feature id for the '<em><b>Discussions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_CARE_UNIT_SYSTEM__DISCUSSIONS = 1;

	/**
	 * The feature id for the '<em><b>Doctors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_CARE_UNIT_SYSTEM__DOCTORS = 2;

	/**
	 * The feature id for the '<em><b>Recommendations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_CARE_UNIT_SYSTEM__RECOMMENDATIONS = 3;

	/**
	 * The feature id for the '<em><b>Newsfeed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_CARE_UNIT_SYSTEM__NEWSFEED = 4;

	/**
	 * The feature id for the '<em><b>Posts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_CARE_UNIT_SYSTEM__POSTS = 5;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_CARE_UNIT_SYSTEM__COMMENTS = 6;

	/**
	 * The feature id for the '<em><b>Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_CARE_UNIT_SYSTEM__QUERIES = 7;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_CARE_UNIT_SYSTEM__MESSAGES = 8;

	/**
	 * The number of structural features of the '<em>The Care Unit System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_CARE_UNIT_SYSTEM_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>The Care Unit System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_CARE_UNIT_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thecareunit.impl.AdminImpl <em>Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thecareunit.impl.AdminImpl
	 * @see thecareunit.impl.ThecareunitPackageImpl#getAdmin()
	 * @generated
	 */
	int ADMIN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Queries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__QUERIES = 1;

	/**
	 * The number of structural features of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Handle Queries</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___HANDLE_QUERIES = 0;

	/**
	 * The number of operations of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link thecareunit.impl.DiscussionImpl <em>Discussion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thecareunit.impl.DiscussionImpl
	 * @see thecareunit.impl.ThecareunitPackageImpl#getDiscussion()
	 * @generated
	 */
	int DISCUSSION = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION__MESSAGES = 1;

	/**
	 * The number of structural features of the '<em>Discussion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Create New Discussion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION___CREATE_NEW_DISCUSSION = 0;

	/**
	 * The operation id for the '<em>View Discussions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION___VIEW_DISCUSSIONS = 1;

	/**
	 * The number of operations of the '<em>Discussion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link thecareunit.impl.DoctorImpl <em>Doctor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thecareunit.impl.DoctorImpl
	 * @see thecareunit.impl.ThecareunitPackageImpl#getDoctor()
	 * @generated
	 */
	int DOCTOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__SPECIALIZATION = 2;

	/**
	 * The feature id for the '<em><b>Field Of Interest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__FIELD_OF_INTEREST = 3;

	/**
	 * The feature id for the '<em><b>Hospital</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__HOSPITAL = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__CONTACT = 6;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__COMMENTS = 7;

	/**
	 * The feature id for the '<em><b>Recommendations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__RECOMMENDATIONS = 8;

	/**
	 * The feature id for the '<em><b>Discussions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__DISCUSSIONS = 9;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__MESSAGES = 10;

	/**
	 * The feature id for the '<em><b>Newsfeed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__NEWSFEED = 11;

	/**
	 * The feature id for the '<em><b>Posts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__POSTS = 12;

	/**
	 * The feature id for the '<em><b>Queries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__QUERIES = 13;

	/**
	 * The number of structural features of the '<em>Doctor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_FEATURE_COUNT = 14;

	/**
	 * The operation id for the '<em>Search Doctor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR___SEARCH_DOCTOR__STRING = 0;

	/**
	 * The operation id for the '<em>Followdoctor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR___FOLLOWDOCTOR = 1;

	/**
	 * The operation id for the '<em>Edit Profile Information</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR___EDIT_PROFILE_INFORMATION = 2;

	/**
	 * The operation id for the '<em>View Profile</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR___VIEW_PROFILE = 3;

	/**
	 * The operation id for the '<em>Send Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR___SEND_QUERY = 4;

	/**
	 * The operation id for the '<em>View Recommendations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR___VIEW_RECOMMENDATIONS = 5;

	/**
	 * The number of operations of the '<em>Doctor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link thecareunit.impl.PostImpl <em>Post</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thecareunit.impl.PostImpl
	 * @see thecareunit.impl.ThecareunitPackageImpl#getPost()
	 * @generated
	 */
	int POST = 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__COMMENTS = 1;

	/**
	 * The number of structural features of the '<em>Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Create Post</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___CREATE_POST__STRING = 0;

	/**
	 * The operation id for the '<em>Edit Post</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___EDIT_POST = 1;

	/**
	 * The operation id for the '<em>Delete Post</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___DELETE_POST = 2;

	/**
	 * The number of operations of the '<em>Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link thecareunit.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thecareunit.impl.QueryImpl
	 * @see thecareunit.impl.ThecareunitPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__QUERY = 1;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>View Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY___VIEW_QUERY = 0;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link thecareunit.impl.RecommendationsImpl <em>Recommendations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thecareunit.impl.RecommendationsImpl
	 * @see thecareunit.impl.ThecareunitPackageImpl#getRecommendations()
	 * @generated
	 */
	int RECOMMENDATIONS = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATIONS__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATIONS__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Doctors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATIONS__DOCTORS = 2;

	/**
	 * The number of structural features of the '<em>Recommendations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Recommendations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thecareunit.impl.NewsfeedImpl <em>Newsfeed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thecareunit.impl.NewsfeedImpl
	 * @see thecareunit.impl.ThecareunitPackageImpl#getNewsfeed()
	 * @generated
	 */
	int NEWSFEED = 7;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWSFEED__NOTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Posts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWSFEED__POSTS = 1;

	/**
	 * The number of structural features of the '<em>Newsfeed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWSFEED_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>View Newsfeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWSFEED___VIEW_NEWSFEED = 0;

	/**
	 * The operation id for the '<em>View Notifications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWSFEED___VIEW_NOTIFICATIONS = 1;

	/**
	 * The number of operations of the '<em>Newsfeed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWSFEED_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link thecareunit.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thecareunit.impl.CommentImpl
	 * @see thecareunit.impl.ThecareunitPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 8;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Add Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT___ADD_COMMENT__STRING = 0;

	/**
	 * The operation id for the '<em>Edit Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT___EDIT_COMMENT = 1;

	/**
	 * The operation id for the '<em>Delete Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT___DELETE_COMMENT = 2;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link thecareunit.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thecareunit.impl.MessageImpl
	 * @see thecareunit.impl.ThecareunitPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 9;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___SEND_MESSAGE = 0;

	/**
	 * The operation id for the '<em>View Messages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___VIEW_MESSAGES = 1;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link thecareunit.impl.ResearchPaperImpl <em>Research Paper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thecareunit.impl.ResearchPaperImpl
	 * @see thecareunit.impl.ThecareunitPackageImpl#getResearchPaper()
	 * @generated
	 */
	int RESEARCH_PAPER = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCH_PAPER__TITLE = RECOMMENDATIONS__TITLE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCH_PAPER__AUTHOR = RECOMMENDATIONS__AUTHOR;

	/**
	 * The feature id for the '<em><b>Doctors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCH_PAPER__DOCTORS = RECOMMENDATIONS__DOCTORS;

	/**
	 * The number of structural features of the '<em>Research Paper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCH_PAPER_FEATURE_COUNT = RECOMMENDATIONS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>View Research Paper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCH_PAPER___VIEW_RESEARCH_PAPER = RECOMMENDATIONS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Download Paper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCH_PAPER___DOWNLOAD_PAPER = RECOMMENDATIONS_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Research Paper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCH_PAPER_OPERATION_COUNT = RECOMMENDATIONS_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link thecareunit.impl.ArticleImpl <em>Article</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thecareunit.impl.ArticleImpl
	 * @see thecareunit.impl.ThecareunitPackageImpl#getArticle()
	 * @generated
	 */
	int ARTICLE = 11;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__TITLE = RECOMMENDATIONS__TITLE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__AUTHOR = RECOMMENDATIONS__AUTHOR;

	/**
	 * The feature id for the '<em><b>Doctors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__DOCTORS = RECOMMENDATIONS__DOCTORS;

	/**
	 * The number of structural features of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_FEATURE_COUNT = RECOMMENDATIONS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>View Article</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE___VIEW_ARTICLE = RECOMMENDATIONS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Download Article</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE___DOWNLOAD_ARTICLE = RECOMMENDATIONS_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_OPERATION_COUNT = RECOMMENDATIONS_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link thecareunit.impl.ReportImpl <em>Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thecareunit.impl.ReportImpl
	 * @see thecareunit.impl.ThecareunitPackageImpl#getReport()
	 * @generated
	 */
	int REPORT = 12;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__TITLE = RECOMMENDATIONS__TITLE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__AUTHOR = RECOMMENDATIONS__AUTHOR;

	/**
	 * The feature id for the '<em><b>Doctors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__DOCTORS = RECOMMENDATIONS__DOCTORS;

	/**
	 * The number of structural features of the '<em>Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_FEATURE_COUNT = RECOMMENDATIONS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>View Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT___VIEW_REPORT = RECOMMENDATIONS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Download Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT___DOWNLOAD_REPORT = RECOMMENDATIONS_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_OPERATION_COUNT = RECOMMENDATIONS_OPERATION_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link thecareunit.TheCareUnitSystem <em>The Care Unit System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>The Care Unit System</em>'.
	 * @see thecareunit.TheCareUnitSystem
	 * @generated
	 */
	EClass getTheCareUnitSystem();

	/**
	 * Returns the meta object for the containment reference '{@link thecareunit.TheCareUnitSystem#getAdmin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Admin</em>'.
	 * @see thecareunit.TheCareUnitSystem#getAdmin()
	 * @see #getTheCareUnitSystem()
	 * @generated
	 */
	EReference getTheCareUnitSystem_Admin();

	/**
	 * Returns the meta object for the containment reference list '{@link thecareunit.TheCareUnitSystem#getDiscussions <em>Discussions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Discussions</em>'.
	 * @see thecareunit.TheCareUnitSystem#getDiscussions()
	 * @see #getTheCareUnitSystem()
	 * @generated
	 */
	EReference getTheCareUnitSystem_Discussions();

	/**
	 * Returns the meta object for the containment reference list '{@link thecareunit.TheCareUnitSystem#getDoctors <em>Doctors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doctors</em>'.
	 * @see thecareunit.TheCareUnitSystem#getDoctors()
	 * @see #getTheCareUnitSystem()
	 * @generated
	 */
	EReference getTheCareUnitSystem_Doctors();

	/**
	 * Returns the meta object for the containment reference list '{@link thecareunit.TheCareUnitSystem#getRecommendations <em>Recommendations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recommendations</em>'.
	 * @see thecareunit.TheCareUnitSystem#getRecommendations()
	 * @see #getTheCareUnitSystem()
	 * @generated
	 */
	EReference getTheCareUnitSystem_Recommendations();

	/**
	 * Returns the meta object for the containment reference list '{@link thecareunit.TheCareUnitSystem#getNewsfeed <em>Newsfeed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Newsfeed</em>'.
	 * @see thecareunit.TheCareUnitSystem#getNewsfeed()
	 * @see #getTheCareUnitSystem()
	 * @generated
	 */
	EReference getTheCareUnitSystem_Newsfeed();

	/**
	 * Returns the meta object for the containment reference list '{@link thecareunit.TheCareUnitSystem#getPosts <em>Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Posts</em>'.
	 * @see thecareunit.TheCareUnitSystem#getPosts()
	 * @see #getTheCareUnitSystem()
	 * @generated
	 */
	EReference getTheCareUnitSystem_Posts();

	/**
	 * Returns the meta object for the containment reference list '{@link thecareunit.TheCareUnitSystem#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see thecareunit.TheCareUnitSystem#getComments()
	 * @see #getTheCareUnitSystem()
	 * @generated
	 */
	EReference getTheCareUnitSystem_Comments();

	/**
	 * Returns the meta object for the containment reference list '{@link thecareunit.TheCareUnitSystem#getQueries <em>Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Queries</em>'.
	 * @see thecareunit.TheCareUnitSystem#getQueries()
	 * @see #getTheCareUnitSystem()
	 * @generated
	 */
	EReference getTheCareUnitSystem_Queries();

	/**
	 * Returns the meta object for the containment reference list '{@link thecareunit.TheCareUnitSystem#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see thecareunit.TheCareUnitSystem#getMessages()
	 * @see #getTheCareUnitSystem()
	 * @generated
	 */
	EReference getTheCareUnitSystem_Messages();

	/**
	 * Returns the meta object for class '{@link thecareunit.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin</em>'.
	 * @see thecareunit.Admin
	 * @generated
	 */
	EClass getAdmin();

	/**
	 * Returns the meta object for the attribute '{@link thecareunit.Admin#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see thecareunit.Admin#getName()
	 * @see #getAdmin()
	 * @generated
	 */
	EAttribute getAdmin_Name();

	/**
	 * Returns the meta object for the reference list '{@link thecareunit.Admin#getQueries <em>Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Queries</em>'.
	 * @see thecareunit.Admin#getQueries()
	 * @see #getAdmin()
	 * @generated
	 */
	EReference getAdmin_Queries();

	/**
	 * Returns the meta object for the '{@link thecareunit.Admin#handleQueries() <em>Handle Queries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Handle Queries</em>' operation.
	 * @see thecareunit.Admin#handleQueries()
	 * @generated
	 */
	EOperation getAdmin__HandleQueries();

	/**
	 * Returns the meta object for class '{@link thecareunit.Discussion <em>Discussion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discussion</em>'.
	 * @see thecareunit.Discussion
	 * @generated
	 */
	EClass getDiscussion();

	/**
	 * Returns the meta object for the attribute '{@link thecareunit.Discussion#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see thecareunit.Discussion#getTitle()
	 * @see #getDiscussion()
	 * @generated
	 */
	EAttribute getDiscussion_Title();

	/**
	 * Returns the meta object for the reference list '{@link thecareunit.Discussion#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Messages</em>'.
	 * @see thecareunit.Discussion#getMessages()
	 * @see #getDiscussion()
	 * @generated
	 */
	EReference getDiscussion_Messages();

	/**
	 * Returns the meta object for the '{@link thecareunit.Discussion#createNewDiscussion() <em>Create New Discussion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create New Discussion</em>' operation.
	 * @see thecareunit.Discussion#createNewDiscussion()
	 * @generated
	 */
	EOperation getDiscussion__CreateNewDiscussion();

	/**
	 * Returns the meta object for the '{@link thecareunit.Discussion#viewDiscussions() <em>View Discussions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Discussions</em>' operation.
	 * @see thecareunit.Discussion#viewDiscussions()
	 * @generated
	 */
	EOperation getDiscussion__ViewDiscussions();

	/**
	 * Returns the meta object for class '{@link thecareunit.Doctor <em>Doctor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doctor</em>'.
	 * @see thecareunit.Doctor
	 * @generated
	 */
	EClass getDoctor();

	/**
	 * Returns the meta object for the attribute '{@link thecareunit.Doctor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see thecareunit.Doctor#getName()
	 * @see #getDoctor()
	 * @generated
	 */
	EAttribute getDoctor_Name();

	/**
	 * Returns the meta object for the attribute '{@link thecareunit.Doctor#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see thecareunit.Doctor#getEmail()
	 * @see #getDoctor()
	 * @generated
	 */
	EAttribute getDoctor_Email();

	/**
	 * Returns the meta object for the attribute '{@link thecareunit.Doctor#getSpecialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specialization</em>'.
	 * @see thecareunit.Doctor#getSpecialization()
	 * @see #getDoctor()
	 * @generated
	 */
	EAttribute getDoctor_Specialization();

	/**
	 * Returns the meta object for the attribute '{@link thecareunit.Doctor#getFieldOfInterest <em>Field Of Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Of Interest</em>'.
	 * @see thecareunit.Doctor#getFieldOfInterest()
	 * @see #getDoctor()
	 * @generated
	 */
	EAttribute getDoctor_FieldOfInterest();

	/**
	 * Returns the meta object for the attribute '{@link thecareunit.Doctor#getHospital <em>Hospital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hospital</em>'.
	 * @see thecareunit.Doctor#getHospital()
	 * @see #getDoctor()
	 * @generated
	 */
	EAttribute getDoctor_Hospital();

	/**
	 * Returns the meta object for the attribute '{@link thecareunit.Doctor#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see thecareunit.Doctor#getLocation()
	 * @see #getDoctor()
	 * @generated
	 */
	EAttribute getDoctor_Location();

	/**
	 * Returns the meta object for the attribute '{@link thecareunit.Doctor#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact</em>'.
	 * @see thecareunit.Doctor#getContact()
	 * @see #getDoctor()
	 * @generated
	 */
	EAttribute getDoctor_Contact();

	/**
	 * Returns the meta object for the reference list '{@link thecareunit.Doctor#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comments</em>'.
	 * @see thecareunit.Doctor#getComments()
	 * @see #getDoctor()
	 * @generated
	 */
	EReference getDoctor_Comments();

	/**
	 * Returns the meta object for the reference list '{@link thecareunit.Doctor#getRecommendations <em>Recommendations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recommendations</em>'.
	 * @see thecareunit.Doctor#getRecommendations()
	 * @see #getDoctor()
	 * @generated
	 */
	EReference getDoctor_Recommendations();

	/**
	 * Returns the meta object for the reference list '{@link thecareunit.Doctor#getDiscussions <em>Discussions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Discussions</em>'.
	 * @see thecareunit.Doctor#getDiscussions()
	 * @see #getDoctor()
	 * @generated
	 */
	EReference getDoctor_Discussions();

	/**
	 * Returns the meta object for the reference list '{@link thecareunit.Doctor#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Messages</em>'.
	 * @see thecareunit.Doctor#getMessages()
	 * @see #getDoctor()
	 * @generated
	 */
	EReference getDoctor_Messages();

	/**
	 * Returns the meta object for the reference '{@link thecareunit.Doctor#getNewsfeed <em>Newsfeed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Newsfeed</em>'.
	 * @see thecareunit.Doctor#getNewsfeed()
	 * @see #getDoctor()
	 * @generated
	 */
	EReference getDoctor_Newsfeed();

	/**
	 * Returns the meta object for the reference list '{@link thecareunit.Doctor#getPosts <em>Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Posts</em>'.
	 * @see thecareunit.Doctor#getPosts()
	 * @see #getDoctor()
	 * @generated
	 */
	EReference getDoctor_Posts();

	/**
	 * Returns the meta object for the reference list '{@link thecareunit.Doctor#getQueries <em>Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Queries</em>'.
	 * @see thecareunit.Doctor#getQueries()
	 * @see #getDoctor()
	 * @generated
	 */
	EReference getDoctor_Queries();

	/**
	 * Returns the meta object for the '{@link thecareunit.Doctor#searchDoctor(java.lang.String) <em>Search Doctor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Doctor</em>' operation.
	 * @see thecareunit.Doctor#searchDoctor(java.lang.String)
	 * @generated
	 */
	EOperation getDoctor__SearchDoctor__String();

	/**
	 * Returns the meta object for the '{@link thecareunit.Doctor#followdoctor() <em>Followdoctor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Followdoctor</em>' operation.
	 * @see thecareunit.Doctor#followdoctor()
	 * @generated
	 */
	EOperation getDoctor__Followdoctor();

	/**
	 * Returns the meta object for the '{@link thecareunit.Doctor#editProfileInformation() <em>Edit Profile Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Profile Information</em>' operation.
	 * @see thecareunit.Doctor#editProfileInformation()
	 * @generated
	 */
	EOperation getDoctor__EditProfileInformation();

	/**
	 * Returns the meta object for the '{@link thecareunit.Doctor#viewProfile() <em>View Profile</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Profile</em>' operation.
	 * @see thecareunit.Doctor#viewProfile()
	 * @generated
	 */
	EOperation getDoctor__ViewProfile();

	/**
	 * Returns the meta object for the '{@link thecareunit.Doctor#sendQuery() <em>Send Query</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Query</em>' operation.
	 * @see thecareunit.Doctor#sendQuery()
	 * @generated
	 */
	EOperation getDoctor__SendQuery();

	/**
	 * Returns the meta object for the '{@link thecareunit.Doctor#viewRecommendations() <em>View Recommendations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Recommendations</em>' operation.
	 * @see thecareunit.Doctor#viewRecommendations()
	 * @generated
	 */
	EOperation getDoctor__ViewRecommendations();

	/**
	 * Returns the meta object for class '{@link thecareunit.Post <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post</em>'.
	 * @see thecareunit.Post
	 * @generated
	 */
	EClass getPost();

	/**
	 * Returns the meta object for the attribute '{@link thecareunit.Post#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see thecareunit.Post#getContent()
	 * @see #getPost()
	 * @generated
	 */
	EAttribute getPost_Content();

	/**
	 * Returns the meta object for the reference '{@link thecareunit.Post#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comments</em>'.
	 * @see thecareunit.Post#getComments()
	 * @see #getPost()
	 * @generated
	 */
	EReference getPost_Comments();

	/**
	 * Returns the meta object for the '{@link thecareunit.Post#createPost(java.lang.String) <em>Create Post</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Post</em>' operation.
	 * @see thecareunit.Post#createPost(java.lang.String)
	 * @generated
	 */
	EOperation getPost__CreatePost__String();

	/**
	 * Returns the meta object for the '{@link thecareunit.Post#editPost() <em>Edit Post</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Post</em>' operation.
	 * @see thecareunit.Post#editPost()
	 * @generated
	 */
	EOperation getPost__EditPost();

	/**
	 * Returns the meta object for the '{@link thecareunit.Post#deletePost() <em>Delete Post</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Post</em>' operation.
	 * @see thecareunit.Post#deletePost()
	 * @generated
	 */
	EOperation getPost__DeletePost();

	/**
	 * Returns the meta object for class '{@link thecareunit.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see thecareunit.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the attribute '{@link thecareunit.Query#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see thecareunit.Query#getTitle()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Title();

	/**
	 * Returns the meta object for the attribute '{@link thecareunit.Query#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see thecareunit.Query#getQuery()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Query();

	/**
	 * Returns the meta object for the '{@link thecareunit.Query#viewQuery() <em>View Query</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Query</em>' operation.
	 * @see thecareunit.Query#viewQuery()
	 * @generated
	 */
	EOperation getQuery__ViewQuery();

	/**
	 * Returns the meta object for class '{@link thecareunit.Recommendations <em>Recommendations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recommendations</em>'.
	 * @see thecareunit.Recommendations
	 * @generated
	 */
	EClass getRecommendations();

	/**
	 * Returns the meta object for the attribute '{@link thecareunit.Recommendations#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see thecareunit.Recommendations#getTitle()
	 * @see #getRecommendations()
	 * @generated
	 */
	EAttribute getRecommendations_Title();

	/**
	 * Returns the meta object for the attribute '{@link thecareunit.Recommendations#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see thecareunit.Recommendations#getAuthor()
	 * @see #getRecommendations()
	 * @generated
	 */
	EAttribute getRecommendations_Author();

	/**
	 * Returns the meta object for the reference list '{@link thecareunit.Recommendations#getDoctors <em>Doctors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Doctors</em>'.
	 * @see thecareunit.Recommendations#getDoctors()
	 * @see #getRecommendations()
	 * @generated
	 */
	EReference getRecommendations_Doctors();

	/**
	 * Returns the meta object for class '{@link thecareunit.Newsfeed <em>Newsfeed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Newsfeed</em>'.
	 * @see thecareunit.Newsfeed
	 * @generated
	 */
	EClass getNewsfeed();

	/**
	 * Returns the meta object for the attribute '{@link thecareunit.Newsfeed#getNotification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification</em>'.
	 * @see thecareunit.Newsfeed#getNotification()
	 * @see #getNewsfeed()
	 * @generated
	 */
	EAttribute getNewsfeed_Notification();

	/**
	 * Returns the meta object for the reference list '{@link thecareunit.Newsfeed#getPosts <em>Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Posts</em>'.
	 * @see thecareunit.Newsfeed#getPosts()
	 * @see #getNewsfeed()
	 * @generated
	 */
	EReference getNewsfeed_Posts();

	/**
	 * Returns the meta object for the '{@link thecareunit.Newsfeed#viewNewsfeed() <em>View Newsfeed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Newsfeed</em>' operation.
	 * @see thecareunit.Newsfeed#viewNewsfeed()
	 * @generated
	 */
	EOperation getNewsfeed__ViewNewsfeed();

	/**
	 * Returns the meta object for the '{@link thecareunit.Newsfeed#viewNotifications() <em>View Notifications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Notifications</em>' operation.
	 * @see thecareunit.Newsfeed#viewNotifications()
	 * @generated
	 */
	EOperation getNewsfeed__ViewNotifications();

	/**
	 * Returns the meta object for class '{@link thecareunit.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see thecareunit.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link thecareunit.Comment#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see thecareunit.Comment#getComment()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Comment();

	/**
	 * Returns the meta object for the '{@link thecareunit.Comment#addComment(java.lang.String) <em>Add Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Comment</em>' operation.
	 * @see thecareunit.Comment#addComment(java.lang.String)
	 * @generated
	 */
	EOperation getComment__AddComment__String();

	/**
	 * Returns the meta object for the '{@link thecareunit.Comment#editComment() <em>Edit Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Comment</em>' operation.
	 * @see thecareunit.Comment#editComment()
	 * @generated
	 */
	EOperation getComment__EditComment();

	/**
	 * Returns the meta object for the '{@link thecareunit.Comment#deleteComment() <em>Delete Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Comment</em>' operation.
	 * @see thecareunit.Comment#deleteComment()
	 * @generated
	 */
	EOperation getComment__DeleteComment();

	/**
	 * Returns the meta object for class '{@link thecareunit.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see thecareunit.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link thecareunit.Message#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see thecareunit.Message#getMessage()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Message();

	/**
	 * Returns the meta object for the '{@link thecareunit.Message#sendMessage() <em>Send Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Message</em>' operation.
	 * @see thecareunit.Message#sendMessage()
	 * @generated
	 */
	EOperation getMessage__SendMessage();

	/**
	 * Returns the meta object for the '{@link thecareunit.Message#viewMessages() <em>View Messages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Messages</em>' operation.
	 * @see thecareunit.Message#viewMessages()
	 * @generated
	 */
	EOperation getMessage__ViewMessages();

	/**
	 * Returns the meta object for class '{@link thecareunit.ResearchPaper <em>Research Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Research Paper</em>'.
	 * @see thecareunit.ResearchPaper
	 * @generated
	 */
	EClass getResearchPaper();

	/**
	 * Returns the meta object for the '{@link thecareunit.ResearchPaper#viewResearchPaper() <em>View Research Paper</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Research Paper</em>' operation.
	 * @see thecareunit.ResearchPaper#viewResearchPaper()
	 * @generated
	 */
	EOperation getResearchPaper__ViewResearchPaper();

	/**
	 * Returns the meta object for the '{@link thecareunit.ResearchPaper#downloadPaper() <em>Download Paper</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Download Paper</em>' operation.
	 * @see thecareunit.ResearchPaper#downloadPaper()
	 * @generated
	 */
	EOperation getResearchPaper__DownloadPaper();

	/**
	 * Returns the meta object for class '{@link thecareunit.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Article</em>'.
	 * @see thecareunit.Article
	 * @generated
	 */
	EClass getArticle();

	/**
	 * Returns the meta object for the '{@link thecareunit.Article#viewArticle() <em>View Article</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Article</em>' operation.
	 * @see thecareunit.Article#viewArticle()
	 * @generated
	 */
	EOperation getArticle__ViewArticle();

	/**
	 * Returns the meta object for the '{@link thecareunit.Article#downloadArticle() <em>Download Article</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Download Article</em>' operation.
	 * @see thecareunit.Article#downloadArticle()
	 * @generated
	 */
	EOperation getArticle__DownloadArticle();

	/**
	 * Returns the meta object for class '{@link thecareunit.Report <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report</em>'.
	 * @see thecareunit.Report
	 * @generated
	 */
	EClass getReport();

	/**
	 * Returns the meta object for the '{@link thecareunit.Report#viewReport() <em>View Report</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Report</em>' operation.
	 * @see thecareunit.Report#viewReport()
	 * @generated
	 */
	EOperation getReport__ViewReport();

	/**
	 * Returns the meta object for the '{@link thecareunit.Report#downloadReport() <em>Download Report</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Download Report</em>' operation.
	 * @see thecareunit.Report#downloadReport()
	 * @generated
	 */
	EOperation getReport__DownloadReport();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ThecareunitFactory getThecareunitFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link thecareunit.impl.TheCareUnitSystemImpl <em>The Care Unit System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thecareunit.impl.TheCareUnitSystemImpl
		 * @see thecareunit.impl.ThecareunitPackageImpl#getTheCareUnitSystem()
		 * @generated
		 */
		EClass THE_CARE_UNIT_SYSTEM = eINSTANCE.getTheCareUnitSystem();

		/**
		 * The meta object literal for the '<em><b>Admin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THE_CARE_UNIT_SYSTEM__ADMIN = eINSTANCE.getTheCareUnitSystem_Admin();

		/**
		 * The meta object literal for the '<em><b>Discussions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THE_CARE_UNIT_SYSTEM__DISCUSSIONS = eINSTANCE.getTheCareUnitSystem_Discussions();

		/**
		 * The meta object literal for the '<em><b>Doctors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THE_CARE_UNIT_SYSTEM__DOCTORS = eINSTANCE.getTheCareUnitSystem_Doctors();

		/**
		 * The meta object literal for the '<em><b>Recommendations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THE_CARE_UNIT_SYSTEM__RECOMMENDATIONS = eINSTANCE.getTheCareUnitSystem_Recommendations();

		/**
		 * The meta object literal for the '<em><b>Newsfeed</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THE_CARE_UNIT_SYSTEM__NEWSFEED = eINSTANCE.getTheCareUnitSystem_Newsfeed();

		/**
		 * The meta object literal for the '<em><b>Posts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THE_CARE_UNIT_SYSTEM__POSTS = eINSTANCE.getTheCareUnitSystem_Posts();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THE_CARE_UNIT_SYSTEM__COMMENTS = eINSTANCE.getTheCareUnitSystem_Comments();

		/**
		 * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THE_CARE_UNIT_SYSTEM__QUERIES = eINSTANCE.getTheCareUnitSystem_Queries();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THE_CARE_UNIT_SYSTEM__MESSAGES = eINSTANCE.getTheCareUnitSystem_Messages();

		/**
		 * The meta object literal for the '{@link thecareunit.impl.AdminImpl <em>Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thecareunit.impl.AdminImpl
		 * @see thecareunit.impl.ThecareunitPackageImpl#getAdmin()
		 * @generated
		 */
		EClass ADMIN = eINSTANCE.getAdmin();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMIN__NAME = eINSTANCE.getAdmin_Name();

		/**
		 * The meta object literal for the '<em><b>Queries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN__QUERIES = eINSTANCE.getAdmin_Queries();

		/**
		 * The meta object literal for the '<em><b>Handle Queries</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___HANDLE_QUERIES = eINSTANCE.getAdmin__HandleQueries();

		/**
		 * The meta object literal for the '{@link thecareunit.impl.DiscussionImpl <em>Discussion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thecareunit.impl.DiscussionImpl
		 * @see thecareunit.impl.ThecareunitPackageImpl#getDiscussion()
		 * @generated
		 */
		EClass DISCUSSION = eINSTANCE.getDiscussion();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCUSSION__TITLE = eINSTANCE.getDiscussion_Title();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCUSSION__MESSAGES = eINSTANCE.getDiscussion_Messages();

		/**
		 * The meta object literal for the '<em><b>Create New Discussion</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISCUSSION___CREATE_NEW_DISCUSSION = eINSTANCE.getDiscussion__CreateNewDiscussion();

		/**
		 * The meta object literal for the '<em><b>View Discussions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISCUSSION___VIEW_DISCUSSIONS = eINSTANCE.getDiscussion__ViewDiscussions();

		/**
		 * The meta object literal for the '{@link thecareunit.impl.DoctorImpl <em>Doctor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thecareunit.impl.DoctorImpl
		 * @see thecareunit.impl.ThecareunitPackageImpl#getDoctor()
		 * @generated
		 */
		EClass DOCTOR = eINSTANCE.getDoctor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR__NAME = eINSTANCE.getDoctor_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR__EMAIL = eINSTANCE.getDoctor_Email();

		/**
		 * The meta object literal for the '<em><b>Specialization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR__SPECIALIZATION = eINSTANCE.getDoctor_Specialization();

		/**
		 * The meta object literal for the '<em><b>Field Of Interest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR__FIELD_OF_INTEREST = eINSTANCE.getDoctor_FieldOfInterest();

		/**
		 * The meta object literal for the '<em><b>Hospital</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR__HOSPITAL = eINSTANCE.getDoctor_Hospital();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR__LOCATION = eINSTANCE.getDoctor_Location();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR__CONTACT = eINSTANCE.getDoctor_Contact();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR__COMMENTS = eINSTANCE.getDoctor_Comments();

		/**
		 * The meta object literal for the '<em><b>Recommendations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR__RECOMMENDATIONS = eINSTANCE.getDoctor_Recommendations();

		/**
		 * The meta object literal for the '<em><b>Discussions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR__DISCUSSIONS = eINSTANCE.getDoctor_Discussions();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR__MESSAGES = eINSTANCE.getDoctor_Messages();

		/**
		 * The meta object literal for the '<em><b>Newsfeed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR__NEWSFEED = eINSTANCE.getDoctor_Newsfeed();

		/**
		 * The meta object literal for the '<em><b>Posts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR__POSTS = eINSTANCE.getDoctor_Posts();

		/**
		 * The meta object literal for the '<em><b>Queries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR__QUERIES = eINSTANCE.getDoctor_Queries();

		/**
		 * The meta object literal for the '<em><b>Search Doctor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCTOR___SEARCH_DOCTOR__STRING = eINSTANCE.getDoctor__SearchDoctor__String();

		/**
		 * The meta object literal for the '<em><b>Followdoctor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCTOR___FOLLOWDOCTOR = eINSTANCE.getDoctor__Followdoctor();

		/**
		 * The meta object literal for the '<em><b>Edit Profile Information</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCTOR___EDIT_PROFILE_INFORMATION = eINSTANCE.getDoctor__EditProfileInformation();

		/**
		 * The meta object literal for the '<em><b>View Profile</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCTOR___VIEW_PROFILE = eINSTANCE.getDoctor__ViewProfile();

		/**
		 * The meta object literal for the '<em><b>Send Query</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCTOR___SEND_QUERY = eINSTANCE.getDoctor__SendQuery();

		/**
		 * The meta object literal for the '<em><b>View Recommendations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCTOR___VIEW_RECOMMENDATIONS = eINSTANCE.getDoctor__ViewRecommendations();

		/**
		 * The meta object literal for the '{@link thecareunit.impl.PostImpl <em>Post</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thecareunit.impl.PostImpl
		 * @see thecareunit.impl.ThecareunitPackageImpl#getPost()
		 * @generated
		 */
		EClass POST = eINSTANCE.getPost();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST__CONTENT = eINSTANCE.getPost_Content();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__COMMENTS = eINSTANCE.getPost_Comments();

		/**
		 * The meta object literal for the '<em><b>Create Post</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POST___CREATE_POST__STRING = eINSTANCE.getPost__CreatePost__String();

		/**
		 * The meta object literal for the '<em><b>Edit Post</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POST___EDIT_POST = eINSTANCE.getPost__EditPost();

		/**
		 * The meta object literal for the '<em><b>Delete Post</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POST___DELETE_POST = eINSTANCE.getPost__DeletePost();

		/**
		 * The meta object literal for the '{@link thecareunit.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thecareunit.impl.QueryImpl
		 * @see thecareunit.impl.ThecareunitPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__TITLE = eINSTANCE.getQuery_Title();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__QUERY = eINSTANCE.getQuery_Query();

		/**
		 * The meta object literal for the '<em><b>View Query</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUERY___VIEW_QUERY = eINSTANCE.getQuery__ViewQuery();

		/**
		 * The meta object literal for the '{@link thecareunit.impl.RecommendationsImpl <em>Recommendations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thecareunit.impl.RecommendationsImpl
		 * @see thecareunit.impl.ThecareunitPackageImpl#getRecommendations()
		 * @generated
		 */
		EClass RECOMMENDATIONS = eINSTANCE.getRecommendations();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOMMENDATIONS__TITLE = eINSTANCE.getRecommendations_Title();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOMMENDATIONS__AUTHOR = eINSTANCE.getRecommendations_Author();

		/**
		 * The meta object literal for the '<em><b>Doctors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOMMENDATIONS__DOCTORS = eINSTANCE.getRecommendations_Doctors();

		/**
		 * The meta object literal for the '{@link thecareunit.impl.NewsfeedImpl <em>Newsfeed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thecareunit.impl.NewsfeedImpl
		 * @see thecareunit.impl.ThecareunitPackageImpl#getNewsfeed()
		 * @generated
		 */
		EClass NEWSFEED = eINSTANCE.getNewsfeed();

		/**
		 * The meta object literal for the '<em><b>Notification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEWSFEED__NOTIFICATION = eINSTANCE.getNewsfeed_Notification();

		/**
		 * The meta object literal for the '<em><b>Posts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEWSFEED__POSTS = eINSTANCE.getNewsfeed_Posts();

		/**
		 * The meta object literal for the '<em><b>View Newsfeed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEWSFEED___VIEW_NEWSFEED = eINSTANCE.getNewsfeed__ViewNewsfeed();

		/**
		 * The meta object literal for the '<em><b>View Notifications</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEWSFEED___VIEW_NOTIFICATIONS = eINSTANCE.getNewsfeed__ViewNotifications();

		/**
		 * The meta object literal for the '{@link thecareunit.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thecareunit.impl.CommentImpl
		 * @see thecareunit.impl.ThecareunitPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__COMMENT = eINSTANCE.getComment_Comment();

		/**
		 * The meta object literal for the '<em><b>Add Comment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMENT___ADD_COMMENT__STRING = eINSTANCE.getComment__AddComment__String();

		/**
		 * The meta object literal for the '<em><b>Edit Comment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMENT___EDIT_COMMENT = eINSTANCE.getComment__EditComment();

		/**
		 * The meta object literal for the '<em><b>Delete Comment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMENT___DELETE_COMMENT = eINSTANCE.getComment__DeleteComment();

		/**
		 * The meta object literal for the '{@link thecareunit.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thecareunit.impl.MessageImpl
		 * @see thecareunit.impl.ThecareunitPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MESSAGE = eINSTANCE.getMessage_Message();

		/**
		 * The meta object literal for the '<em><b>Send Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESSAGE___SEND_MESSAGE = eINSTANCE.getMessage__SendMessage();

		/**
		 * The meta object literal for the '<em><b>View Messages</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESSAGE___VIEW_MESSAGES = eINSTANCE.getMessage__ViewMessages();

		/**
		 * The meta object literal for the '{@link thecareunit.impl.ResearchPaperImpl <em>Research Paper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thecareunit.impl.ResearchPaperImpl
		 * @see thecareunit.impl.ThecareunitPackageImpl#getResearchPaper()
		 * @generated
		 */
		EClass RESEARCH_PAPER = eINSTANCE.getResearchPaper();

		/**
		 * The meta object literal for the '<em><b>View Research Paper</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESEARCH_PAPER___VIEW_RESEARCH_PAPER = eINSTANCE.getResearchPaper__ViewResearchPaper();

		/**
		 * The meta object literal for the '<em><b>Download Paper</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESEARCH_PAPER___DOWNLOAD_PAPER = eINSTANCE.getResearchPaper__DownloadPaper();

		/**
		 * The meta object literal for the '{@link thecareunit.impl.ArticleImpl <em>Article</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thecareunit.impl.ArticleImpl
		 * @see thecareunit.impl.ThecareunitPackageImpl#getArticle()
		 * @generated
		 */
		EClass ARTICLE = eINSTANCE.getArticle();

		/**
		 * The meta object literal for the '<em><b>View Article</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARTICLE___VIEW_ARTICLE = eINSTANCE.getArticle__ViewArticle();

		/**
		 * The meta object literal for the '<em><b>Download Article</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARTICLE___DOWNLOAD_ARTICLE = eINSTANCE.getArticle__DownloadArticle();

		/**
		 * The meta object literal for the '{@link thecareunit.impl.ReportImpl <em>Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thecareunit.impl.ReportImpl
		 * @see thecareunit.impl.ThecareunitPackageImpl#getReport()
		 * @generated
		 */
		EClass REPORT = eINSTANCE.getReport();

		/**
		 * The meta object literal for the '<em><b>View Report</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPORT___VIEW_REPORT = eINSTANCE.getReport__ViewReport();

		/**
		 * The meta object literal for the '<em><b>Download Report</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPORT___DOWNLOAD_REPORT = eINSTANCE.getReport__DownloadReport();

	}

} //ThecareunitPackage
