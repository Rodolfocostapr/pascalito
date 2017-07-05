/**
 */
package pascalito.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
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
import pascalito.PascalitoFactory;
import pascalito.PascalitoPackage;
import pascalito.Procedimento;
import pascalito.Programa;
import pascalito.Variavel;
import pascalito.newRole15;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PascalitoPackageImpl extends EPackageImpl implements PascalitoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blocoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callVariavelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comandoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callProcedimentoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atribuicaoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass desvioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressaoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expBinLogicaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expBinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expNegEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newRole15EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variavelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedimentoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listaParmetrosEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pascalito.PascalitoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PascalitoPackageImpl() {
		super(eNS_URI, PascalitoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PascalitoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PascalitoPackage init() {
		if (isInited) return (PascalitoPackage)EPackage.Registry.INSTANCE.getEPackage(PascalitoPackage.eNS_URI);

		// Obtain or create and register package
		PascalitoPackageImpl thePascalitoPackage = (PascalitoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PascalitoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PascalitoPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePascalitoPackage.createPackageContents();

		// Initialize created meta-data
		thePascalitoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePascalitoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PascalitoPackage.eNS_URI, thePascalitoPackage);
		return thePascalitoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrograma() {
		return programaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrograma_Ident() {
		return (EAttribute)programaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrograma_Bloco() {
		return (EReference)programaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBloco() {
		return blocoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBloco_Defvariavel() {
		return (EReference)blocoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBloco_Defprocedimento() {
		return (EReference)blocoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBloco_Executa() {
		return (EReference)blocoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallVariavel() {
		return callVariavelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallVariavel_Representa() {
		return (EReference)callVariavelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComando() {
		return comandoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallProcedimento() {
		return callProcedimentoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallProcedimento_Definido() {
		return (EReference)callProcedimentoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallProcedimento_Parametro() {
		return (EReference)callProcedimentoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtribuicao() {
		return atribuicaoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtribuicao_Atribui() {
		return (EReference)atribuicaoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtribuicao_AtribuiResultado() {
		return (EReference)atribuicaoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesvio() {
		return desvioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesvio_Se() {
		return (EReference)desvioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesvio_Faca() {
		return (EReference)desvioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesvio_SeNao() {
		return (EReference)desvioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoop() {
		return loopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_Se() {
		return (EReference)loopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_Faca() {
		return (EReference)loopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressao() {
		return expressaoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressao_Prioridade() {
		return (EAttribute)expressaoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber() {
		return numberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumber_Valor() {
		return (EAttribute)numberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpBinLogica() {
		return expBinLogicaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpBinLogica_Operador() {
		return (EAttribute)expBinLogicaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpBinLogica_OperandoEsq() {
		return (EReference)expBinLogicaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpBinLogica_OperandoDir() {
		return (EReference)expBinLogicaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpBinLogica_Comutativa() {
		return (EAttribute)expBinLogicaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpBin() {
		return expBinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpBin_Operador() {
		return (EAttribute)expBinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpBin_OperandoDir() {
		return (EReference)expBinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpBin_OperandoEsq() {
		return (EReference)expBinEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpBin_Comutativa() {
		return (EAttribute)expBinEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpNeg() {
		return expNegEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpNeg_Operador() {
		return (EAttribute)expNegEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpNeg_Nega() {
		return (EReference)expNegEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnewRole15() {
		return newRole15EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariavel() {
		return variavelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariavel_Nome() {
		return (EAttribute)variavelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariavel_Tipo() {
		return (EAttribute)variavelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariavel_Valor() {
		return (EAttribute)variavelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedimento() {
		return procedimentoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedimento_Bloco() {
		return (EReference)procedimentoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedimento_Identificador() {
		return (EAttribute)procedimentoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedimento_Listaparmetros() {
		return (EReference)procedimentoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListaParmetros() {
		return listaParmetrosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListaParmetros_Variavel() {
		return (EReference)listaParmetrosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PascalitoFactory getPascalitoFactory() {
		return (PascalitoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		programaEClass = createEClass(PROGRAMA);
		createEAttribute(programaEClass, PROGRAMA__IDENT);
		createEReference(programaEClass, PROGRAMA__BLOCO);

		blocoEClass = createEClass(BLOCO);
		createEReference(blocoEClass, BLOCO__DEFVARIAVEL);
		createEReference(blocoEClass, BLOCO__DEFPROCEDIMENTO);
		createEReference(blocoEClass, BLOCO__EXECUTA);

		callVariavelEClass = createEClass(CALL_VARIAVEL);
		createEReference(callVariavelEClass, CALL_VARIAVEL__REPRESENTA);

		comandoEClass = createEClass(COMANDO);

		callProcedimentoEClass = createEClass(CALL_PROCEDIMENTO);
		createEReference(callProcedimentoEClass, CALL_PROCEDIMENTO__DEFINIDO);
		createEReference(callProcedimentoEClass, CALL_PROCEDIMENTO__PARAMETRO);

		atribuicaoEClass = createEClass(ATRIBUICAO);
		createEReference(atribuicaoEClass, ATRIBUICAO__ATRIBUI);
		createEReference(atribuicaoEClass, ATRIBUICAO__ATRIBUI_RESULTADO);

		desvioEClass = createEClass(DESVIO);
		createEReference(desvioEClass, DESVIO__SE);
		createEReference(desvioEClass, DESVIO__FACA);
		createEReference(desvioEClass, DESVIO__SE_NAO);

		loopEClass = createEClass(LOOP);
		createEReference(loopEClass, LOOP__SE);
		createEReference(loopEClass, LOOP__FACA);

		expressaoEClass = createEClass(EXPRESSAO);
		createEAttribute(expressaoEClass, EXPRESSAO__PRIORIDADE);

		numberEClass = createEClass(NUMBER);
		createEAttribute(numberEClass, NUMBER__VALOR);

		expBinLogicaEClass = createEClass(EXP_BIN_LOGICA);
		createEAttribute(expBinLogicaEClass, EXP_BIN_LOGICA__OPERADOR);
		createEReference(expBinLogicaEClass, EXP_BIN_LOGICA__OPERANDO_ESQ);
		createEReference(expBinLogicaEClass, EXP_BIN_LOGICA__OPERANDO_DIR);
		createEAttribute(expBinLogicaEClass, EXP_BIN_LOGICA__COMUTATIVA);

		expBinEClass = createEClass(EXP_BIN);
		createEAttribute(expBinEClass, EXP_BIN__OPERADOR);
		createEReference(expBinEClass, EXP_BIN__OPERANDO_DIR);
		createEReference(expBinEClass, EXP_BIN__OPERANDO_ESQ);
		createEAttribute(expBinEClass, EXP_BIN__COMUTATIVA);

		expNegEClass = createEClass(EXP_NEG);
		createEAttribute(expNegEClass, EXP_NEG__OPERADOR);
		createEReference(expNegEClass, EXP_NEG__NEGA);

		newRole15EClass = createEClass(NEW_ROLE15);

		variavelEClass = createEClass(VARIAVEL);
		createEAttribute(variavelEClass, VARIAVEL__NOME);
		createEAttribute(variavelEClass, VARIAVEL__TIPO);
		createEAttribute(variavelEClass, VARIAVEL__VALOR);

		procedimentoEClass = createEClass(PROCEDIMENTO);
		createEReference(procedimentoEClass, PROCEDIMENTO__BLOCO);
		createEAttribute(procedimentoEClass, PROCEDIMENTO__IDENTIFICADOR);
		createEReference(procedimentoEClass, PROCEDIMENTO__LISTAPARMETROS);

		listaParmetrosEClass = createEClass(LISTA_PARMETROS);
		createEReference(listaParmetrosEClass, LISTA_PARMETROS__VARIAVEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		callVariavelEClass.getESuperTypes().add(this.getExpressao());
		callProcedimentoEClass.getESuperTypes().add(this.getComando());
		atribuicaoEClass.getESuperTypes().add(this.getComando());
		desvioEClass.getESuperTypes().add(this.getComando());
		loopEClass.getESuperTypes().add(this.getComando());
		numberEClass.getESuperTypes().add(this.getExpressao());
		expBinLogicaEClass.getESuperTypes().add(this.getExpressao());
		expBinEClass.getESuperTypes().add(this.getExpressao());
		expNegEClass.getESuperTypes().add(this.getExpressao());

		// Initialize classes, features, and operations; add parameters
		initEClass(programaEClass, Programa.class, "Programa", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrograma_Ident(), ecorePackage.getEString(), "Ident", null, 1, 1, Programa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrograma_Bloco(), this.getBloco(), null, "bloco", null, 1, 1, Programa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blocoEClass, Bloco.class, "Bloco", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBloco_Defvariavel(), this.getVariavel(), null, "defvariavel", null, 0, -1, Bloco.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBloco_Defprocedimento(), this.getProcedimento(), null, "defprocedimento", null, 0, -1, Bloco.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBloco_Executa(), this.getComando(), null, "executa", null, 0, -1, Bloco.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callVariavelEClass, CallVariavel.class, "CallVariavel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallVariavel_Representa(), this.getVariavel(), null, "representa", null, 1, 1, CallVariavel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comandoEClass, Comando.class, "Comando", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callProcedimentoEClass, CallProcedimento.class, "CallProcedimento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallProcedimento_Definido(), this.getProcedimento(), null, "definido", null, 1, 1, CallProcedimento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallProcedimento_Parametro(), this.getExpressao(), null, "parametro", null, 0, -1, CallProcedimento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atribuicaoEClass, Atribuicao.class, "Atribuicao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtribuicao_Atribui(), this.getVariavel(), null, "atribui", null, 1, 1, Atribuicao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtribuicao_AtribuiResultado(), this.getExpressao(), null, "atribuiResultado", null, 1, 1, Atribuicao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(desvioEClass, Desvio.class, "Desvio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDesvio_Se(), this.getExpressao(), null, "se", null, 1, 1, Desvio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesvio_Faca(), this.getComando(), null, "faca", null, 1, -1, Desvio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesvio_SeNao(), this.getComando(), null, "seNao", null, 0, -1, Desvio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoop_Se(), this.getExpressao(), null, "se", null, 1, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoop_Faca(), this.getComando(), null, "faca", null, 1, -1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressaoEClass, Expressao.class, "Expressao", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpressao_Prioridade(), ecorePackage.getEBigDecimal(), "Prioridade", null, 0, 1, Expressao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberEClass, pascalito.Number.class, "Number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumber_Valor(), ecorePackage.getEInt(), "Valor", null, 0, 1, pascalito.Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expBinLogicaEClass, ExpBinLogica.class, "ExpBinLogica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpBinLogica_Operador(), ecorePackage.getEString(), "Operador", null, 0, 1, ExpBinLogica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpBinLogica_OperandoEsq(), this.getExpressao(), null, "operandoEsq", null, 1, 1, ExpBinLogica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpBinLogica_OperandoDir(), this.getExpressao(), null, "operandoDir", null, 1, 1, ExpBinLogica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpBinLogica_Comutativa(), ecorePackage.getEBoolean(), "Comutativa", null, 0, 1, ExpBinLogica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expBinEClass, ExpBin.class, "ExpBin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpBin_Operador(), ecorePackage.getEString(), "Operador", null, 0, 1, ExpBin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpBin_OperandoDir(), this.getExpressao(), null, "operandoDir", null, 1, 1, ExpBin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpBin_OperandoEsq(), this.getExpressao(), null, "operandoEsq", null, 1, 1, ExpBin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpBin_Comutativa(), ecorePackage.getEBoolean(), "Comutativa", null, 0, 1, ExpBin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expNegEClass, ExpNeg.class, "ExpNeg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpNeg_Operador(), ecorePackage.getEString(), "Operador", null, 0, 1, ExpNeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpNeg_Nega(), this.getExpressao(), null, "nega", null, 1, 1, ExpNeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newRole15EClass, newRole15.class, "newRole15", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variavelEClass, Variavel.class, "Variavel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariavel_Nome(), ecorePackage.getEString(), "Nome", "", 0, 1, Variavel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariavel_Tipo(), ecorePackage.getEString(), "Tipo", null, 0, 1, Variavel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariavel_Valor(), ecorePackage.getEString(), "Valor", null, 0, 1, Variavel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(procedimentoEClass, Procedimento.class, "Procedimento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcedimento_Bloco(), this.getBloco(), null, "bloco", null, 1, 1, Procedimento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcedimento_Identificador(), ecorePackage.getEString(), "Identificador", null, 0, 1, Procedimento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcedimento_Listaparmetros(), this.getListaParmetros(), null, "listaparmetros", null, 1, 1, Procedimento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listaParmetrosEClass, ListaParmetros.class, "ListaParmetros", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListaParmetros_Variavel(), this.getVariavel(), null, "variavel", null, 0, -1, ListaParmetros.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";	
		addAnnotation
		  (newRole15EClass, 
		   source, 
		   new String[] {
			 "archetype", "Role"
		   });
	}

} //PascalitoPackageImpl
