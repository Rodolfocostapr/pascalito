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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import pascalito.CallProcedimento;
import pascalito.Expressao;
import pascalito.PascalitoPackage;
import pascalito.Procedimento;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Procedimento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pascalito.impl.CallProcedimentoImpl#getDefinido <em>Definido</em>}</li>
 *   <li>{@link pascalito.impl.CallProcedimentoImpl#getParametro <em>Parametro</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallProcedimentoImpl extends ComandoImpl implements CallProcedimento {
	/**
	 * The cached value of the '{@link #getDefinido() <em>Definido</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinido()
	 * @generated
	 * @ordered
	 */
	protected Procedimento definido;

	/**
	 * The cached value of the '{@link #getParametro() <em>Parametro</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametro()
	 * @generated
	 * @ordered
	 */
	protected EList<Expressao> parametro;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallProcedimentoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PascalitoPackage.Literals.CALL_PROCEDIMENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedimento getDefinido() {
		if (definido != null && definido.eIsProxy()) {
			InternalEObject oldDefinido = (InternalEObject)definido;
			definido = (Procedimento)eResolveProxy(oldDefinido);
			if (definido != oldDefinido) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PascalitoPackage.CALL_PROCEDIMENTO__DEFINIDO, oldDefinido, definido));
			}
		}
		return definido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedimento basicGetDefinido() {
		return definido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinido(Procedimento newDefinido) {
		Procedimento oldDefinido = definido;
		definido = newDefinido;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.CALL_PROCEDIMENTO__DEFINIDO, oldDefinido, definido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expressao> getParametro() {
		if (parametro == null) {
			parametro = new EObjectContainmentEList<Expressao>(Expressao.class, this, PascalitoPackage.CALL_PROCEDIMENTO__PARAMETRO);
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
			case PascalitoPackage.CALL_PROCEDIMENTO__PARAMETRO:
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
			case PascalitoPackage.CALL_PROCEDIMENTO__DEFINIDO:
				if (resolve) return getDefinido();
				return basicGetDefinido();
			case PascalitoPackage.CALL_PROCEDIMENTO__PARAMETRO:
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
			case PascalitoPackage.CALL_PROCEDIMENTO__DEFINIDO:
				setDefinido((Procedimento)newValue);
				return;
			case PascalitoPackage.CALL_PROCEDIMENTO__PARAMETRO:
				getParametro().clear();
				getParametro().addAll((Collection<? extends Expressao>)newValue);
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
			case PascalitoPackage.CALL_PROCEDIMENTO__DEFINIDO:
				setDefinido((Procedimento)null);
				return;
			case PascalitoPackage.CALL_PROCEDIMENTO__PARAMETRO:
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
			case PascalitoPackage.CALL_PROCEDIMENTO__DEFINIDO:
				return definido != null;
			case PascalitoPackage.CALL_PROCEDIMENTO__PARAMETRO:
				return parametro != null && !parametro.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CallProcedimentoImpl
