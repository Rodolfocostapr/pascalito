/**
 */
package pascalito.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import pascalito.Bloco;
import pascalito.PascalitoPackage;
import pascalito.Procedimento;
import pascalito.Variavel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedimento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pascalito.impl.ProcedimentoImpl#getBloco <em>Bloco</em>}</li>
 *   <li>{@link pascalito.impl.ProcedimentoImpl#getIdentificador <em>Identificador</em>}</li>
 *   <li>{@link pascalito.impl.ProcedimentoImpl#getParametro <em>Parametro</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedimentoImpl extends MinimalEObjectImpl.Container implements Procedimento {
	/**
	 * The cached value of the '{@link #getBloco() <em>Bloco</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloco()
	 * @generated
	 * @ordered
	 */
	protected Bloco bloco;

	/**
	 * The default value of the '{@link #getIdentificador() <em>Identificador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificador()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFICADOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentificador() <em>Identificador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificador()
	 * @generated
	 * @ordered
	 */
	protected String identificador = IDENTIFICADOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParametro() <em>Parametro</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametro()
	 * @generated
	 * @ordered
	 */
	protected EList<Variavel> parametro;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedimentoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PascalitoPackage.Literals.PROCEDIMENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bloco getBloco() {
		return bloco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBloco(Bloco newBloco, NotificationChain msgs) {
		Bloco oldBloco = bloco;
		bloco = newBloco;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalitoPackage.PROCEDIMENTO__BLOCO, oldBloco, newBloco);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBloco(Bloco newBloco) {
		if (newBloco != bloco) {
			NotificationChain msgs = null;
			if (bloco != null)
				msgs = ((InternalEObject)bloco).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.PROCEDIMENTO__BLOCO, null, msgs);
			if (newBloco != null)
				msgs = ((InternalEObject)newBloco).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.PROCEDIMENTO__BLOCO, null, msgs);
			msgs = basicSetBloco(newBloco, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.PROCEDIMENTO__BLOCO, newBloco, newBloco));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentificador() {
		return identificador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentificador(String newIdentificador) {
		String oldIdentificador = identificador;
		identificador = newIdentificador;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.PROCEDIMENTO__IDENTIFICADOR, oldIdentificador, identificador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variavel> getParametro() {
		if (parametro == null) {
			parametro = new EObjectContainmentEList<Variavel>(Variavel.class, this, PascalitoPackage.PROCEDIMENTO__PARAMETRO);
		}
		return parametro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PascalitoPackage.PROCEDIMENTO__BLOCO:
				return basicSetBloco(null, msgs);
			case PascalitoPackage.PROCEDIMENTO__PARAMETRO:
				return ((InternalEList<?>)getParametro()).basicRemove(otherEnd, msgs);
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
			case PascalitoPackage.PROCEDIMENTO__BLOCO:
				return getBloco();
			case PascalitoPackage.PROCEDIMENTO__IDENTIFICADOR:
				return getIdentificador();
			case PascalitoPackage.PROCEDIMENTO__PARAMETRO:
				return getParametro();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PascalitoPackage.PROCEDIMENTO__BLOCO:
				setBloco((Bloco)newValue);
				return;
			case PascalitoPackage.PROCEDIMENTO__IDENTIFICADOR:
				setIdentificador((String)newValue);
				return;
			case PascalitoPackage.PROCEDIMENTO__PARAMETRO:
				getParametro().clear();
				getParametro().addAll((Collection<? extends Variavel>)newValue);
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
			case PascalitoPackage.PROCEDIMENTO__BLOCO:
				setBloco((Bloco)null);
				return;
			case PascalitoPackage.PROCEDIMENTO__IDENTIFICADOR:
				setIdentificador(IDENTIFICADOR_EDEFAULT);
				return;
			case PascalitoPackage.PROCEDIMENTO__PARAMETRO:
				getParametro().clear();
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
			case PascalitoPackage.PROCEDIMENTO__BLOCO:
				return bloco != null;
			case PascalitoPackage.PROCEDIMENTO__IDENTIFICADOR:
				return IDENTIFICADOR_EDEFAULT == null ? identificador != null : !IDENTIFICADOR_EDEFAULT.equals(identificador);
			case PascalitoPackage.PROCEDIMENTO__PARAMETRO:
				return parametro != null && !parametro.isEmpty();
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
		result.append(" (Identificador: ");
		result.append(identificador);
		result.append(')');
		return result.toString();
	}

} //ProcedimentoImpl
