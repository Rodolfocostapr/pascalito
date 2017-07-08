/**
 */
package pascalito;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see pascalito.PascalitoFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface PascalitoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pascalito";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/pascalito";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pascalito";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PascalitoPackage eINSTANCE = pascalito.impl.PascalitoPackageImpl.init();

	/**
	 * The meta object id for the '{@link pascalito.impl.ProgramaImpl <em>Programa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.ProgramaImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getPrograma()
	 * @generated
	 */
	int PROGRAMA = 0;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA__IDENT = 0;

	/**
	 * The feature id for the '<em><b>Bloco</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA__BLOCO = 1;

	/**
	 * The number of structural features of the '<em>Programa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Programa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pascalito.impl.BlocoImpl <em>Bloco</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.BlocoImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getBloco()
	 * @generated
	 */
	int BLOCO = 1;

	/**
	 * The feature id for the '<em><b>Defvariavel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCO__DEFVARIAVEL = 0;

	/**
	 * The feature id for the '<em><b>Defprocedimento</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCO__DEFPROCEDIMENTO = 1;

	/**
	 * The feature id for the '<em><b>Executa</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCO__EXECUTA = 2;

	/**
	 * The number of structural features of the '<em>Bloco</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Bloco</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pascalito.impl.ExpressaoImpl <em>Expressao</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.ExpressaoImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getExpressao()
	 * @generated
	 */
	int EXPRESSAO = 8;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSAO__LEFT = 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSAO__RIGHT = 1;

	/**
	 * The number of structural features of the '<em>Expressao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSAO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Expressao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSAO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pascalito.impl.CallVariavelImpl <em>Call Variavel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.CallVariavelImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getCallVariavel()
	 * @generated
	 */
	int CALL_VARIAVEL = 2;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VARIAVEL__LEFT = EXPRESSAO__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VARIAVEL__RIGHT = EXPRESSAO__RIGHT;

	/**
	 * The feature id for the '<em><b>Representa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VARIAVEL__REPRESENTA = EXPRESSAO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Variavel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VARIAVEL_FEATURE_COUNT = EXPRESSAO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Call Variavel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VARIAVEL_OPERATION_COUNT = EXPRESSAO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pascalito.impl.ComandoImpl <em>Comando</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.ComandoImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getComando()
	 * @generated
	 */
	int COMANDO = 3;

	/**
	 * The number of structural features of the '<em>Comando</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMANDO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Comando</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMANDO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pascalito.impl.CallProcedimentoImpl <em>Call Procedimento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.CallProcedimentoImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getCallProcedimento()
	 * @generated
	 */
	int CALL_PROCEDIMENTO = 4;

	/**
	 * The feature id for the '<em><b>Definido</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROCEDIMENTO__DEFINIDO = COMANDO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parametro</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROCEDIMENTO__PARAMETRO = COMANDO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call Procedimento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROCEDIMENTO_FEATURE_COUNT = COMANDO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Call Procedimento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROCEDIMENTO_OPERATION_COUNT = COMANDO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pascalito.impl.AtribuicaoImpl <em>Atribuicao</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.AtribuicaoImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getAtribuicao()
	 * @generated
	 */
	int ATRIBUICAO = 5;

	/**
	 * The feature id for the '<em><b>Atribui</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUICAO__ATRIBUI = COMANDO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Atribui Resultado</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUICAO__ATRIBUI_RESULTADO = COMANDO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Atribuicao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUICAO_FEATURE_COUNT = COMANDO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Atribuicao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUICAO_OPERATION_COUNT = COMANDO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pascalito.impl.DesvioImpl <em>Desvio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.DesvioImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getDesvio()
	 * @generated
	 */
	int DESVIO = 6;

	/**
	 * The feature id for the '<em><b>Se</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESVIO__SE = COMANDO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Faca</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESVIO__FACA = COMANDO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Se Nao</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESVIO__SE_NAO = COMANDO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Desvio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESVIO_FEATURE_COUNT = COMANDO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Desvio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESVIO_OPERATION_COUNT = COMANDO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pascalito.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.LoopImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 7;

	/**
	 * The feature id for the '<em><b>Se</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__SE = COMANDO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Faca</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__FACA = COMANDO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = COMANDO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = COMANDO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pascalito.impl.ExpBinLogicaImpl <em>Exp Bin Logica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.ExpBinLogicaImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getExpBinLogica()
	 * @generated
	 */
	int EXP_BIN_LOGICA = 9;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_BIN_LOGICA__LEFT = EXPRESSAO__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_BIN_LOGICA__RIGHT = EXPRESSAO__RIGHT;

	/**
	 * The meta object id for the '{@link pascalito.impl.ExpNegImpl <em>Exp Neg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.ExpNegImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getExpNeg()
	 * @generated
	 */
	int EXP_NEG = 10;

	/**
	 * The meta object id for the '{@link pascalito.impl.newRole15Impl <em>new Role15</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.newRole15Impl
	 * @see pascalito.impl.PascalitoPackageImpl#getnewRole15()
	 * @generated
	 */
	int NEW_ROLE15 = 11;

	/**
	 * The meta object id for the '{@link pascalito.impl.VariavelImpl <em>Variavel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.VariavelImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getVariavel()
	 * @generated
	 */
	int VARIAVEL = 12;

	/**
	 * The meta object id for the '{@link pascalito.impl.ProcedimentoImpl <em>Procedimento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.ProcedimentoImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getProcedimento()
	 * @generated
	 */
	int PROCEDIMENTO = 13;

	/**
	 * The meta object id for the '{@link pascalito.impl.CallProcImpl <em>Call Proc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.CallProcImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getCallProc()
	 * @generated
	 */
	int CALL_PROC = 14;

	/**
	 * The number of structural features of the '<em>Exp Bin Logica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_BIN_LOGICA_FEATURE_COUNT = EXPRESSAO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exp Bin Logica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_BIN_LOGICA_OPERATION_COUNT = EXPRESSAO_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_NEG__LEFT = EXPRESSAO__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_NEG__RIGHT = EXPRESSAO__RIGHT;

	/**
	 * The feature id for the '<em><b>Nega</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_NEG__NEGA = EXPRESSAO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exp Neg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_NEG_FEATURE_COUNT = EXPRESSAO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exp Neg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_NEG_OPERATION_COUNT = EXPRESSAO_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>new Role15</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ROLE15_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>new Role15</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ROLE15_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIAVEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIAVEL__TIPO = 1;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIAVEL__VALOR = 2;

	/**
	 * The number of structural features of the '<em>Variavel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIAVEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variavel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIAVEL_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Bloco</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMENTO__BLOCO = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMENTO__NAME = 1;

	/**
	 * The feature id for the '<em><b>Parametro</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMENTO__PARAMETRO = 2;

	/**
	 * The number of structural features of the '<em>Procedimento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMENTO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Procedimento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMENTO_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROC__LEFT = EXPRESSAO__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROC__RIGHT = EXPRESSAO__RIGHT;

	/**
	 * The feature id for the '<em><b>Representa Proc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROC__REPRESENTA_PROC = EXPRESSAO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parametro</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROC__PARAMETRO = EXPRESSAO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call Proc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROC_FEATURE_COUNT = EXPRESSAO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Call Proc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROC_OPERATION_COUNT = EXPRESSAO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pascalito.impl.N_ComutativaImpl <em>NComutativa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.N_ComutativaImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getN_Comutativa()
	 * @generated
	 */
	int NCOMUTATIVA = 15;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NCOMUTATIVA__LEFT = EXPRESSAO__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NCOMUTATIVA__RIGHT = EXPRESSAO__RIGHT;

	/**
	 * The number of structural features of the '<em>NComutativa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NCOMUTATIVA_FEATURE_COUNT = EXPRESSAO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>NComutativa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NCOMUTATIVA_OPERATION_COUNT = EXPRESSAO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pascalito.impl.ComutativaImpl <em>Comutativa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.ComutativaImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getComutativa()
	 * @generated
	 */
	int COMUTATIVA = 16;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUTATIVA__LEFT = EXPRESSAO__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUTATIVA__RIGHT = EXPRESSAO__RIGHT;

	/**
	 * The number of structural features of the '<em>Comutativa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUTATIVA_FEATURE_COUNT = EXPRESSAO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Comutativa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUTATIVA_OPERATION_COUNT = EXPRESSAO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pascalito.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.NumberLiteralImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getNumberLiteral()
	 * @generated
	 */
	int NUMBER_LITERAL = 17;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL__LEFT = EXPRESSAO__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL__RIGHT = EXPRESSAO__RIGHT;

	/**
	 * The number of structural features of the '<em>Number Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_FEATURE_COUNT = EXPRESSAO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_OPERATION_COUNT = EXPRESSAO_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link pascalito.Programa <em>Programa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programa</em>'.
	 * @see pascalito.Programa
	 * @generated
	 */
	EClass getPrograma();

	/**
	 * Returns the meta object for the attribute '{@link pascalito.Programa#getIdent <em>Ident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ident</em>'.
	 * @see pascalito.Programa#getIdent()
	 * @see #getPrograma()
	 * @generated
	 */
	EAttribute getPrograma_Ident();

	/**
	 * Returns the meta object for the containment reference '{@link pascalito.Programa#getBloco <em>Bloco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bloco</em>'.
	 * @see pascalito.Programa#getBloco()
	 * @see #getPrograma()
	 * @generated
	 */
	EReference getPrograma_Bloco();

	/**
	 * Returns the meta object for class '{@link pascalito.Bloco <em>Bloco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bloco</em>'.
	 * @see pascalito.Bloco
	 * @generated
	 */
	EClass getBloco();

	/**
	 * Returns the meta object for the containment reference list '{@link pascalito.Bloco#getDefvariavel <em>Defvariavel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defvariavel</em>'.
	 * @see pascalito.Bloco#getDefvariavel()
	 * @see #getBloco()
	 * @generated
	 */
	EReference getBloco_Defvariavel();

	/**
	 * Returns the meta object for the containment reference list '{@link pascalito.Bloco#getDefprocedimento <em>Defprocedimento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defprocedimento</em>'.
	 * @see pascalito.Bloco#getDefprocedimento()
	 * @see #getBloco()
	 * @generated
	 */
	EReference getBloco_Defprocedimento();

	/**
	 * Returns the meta object for the containment reference list '{@link pascalito.Bloco#getExecuta <em>Executa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executa</em>'.
	 * @see pascalito.Bloco#getExecuta()
	 * @see #getBloco()
	 * @generated
	 */
	EReference getBloco_Executa();

	/**
	 * Returns the meta object for class '{@link pascalito.CallVariavel <em>Call Variavel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Variavel</em>'.
	 * @see pascalito.CallVariavel
	 * @generated
	 */
	EClass getCallVariavel();

	/**
	 * Returns the meta object for the reference '{@link pascalito.CallVariavel#getRepresenta <em>Representa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Representa</em>'.
	 * @see pascalito.CallVariavel#getRepresenta()
	 * @see #getCallVariavel()
	 * @generated
	 */
	EReference getCallVariavel_Representa();

	/**
	 * Returns the meta object for class '{@link pascalito.Comando <em>Comando</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comando</em>'.
	 * @see pascalito.Comando
	 * @generated
	 */
	EClass getComando();

	/**
	 * Returns the meta object for class '{@link pascalito.CallProcedimento <em>Call Procedimento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Procedimento</em>'.
	 * @see pascalito.CallProcedimento
	 * @generated
	 */
	EClass getCallProcedimento();

	/**
	 * Returns the meta object for the reference '{@link pascalito.CallProcedimento#getDefinido <em>Definido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definido</em>'.
	 * @see pascalito.CallProcedimento#getDefinido()
	 * @see #getCallProcedimento()
	 * @generated
	 */
	EReference getCallProcedimento_Definido();

	/**
	 * Returns the meta object for the containment reference list '{@link pascalito.CallProcedimento#getParametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametro</em>'.
	 * @see pascalito.CallProcedimento#getParametro()
	 * @see #getCallProcedimento()
	 * @generated
	 */
	EReference getCallProcedimento_Parametro();

	/**
	 * Returns the meta object for class '{@link pascalito.Atribuicao <em>Atribuicao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atribuicao</em>'.
	 * @see pascalito.Atribuicao
	 * @generated
	 */
	EClass getAtribuicao();

	/**
	 * Returns the meta object for the reference '{@link pascalito.Atribuicao#getAtribui <em>Atribui</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Atribui</em>'.
	 * @see pascalito.Atribuicao#getAtribui()
	 * @see #getAtribuicao()
	 * @generated
	 */
	EReference getAtribuicao_Atribui();

	/**
	 * Returns the meta object for the containment reference '{@link pascalito.Atribuicao#getAtribuiResultado <em>Atribui Resultado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Atribui Resultado</em>'.
	 * @see pascalito.Atribuicao#getAtribuiResultado()
	 * @see #getAtribuicao()
	 * @generated
	 */
	EReference getAtribuicao_AtribuiResultado();

	/**
	 * Returns the meta object for class '{@link pascalito.Desvio <em>Desvio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Desvio</em>'.
	 * @see pascalito.Desvio
	 * @generated
	 */
	EClass getDesvio();

	/**
	 * Returns the meta object for the containment reference '{@link pascalito.Desvio#getSe <em>Se</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Se</em>'.
	 * @see pascalito.Desvio#getSe()
	 * @see #getDesvio()
	 * @generated
	 */
	EReference getDesvio_Se();

	/**
	 * Returns the meta object for the containment reference list '{@link pascalito.Desvio#getFaca <em>Faca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Faca</em>'.
	 * @see pascalito.Desvio#getFaca()
	 * @see #getDesvio()
	 * @generated
	 */
	EReference getDesvio_Faca();

	/**
	 * Returns the meta object for the containment reference list '{@link pascalito.Desvio#getSeNao <em>Se Nao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Se Nao</em>'.
	 * @see pascalito.Desvio#getSeNao()
	 * @see #getDesvio()
	 * @generated
	 */
	EReference getDesvio_SeNao();

	/**
	 * Returns the meta object for class '{@link pascalito.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see pascalito.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference '{@link pascalito.Loop#getSe <em>Se</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Se</em>'.
	 * @see pascalito.Loop#getSe()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Se();

	/**
	 * Returns the meta object for the containment reference list '{@link pascalito.Loop#getFaca <em>Faca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Faca</em>'.
	 * @see pascalito.Loop#getFaca()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Faca();

	/**
	 * Returns the meta object for class '{@link pascalito.Expressao <em>Expressao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expressao</em>'.
	 * @see pascalito.Expressao
	 * @generated
	 */
	EClass getExpressao();

	/**
	 * Returns the meta object for the containment reference '{@link pascalito.Expressao#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see pascalito.Expressao#getLeft()
	 * @see #getExpressao()
	 * @generated
	 */
	EReference getExpressao_Left();

	/**
	 * Returns the meta object for the containment reference '{@link pascalito.Expressao#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see pascalito.Expressao#getRight()
	 * @see #getExpressao()
	 * @generated
	 */
	EReference getExpressao_Right();

	/**
	 * Returns the meta object for class '{@link pascalito.ExpBinLogica <em>Exp Bin Logica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exp Bin Logica</em>'.
	 * @see pascalito.ExpBinLogica
	 * @generated
	 */
	EClass getExpBinLogica();

	/**
	 * Returns the meta object for class '{@link pascalito.ExpNeg <em>Exp Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exp Neg</em>'.
	 * @see pascalito.ExpNeg
	 * @generated
	 */
	EClass getExpNeg();

	/**
	 * Returns the meta object for the containment reference '{@link pascalito.ExpNeg#getNega <em>Nega</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nega</em>'.
	 * @see pascalito.ExpNeg#getNega()
	 * @see #getExpNeg()
	 * @generated
	 */
	EReference getExpNeg_Nega();

	/**
	 * Returns the meta object for class '{@link pascalito.newRole15 <em>new Role15</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>new Role15</em>'.
	 * @see pascalito.newRole15
	 * @generated
	 */
	EClass getnewRole15();

	/**
	 * Returns the meta object for class '{@link pascalito.Variavel <em>Variavel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variavel</em>'.
	 * @see pascalito.Variavel
	 * @generated
	 */
	EClass getVariavel();

	/**
	 * Returns the meta object for the attribute '{@link pascalito.Variavel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pascalito.Variavel#getName()
	 * @see #getVariavel()
	 * @generated
	 */
	EAttribute getVariavel_Name();

	/**
	 * Returns the meta object for the attribute '{@link pascalito.Variavel#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see pascalito.Variavel#getTipo()
	 * @see #getVariavel()
	 * @generated
	 */
	EAttribute getVariavel_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link pascalito.Variavel#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see pascalito.Variavel#getValor()
	 * @see #getVariavel()
	 * @generated
	 */
	EAttribute getVariavel_Valor();

	/**
	 * Returns the meta object for class '{@link pascalito.Procedimento <em>Procedimento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedimento</em>'.
	 * @see pascalito.Procedimento
	 * @generated
	 */
	EClass getProcedimento();

	/**
	 * Returns the meta object for the containment reference '{@link pascalito.Procedimento#getBloco <em>Bloco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bloco</em>'.
	 * @see pascalito.Procedimento#getBloco()
	 * @see #getProcedimento()
	 * @generated
	 */
	EReference getProcedimento_Bloco();

	/**
	 * Returns the meta object for the attribute '{@link pascalito.Procedimento#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pascalito.Procedimento#getName()
	 * @see #getProcedimento()
	 * @generated
	 */
	EAttribute getProcedimento_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pascalito.Procedimento#getParametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametro</em>'.
	 * @see pascalito.Procedimento#getParametro()
	 * @see #getProcedimento()
	 * @generated
	 */
	EReference getProcedimento_Parametro();

	/**
	 * Returns the meta object for class '{@link pascalito.CallProc <em>Call Proc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Proc</em>'.
	 * @see pascalito.CallProc
	 * @generated
	 */
	EClass getCallProc();

	/**
	 * Returns the meta object for the reference '{@link pascalito.CallProc#getRepresentaProc <em>Representa Proc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Representa Proc</em>'.
	 * @see pascalito.CallProc#getRepresentaProc()
	 * @see #getCallProc()
	 * @generated
	 */
	EReference getCallProc_RepresentaProc();

	/**
	 * Returns the meta object for the containment reference list '{@link pascalito.CallProc#getParametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametro</em>'.
	 * @see pascalito.CallProc#getParametro()
	 * @see #getCallProc()
	 * @generated
	 */
	EReference getCallProc_Parametro();

	/**
	 * Returns the meta object for class '{@link pascalito.N_Comutativa <em>NComutativa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NComutativa</em>'.
	 * @see pascalito.N_Comutativa
	 * @generated
	 */
	EClass getN_Comutativa();

	/**
	 * Returns the meta object for class '{@link pascalito.Comutativa <em>Comutativa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comutativa</em>'.
	 * @see pascalito.Comutativa
	 * @generated
	 */
	EClass getComutativa();

	/**
	 * Returns the meta object for class '{@link pascalito.NumberLiteral <em>Number Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Literal</em>'.
	 * @see pascalito.NumberLiteral
	 * @generated
	 */
	EClass getNumberLiteral();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PascalitoFactory getPascalitoFactory();

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
		 * The meta object literal for the '{@link pascalito.impl.ProgramaImpl <em>Programa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.ProgramaImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getPrograma()
		 * @generated
		 */
		EClass PROGRAMA = eINSTANCE.getPrograma();

		/**
		 * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMA__IDENT = eINSTANCE.getPrograma_Ident();

		/**
		 * The meta object literal for the '<em><b>Bloco</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMA__BLOCO = eINSTANCE.getPrograma_Bloco();

		/**
		 * The meta object literal for the '{@link pascalito.impl.BlocoImpl <em>Bloco</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.BlocoImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getBloco()
		 * @generated
		 */
		EClass BLOCO = eINSTANCE.getBloco();

		/**
		 * The meta object literal for the '<em><b>Defvariavel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCO__DEFVARIAVEL = eINSTANCE.getBloco_Defvariavel();

		/**
		 * The meta object literal for the '<em><b>Defprocedimento</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCO__DEFPROCEDIMENTO = eINSTANCE.getBloco_Defprocedimento();

		/**
		 * The meta object literal for the '<em><b>Executa</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCO__EXECUTA = eINSTANCE.getBloco_Executa();

		/**
		 * The meta object literal for the '{@link pascalito.impl.CallVariavelImpl <em>Call Variavel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.CallVariavelImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getCallVariavel()
		 * @generated
		 */
		EClass CALL_VARIAVEL = eINSTANCE.getCallVariavel();

		/**
		 * The meta object literal for the '<em><b>Representa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_VARIAVEL__REPRESENTA = eINSTANCE.getCallVariavel_Representa();

		/**
		 * The meta object literal for the '{@link pascalito.impl.ComandoImpl <em>Comando</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.ComandoImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getComando()
		 * @generated
		 */
		EClass COMANDO = eINSTANCE.getComando();

		/**
		 * The meta object literal for the '{@link pascalito.impl.CallProcedimentoImpl <em>Call Procedimento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.CallProcedimentoImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getCallProcedimento()
		 * @generated
		 */
		EClass CALL_PROCEDIMENTO = eINSTANCE.getCallProcedimento();

		/**
		 * The meta object literal for the '<em><b>Definido</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_PROCEDIMENTO__DEFINIDO = eINSTANCE.getCallProcedimento_Definido();

		/**
		 * The meta object literal for the '<em><b>Parametro</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_PROCEDIMENTO__PARAMETRO = eINSTANCE.getCallProcedimento_Parametro();

		/**
		 * The meta object literal for the '{@link pascalito.impl.AtribuicaoImpl <em>Atribuicao</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.AtribuicaoImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getAtribuicao()
		 * @generated
		 */
		EClass ATRIBUICAO = eINSTANCE.getAtribuicao();

		/**
		 * The meta object literal for the '<em><b>Atribui</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATRIBUICAO__ATRIBUI = eINSTANCE.getAtribuicao_Atribui();

		/**
		 * The meta object literal for the '<em><b>Atribui Resultado</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATRIBUICAO__ATRIBUI_RESULTADO = eINSTANCE.getAtribuicao_AtribuiResultado();

		/**
		 * The meta object literal for the '{@link pascalito.impl.DesvioImpl <em>Desvio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.DesvioImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getDesvio()
		 * @generated
		 */
		EClass DESVIO = eINSTANCE.getDesvio();

		/**
		 * The meta object literal for the '<em><b>Se</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESVIO__SE = eINSTANCE.getDesvio_Se();

		/**
		 * The meta object literal for the '<em><b>Faca</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESVIO__FACA = eINSTANCE.getDesvio_Faca();

		/**
		 * The meta object literal for the '<em><b>Se Nao</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESVIO__SE_NAO = eINSTANCE.getDesvio_SeNao();

		/**
		 * The meta object literal for the '{@link pascalito.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.LoopImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Se</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__SE = eINSTANCE.getLoop_Se();

		/**
		 * The meta object literal for the '<em><b>Faca</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__FACA = eINSTANCE.getLoop_Faca();

		/**
		 * The meta object literal for the '{@link pascalito.impl.ExpressaoImpl <em>Expressao</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.ExpressaoImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getExpressao()
		 * @generated
		 */
		EClass EXPRESSAO = eINSTANCE.getExpressao();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSAO__LEFT = eINSTANCE.getExpressao_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSAO__RIGHT = eINSTANCE.getExpressao_Right();

		/**
		 * The meta object literal for the '{@link pascalito.impl.ExpBinLogicaImpl <em>Exp Bin Logica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.ExpBinLogicaImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getExpBinLogica()
		 * @generated
		 */
		EClass EXP_BIN_LOGICA = eINSTANCE.getExpBinLogica();

		/**
		 * The meta object literal for the '{@link pascalito.impl.ExpNegImpl <em>Exp Neg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.ExpNegImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getExpNeg()
		 * @generated
		 */
		EClass EXP_NEG = eINSTANCE.getExpNeg();

		/**
		 * The meta object literal for the '<em><b>Nega</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXP_NEG__NEGA = eINSTANCE.getExpNeg_Nega();

		/**
		 * The meta object literal for the '{@link pascalito.impl.newRole15Impl <em>new Role15</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.newRole15Impl
		 * @see pascalito.impl.PascalitoPackageImpl#getnewRole15()
		 * @generated
		 */
		EClass NEW_ROLE15 = eINSTANCE.getnewRole15();

		/**
		 * The meta object literal for the '{@link pascalito.impl.VariavelImpl <em>Variavel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.VariavelImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getVariavel()
		 * @generated
		 */
		EClass VARIAVEL = eINSTANCE.getVariavel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIAVEL__NAME = eINSTANCE.getVariavel_Name();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIAVEL__TIPO = eINSTANCE.getVariavel_Tipo();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIAVEL__VALOR = eINSTANCE.getVariavel_Valor();

		/**
		 * The meta object literal for the '{@link pascalito.impl.ProcedimentoImpl <em>Procedimento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.ProcedimentoImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getProcedimento()
		 * @generated
		 */
		EClass PROCEDIMENTO = eINSTANCE.getProcedimento();

		/**
		 * The meta object literal for the '<em><b>Bloco</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDIMENTO__BLOCO = eINSTANCE.getProcedimento_Bloco();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDIMENTO__NAME = eINSTANCE.getProcedimento_Name();

		/**
		 * The meta object literal for the '<em><b>Parametro</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDIMENTO__PARAMETRO = eINSTANCE.getProcedimento_Parametro();

		/**
		 * The meta object literal for the '{@link pascalito.impl.CallProcImpl <em>Call Proc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.CallProcImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getCallProc()
		 * @generated
		 */
		EClass CALL_PROC = eINSTANCE.getCallProc();

		/**
		 * The meta object literal for the '<em><b>Representa Proc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_PROC__REPRESENTA_PROC = eINSTANCE.getCallProc_RepresentaProc();

		/**
		 * The meta object literal for the '<em><b>Parametro</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_PROC__PARAMETRO = eINSTANCE.getCallProc_Parametro();

		/**
		 * The meta object literal for the '{@link pascalito.impl.N_ComutativaImpl <em>NComutativa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.N_ComutativaImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getN_Comutativa()
		 * @generated
		 */
		EClass NCOMUTATIVA = eINSTANCE.getN_Comutativa();

		/**
		 * The meta object literal for the '{@link pascalito.impl.ComutativaImpl <em>Comutativa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.ComutativaImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getComutativa()
		 * @generated
		 */
		EClass COMUTATIVA = eINSTANCE.getComutativa();

		/**
		 * The meta object literal for the '{@link pascalito.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.NumberLiteralImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getNumberLiteral()
		 * @generated
		 */
		EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

	}

} //PascalitoPackage
