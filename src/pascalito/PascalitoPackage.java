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
	 * The meta object id for the '{@link pascalito.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.ProgramImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__IDENT = 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__BLOCK = 1;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pascalito.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.BlockImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Def Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__DEF_VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Defprocedure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__DEFPROCEDURE = 1;

	/**
	 * The feature id for the '<em><b>Execute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__EXECUTE = 2;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pascalito.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.ExpressionImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__LEFT = 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__RIGHT = 1;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pascalito.impl.CallVariableImpl <em>Call Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.CallVariableImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getCallVariable()
	 * @generated
	 */
	int CALL_VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VARIABLE__LEFT = EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VARIABLE__RIGHT = EXPRESSION__RIGHT;

	/**
	 * The feature id for the '<em><b>Represent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VARIABLE__REPRESENT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VARIABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Call Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VARIABLE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pascalito.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.CommandImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 3;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

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
	 * The meta object id for the '{@link pascalito.impl.ExpBinLogicalImpl <em>Exp Bin Logical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.ExpBinLogicalImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getExpBinLogical()
	 * @generated
	 */
	int EXP_BIN_LOGICAL = 9;

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
	 * The meta object id for the '{@link pascalito.impl.CallProcImpl <em>Call Proc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.CallProcImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getCallProc()
	 * @generated
	 */
	int CALL_PROC = 4;

	/**
	 * The feature id for the '<em><b>Defined</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROC__DEFINED = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROC__PARAMETER = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pascalito.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.VariableImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 12;

	/**
	 * The meta object id for the '{@link pascalito.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.ProcedureImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getProcedure()
	 * @generated
	 */
	int PROCEDURE = 13;

	/**
	 * The meta object id for the '{@link pascalito.impl.CallProcExpImpl <em>Call Proc Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.CallProcExpImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getCallProcExp()
	 * @generated
	 */
	int CALL_PROC_EXP = 14;

	/**
	 * The meta object id for the '{@link pascalito.impl.ExpBinNv1Impl <em>Exp Bin Nv1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.ExpBinNv1Impl
	 * @see pascalito.impl.PascalitoPackageImpl#getExpBinNv1()
	 * @generated
	 */
	int EXP_BIN_NV1 = 15;

	/**
	 * The meta object id for the '{@link pascalito.impl.ExpBinNv0Impl <em>Exp Bin Nv0</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.ExpBinNv0Impl
	 * @see pascalito.impl.PascalitoPackageImpl#getExpBinNv0()
	 * @generated
	 */
	int EXP_BIN_NV0 = 16;

	/**
	 * The number of structural features of the '<em>Call Proc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROC_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Call Proc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROC_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pascalito.impl.AtribuitionImpl <em>Atribuition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.AtribuitionImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getAtribuition()
	 * @generated
	 */
	int ATRIBUITION = 5;

	/**
	 * The feature id for the '<em><b>Sets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUITION__SETS = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Atribui Resultado</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUITION__ATRIBUI_RESULTADO = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Atribuition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUITION_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Atribuition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUITION_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pascalito.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pascalito.impl.IfImpl
	 * @see pascalito.impl.PascalitoPackageImpl#getIf()
	 * @generated
	 */
	int IF = 6;

	/**
	 * The feature id for the '<em><b>If Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__IF_EXP = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Do</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__DO = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE_CMD = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__WHILE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Do</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__DO = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_BIN_LOGICAL__LEFT = EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_BIN_LOGICAL__RIGHT = EXPRESSION__RIGHT;

	/**
	 * The number of structural features of the '<em>Exp Bin Logical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_BIN_LOGICAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exp Bin Logical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_BIN_LOGICAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_NEG__LEFT = EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_NEG__RIGHT = EXPRESSION__RIGHT;

	/**
	 * The feature id for the '<em><b>Negate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_NEG__NEGATE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exp Neg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_NEG_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exp Neg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_NEG_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

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
	int VARIABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PARAMETER = 2;

	/**
	 * The number of structural features of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROC_EXP__LEFT = EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROC_EXP__RIGHT = EXPRESSION__RIGHT;

	/**
	 * The feature id for the '<em><b>Represent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROC_EXP__REPRESENT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROC_EXP__PARAMETER = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call Proc Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROC_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Call Proc Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROC_EXP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_BIN_NV1__LEFT = EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_BIN_NV1__RIGHT = EXPRESSION__RIGHT;

	/**
	 * The number of structural features of the '<em>Exp Bin Nv1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_BIN_NV1_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exp Bin Nv1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_BIN_NV1_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_BIN_NV0__LEFT = EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_BIN_NV0__RIGHT = EXPRESSION__RIGHT;

	/**
	 * The number of structural features of the '<em>Exp Bin Nv0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_BIN_NV0_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exp Bin Nv0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_BIN_NV0_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

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
	int NUMBER_LITERAL__LEFT = EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL__RIGHT = EXPRESSION__RIGHT;

	/**
	 * The number of structural features of the '<em>Number Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link pascalito.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see pascalito.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the attribute '{@link pascalito.Program#getIdent <em>Ident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ident</em>'.
	 * @see pascalito.Program#getIdent()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Ident();

	/**
	 * Returns the meta object for the containment reference '{@link pascalito.Program#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see pascalito.Program#getBlock()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Block();

	/**
	 * Returns the meta object for class '{@link pascalito.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see pascalito.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link pascalito.Block#getDefVariable <em>Def Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Def Variable</em>'.
	 * @see pascalito.Block#getDefVariable()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_DefVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link pascalito.Block#getDefprocedure <em>Defprocedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defprocedure</em>'.
	 * @see pascalito.Block#getDefprocedure()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Defprocedure();

	/**
	 * Returns the meta object for the containment reference list '{@link pascalito.Block#getExecute <em>Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Execute</em>'.
	 * @see pascalito.Block#getExecute()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Execute();

	/**
	 * Returns the meta object for class '{@link pascalito.CallVariable <em>Call Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Variable</em>'.
	 * @see pascalito.CallVariable
	 * @generated
	 */
	EClass getCallVariable();

	/**
	 * Returns the meta object for the reference '{@link pascalito.CallVariable#getRepresent <em>Represent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Represent</em>'.
	 * @see pascalito.CallVariable#getRepresent()
	 * @see #getCallVariable()
	 * @generated
	 */
	EReference getCallVariable_Represent();

	/**
	 * Returns the meta object for class '{@link pascalito.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see pascalito.Command
	 * @generated
	 */
	EClass getCommand();

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
	 * Returns the meta object for the containment reference '{@link pascalito.Loop#getWhile <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>While</em>'.
	 * @see pascalito.Loop#getWhile()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_While();

	/**
	 * Returns the meta object for the containment reference list '{@link pascalito.Loop#getDo <em>Do</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Do</em>'.
	 * @see pascalito.Loop#getDo()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Do();

	/**
	 * Returns the meta object for class '{@link pascalito.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see pascalito.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the containment reference '{@link pascalito.Expression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see pascalito.Expression#getLeft()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link pascalito.Expression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see pascalito.Expression#getRight()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Right();

	/**
	 * Returns the meta object for class '{@link pascalito.ExpBinLogical <em>Exp Bin Logical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exp Bin Logical</em>'.
	 * @see pascalito.ExpBinLogical
	 * @generated
	 */
	EClass getExpBinLogical();

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
	 * Returns the meta object for the containment reference '{@link pascalito.ExpNeg#getNegate <em>Negate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Negate</em>'.
	 * @see pascalito.ExpNeg#getNegate()
	 * @see #getExpNeg()
	 * @generated
	 */
	EReference getExpNeg_Negate();

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
	 * Returns the meta object for class '{@link pascalito.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see pascalito.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link pascalito.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pascalito.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link pascalito.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure</em>'.
	 * @see pascalito.Procedure
	 * @generated
	 */
	EClass getProcedure();

	/**
	 * Returns the meta object for the containment reference '{@link pascalito.Procedure#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see pascalito.Procedure#getBlock()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Block();

	/**
	 * Returns the meta object for the attribute '{@link pascalito.Procedure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pascalito.Procedure#getName()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pascalito.Procedure#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see pascalito.Procedure#getParameter()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Parameter();

	/**
	 * Returns the meta object for class '{@link pascalito.CallProcExp <em>Call Proc Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Proc Exp</em>'.
	 * @see pascalito.CallProcExp
	 * @generated
	 */
	EClass getCallProcExp();

	/**
	 * Returns the meta object for the reference '{@link pascalito.CallProcExp#getRepresent <em>Represent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Represent</em>'.
	 * @see pascalito.CallProcExp#getRepresent()
	 * @see #getCallProcExp()
	 * @generated
	 */
	EReference getCallProcExp_Represent();

	/**
	 * Returns the meta object for the containment reference list '{@link pascalito.CallProcExp#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see pascalito.CallProcExp#getParameter()
	 * @see #getCallProcExp()
	 * @generated
	 */
	EReference getCallProcExp_Parameter();

	/**
	 * Returns the meta object for class '{@link pascalito.ExpBinNv1 <em>Exp Bin Nv1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exp Bin Nv1</em>'.
	 * @see pascalito.ExpBinNv1
	 * @generated
	 */
	EClass getExpBinNv1();

	/**
	 * Returns the meta object for class '{@link pascalito.ExpBinNv0 <em>Exp Bin Nv0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exp Bin Nv0</em>'.
	 * @see pascalito.ExpBinNv0
	 * @generated
	 */
	EClass getExpBinNv0();

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
	 * Returns the meta object for the reference '{@link pascalito.CallProc#getDefined <em>Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defined</em>'.
	 * @see pascalito.CallProc#getDefined()
	 * @see #getCallProc()
	 * @generated
	 */
	EReference getCallProc_Defined();

	/**
	 * Returns the meta object for the containment reference list '{@link pascalito.CallProc#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see pascalito.CallProc#getParameter()
	 * @see #getCallProc()
	 * @generated
	 */
	EReference getCallProc_Parameter();

	/**
	 * Returns the meta object for class '{@link pascalito.Atribuition <em>Atribuition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atribuition</em>'.
	 * @see pascalito.Atribuition
	 * @generated
	 */
	EClass getAtribuition();

	/**
	 * Returns the meta object for the reference '{@link pascalito.Atribuition#getSets <em>Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sets</em>'.
	 * @see pascalito.Atribuition#getSets()
	 * @see #getAtribuition()
	 * @generated
	 */
	EReference getAtribuition_Sets();

	/**
	 * Returns the meta object for the containment reference '{@link pascalito.Atribuition#getAtribuiResultado <em>Atribui Resultado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Atribui Resultado</em>'.
	 * @see pascalito.Atribuition#getAtribuiResultado()
	 * @see #getAtribuition()
	 * @generated
	 */
	EReference getAtribuition_AtribuiResultado();

	/**
	 * Returns the meta object for class '{@link pascalito.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see pascalito.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link pascalito.If#getIfExp <em>If Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Exp</em>'.
	 * @see pascalito.If#getIfExp()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_IfExp();

	/**
	 * Returns the meta object for the containment reference list '{@link pascalito.If#getDo <em>Do</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Do</em>'.
	 * @see pascalito.If#getDo()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Do();

	/**
	 * Returns the meta object for the containment reference list '{@link pascalito.If#getElseCmd <em>Else Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else Cmd</em>'.
	 * @see pascalito.If#getElseCmd()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_ElseCmd();

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
		 * The meta object literal for the '{@link pascalito.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.ProgramImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__IDENT = eINSTANCE.getProgram_Ident();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__BLOCK = eINSTANCE.getProgram_Block();

		/**
		 * The meta object literal for the '{@link pascalito.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.BlockImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Def Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__DEF_VARIABLE = eINSTANCE.getBlock_DefVariable();

		/**
		 * The meta object literal for the '<em><b>Defprocedure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__DEFPROCEDURE = eINSTANCE.getBlock_Defprocedure();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__EXECUTE = eINSTANCE.getBlock_Execute();

		/**
		 * The meta object literal for the '{@link pascalito.impl.CallVariableImpl <em>Call Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.CallVariableImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getCallVariable()
		 * @generated
		 */
		EClass CALL_VARIABLE = eINSTANCE.getCallVariable();

		/**
		 * The meta object literal for the '<em><b>Represent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_VARIABLE__REPRESENT = eINSTANCE.getCallVariable_Represent();

		/**
		 * The meta object literal for the '{@link pascalito.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.CommandImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

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
		 * The meta object literal for the '<em><b>While</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__WHILE = eINSTANCE.getLoop_While();

		/**
		 * The meta object literal for the '<em><b>Do</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__DO = eINSTANCE.getLoop_Do();

		/**
		 * The meta object literal for the '{@link pascalito.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.ExpressionImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__LEFT = eINSTANCE.getExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

		/**
		 * The meta object literal for the '{@link pascalito.impl.ExpBinLogicalImpl <em>Exp Bin Logical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.ExpBinLogicalImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getExpBinLogical()
		 * @generated
		 */
		EClass EXP_BIN_LOGICAL = eINSTANCE.getExpBinLogical();

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
		 * The meta object literal for the '<em><b>Negate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXP_NEG__NEGATE = eINSTANCE.getExpNeg_Negate();

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
		 * The meta object literal for the '{@link pascalito.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.VariableImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link pascalito.impl.ProcedureImpl <em>Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.ProcedureImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getProcedure()
		 * @generated
		 */
		EClass PROCEDURE = eINSTANCE.getProcedure();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE__BLOCK = eINSTANCE.getProcedure_Block();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE__NAME = eINSTANCE.getProcedure_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE__PARAMETER = eINSTANCE.getProcedure_Parameter();

		/**
		 * The meta object literal for the '{@link pascalito.impl.CallProcExpImpl <em>Call Proc Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.CallProcExpImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getCallProcExp()
		 * @generated
		 */
		EClass CALL_PROC_EXP = eINSTANCE.getCallProcExp();

		/**
		 * The meta object literal for the '<em><b>Represent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_PROC_EXP__REPRESENT = eINSTANCE.getCallProcExp_Represent();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_PROC_EXP__PARAMETER = eINSTANCE.getCallProcExp_Parameter();

		/**
		 * The meta object literal for the '{@link pascalito.impl.ExpBinNv1Impl <em>Exp Bin Nv1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.ExpBinNv1Impl
		 * @see pascalito.impl.PascalitoPackageImpl#getExpBinNv1()
		 * @generated
		 */
		EClass EXP_BIN_NV1 = eINSTANCE.getExpBinNv1();

		/**
		 * The meta object literal for the '{@link pascalito.impl.ExpBinNv0Impl <em>Exp Bin Nv0</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.ExpBinNv0Impl
		 * @see pascalito.impl.PascalitoPackageImpl#getExpBinNv0()
		 * @generated
		 */
		EClass EXP_BIN_NV0 = eINSTANCE.getExpBinNv0();

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
		 * The meta object literal for the '<em><b>Defined</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_PROC__DEFINED = eINSTANCE.getCallProc_Defined();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_PROC__PARAMETER = eINSTANCE.getCallProc_Parameter();

		/**
		 * The meta object literal for the '{@link pascalito.impl.AtribuitionImpl <em>Atribuition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.AtribuitionImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getAtribuition()
		 * @generated
		 */
		EClass ATRIBUITION = eINSTANCE.getAtribuition();

		/**
		 * The meta object literal for the '<em><b>Sets</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATRIBUITION__SETS = eINSTANCE.getAtribuition_Sets();

		/**
		 * The meta object literal for the '<em><b>Atribui Resultado</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATRIBUITION__ATRIBUI_RESULTADO = eINSTANCE.getAtribuition_AtribuiResultado();

		/**
		 * The meta object literal for the '{@link pascalito.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pascalito.impl.IfImpl
		 * @see pascalito.impl.PascalitoPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>If Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__IF_EXP = eINSTANCE.getIf_IfExp();

		/**
		 * The meta object literal for the '<em><b>Do</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__DO = eINSTANCE.getIf_Do();

		/**
		 * The meta object literal for the '<em><b>Else Cmd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE_CMD = eINSTANCE.getIf_ElseCmd();

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
