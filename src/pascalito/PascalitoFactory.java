/**
 */
package pascalito;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pascalito.PascalitoPackage
 * @generated
 */
public interface PascalitoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PascalitoFactory eINSTANCE = pascalito.impl.PascalitoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Programa</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Programa</em>'.
	 * @generated
	 */
	Programa createPrograma();

	/**
	 * Returns a new object of class '<em>Bloco</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bloco</em>'.
	 * @generated
	 */
	Bloco createBloco();

	/**
	 * Returns a new object of class '<em>Call Variavel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Variavel</em>'.
	 * @generated
	 */
	CallVariavel createCallVariavel();

	/**
	 * Returns a new object of class '<em>Call Procedimento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Procedimento</em>'.
	 * @generated
	 */
	CallProcedimento createCallProcedimento();

	/**
	 * Returns a new object of class '<em>Atribuicao</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atribuicao</em>'.
	 * @generated
	 */
	Atribuicao createAtribuicao();

	/**
	 * Returns a new object of class '<em>Desvio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Desvio</em>'.
	 * @generated
	 */
	Desvio createDesvio();

	/**
	 * Returns a new object of class '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop</em>'.
	 * @generated
	 */
	Loop createLoop();

	/**
	 * Returns a new object of class '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number</em>'.
	 * @generated
	 */
	Number createNumber();

	/**
	 * Returns a new object of class '<em>Exp Bin Logica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exp Bin Logica</em>'.
	 * @generated
	 */
	ExpBinLogica createExpBinLogica();

	/**
	 * Returns a new object of class '<em>Exp Bin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exp Bin</em>'.
	 * @generated
	 */
	ExpBin createExpBin();

	/**
	 * Returns a new object of class '<em>Exp Neg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exp Neg</em>'.
	 * @generated
	 */
	ExpNeg createExpNeg();

	/**
	 * Returns a new object of class '<em>new Role15</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>new Role15</em>'.
	 * @generated
	 */
	newRole15 createnewRole15();

	/**
	 * Returns a new object of class '<em>Variavel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variavel</em>'.
	 * @generated
	 */
	Variavel createVariavel();

	/**
	 * Returns a new object of class '<em>Procedimento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedimento</em>'.
	 * @generated
	 */
	Procedimento createProcedimento();

	/**
	 * Returns a new object of class '<em>Call Proc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Proc</em>'.
	 * @generated
	 */
	CallProc createCallProc();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PascalitoPackage getPascalitoPackage();

} //PascalitoFactory
