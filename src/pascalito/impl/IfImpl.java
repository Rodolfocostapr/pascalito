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

import pascalito.Command;
import pascalito.Expression;
import pascalito.If;
import pascalito.PascalitoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pascalito.impl.IfImpl#getIfExp <em>If Exp</em>}</li>
 *   <li>{@link pascalito.impl.IfImpl#getDo <em>Do</em>}</li>
 *   <li>{@link pascalito.impl.IfImpl#getElseCmd <em>Else Cmd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfImpl extends CommandImpl implements If {
	/**
	 * The cached value of the '{@link #getIfExp() <em>If Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfExp()
	 * @generated
	 * @ordered
	 */
	protected Expression ifExp;

	/**
	 * The cached value of the '{@link #getDo() <em>Do</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDo()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> do_;

	/**
	 * The cached value of the '{@link #getElseCmd() <em>Else Cmd</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseCmd()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> elseCmd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PascalitoPackage.Literals.IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getIfExp() {
		return ifExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfExp(Expression newIfExp, NotificationChain msgs) {
		Expression oldIfExp = ifExp;
		ifExp = newIfExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalitoPackage.IF__IF_EXP, oldIfExp, newIfExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfExp(Expression newIfExp) {
		if (newIfExp != ifExp) {
			NotificationChain msgs = null;
			if (ifExp != null)
				msgs = ((InternalEObject)ifExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.IF__IF_EXP, null, msgs);
			if (newIfExp != null)
				msgs = ((InternalEObject)newIfExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.IF__IF_EXP, null, msgs);
			msgs = basicSetIfExp(newIfExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.IF__IF_EXP, newIfExp, newIfExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getDo() {
		if (do_ == null) {
			do_ = new EObjectContainmentEList<Command>(Command.class, this, PascalitoPackage.IF__DO);
		}
		return do_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getElseCmd() {
		if (elseCmd == null) {
			elseCmd = new EObjectContainmentEList<Command>(Command.class, this, PascalitoPackage.IF__ELSE_CMD);
		}
		return elseCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PascalitoPackage.IF__IF_EXP:
				return basicSetIfExp(null, msgs);
			case PascalitoPackage.IF__DO:
				return ((InternalEList<?>)getDo()).basicRemove(otherEnd, msgs);
			case PascalitoPackage.IF__ELSE_CMD:
				return ((InternalEList<?>)getElseCmd()).basicRemove(otherEnd, msgs);
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
			case PascalitoPackage.IF__IF_EXP:
				return getIfExp();
			case PascalitoPackage.IF__DO:
				return getDo();
			case PascalitoPackage.IF__ELSE_CMD:
				return getElseCmd();
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
			case PascalitoPackage.IF__IF_EXP:
				setIfExp((Expression)newValue);
				return;
			case PascalitoPackage.IF__DO:
				getDo().clear();
				getDo().addAll((Collection<? extends Command>)newValue);
				return;
			case PascalitoPackage.IF__ELSE_CMD:
				getElseCmd().clear();
				getElseCmd().addAll((Collection<? extends Command>)newValue);
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
			case PascalitoPackage.IF__IF_EXP:
				setIfExp((Expression)null);
				return;
			case PascalitoPackage.IF__DO:
				getDo().clear();
				return;
			case PascalitoPackage.IF__ELSE_CMD:
				getElseCmd().clear();
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
			case PascalitoPackage.IF__IF_EXP:
				return ifExp != null;
			case PascalitoPackage.IF__DO:
				return do_ != null && !do_.isEmpty();
			case PascalitoPackage.IF__ELSE_CMD:
				return elseCmd != null && !elseCmd.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfImpl
