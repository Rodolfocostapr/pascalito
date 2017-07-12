/**
 */
package pascalito.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pascalito.CallVariable;
import pascalito.PascalitoPackage;
import pascalito.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pascalito.impl.CallVariableImpl#getRepresent <em>Represent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallVariableImpl extends ExpressionImpl implements CallVariable {
	/**
	 * The cached value of the '{@link #getRepresent() <em>Represent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresent()
	 * @generated
	 * @ordered
	 */
	protected Variable represent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PascalitoPackage.Literals.CALL_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getRepresent() {
		if (represent != null && represent.eIsProxy()) {
			InternalEObject oldRepresent = (InternalEObject)represent;
			represent = (Variable)eResolveProxy(oldRepresent);
			if (represent != oldRepresent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PascalitoPackage.CALL_VARIABLE__REPRESENT, oldRepresent, represent));
			}
		}
		return represent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetRepresent() {
		return represent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresent(Variable newRepresent) {
		Variable oldRepresent = represent;
		represent = newRepresent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.CALL_VARIABLE__REPRESENT, oldRepresent, represent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PascalitoPackage.CALL_VARIABLE__REPRESENT:
				if (resolve) return getRepresent();
				return basicGetRepresent();
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
			case PascalitoPackage.CALL_VARIABLE__REPRESENT:
				setRepresent((Variable)newValue);
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
			case PascalitoPackage.CALL_VARIABLE__REPRESENT:
				setRepresent((Variable)null);
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
			case PascalitoPackage.CALL_VARIABLE__REPRESENT:
				return represent != null;
		}
		return super.eIsSet(featureID);
	}

} //CallVariableImpl
