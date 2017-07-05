/**
 */
package pascalito.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import pascalito.Atribuicao;
import pascalito.Bloco;
import pascalito.CallProcedimento;
import pascalito.CallVariavel;
import pascalito.Comando;
import pascalito.Desvio;
import pascalito.ExpBin;
import pascalito.ExpBinLogica;
import pascalito.ExpNeg;
import pascalito.Expressao;
import pascalito.ListaParmetros;
import pascalito.Loop;
import pascalito.PascalitoPackage;
import pascalito.Procedimento;
import pascalito.Programa;
import pascalito.Variavel;
import pascalito.newRole15;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pascalito.PascalitoPackage
 * @generated
 */
public class PascalitoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PascalitoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PascalitoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PascalitoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PascalitoSwitch<Adapter> modelSwitch =
		new PascalitoSwitch<Adapter>() {
			@Override
			public Adapter casePrograma(Programa object) {
				return createProgramaAdapter();
			}
			@Override
			public Adapter caseBloco(Bloco object) {
				return createBlocoAdapter();
			}
			@Override
			public Adapter caseCallVariavel(CallVariavel object) {
				return createCallVariavelAdapter();
			}
			@Override
			public Adapter caseComando(Comando object) {
				return createComandoAdapter();
			}
			@Override
			public Adapter caseCallProcedimento(CallProcedimento object) {
				return createCallProcedimentoAdapter();
			}
			@Override
			public Adapter caseAtribuicao(Atribuicao object) {
				return createAtribuicaoAdapter();
			}
			@Override
			public Adapter caseDesvio(Desvio object) {
				return createDesvioAdapter();
			}
			@Override
			public Adapter caseLoop(Loop object) {
				return createLoopAdapter();
			}
			@Override
			public Adapter caseExpressao(Expressao object) {
				return createExpressaoAdapter();
			}
			@Override
			public Adapter caseNumber(pascalito.Number object) {
				return createNumberAdapter();
			}
			@Override
			public Adapter caseExpBinLogica(ExpBinLogica object) {
				return createExpBinLogicaAdapter();
			}
			@Override
			public Adapter caseExpBin(ExpBin object) {
				return createExpBinAdapter();
			}
			@Override
			public Adapter caseExpNeg(ExpNeg object) {
				return createExpNegAdapter();
			}
			@Override
			public Adapter casenewRole15(newRole15 object) {
				return createnewRole15Adapter();
			}
			@Override
			public Adapter caseVariavel(Variavel object) {
				return createVariavelAdapter();
			}
			@Override
			public Adapter caseProcedimento(Procedimento object) {
				return createProcedimentoAdapter();
			}
			@Override
			public Adapter caseListaParmetros(ListaParmetros object) {
				return createListaParmetrosAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link pascalito.Programa <em>Programa</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pascalito.Programa
	 * @generated
	 */
	public Adapter createProgramaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pascalito.Bloco <em>Bloco</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pascalito.Bloco
	 * @generated
	 */
	public Adapter createBlocoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pascalito.CallVariavel <em>Call Variavel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pascalito.CallVariavel
	 * @generated
	 */
	public Adapter createCallVariavelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pascalito.Comando <em>Comando</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pascalito.Comando
	 * @generated
	 */
	public Adapter createComandoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pascalito.CallProcedimento <em>Call Procedimento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pascalito.CallProcedimento
	 * @generated
	 */
	public Adapter createCallProcedimentoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pascalito.Atribuicao <em>Atribuicao</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pascalito.Atribuicao
	 * @generated
	 */
	public Adapter createAtribuicaoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pascalito.Desvio <em>Desvio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pascalito.Desvio
	 * @generated
	 */
	public Adapter createDesvioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pascalito.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pascalito.Loop
	 * @generated
	 */
	public Adapter createLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pascalito.Expressao <em>Expressao</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pascalito.Expressao
	 * @generated
	 */
	public Adapter createExpressaoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pascalito.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pascalito.Number
	 * @generated
	 */
	public Adapter createNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pascalito.ExpBinLogica <em>Exp Bin Logica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pascalito.ExpBinLogica
	 * @generated
	 */
	public Adapter createExpBinLogicaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pascalito.ExpBin <em>Exp Bin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pascalito.ExpBin
	 * @generated
	 */
	public Adapter createExpBinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pascalito.ExpNeg <em>Exp Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pascalito.ExpNeg
	 * @generated
	 */
	public Adapter createExpNegAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pascalito.newRole15 <em>new Role15</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pascalito.newRole15
	 * @generated
	 */
	public Adapter createnewRole15Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pascalito.Variavel <em>Variavel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pascalito.Variavel
	 * @generated
	 */
	public Adapter createVariavelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pascalito.Procedimento <em>Procedimento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pascalito.Procedimento
	 * @generated
	 */
	public Adapter createProcedimentoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pascalito.ListaParmetros <em>Lista Parmetros</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pascalito.ListaParmetros
	 * @generated
	 */
	public Adapter createListaParmetrosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PascalitoAdapterFactory
