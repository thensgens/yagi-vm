package de.fhac.ti.yagi.vm.memory.models.action;

import de.fhac.ti.yagi.vm.exceptions.IncompatibleOperationException;
import de.fhac.ti.yagi.vm.exceptions.VarNotInScopeException;
import de.fhac.ti.yagi.vm.interfaces.ConditionObject;
import de.fhac.ti.yagi.vm.memory.models.Var;

import java.util.Map;

public class Formula implements ConditionObject {

    private Atom mAtom;
    private Formula mFormula;
    private Connective mConnective;

    /*
     two rules are missing for now..
    */

    private FormulaRule mRule;

    private Map<String, Var> mScope;

    public Formula(FormulaRule mRule, Map<String, Var> mScope) {
        this.mRule = mRule;
        this.mScope = mScope;
    }

    public Formula(Atom mAtom, Formula mFormula, Connective mConnective, FormulaRule mRule, Map<String, Var> mScope) {
        this.mAtom = mAtom;
        this.mFormula = mFormula;
        this.mConnective = mConnective;
        this.mRule = mRule;
        this.mScope = mScope;
    }

    public void updateScope(Map<String, Var> scope) {
        mScope = scope;
        if (mAtom != null) {
            mAtom.updateScope(scope);
        }
        if (mFormula != null) {
            mFormula.updateScope(scope);
        }
    }

    public void setAtom(Atom atom) {
        mAtom = atom;
    }

    public void setFormula(Formula formula) {
        mFormula = formula;
    }

    public void setConnective(Connective connective) {
        mConnective = connective;
    }

    @Override
    public boolean evaluate() throws IncompatibleOperationException, VarNotInScopeException {
        boolean result = false;

        if (mRule == FormulaRule.FIRST) {
            result = mAtom.evaluate();
        } else if (mRule == FormulaRule.SECOND) {
            result = !mFormula.evaluate();
        } else if (mRule == FormulaRule.THIRD) {
            result = mConnective.evaluate();
        } else if (mRule == FormulaRule.FOURTH) {
            /* not implemented for now */
        } else if (mRule == FormulaRule.FIFTH) {
            /* not implemented for now */
        }

        return result;
    }

    public enum FormulaRule {
        FIRST,
        SECOND,
        THIRD,
        FOURTH,
        FIFTH
    }
}
