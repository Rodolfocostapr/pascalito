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
import pascalito.CallProc;
import pascalito.Expressao;
import pascalito.PascalitoPackage;
import pascalito.Procedimento;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Proc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pascalito.impl.CallProcImpl#getRepresentaProc <em>Representa Proc</em>}</li>
 *   <li>{@link pascalito.impl.CallProcImpl#getParametro <em>Parametro</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallProcImpl extends ExpressaoImpl implements CallProc {
	/**
	 * The cached value of the '{@link #getRepresentaProc() <em>Representa Proc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentaProc()
	 * @generated
	 * @ordered
	 */
	protected Procedimento representaProc;
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
	protected CallProcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PascalitoPackage.Literals.CALL_PROC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedimento getRepresentaProc() {
		if (representaProc != null && representaProc.eIsProxy()) {
			InternalEObject oldRepresentaProc = (InternalEObject)representaProc;
			representaProc = (Procedimento)eResolveProxy(oldRepresentaProc);
			if (representaProc != oldRepresentaProc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PascalitoPackage.CALL_PROC__REPRESENTA_PROC, oldRepresentaProc, representaProc));
			}
		}
		return representaProc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedimento basicGetRepresentaProc() {
		return representaProc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentaProc(Procedimento newRepresentaProc) {
		Procedimento oldRepresentaProc = representaProc;
		representaProc = newRepresentaProc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.CALL_PROC__REPRESENTA_PROC, oldRepresentaProc, representaProc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expressao> getParametro() {
		if (parametro == null) {
			parametro = new EObjectContainmentEList<Expressao>(Expressao.class, this, PascalitoPackage.CALL_PROC__PARAMETRO);
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
			case PascalitoPackage.CALL_PROC__PARAMETRO:
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
			case PascalitoPackage.CALL_PROC__REPRESENTA_PROC:
				if (resolve) return getRepresentaProc();
				return basicGetRepresentaProc();
			case PascalitoPackage.CALL_PROC__PARAMETRO:
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
			case PascalitoPackage.CALL_PROC__REPRESENTA_PROC:
				setRepresentaProc((Procedimento)newValue);
				return;
			case PascalitoPackage.CALL_PROC__PARAMETRO:
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
			case PascalitoPackage.CALL_PROC__REPRESENTA_PROC:
				setRepresentaProc((Procedimento)null);
				return;
			case PascalitoPackage.CALL_PROC__PARAMETRO:
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
			case PascalitoPackage.CALL_PROC__REPRESENTA_PROC:
				return representaProc != null;
			case PascalitoPackage.CALL_PROC__PARAMETRO:
				return parametro != null && !parametro.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CallProcImpl
