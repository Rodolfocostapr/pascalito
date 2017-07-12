/**
 */
package pascalito.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import pascalito.*;

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
			case PascalitoPackage.PROGRAM: return createProgram();
			case PascalitoPackage.BLOCK: return createBlock();
			case PascalitoPackage.CALL_VARIABLE: return createCallVariable();
			case PascalitoPackage.CALL_PROC: return createCallProc();
			case PascalitoPackage.ATRIBUITION: return createAtribuition();
			case PascalitoPackage.IF: return createIf();
			case PascalitoPackage.LOOP: return createLoop();
			case PascalitoPackage.EXP_BIN_LOGICAL: return createExpBinLogical();
			case PascalitoPackage.EXP_NEG: return createExpNeg();
			case PascalitoPackage.NEW_ROLE15: return createnewRole15();
			case PascalitoPackage.VARIABLE: return createVariable();
			case PascalitoPackage.PROCEDURE: return createProcedure();
			case PascalitoPackage.CALL_PROC_EXP: return createCallProcExp();
			case PascalitoPackage.EXP_BIN_NV1: return createExpBinNv1();
			case PascalitoPackage.EXP_BIN_NV0: return createExpBinNv0();
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
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallVariable createCallVariable() {
		CallVariableImpl callVariable = new CallVariableImpl();
		return callVariable;
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
	public ExpBinLogical createExpBinLogical() {
		ExpBinLogicalImpl expBinLogical = new ExpBinLogicalImpl();
		return expBinLogical;
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
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallProcExp createCallProcExp() {
		CallProcExpImpl callProcExp = new CallProcExpImpl();
		return callProcExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpBinNv1 createExpBinNv1() {
		ExpBinNv1Impl expBinNv1 = new ExpBinNv1Impl();
		return expBinNv1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpBinNv0 createExpBinNv0() {
		ExpBinNv0Impl expBinNv0 = new ExpBinNv0Impl();
		return expBinNv0;
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
	public Atribuition createAtribuition() {
		AtribuitionImpl atribuition = new AtribuitionImpl();
		return atribuition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
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
