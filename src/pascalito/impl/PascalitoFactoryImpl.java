/**
 */
package pascalito.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import pascalito.Atribuicao;
import pascalito.Bloco;
import pascalito.CallProc;
import pascalito.CallProcedimento;
import pascalito.CallVariavel;
import pascalito.Comutativa;
import pascalito.Desvio;
import pascalito.ExpBinLogica;
import pascalito.ExpNeg;
import pascalito.Loop;
import pascalito.N_Comutativa;
import pascalito.NumberLiteral;
import pascalito.PascalitoFactory;
import pascalito.PascalitoPackage;
import pascalito.Procedimento;
import pascalito.Programa;
import pascalito.Variavel;
import pascalito.newRole15;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PascalitoFactoryImpl extends EFactoryImpl implements PascalitoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PascalitoFactory init() {
		try {
			PascalitoFactory thePascalitoFactory = (PascalitoFactory)EPackage.Registry.INSTANCE.getEFactory(PascalitoPackage.eNS_URI);
			if (thePascalitoFactory != null) {
				return thePascalitoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PascalitoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PascalitoFactoryImpl() {
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
			case PascalitoPackage.PROGRAMA: return createPrograma();
			case PascalitoPackage.BLOCO: return createBloco();
			case PascalitoPackage.CALL_VARIAVEL: return createCallVariavel();
			case PascalitoPackage.CALL_PROCEDIMENTO: return createCallProcedimento();
			case PascalitoPackage.ATRIBUICAO: return createAtribuicao();
			case PascalitoPackage.DESVIO: return createDesvio();
			case PascalitoPackage.LOOP: return createLoop();
			case PascalitoPackage.EXP_BIN_LOGICA: return createExpBinLogica();
			case PascalitoPackage.EXP_NEG: return createExpNeg();
			case PascalitoPackage.NEW_ROLE15: return createnewRole15();
			case PascalitoPackage.VARIAVEL: return createVariavel();
			case PascalitoPackage.PROCEDIMENTO: return createProcedimento();
			case PascalitoPackage.CALL_PROC: return createCallProc();
			case PascalitoPackage.NCOMUTATIVA: return createN_Comutativa();
			case PascalitoPackage.COMUTATIVA: return createComutativa();
			case PascalitoPackage.NUMBER_LITERAL: return createNumberLiteral();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programa createPrograma() {
		ProgramaImpl programa = new ProgramaImpl();
		return programa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bloco createBloco() {
		BlocoImpl bloco = new BlocoImpl();
		return bloco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallVariavel createCallVariavel() {
		CallVariavelImpl callVariavel = new CallVariavelImpl();
		return callVariavel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallProcedimento createCallProcedimento() {
		CallProcedimentoImpl callProcedimento = new CallProcedimentoImpl();
		return callProcedimento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atribuicao createAtribuicao() {
		AtribuicaoImpl atribuicao = new AtribuicaoImpl();
		return atribuicao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Desvio createDesvio() {
		DesvioImpl desvio = new DesvioImpl();
		return desvio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpBinLogica createExpBinLogica() {
		ExpBinLogicaImpl expBinLogica = new ExpBinLogicaImpl();
		return expBinLogica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpNeg createExpNeg() {
		ExpNegImpl expNeg = new ExpNegImpl();
		return expNeg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public newRole15 createnewRole15() {
		newRole15Impl newRole15 = new newRole15Impl();
		return newRole15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variavel createVariavel() {
		VariavelImpl variavel = new VariavelImpl();
		return variavel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedimento createProcedimento() {
		ProcedimentoImpl procedimento = new ProcedimentoImpl();
		return procedimento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallProc createCallProc() {
		CallProcImpl callProc = new CallProcImpl();
		return callProc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public N_Comutativa createN_Comutativa() {
		N_ComutativaImpl n_Comutativa = new N_ComutativaImpl();
		return n_Comutativa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comutativa createComutativa() {
		ComutativaImpl comutativa = new ComutativaImpl();
		return comutativa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberLiteral createNumberLiteral() {
		NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
		return numberLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PascalitoPackage getPascalitoPackage() {
		return (PascalitoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PascalitoPackage getPackage() {
		return PascalitoPackage.eINSTANCE;
	}

} //PascalitoFactoryImpl
