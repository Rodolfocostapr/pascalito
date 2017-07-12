/**
 */
package pascalito.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pascalito.Atribuition;
import pascalito.Expression;
import pascalito.PascalitoPackage;
import pascalito.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atribuition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pascalito.impl.AtribuitionImpl#getSets <em>Sets</em>}</li>
 *   <li>{@link pascalito.impl.AtribuitionImpl#getAtribuiResultado <em>Atribui Resultado</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtribuitionImpl extends CommandImpl implements Atribuition {
	/**
	 * The cached value of the '{@link #getSets() <em>Sets</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSets()
	 * @generated
	 * @ordered
	 */
	protected Variable sets;

	/**
	 * The cached value of the '{@link #getAtribuiResultado() <em>Atribui Resultado</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtribuiResultado()
	 * @generated
	 * @ordered
	 */
	protected Expression atribuiResultado;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtribuitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PascalitoPackage.Literals.ATRIBUITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getSets() {
		if (sets != null && sets.eIsProxy()) {
			InternalEObject oldSets = (InternalEObject)sets;
			sets = (Variable)eResolveProxy(oldSets);
			if (sets != oldSets) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PascalitoPackage.ATRIBUITION__SETS, oldSets, sets));
			}
		}
		return sets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetSets() {
		return sets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSets(Variable newSets) {
		Variable oldSets = sets;
		sets = newSets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.ATRIBUITION__SETS, oldSets, sets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getAtribuiResultado() {
		return atribuiResultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAtribuiResultado(Expression newAtribuiResultado, NotificationChain msgs) {
		Expression oldAtribuiResultado = atribuiResultado;
		atribuiResultado = newAtribuiResultado;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalitoPackage.ATRIBUITION__ATRIBUI_RESULTADO, oldAtribuiResultado, newAtribuiResultado);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtribuiResultado(Expression newAtribuiResultado) {
		if (newAtribuiResultado != atribuiResultado) {
			NotificationChain msgs = null;
			if (atribuiResultado != null)
				msgs = ((InternalEObject)atribuiResultado).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.ATRIBUITION__ATRIBUI_RESULTADO, null, msgs);
			if (newAtribuiResultado != null)
				msgs = ((InternalEObject)newAtribuiResultado).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.ATRIBUITION__ATRIBUI_RESULTADO, null, msgs);
			msgs = basicSetAtribuiResultado(newAtribuiResultado, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.ATRIBUITION__ATRIBUI_RESULTADO, newAtribuiResultado, newAtribuiResultado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PascalitoPackage.ATRIBUITION__ATRIBUI_RESULTADO:
				return basicSetAtribuiResultado(null, msgs);
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
			case PascalitoPackage.ATRIBUITION__SETS:
				if (resolve) return getSets();
				return basicGetSets();
			case PascalitoPackage.ATRIBUITION__ATRIBUI_RESULTADO:
				return getAtribuiResultado();
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
			case PascalitoPackage.ATRIBUITION__SETS:
				setSets((Variable)newValue);
				return;
			case PascalitoPackage.ATRIBUITION__ATRIBUI_RESULTADO:
				setAtribuiResultado((Expression)newValue);
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
			case PascalitoPackage.ATRIBUITION__SETS:
				setSets((Variable)null);
				return;
			case PascalitoPackage.ATRIBUITION__ATRIBUI_RESULTADO:
				setAtribuiResultado((Expression)null);
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
			case PascalitoPackage.ATRIBUITION__SETS:
				return sets != null;
			case PascalitoPackage.ATRIBUITION__ATRIBUI_RESULTADO:
				return atribuiResultado != null;
		}
		return super.eIsSet(featureID);
	}

} //AtribuitionImpl
