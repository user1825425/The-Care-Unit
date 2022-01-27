/**
 */
package thecareunit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thecareunit.Admin#getName <em>Name</em>}</li>
 *   <li>{@link thecareunit.Admin#getQueries <em>Queries</em>}</li>
 * </ul>
 *
 * @see thecareunit.ThecareunitPackage#getAdmin()
 * @model
 * @generated
 */
public interface Admin extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see thecareunit.ThecareunitPackage#getAdmin_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link thecareunit.Admin#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Queries</b></em>' reference list.
	 * The list contents are of type {@link thecareunit.Query}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queries</em>' reference list.
	 * @see thecareunit.ThecareunitPackage#getAdmin_Queries()
	 * @model
	 * @generated
	 */
	EList<Query> getQueries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void handleQueries();

} // Admin
