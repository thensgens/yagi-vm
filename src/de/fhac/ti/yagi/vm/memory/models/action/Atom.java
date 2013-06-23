package de.fhac.ti.yagi.vm.memory.models.action;

import de.fhac.ti.yagi.vm.exceptions.IncompatibleOperationException;
import de.fhac.ti.yagi.vm.exceptions.VarNotInScopeException;
import de.fhac.ti.yagi.vm.interfaces.ConditionObject;
import de.fhac.ti.yagi.vm.memory.SetItem;
import de.fhac.ti.yagi.vm.memory.SetType;
import de.fhac.ti.yagi.vm.memory.models.Value;
import de.fhac.ti.yagi.vm.memory.models.Var;

import java.util.List;
import java.util.Map;

public class Atom implements ConditionObject {

    private AtomRule mRuleNumber;

    private Var mFirstVar;
    private Var mSecondVar;

    private List<SetItem> mFirstSet;
    private SetType mFirstSetType;

    private List<SetItem> mSecondSet;
    private SetType mSecondSetType;

    private CompOperator mCompOp;

    private Map<String, Var> mScope;

    public Atom(AtomRule rule, Map<String, Var> scope) {
        mRuleNumber = rule;
        mScope = scope;
    }

    @Override
    public boolean evaluate() throws IncompatibleOperationException, VarNotInScopeException {
        boolean result = false;
        if (mRuleNumber == AtomRule.FIRST) {
            if (mFirstVar.getSetType() != mSecondVar.getSetType()) {
                throw new IncompatibleOperationException("Types are incompatible.");
            }
            if (mFirstVar.getSetType() == SetType.INT) {
                int first = Integer.parseInt(mFirstVar.getmValue());
                int second = Integer.parseInt(mSecondVar.getmValue());
                result = evaluateInt(first,  second);
            }
            // STRING operation not supported yet
            // ...

            // lookup in the current scope required
            else if (mFirstVar.getSetType() == SetType.UNDEFINED) {
                if (mScope.containsKey(mFirstVar.getName()) && mScope.containsKey(mSecondVar.getName())) {
                    Var first = mScope.get(mFirstVar.getName());
                    Var second = mScope.get(mSecondVar.getName());
                    if (first.getSetType() != second.getSetType()) {
                        throw new IncompatibleOperationException("Types are incompatible.");
                    }
                    if (first.getSetType() == SetType.INT) {
                        int f1 = Integer.parseInt(first.getmValue());
                        int f2 = Integer.parseInt(second.getmValue());
                        result = evaluateInt(f1, f2);
                    }
                    // STRING not supported
                } else {
                    throw new VarNotInScopeException("Var [" + mFirstVar.getName() + "] or [" + mSecondVar.getName()
                    + "] is not defined in the current scope.");
                }
            }
        } else if (mRuleNumber == AtomRule.SECOND) {
        } else if (mRuleNumber == AtomRule.THIRD) {
        } else if (mRuleNumber == AtomRule.FOURTH) {
        } else if (mRuleNumber == AtomRule.FIFTH) {
        }
        return result;
    }

    private boolean evaluateInt(int first, int second) {
        boolean result = false;
        if (mCompOp == CompOperator.EQUALS) { result = first == second; }
        else if (mCompOp == CompOperator.NOT_EQUALS) { result = first != second; }
        else if (mCompOp == CompOperator.LESS_OR_EQUAL) { result = first <= second; }
        else if (mCompOp == CompOperator.GREATER_OR_EQUAL) { result = first >= second; }
        else if (mCompOp == CompOperator.LESS) { result = first < second; }
        else if (mCompOp == CompOperator.GREATER) { result = first > second; }

        return result;
    }

    public void setRuleNumber(AtomRule ruleNumber) {
        mRuleNumber = ruleNumber;
    }

    public void setFirstVar(Var firstVar) {
        mFirstVar = firstVar;
    }

    public void setSecondVar(Var secondVar) {
        mSecondVar = secondVar;
    }

    public void setFirstSet(List<SetItem> firstSet) {
        mFirstSet = firstSet;
    }

    public void setFirstSetType(SetType firstSetType) {
        mFirstSetType = firstSetType;
    }

    public void setSecondSet(List<SetItem> secondSet) {
        mSecondSet = secondSet;
    }

    public void setSecondSetType(SetType secondSetType) {
        mSecondSetType = secondSetType;
    }

    public void setCompOp(CompOperator compOp) {
        mCompOp = compOp;
    }

    public void updateScope(Map<String, Var> scope) {
        mScope = scope;
    }

    public enum AtomRule {
        FIRST,
        SECOND,
        THIRD,
        FOURTH,
        FIFTH
    }
}
