/**
 */
package pascalito.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pascalito.Bloco;
import pascalito.Comando;
import pascalito.PascalitoPackage;
import pascalito.Procedimento;
import pascalito.Variavel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bloco</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pascalito.impl.BlocoImpl#getDefvariavel <em>Defvariavel</em>}</li>
 *   <li>{@link pascalito.impl.BlocoImpl#getDefprocedimento <em>Defprocedimento</em>}</li>
 *   <li>{@link pascalito.impl.BlocoImpl#getExecuta <em>Executa</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlocoImpl extends MinimalEObjectImpl.Container implements Bloco {
	/**
	 * The cached value of the '{@link #getDefvariavel() <em>Defvariavel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefvariavel()
	 * @generated
	 * @ordered
	 */
	protected EList<Variavel> defvariavel;

	/**
	 * The cached value of the '{@link #getDefprocedimento() <em>Defprocedimento</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefprocedimento()
	 * @generated
	 * @ordered
	 */
	protected EList<Procedimento> defprocedimento;

	/**
	 * The cached value of the '{@link #getExecuta() <em>Executa</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecuta()
	 * @generated
	 * @ordered
	 */
	protected EList<Comando> executa;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlocoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PascalitoPackage.Literals.BLOCO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variavel> getDefvariavel() {
		if (defvariavel == null) {
			defvariavel = new EObjectContainmentEList<Variavel>(Variavel.class, this, PascalitoPackage.BLOCO__DEFVARIAVEL);
		}
		return defvariavel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Procedimento> getDefprocedimento() {
		if (defprocedimento == null) {
			defprocedimento = new EObjectContainmentEList<Procedimento>(Procedimento.class, this, PascalitoPackage.BLOCO__DEFPROCEDIMENTO);
		}
		return defprocedimento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comando> getExecuta() {
		if (executa == null) {
			executa = new EObjectContainmentEList<Comando>(Comando.class, this, PascalitoPackage.BLOCO__EXECUTA);
		}
		return executa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PascalitoPackage.BLOCO__DEFVARIAVEL:
				return ((InternalEList<?>)getDefvariavel()).basicRemove(otherEnd, msgs);
			case PascalitoPackage.BLOCO__DEFPROCEDIMENTO:
				return ((InternalEList<?>)getDefprocedimento()).basicRemove(otherEnd, msgs);
			case PascalitoPackage.BLOCO__EXECUTA:
				return ((InternalEList<?>)getExecuta()).basicRemove(otherEnd, msgs);
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
			case PascalitoPackage.BLOCO__DEFVARIAVEL:
				return getDefvariavel();
			case PascalitoPackage.BLOCO__DEFPROCEDIMENTO:
				return getDefprocedimento();
			case PascalitoPackage.BLOCO__EXECUTA:
				return getExecuta();
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
			case PascalitoPackage.BLOCO__DEFVARIAVEL:
				getDefvariavel().clear();
				getDefvariavel().addAll((Collection<? extends Variavel>)newValue);
				return;
			case PascalitoPackage.BLOCO__DEFPROCEDIMENTO:
				getDefprocedimento().clear();
				getDefprocedimento().addAll((Collection<? extends Procedimento>)newValue);
				return;
			case PascalitoPackage.BLOCO__EXECUTA:
				getExecuta().clear();
				getExecuta().addAll((Collection<? extends Comando>)newValue);
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
			case PascalitoPackage.BLOCO__DEFVARIAVEL:
				getDefvariavel().clear();
				return;
			case PascalitoPackage.BLOCO__DEFPROCEDIMENTO:
				getDefprocedimento().clear();
				return;
			case PascalitoPackage.BLOCO__EXECUTA:
				getExecuta().clear();
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
			case PascalitoPackage.BLOCO__DEFVARIAVEL:
				return defvariavel != null && !defvariavel.isEmpty();
			case PascalitoPackage.BLOCO__DEFPROCEDIMENTO:
				return defprocedimento != null && !defprocedimento.isEmpty();
			case PascalitoPackage.BLOCO__EXECUTA:
				return executa != null && !executa.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BlocoImpl
