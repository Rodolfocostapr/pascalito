/**
 */
package pascalito.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import pascalito.Bloco;
import pascalito.ListaParmetros;
import pascalito.PascalitoPackage;
import pascalito.Procedimento;

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
 *   <li>{@link pascalito.impl.ProcedimentoImpl#getListaparmetros <em>Listaparmetros</em>}</li>
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
	 * The cached value of the '{@link #getListaparmetros() <em>Listaparmetros</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaparmetros()
	 * @generated
	 * @ordered
	 */
	protected ListaParmetros listaparmetros;

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
	public ListaParmetros getListaparmetros() {
		return listaparmetros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListaparmetros(ListaParmetros newListaparmetros, NotificationChain msgs) {
		ListaParmetros oldListaparmetros = listaparmetros;
		listaparmetros = newListaparmetros;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalitoPackage.PROCEDIMENTO__LISTAPARMETROS, oldListaparmetros, newListaparmetros);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListaparmetros(ListaParmetros newListaparmetros) {
		if (newListaparmetros != listaparmetros) {
			NotificationChain msgs = null;
			if (listaparmetros != null)
				msgs = ((InternalEObject)listaparmetros).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.PROCEDIMENTO__LISTAPARMETROS, null, msgs);
			if (newListaparmetros != null)
				msgs = ((InternalEObject)newListaparmetros).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.PROCEDIMENTO__LISTAPARMETROS, null, msgs);
			msgs = basicSetListaparmetros(newListaparmetros, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.PROCEDIMENTO__LISTAPARMETROS, newListaparmetros, newListaparmetros));
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
			case PascalitoPackage.PROCEDIMENTO__LISTAPARMETROS:
				return basicSetListaparmetros(null, msgs);
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
			case PascalitoPackage.PROCEDIMENTO__LISTAPARMETROS:
				return getListaparmetros();
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
			case PascalitoPackage.PROCEDIMENTO__LISTAPARMETROS:
				setListaparmetros((ListaParmetros)newValue);
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
			case PascalitoPackage.PROCEDIMENTO__LISTAPARMETROS:
				setListaparmetros((ListaParmetros)null);
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
			case PascalitoPackage.PROCEDIMENTO__LISTAPARMETROS:
				return listaparmetros != null;
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
