/**
 */
package pascalito.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pascalito.Atribuicao;
import pascalito.Expressao;
import pascalito.PascalitoPackage;
import pascalito.Variavel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atribuicao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pascalito.impl.AtribuicaoImpl#getAtribui <em>Atribui</em>}</li>
 *   <li>{@link pascalito.impl.AtribuicaoImpl#getAtribuiResultado <em>Atribui Resultado</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtribuicaoImpl extends ComandoImpl implements Atribuicao {
	/**
	 * The cached value of the '{@link #getAtribui() <em>Atribui</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtribui()
	 * @generated
	 * @ordered
	 */
	protected Variavel atribui;

	/**
	 * The cached value of the '{@link #getAtribuiResultado() <em>Atribui Resultado</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtribuiResultado()
	 * @generated
	 * @ordered
	 */
	protected Expressao atribuiResultado;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtribuicaoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PascalitoPackage.Literals.ATRIBUICAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variavel getAtribui() {
		if (atribui != null && atribui.eIsProxy()) {
			InternalEObject oldAtribui = (InternalEObject)atribui;
			atribui = (Variavel)eResolveProxy(oldAtribui);
			if (atribui != oldAtribui) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PascalitoPackage.ATRIBUICAO__ATRIBUI, oldAtribui, atribui));
			}
		}
		return atribui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variavel basicGetAtribui() {
		return atribui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtribui(Variavel newAtribui) {
		Variavel oldAtribui = atribui;
		atribui = newAtribui;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.ATRIBUICAO__ATRIBUI, oldAtribui, atribui));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expressao getAtribuiResultado() {
		return atribuiResultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAtribuiResultado(Expressao newAtribuiResultado, NotificationChain msgs) {
		Expressao oldAtribuiResultado = atribuiResultado;
		atribuiResultado = newAtribuiResultado;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalitoPackage.ATRIBUICAO__ATRIBUI_RESULTADO, oldAtribuiResultado, newAtribuiResultado);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtribuiResultado(Expressao newAtribuiResultado) {
		if (newAtribuiResultado != atribuiResultado) {
			NotificationChain msgs = null;
			if (atribuiResultado != null)
				msgs = ((InternalEObject)atribuiResultado).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.ATRIBUICAO__ATRIBUI_RESULTADO, null, msgs);
			if (newAtribuiResultado != null)
				msgs = ((InternalEObject)newAtribuiResultado).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.ATRIBUICAO__ATRIBUI_RESULTADO, null, msgs);
			msgs = basicSetAtribuiResultado(newAtribuiResultado, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.ATRIBUICAO__ATRIBUI_RESULTADO, newAtribuiResultado, newAtribuiResultado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PascalitoPackage.ATRIBUICAO__ATRIBUI_RESULTADO:
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
			case PascalitoPackage.ATRIBUICAO__ATRIBUI:
				if (resolve) return getAtribui();
				return basicGetAtribui();
			case PascalitoPackage.ATRIBUICAO__ATRIBUI_RESULTADO:
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
			case PascalitoPackage.ATRIBUICAO__ATRIBUI:
				setAtribui((Variavel)newValue);
				return;
			case PascalitoPackage.ATRIBUICAO__ATRIBUI_RESULTADO:
				setAtribuiResultado((Expressao)newValue);
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
			case PascalitoPackage.ATRIBUICAO__ATRIBUI:
				setAtribui((Variavel)null);
				return;
			case PascalitoPackage.ATRIBUICAO__ATRIBUI_RESULTADO:
				setAtribuiResultado((Expressao)null);
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
			case PascalitoPackage.ATRIBUICAO__ATRIBUI:
				return atribui != null;
			case PascalitoPackage.ATRIBUICAO__ATRIBUI_RESULTADO:
				return atribuiResultado != null;
		}
		return super.eIsSet(featureID);
	}

} //AtribuicaoImpl
