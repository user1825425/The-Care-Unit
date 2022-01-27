/**
 */
package thecareunit.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import thecareunit.Admin;
import thecareunit.Comment;
import thecareunit.Discussion;
import thecareunit.Doctor;
import thecareunit.Message;
import thecareunit.Newsfeed;
import thecareunit.Post;
import thecareunit.Query;
import thecareunit.Recommendations;
import thecareunit.TheCareUnitSystem;
import thecareunit.ThecareunitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>The Care Unit System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link thecareunit.impl.TheCareUnitSystemImpl#getAdmin <em>Admin</em>}</li>
 *   <li>{@link thecareunit.impl.TheCareUnitSystemImpl#getDiscussions <em>Discussions</em>}</li>
 *   <li>{@link thecareunit.impl.TheCareUnitSystemImpl#getDoctors <em>Doctors</em>}</li>
 *   <li>{@link thecareunit.impl.TheCareUnitSystemImpl#getRecommendations <em>Recommendations</em>}</li>
 *   <li>{@link thecareunit.impl.TheCareUnitSystemImpl#getNewsfeed <em>Newsfeed</em>}</li>
 *   <li>{@link thecareunit.impl.TheCareUnitSystemImpl#getPosts <em>Posts</em>}</li>
 *   <li>{@link thecareunit.impl.TheCareUnitSystemImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link thecareunit.impl.TheCareUnitSystemImpl#getQueries <em>Queries</em>}</li>
 *   <li>{@link thecareunit.impl.TheCareUnitSystemImpl#getMessages <em>Messages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TheCareUnitSystemImpl extends MinimalEObjectImpl.Container implements TheCareUnitSystem {
	/**
	 * The cached value of the '{@link #getAdmin() <em>Admin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmin()
	 * @generated
	 * @ordered
	 */
	protected Admin admin;

	/**
	 * The cached value of the '{@link #getDiscussions() <em>Discussions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscussions()
	 * @generated
	 * @ordered
	 */
	protected EList<Discussion> discussions;

	/**
	 * The cached value of the '{@link #getDoctors() <em>Doctors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoctors()
	 * @generated
	 * @ordered
	 */
	protected EList<Doctor> doctors;

	/**
	 * The cached value of the '{@link #getRecommendations() <em>Recommendations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendations()
	 * @generated
	 * @ordered
	 */
	protected EList<Recommendations> recommendations;

	/**
	 * The cached value of the '{@link #getNewsfeed() <em>Newsfeed</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewsfeed()
	 * @generated
	 * @ordered
	 */
	protected EList<Newsfeed> newsfeed;

	/**
	 * The cached value of the '{@link #getPosts() <em>Posts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosts()
	 * @generated
	 * @ordered
	 */
	protected EList<Post> posts;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comments;

	/**
	 * The cached value of the '{@link #getQueries() <em>Queries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueries()
	 * @generated
	 * @ordered
	 */
	protected EList<Query> queries;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> messages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TheCareUnitSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThecareunitPackage.Literals.THE_CARE_UNIT_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Admin getAdmin() {
		return admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdmin(Admin newAdmin, NotificationChain msgs) {
		Admin oldAdmin = admin;
		admin = newAdmin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ThecareunitPackage.THE_CARE_UNIT_SYSTEM__ADMIN, oldAdmin, newAdmin);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdmin(Admin newAdmin) {
		if (newAdmin != admin) {
			NotificationChain msgs = null;
			if (admin != null)
				msgs = ((InternalEObject) admin).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ThecareunitPackage.THE_CARE_UNIT_SYSTEM__ADMIN, null, msgs);
			if (newAdmin != null)
				msgs = ((InternalEObject) newAdmin).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ThecareunitPackage.THE_CARE_UNIT_SYSTEM__ADMIN, null, msgs);
			msgs = basicSetAdmin(newAdmin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThecareunitPackage.THE_CARE_UNIT_SYSTEM__ADMIN,
					newAdmin, newAdmin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Discussion> getDiscussions() {
		if (discussions == null) {
			discussions = new EObjectContainmentEList<Discussion>(Discussion.class, this,
					ThecareunitPackage.THE_CARE_UNIT_SYSTEM__DISCUSSIONS);
		}
		return discussions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Doctor> getDoctors() {
		if (doctors == null) {
			doctors = new EObjectContainmentEList<Doctor>(Doctor.class, this,
					ThecareunitPackage.THE_CARE_UNIT_SYSTEM__DOCTORS);
		}
		return doctors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Recommendations> getRecommendations() {
		if (recommendations == null) {
			recommendations = new EObjectContainmentEList<Recommendations>(Recommendations.class, this,
					ThecareunitPackage.THE_CARE_UNIT_SYSTEM__RECOMMENDATIONS);
		}
		return recommendations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Newsfeed> getNewsfeed() {
		if (newsfeed == null) {
			newsfeed = new EObjectContainmentEList<Newsfeed>(Newsfeed.class, this,
					ThecareunitPackage.THE_CARE_UNIT_SYSTEM__NEWSFEED);
		}
		return newsfeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Post> getPosts() {
		if (posts == null) {
			posts = new EObjectContainmentEList<Post>(Post.class, this, ThecareunitPackage.THE_CARE_UNIT_SYSTEM__POSTS);
		}
		return posts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getComments() {
		if (comments == null) {
			comments = new EObjectContainmentEList<Comment>(Comment.class, this,
					ThecareunitPackage.THE_CARE_UNIT_SYSTEM__COMMENTS);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Query> getQueries() {
		if (queries == null) {
			queries = new EObjectContainmentEList<Query>(Query.class, this,
					ThecareunitPackage.THE_CARE_UNIT_SYSTEM__QUERIES);
		}
		return queries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getMessages() {
		if (messages == null) {
			messages = new EObjectContainmentEList<Message>(Message.class, this,
					ThecareunitPackage.THE_CARE_UNIT_SYSTEM__MESSAGES);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__ADMIN:
			return basicSetAdmin(null, msgs);
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__DISCUSSIONS:
			return ((InternalEList<?>) getDiscussions()).basicRemove(otherEnd, msgs);
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__DOCTORS:
			return ((InternalEList<?>) getDoctors()).basicRemove(otherEnd, msgs);
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__RECOMMENDATIONS:
			return ((InternalEList<?>) getRecommendations()).basicRemove(otherEnd, msgs);
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__NEWSFEED:
			return ((InternalEList<?>) getNewsfeed()).basicRemove(otherEnd, msgs);
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__POSTS:
			return ((InternalEList<?>) getPosts()).basicRemove(otherEnd, msgs);
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__COMMENTS:
			return ((InternalEList<?>) getComments()).basicRemove(otherEnd, msgs);
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__QUERIES:
			return ((InternalEList<?>) getQueries()).basicRemove(otherEnd, msgs);
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__MESSAGES:
			return ((InternalEList<?>) getMessages()).basicRemove(otherEnd, msgs);
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
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__ADMIN:
			return getAdmin();
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__DISCUSSIONS:
			return getDiscussions();
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__DOCTORS:
			return getDoctors();
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__RECOMMENDATIONS:
			return getRecommendations();
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__NEWSFEED:
			return getNewsfeed();
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__POSTS:
			return getPosts();
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__COMMENTS:
			return getComments();
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__QUERIES:
			return getQueries();
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__MESSAGES:
			return getMessages();
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
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__ADMIN:
			setAdmin((Admin) newValue);
			return;
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__DISCUSSIONS:
			getDiscussions().clear();
			getDiscussions().addAll((Collection<? extends Discussion>) newValue);
			return;
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__DOCTORS:
			getDoctors().clear();
			getDoctors().addAll((Collection<? extends Doctor>) newValue);
			return;
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__RECOMMENDATIONS:
			getRecommendations().clear();
			getRecommendations().addAll((Collection<? extends Recommendations>) newValue);
			return;
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__NEWSFEED:
			getNewsfeed().clear();
			getNewsfeed().addAll((Collection<? extends Newsfeed>) newValue);
			return;
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__POSTS:
			getPosts().clear();
			getPosts().addAll((Collection<? extends Post>) newValue);
			return;
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__COMMENTS:
			getComments().clear();
			getComments().addAll((Collection<? extends Comment>) newValue);
			return;
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__QUERIES:
			getQueries().clear();
			getQueries().addAll((Collection<? extends Query>) newValue);
			return;
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__MESSAGES:
			getMessages().clear();
			getMessages().addAll((Collection<? extends Message>) newValue);
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
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__ADMIN:
			setAdmin((Admin) null);
			return;
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__DISCUSSIONS:
			getDiscussions().clear();
			return;
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__DOCTORS:
			getDoctors().clear();
			return;
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__RECOMMENDATIONS:
			getRecommendations().clear();
			return;
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__NEWSFEED:
			getNewsfeed().clear();
			return;
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__POSTS:
			getPosts().clear();
			return;
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__COMMENTS:
			getComments().clear();
			return;
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__QUERIES:
			getQueries().clear();
			return;
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__MESSAGES:
			getMessages().clear();
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
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__ADMIN:
			return admin != null;
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__DISCUSSIONS:
			return discussions != null && !discussions.isEmpty();
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__DOCTORS:
			return doctors != null && !doctors.isEmpty();
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__RECOMMENDATIONS:
			return recommendations != null && !recommendations.isEmpty();
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__NEWSFEED:
			return newsfeed != null && !newsfeed.isEmpty();
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__POSTS:
			return posts != null && !posts.isEmpty();
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__COMMENTS:
			return comments != null && !comments.isEmpty();
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__QUERIES:
			return queries != null && !queries.isEmpty();
		case ThecareunitPackage.THE_CARE_UNIT_SYSTEM__MESSAGES:
			return messages != null && !messages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TheCareUnitSystemImpl
