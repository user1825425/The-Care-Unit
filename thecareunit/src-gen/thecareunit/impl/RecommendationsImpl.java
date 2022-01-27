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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import thecareunit.Doctor;
import thecareunit.Recommendations;
import thecareunit.ThecareunitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recommendations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link thecareunit.impl.RecommendationsImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link thecareunit.impl.RecommendationsImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link thecareunit.impl.RecommendationsImpl#getDoctors <em>Doctors</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RecommendationsImpl extends MinimalEObjectImpl.Container implements Recommendations {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDoctors() <em>Doctors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoctors()
	 * @generated
	 * @ordered
	 */
	protected EList<Doctor> doctors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecommendationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThecareunitPackage.Literals.RECOMMENDATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThecareunitPackage.RECOMMENDATIONS__TITLE, oldTitle,
					title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThecareunitPackage.RECOMMENDATIONS__AUTHOR, oldAuthor,
					author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Doctor> getDoctors() {
		if (doctors == null) {
			doctors = new EObjectWithInverseResolvingEList.ManyInverse<Doctor>(Doctor.class, this,
					ThecareunitPackage.RECOMMENDATIONS__DOCTORS, ThecareunitPackage.DOCTOR__RECOMMENDATIONS);
		}
		return doctors;
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
		case ThecareunitPackage.RECOMMENDATIONS__DOCTORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDoctors()).basicAdd(otherEnd, msgs);
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
		case ThecareunitPackage.RECOMMENDATIONS__DOCTORS:
			return ((InternalEList<?>) getDoctors()).basicRemove(otherEnd, msgs);
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
		case ThecareunitPackage.RECOMMENDATIONS__TITLE:
			return getTitle();
		case ThecareunitPackage.RECOMMENDATIONS__AUTHOR:
			return getAuthor();
		case ThecareunitPackage.RECOMMENDATIONS__DOCTORS:
			return getDoctors();
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
		case ThecareunitPackage.RECOMMENDATIONS__TITLE:
			setTitle((String) newValue);
			return;
		case ThecareunitPackage.RECOMMENDATIONS__AUTHOR:
			setAuthor((String) newValue);
			return;
		case ThecareunitPackage.RECOMMENDATIONS__DOCTORS:
			getDoctors().clear();
			getDoctors().addAll((Collection<? extends Doctor>) newValue);
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
		case ThecareunitPackage.RECOMMENDATIONS__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case ThecareunitPackage.RECOMMENDATIONS__AUTHOR:
			setAuthor(AUTHOR_EDEFAULT);
			return;
		case ThecareunitPackage.RECOMMENDATIONS__DOCTORS:
			getDoctors().clear();
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
		case ThecareunitPackage.RECOMMENDATIONS__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case ThecareunitPackage.RECOMMENDATIONS__AUTHOR:
			return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
		case ThecareunitPackage.RECOMMENDATIONS__DOCTORS:
			return doctors != null && !doctors.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (title: ");
		result.append(title);
		result.append(", author: ");
		result.append(author);
		result.append(')');
		return result.toString();
	}

} //RecommendationsImpl
