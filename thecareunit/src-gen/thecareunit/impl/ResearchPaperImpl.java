/**
 */
package thecareunit.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import thecareunit.ResearchPaper;
import thecareunit.ThecareunitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Research Paper</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResearchPaperImpl extends RecommendationsImpl implements ResearchPaper {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResearchPaperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThecareunitPackage.Literals.RESEARCH_PAPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void viewResearchPaper() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void downloadPaper() {
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
		case ThecareunitPackage.RESEARCH_PAPER___VIEW_RESEARCH_PAPER:
			viewResearchPaper();
			return null;
		case ThecareunitPackage.RESEARCH_PAPER___DOWNLOAD_PAPER:
			downloadPaper();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ResearchPaperImpl
