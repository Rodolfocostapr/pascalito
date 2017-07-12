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

import pascalito.CallProcExp;
import pascalito.Expression;
import pascalito.PascalitoPackage;
import pascalito.Procedure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Proc Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pascalito.impl.CallProcExpImpl#getRepresent <em>Represent</em>}</li>
 *   <li>{@link pascalito.impl.CallProcExpImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallProcExpImpl extends ExpressionImpl implements CallProcExp {
	/**
	 * The cached value of the '{@link #getRepresent() <em>Represent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresent()
	 * @generated
	 * @ordered
	 */
	protected Procedure represent;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallProcExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PascalitoPackage.Literals.CALL_PROC_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure getRepresent() {
		if (represent != null && represent.eIsProxy()) {
			InternalEObject oldRepresent = (InternalEObject)represent;
			represent = (Procedure)eResolveProxy(oldRepresent);
			if (represent != oldRepresent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PascalitoPackage.CALL_PROC_EXP__REPRESENT, oldRepresent, represent));
			}
		}
		return represent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure basicGetRepresent() {
		return represent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresent(Procedure newRepresent) {
		Procedure oldRepresent = represent;
		represent = newRepresent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.CALL_PROC_EXP__REPRESENT, oldRepresent, represent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Expression>(Expression.class, this, PascalitoPackage.CALL_PROC_EXP__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PascalitoPackage.CALL_PROC_EXP__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
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
			case PascalitoPackage.CALL_PROC_EXP__REPRESENT:
				if (resolve) return getRepresent();
				return basicGetRepresent();
			case PascalitoPackage.CALL_PROC_EXP__PARAMETER:
				return getParameter();
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
			case PascalitoPackage.CALL_PROC_EXP__REPRESENT:
				setRepresent((Procedure)newValue);
				return;
			case PascalitoPackage.CALL_PROC_EXP__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Expression>)newValue);
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
			case PascalitoPackage.CALL_PROC_EXP__REPRESENT:
				setRepresent((Procedure)null);
				return;
			case PascalitoPackage.CALL_PROC_EXP__PARAMETER:
				getParameter().clear();
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
			case PascalitoPackage.CALL_PROC_EXP__REPRESENT:
				return represent != null;
			case PascalitoPackage.CALL_PROC_EXP__PARAMETER:
				return parameter != null && !parameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CallProcExpImpl
