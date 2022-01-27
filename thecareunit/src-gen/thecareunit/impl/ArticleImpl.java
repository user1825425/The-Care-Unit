/**
 */
package thecareunit.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import thecareunit.Article;
import thecareunit.ThecareunitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Article</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ArticleImpl extends RecommendationsImpl implements Article {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArticleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThecareunitPackage.Literals.ARTICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void viewArticle() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void downloadArticle() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ThecareunitPackage.ARTICLE___VIEW_ARTICLE:
			viewArticle();
			return null;
		case ThecareunitPackage.ARTICLE___DOWNLOAD_ARTICLE:
			downloadArticle();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ArticleImpl
