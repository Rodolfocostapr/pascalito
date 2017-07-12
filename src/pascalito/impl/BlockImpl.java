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

import pascalito.Block;
import pascalito.Command;
import pascalito.PascalitoPackage;
import pascalito.Procedure;
import pascalito.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pascalito.impl.BlockImpl#getDefVariable <em>Def Variable</em>}</li>
 *   <li>{@link pascalito.impl.BlockImpl#getDefprocedure <em>Defprocedure</em>}</li>
 *   <li>{@link pascalito.impl.BlockImpl#getExecute <em>Execute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockImpl extends MinimalEObjectImpl.Container implements Block {
	/**
	 * The cached value of the '{@link #getDefVariable() <em>Def Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> defVariable;

	/**
	 * The cached value of the '{@link #getDefprocedure() <em>Defprocedure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefprocedure()
	 * @generated
	 * @ordered
	 */
	protected EList<Procedure> defprocedure;

	/**
	 * The cached value of the '{@link #getExecute() <em>Execute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecute()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> execute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PascalitoPackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getDefVariable() {
		if (defVariable == null) {
			defVariable = new EObjectContainmentEList<Variable>(Variable.class, this, PascalitoPackage.BLOCK__DEF_VARIABLE);
		}
		return defVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Procedure> getDefprocedure() {
		if (defprocedure == null) {
			defprocedure = new EObjectContainmentEList<Procedure>(Procedure.class, this, PascalitoPackage.BLOCK__DEFPROCEDURE);
		}
		return defprocedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getExecute() {
		if (execute == null) {
			execute = new EObjectContainmentEList<Command>(Command.class, this, PascalitoPackage.BLOCK__EXECUTE);
		}
		return execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PascalitoPackage.BLOCK__DEF_VARIABLE:
				return ((InternalEList<?>)getDefVariable()).basicRemove(otherEnd, msgs);
			case PascalitoPackage.BLOCK__DEFPROCEDURE:
				return ((InternalEList<?>)getDefprocedure()).basicRemove(otherEnd, msgs);
			case PascalitoPackage.BLOCK__EXECUTE:
				return ((InternalEList<?>)getExecute()).basicRemove(otherEnd, msgs);
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
			case PascalitoPackage.BLOCK__DEF_VARIABLE:
				return getDefVariable();
			case PascalitoPackage.BLOCK__DEFPROCEDURE:
				return getDefprocedure();
			case PascalitoPackage.BLOCK__EXECUTE:
				return getExecute();
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
			case PascalitoPackage.BLOCK__DEF_VARIABLE:
				getDefVariable().clear();
				getDefVariable().addAll((Collection<? extends Variable>)newValue);
				return;
			case PascalitoPackage.BLOCK__DEFPROCEDURE:
				getDefprocedure().clear();
				getDefprocedure().addAll((Collection<? extends Procedure>)newValue);
				return;
			case PascalitoPackage.BLOCK__EXECUTE:
				getExecute().clear();
				getExecute().addAll((Collection<? extends Command>)newValue);
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
			case PascalitoPackage.BLOCK__DEF_VARIABLE:
				getDefVariable().clear();
				return;
			case PascalitoPackage.BLOCK__DEFPROCEDURE:
				getDefprocedure().clear();
				return;
			case PascalitoPackage.BLOCK__EXECUTE:
				getExecute().clear();
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
			case PascalitoPackage.BLOCK__DEF_VARIABLE:
				return defVariable != null && !defVariable.isEmpty();
			case PascalitoPackage.BLOCK__DEFPROCEDURE:
				return defprocedure != null && !defprocedure.isEmpty();
			case PascalitoPackage.BLOCK__EXECUTE:
				return execute != null && !execute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BlockImpl
