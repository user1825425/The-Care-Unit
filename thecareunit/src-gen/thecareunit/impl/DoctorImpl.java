/**
 */
package thecareunit.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import thecareunit.Comment;
import thecareunit.Discussion;
import thecareunit.Doctor;
import thecareunit.Message;
import thecareunit.Newsfeed;
import thecareunit.Post;
import thecareunit.Query;
import thecareunit.Recommendations;
import thecareunit.ThecareunitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doctor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link thecareunit.impl.DoctorImpl#getName <em>Name</em>}</li>
 *   <li>{@link thecareunit.impl.DoctorImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link thecareunit.impl.DoctorImpl#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link thecareunit.impl.DoctorImpl#getFieldOfInterest <em>Field Of Interest</em>}</li>
 *   <li>{@link thecareunit.impl.DoctorImpl#getHospital <em>Hospital</em>}</li>
 *   <li>{@link thecareunit.impl.DoctorImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link thecareunit.impl.DoctorImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link thecareunit.impl.DoctorImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link thecareunit.impl.DoctorImpl#getRecommendations <em>Recommendations</em>}</li>
 *   <li>{@link thecareunit.impl.DoctorImpl#getDiscussions <em>Discussions</em>}</li>
 *   <li>{@link thecareunit.impl.DoctorImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link thecareunit.impl.DoctorImpl#getNewsfeed <em>Newsfeed</em>}</li>
 *   <li>{@link thecareunit.impl.DoctorImpl#getPosts <em>Posts</em>}</li>
 *   <li>{@link thecareunit.impl.DoctorImpl#getQueries <em>Queries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoctorImpl extends MinimalEObjectImpl.Container implements Doctor {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecialization() <em>Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialization()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIALIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecialization() <em>Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialization()
	 * @generated
	 * @ordered
	 */
	protected String specialization = SPECIALIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFieldOfInterest() <em>Field Of Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldOfInterest()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_OF_INTEREST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldOfInterest() <em>Field Of Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldOfInterest()
	 * @generated
	 * @ordered
	 */
	protected String fieldOfInterest = FIELD_OF_INTEREST_EDEFAULT;

	/**
	 * The default value of the '{@link #getHospital() <em>Hospital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospital()
	 * @generated
	 * @ordered
	 */
	protected static final String HOSPITAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHospital() <em>Hospital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospital()
	 * @generated
	 * @ordered
	 */
	protected String hospital = HOSPITAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getContact() <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTACT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected int contact = CONTACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comments;

	/**
	 * The cached value of the '{@link #getRecommendations() <em>Recommendations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendations()
	 * @generated
	 * @ordered
	 */
	protected EList<Recommendations> recommendations;

	/**
	 * The cached value of the '{@link #getDiscussions() <em>Discussions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscussions()
	 * @generated
	 * @ordered
	 */
	protected EList<Discussion> discussions;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> messages;

	/**
	 * The cached value of the '{@link #getNewsfeed() <em>Newsfeed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewsfeed()
	 * @generated
	 * @ordered
	 */
	protected Newsfeed newsfeed;

	/**
	 * The cached value of the '{@link #getPosts() <em>Posts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosts()
	 * @generated
	 * @ordered
	 */
	protected EList<Post> posts;

	/**
	 * The cached value of the '{@link #getQueries() <em>Queries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueries()
	 * @generated
	 * @ordered
	 */
	protected EList<Query> queries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoctorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThecareunitPackage.Literals.DOCTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThecareunitPackage.DOCTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThecareunitPackage.DOCTOR__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecialization() {
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialization(String newSpecialization) {
		String oldSpecialization = specialization;
		specialization = newSpecialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThecareunitPackage.DOCTOR__SPECIALIZATION,
					oldSpecialization, specialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFieldOfInterest() {
		return fieldOfInterest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldOfInterest(String newFieldOfInterest) {
		String oldFieldOfInterest = fieldOfInterest;
		fieldOfInterest = newFieldOfInterest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThecareunitPackage.DOCTOR__FIELD_OF_INTEREST,
					oldFieldOfInterest, fieldOfInterest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHospital() {
		return hospital;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHospital(String newHospital) {
		String oldHospital = hospital;
		hospital = newHospital;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThecareunitPackage.DOCTOR__HOSPITAL, oldHospital,
					hospital));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThecareunitPackage.DOCTOR__LOCATION, oldLocation,
					location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getContact() {
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContact(int newContact) {
		int oldContact = contact;
		contact = newContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThecareunitPackage.DOCTOR__CONTACT, oldContact,
					contact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getComments() {
		if (comments == null) {
			comments = new EObjectResolvingEList<Comment>(Comment.class, this, ThecareunitPackage.DOCTOR__COMMENTS);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Recommendations> getRecommendations() {
		if (recommendations == null) {
			recommendations = new EObjectWithInverseResolvingEList.ManyInverse<Recommendations>(Recommendations.class,
					this, ThecareunitPackage.DOCTOR__RECOMMENDATIONS, ThecareunitPackage.RECOMMENDATIONS__DOCTORS);
		}
		return recommendations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Discussion> getDiscussions() {
		if (discussions == null) {
			discussions = new EObjectResolvingEList<Discussion>(Discussion.class, this,
					ThecareunitPackage.DOCTOR__DISCUSSIONS);
		}
		return discussions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getMessages() {
		if (messages == null) {
			messages = new EObjectResolvingEList<Message>(Message.class, this, ThecareunitPackage.DOCTOR__MESSAGES);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Newsfeed getNewsfeed() {
		if (newsfeed != null && newsfeed.eIsProxy()) {
			InternalEObject oldNewsfeed = (InternalEObject) newsfeed;
			newsfeed = (Newsfeed) eResolveProxy(oldNewsfeed);
			if (newsfeed != oldNewsfeed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThecareunitPackage.DOCTOR__NEWSFEED,
							oldNewsfeed, newsfeed));
			}
		}
		return newsfeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Newsfeed basicGetNewsfeed() {
		return newsfeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewsfeed(Newsfeed newNewsfeed) {
		Newsfeed oldNewsfeed = newsfeed;
		newsfeed = newNewsfeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThecareunitPackage.DOCTOR__NEWSFEED, oldNewsfeed,
					newsfeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Post> getPosts() {
		if (posts == null) {
			posts = new EObjectResolvingEList<Post>(Post.class, this, ThecareunitPackage.DOCTOR__POSTS);
		}
		return posts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Query> getQueries() {
		if (queries == null) {
			queries = new EObjectResolvingEList<Query>(Query.class, this, ThecareunitPackage.DOCTOR__QUERIES);
		}
		return queries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void searchDoctor(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void followdoctor() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editProfileInformation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void viewProfile() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendQuery() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void viewRecommendations() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ThecareunitPackage.DOCTOR__RECOMMENDATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRecommendations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ThecareunitPackage.DOCTOR__RECOMMENDATIONS:
			return ((InternalEList<?>) getRecommendations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ThecareunitPackage.DOCTOR__NAME:
			return getName();
		case ThecareunitPackage.DOCTOR__EMAIL:
			return getEmail();
		case ThecareunitPackage.DOCTOR__SPECIALIZATION:
			return getSpecialization();
		case ThecareunitPackage.DOCTOR__FIELD_OF_INTEREST:
			return getFieldOfInterest();
		case ThecareunitPackage.DOCTOR__HOSPITAL:
			return getHospital();
		case ThecareunitPackage.DOCTOR__LOCATION:
			return getLocation();
		case ThecareunitPackage.DOCTOR__CONTACT:
			return getContact();
		case ThecareunitPackage.DOCTOR__COMMENTS:
			return getComments();
		case ThecareunitPackage.DOCTOR__RECOMMENDATIONS:
			return getRecommendations();
		case ThecareunitPackage.DOCTOR__DISCUSSIONS:
			return getDiscussions();
		case ThecareunitPackage.DOCTOR__MESSAGES:
			return getMessages();
		case ThecareunitPackage.DOCTOR__NEWSFEED:
			if (resolve)
				return getNewsfeed();
			return basicGetNewsfeed();
		case ThecareunitPackage.DOCTOR__POSTS:
			return getPosts();
		case ThecareunitPackage.DOCTOR__QUERIES:
			return getQueries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ThecareunitPackage.DOCTOR__NAME:
			setName((String) newValue);
			return;
		case ThecareunitPackage.DOCTOR__EMAIL:
			setEmail((String) newValue);
			return;
		case ThecareunitPackage.DOCTOR__SPECIALIZATION:
			setSpecialization((String) newValue);
			return;
		case ThecareunitPackage.DOCTOR__FIELD_OF_INTEREST:
			setFieldOfInterest((String) newValue);
			return;
		case ThecareunitPackage.DOCTOR__HOSPITAL:
			setHospital((String) newValue);
			return;
		case ThecareunitPackage.DOCTOR__LOCATION:
			setLocation((String) newValue);
			return;
		case ThecareunitPackage.DOCTOR__CONTACT:
			setContact((Integer) newValue);
			return;
		case ThecareunitPackage.DOCTOR__COMMENTS:
			getComments().clear();
			getComments().addAll((Collection<? extends Comment>) newValue);
			return;
		case ThecareunitPackage.DOCTOR__RECOMMENDATIONS:
			getRecommendations().clear();
			getRecommendations().addAll((Collection<? extends Recommendations>) newValue);
			return;
		case ThecareunitPackage.DOCTOR__DISCUSSIONS:
			getDiscussions().clear();
			getDiscussions().addAll((Collection<? extends Discussion>) newValue);
			return;
		case ThecareunitPackage.DOCTOR__MESSAGES:
			getMessages().clear();
			getMessages().addAll((Collection<? extends Message>) newValue);
			return;
		case ThecareunitPackage.DOCTOR__NEWSFEED:
			setNewsfeed((Newsfeed) newValue);
			return;
		case ThecareunitPackage.DOCTOR__POSTS:
			getPosts().clear();
			getPosts().addAll((Collection<? extends Post>) newValue);
			return;
		case ThecareunitPackage.DOCTOR__QUERIES:
			getQueries().clear();
			getQueries().addAll((Collection<? extends Query>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ThecareunitPackage.DOCTOR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ThecareunitPackage.DOCTOR__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case ThecareunitPackage.DOCTOR__SPECIALIZATION:
			setSpecialization(SPECIALIZATION_EDEFAULT);
			return;
		case ThecareunitPackage.DOCTOR__FIELD_OF_INTEREST:
			setFieldOfInterest(FIELD_OF_INTEREST_EDEFAULT);
			return;
		case ThecareunitPackage.DOCTOR__HOSPITAL:
			setHospital(HOSPITAL_EDEFAULT);
			return;
		case ThecareunitPackage.DOCTOR__LOCATION:
			setLocation(LOCATION_EDEFAULT);
			return;
		case ThecareunitPackage.DOCTOR__CONTACT:
			setContact(CONTACT_EDEFAULT);
			return;
		case ThecareunitPackage.DOCTOR__COMMENTS:
			getComments().clear();
			return;
		case ThecareunitPackage.DOCTOR__RECOMMENDATIONS:
			getRecommendations().clear();
			return;
		case ThecareunitPackage.DOCTOR__DISCUSSIONS:
			getDiscussions().clear();
			return;
		case ThecareunitPackage.DOCTOR__MESSAGES:
			getMessages().clear();
			return;
		case ThecareunitPackage.DOCTOR__NEWSFEED:
			setNewsfeed((Newsfeed) null);
			return;
		case ThecareunitPackage.DOCTOR__POSTS:
			getPosts().clear();
			return;
		case ThecareunitPackage.DOCTOR__QUERIES:
			getQueries().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ThecareunitPackage.DOCTOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ThecareunitPackage.DOCTOR__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case ThecareunitPackage.DOCTOR__SPECIALIZATION:
			return SPECIALIZATION_EDEFAULT == null ? specialization != null
					: !SPECIALIZATION_EDEFAULT.equals(specialization);
		case ThecareunitPackage.DOCTOR__FIELD_OF_INTEREST:
			return FIELD_OF_INTEREST_EDEFAULT == null ? fieldOfInterest != null
					: !FIELD_OF_INTEREST_EDEFAULT.equals(fieldOfInterest);
		case ThecareunitPackage.DOCTOR__HOSPITAL:
			return HOSPITAL_EDEFAULT == null ? hospital != null : !HOSPITAL_EDEFAULT.equals(hospital);
		case ThecareunitPackage.DOCTOR__LOCATION:
			return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
		case ThecareunitPackage.DOCTOR__CONTACT:
			return contact != CONTACT_EDEFAULT;
		case ThecareunitPackage.DOCTOR__COMMENTS:
			return comments != null && !comments.isEmpty();
		case ThecareunitPackage.DOCTOR__RECOMMENDATIONS:
			return recommendations != null && !recommendations.isEmpty();
		case ThecareunitPackage.DOCTOR__DISCUSSIONS:
			return discussions != null && !discussions.isEmpty();
		case ThecareunitPackage.DOCTOR__MESSAGES:
			return messages != null && !messages.isEmpty();
		case ThecareunitPackage.DOCTOR__NEWSFEED:
			return newsfeed != null;
		case ThecareunitPackage.DOCTOR__POSTS:
			return posts != null && !posts.isEmpty();
		case ThecareunitPackage.DOCTOR__QUERIES:
			return queries != null && !queries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ThecareunitPackage.DOCTOR___SEARCH_DOCTOR__STRING:
			searchDoctor((String) arguments.get(0));
			return null;
		case ThecareunitPackage.DOCTOR___FOLLOWDOCTOR:
			followdoctor();
			return null;
		case ThecareunitPackage.DOCTOR___EDIT_PROFILE_INFORMATION:
			editProfileInformation();
			return null;
		case ThecareunitPackage.DOCTOR___VIEW_PROFILE:
			viewProfile();
			return null;
		case ThecareunitPackage.DOCTOR___SEND_QUERY:
			sendQuery();
			return null;
		case ThecareunitPackage.DOCTOR___VIEW_RECOMMENDATIONS:
			viewRecommendations();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", email: ");
		result.append(email);
		result.append(", specialization: ");
		result.append(specialization);
		result.append(", fieldOfInterest: ");
		result.append(fieldOfInterest);
		result.append(", hospital: ");
		result.append(hospital);
		result.append(", location: ");
		result.append(location);
		result.append(", contact: ");
		result.append(contact);
		result.append(')');
		return result.toString();
	}

} //DoctorImpl
