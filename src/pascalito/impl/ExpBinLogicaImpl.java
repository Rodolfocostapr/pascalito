/**
 */
package pascalito.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pascalito.ExpBinLogica;
import pascalito.Expressao;
import pascalito.PascalitoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exp Bin Logica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pascalito.impl.ExpBinLogicaImpl#getOperador <em>Operador</em>}</li>
 *   <li>{@link pascalito.impl.ExpBinLogicaImpl#getOperandoEsq <em>Operando Esq</em>}</li>
 *   <li>{@link pascalito.impl.ExpBinLogicaImpl#getOperandoDir <em>Operando Dir</em>}</li>
 *   <li>{@link pascalito.impl.ExpBinLogicaImpl#isComutativa <em>Comutativa</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpBinLogicaImpl extends ExpressaoImpl implements ExpBinLogica {
	/**
	 * The default value of the '{@link #getOperador() <em>Operador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperador()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERADOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperador() <em>Operador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperador()
	 * @generated
	 * @ordered
	 */
	protected String operador = OPERADOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperandoEsq() <em>Operando Esq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandoEsq()
	 * @generated
	 * @ordered
	 */
	protected Expressao operandoEsq;

	/**
	 * The cached value of the '{@link #getOperandoDir() <em>Operando Dir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandoDir()
	 * @generated
	 * @ordered
	 */
	protected Expressao operandoDir;

	/**
	 * The default value of the '{@link #isComutativa() <em>Comutativa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComutativa()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMUTATIVA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isComutativa() <em>Comutativa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComutativa()
	 * @generated
	 * @ordered
	 */
	protected boolean comutativa = COMUTATIVA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpBinLogicaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PascalitoPackage.Literals.EXP_BIN_LOGICA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperador() {
		return operador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperador(String newOperador) {
		String oldOperador = operador;
		operador = newOperador;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.EXP_BIN_LOGICA__OPERADOR, oldOperador, operador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expressao getOperandoEsq() {
		return operandoEsq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperandoEsq(Expressao newOperandoEsq, NotificationChain msgs) {
		Expressao oldOperandoEsq = operandoEsq;
		operandoEsq = newOperandoEsq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalitoPackage.EXP_BIN_LOGICA__OPERANDO_ESQ, oldOperandoEsq, newOperandoEsq);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperandoEsq(Expressao newOperandoEsq) {
		if (newOperandoEsq != operandoEsq) {
			NotificationChain msgs = null;
			if (operandoEsq != null)
				msgs = ((InternalEObject)operandoEsq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.EXP_BIN_LOGICA__OPERANDO_ESQ, null, msgs);
			if (newOperandoEsq != null)
				msgs = ((InternalEObject)newOperandoEsq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.EXP_BIN_LOGICA__OPERANDO_ESQ, null, msgs);
			msgs = basicSetOperandoEsq(newOperandoEsq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.EXP_BIN_LOGICA__OPERANDO_ESQ, newOperandoEsq, newOperandoEsq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expressao getOperandoDir() {
		return operandoDir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperandoDir(Expressao newOperandoDir, NotificationChain msgs) {
		Expressao oldOperandoDir = operandoDir;
		operandoDir = newOperandoDir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalitoPackage.EXP_BIN_LOGICA__OPERANDO_DIR, oldOperandoDir, newOperandoDir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperandoDir(Expressao newOperandoDir) {
		if (newOperandoDir != operandoDir) {
			NotificationChain msgs = null;
			if (operandoDir != null)
				msgs = ((InternalEObject)operandoDir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.EXP_BIN_LOGICA__OPERANDO_DIR, null, msgs);
			if (newOperandoDir != null)
				msgs = ((InternalEObject)newOperandoDir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.EXP_BIN_LOGICA__OPERANDO_DIR, null, msgs);
			msgs = basicSetOperandoDir(newOperandoDir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.EXP_BIN_LOGICA__OPERANDO_DIR, newOperandoDir, newOperandoDir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComutativa() {
		return comutativa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComutativa(boolean newComutativa) {
		boolean oldComutativa = comutativa;
		comutativa = newComutativa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.EXP_BIN_LOGICA__COMUTATIVA, oldComutativa, comutativa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PascalitoPackage.EXP_BIN_LOGICA__OPERANDO_ESQ:
				return basicSetOperandoEsq(null, msgs);
			case PascalitoPackage.EXP_BIN_LOGICA__OPERANDO_DIR:
				return basicSetOperandoDir(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PascalitoPackage.EXP_BIN_LOGICA__OPERADOR:
				return getOperador();
			case PascalitoPackage.EXP_BIN_LOGICA__OPERANDO_ESQ:
				return getOperandoEsq();
			case PascalitoPackage.EXP_BIN_LOGICA__OPERANDO_DIR:
				return getOperandoDir();
			case PascalitoPackage.EXP_BIN_LOGICA__COMUTATIVA:
				return isComutativa();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PascalitoPackage.EXP_BIN_LOGICA__OPERADOR:
				setOperador((String)newValue);
				return;
			case PascalitoPackage.EXP_BIN_LOGICA__OPERANDO_ESQ:
				setOperandoEsq((Expressao)newValue);
				return;
			case PascalitoPackage.EXP_BIN_LOGICA__OPERANDO_DIR:
				setOperandoDir((Expressao)newValue);
				return;
			case PascalitoPackage.EXP_BIN_LOGICA__COMUTATIVA:
				setComutativa((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PascalitoPackage.EXP_BIN_LOGICA__OPERADOR:
				setOperador(OPERADOR_EDEFAULT);
				return;
			case PascalitoPackage.EXP_BIN_LOGICA__OPERANDO_ESQ:
				setOperandoEsq((Expressao)null);
				return;
			case PascalitoPackage.EXP_BIN_LOGICA__OPERANDO_DIR:
				setOperandoDir((Expressao)null);
				return;
			case PascalitoPackage.EXP_BIN_LOGICA__COMUTATIVA:
				setComutativa(COMUTATIVA_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PascalitoPackage.EXP_BIN_LOGICA__OPERADOR:
				return OPERADOR_EDEFAULT == null ? operador != null : !OPERADOR_EDEFAULT.equals(operador);
			case PascalitoPackage.EXP_BIN_LOGICA__OPERANDO_ESQ:
				return operandoEsq != null;
			case PascalitoPackage.EXP_BIN_LOGICA__OPERANDO_DIR:
				return operandoDir != null;
			case PascalitoPackage.EXP_BIN_LOGICA__COMUTATIVA:
				return comutativa != COMUTATIVA_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Operador: ");
		result.append(operador);
		result.append(", Comutativa: ");
		result.append(comutativa);
		result.append(')');
		return result.toString();
	}

} //ExpBinLogicaImpl
