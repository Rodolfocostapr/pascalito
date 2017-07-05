/**
 */
package pascalito.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pascalito.Expressao;
import pascalito.PascalitoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expressao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pascalito.impl.ExpressaoImpl#getPrioridade <em>Prioridade</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExpressaoImpl extends MinimalEObjectImpl.Container implements Expressao {
	/**
	 * The default value of the '{@link #getPrioridade() <em>Prioridade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioridade()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PRIORIDADE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrioridade() <em>Prioridade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioridade()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal prioridade = PRIORIDADE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressaoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PascalitoPackage.Literals.EXPRESSAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getPrioridade() {
		return prioridade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrioridade(BigDecimal newPrioridade) {
		BigDecimal oldPrioridade = prioridade;
		prioridade = newPrioridade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.EXPRESSAO__PRIORIDADE, oldPrioridade, prioridade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PascalitoPackage.EXPRESSAO__PRIORIDADE:
				return getPrioridade();
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
			case PascalitoPackage.EXPRESSAO__PRIORIDADE:
				setPrioridade((BigDecimal)newValue);
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
			case PascalitoPackage.EXPRESSAO__PRIORIDADE:
				setPrioridade(PRIORIDADE_EDEFAULT);
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
			case PascalitoPackage.EXPRESSAO__PRIORIDADE:
				return PRIORIDADE_EDEFAULT == null ? prioridade != null : !PRIORIDADE_EDEFAULT.equals(prioridade);
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
		result.append(" (Prioridade: ");
		result.append(prioridade);
		result.append(')');
		return result.toString();
	}

} //ExpressaoImpl
