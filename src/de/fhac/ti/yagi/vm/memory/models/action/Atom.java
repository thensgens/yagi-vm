package de.fhac.ti.yagi.vm.memory.models.action;

import de.fhac.ti.yagi.vm.exceptions.IncompatibleOperationException;
import de.fhac.ti.yagi.vm.exceptions.VarNotInScopeException;
import de.fhac.ti.yagi.vm.interfaces.ConditionObject;
import de.fhac.ti.yagi.vm.memory.SetItem;
import de.fhac.ti.yagi.vm.memory.SetType;
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

    private boolean mStaticExpression;

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
            // INT comp
            if (mFirstVar.getSetType() == SetType.INT) {
                result = evaluateInt();
            }
            // STRING comp
            else if (mFirstVar.getSetType() == SetType.STRING) {
                result = evaluateString();
            }
            // lookup in the current scope required
            else if (mFirstVar.getSetType() == SetType.UNDEFINED) {
                if (mScope.containsKey(mFirstVar.getName()) && mScope.containsKey(mSecondVar.getName())) {
                    mFirstVar = mScope.get(mFirstVar.getName());
                    mSecondVar = mScope.get(mSecondVar.getName());
                    if (mFirstVar.getSetType() != mSecondVar.getSetType()) {
                        throw new IncompatibleOperationException("Types are incompatible.");
                    }
                    // INT comp
                    if (mFirstVar.getSetType() == SetType.INT) {
                        result = evaluateInt();
                    }
                    // STRING comp
                    else if (mFirstVar.getSetType() == SetType.STRING) {
                        result = evaluateString();
                    }
                } else {
                    throw new VarNotInScopeException("Var [" + mFirstVar.getName() + "] or [" + mSecondVar.getName()
                    + "] is not defined in the current scope.");
                }
            }
        } else if (mRuleNumber == AtomRule.SECOND) {
            if (mFirstSetType != mSecondSetType) {
                throw new IncompatibleOperationException("Types are incompatible.");
            }
            result = false;
            if (mFirstSetType == SetType.INT) {
                result = evaluateSetComp();
            }
        } else if (mRuleNumber == AtomRule.THIRD) {
            if (mFirstVar.getSetType() != mFirstSetType) {
                throw new IncompatibleOperationException("Types are incompatible.");
            }
            result = false;
            // INT comp
            if (mFirstVar.getSetType() == SetType.INT) {
                for (SetItem item : mFirstSet) {
                    int value = Integer.parseInt(mFirstVar.getmValue());
                    int itemVal = Integer.parseInt(item.getValue());
                    if (value == itemVal) {
                        result = true;
                        break;
                    }
                }
            }
            // STRING comp
            else if (mFirstVar.getSetType() == SetType.STRING) {
                for (SetItem item : mFirstSet) {
                    String value = mFirstVar.getmValue();
                    String itemVal = item.getValue();
                    if (value.equals(itemVal)) {
                        result = true;
                        break;
                    }
                }
            }
        } else if (mRuleNumber == AtomRule.FOURTH || mRuleNumber == AtomRule.FIFTH) {
            result = mStaticExpression;
        }
        return result;
    }

    private boolean evaluateInt() {
        boolean intEval = false;
        int first = Integer.parseInt(mFirstVar.getmValue());
        int second = Integer.parseInt(mSecondVar.getmValue());
        if (mCompOp == CompOperator.EQUALS) { intEval = first == second; }
        else if (mCompOp == CompOperator.NOT_EQUALS) { intEval = first != second; }
        else if (mCompOp == CompOperator.LESS_OR_EQUAL) { intEval = first <= second; }
        else if (mCompOp == CompOperator.GREATER_OR_EQUAL) { intEval = first >= second; }
        else if (mCompOp == CompOperator.LESS) { intEval = first < second; }
        else if (mCompOp == CompOperator.GREATER) { intEval = first > second; }

        return intEval;
    }

    private boolean evaluateString() {
        boolean stringEval = false;
        String first = mFirstVar.getmValue();
        String second = mSecondVar.getmValue();
        if (mCompOp == CompOperator.EQUALS) { stringEval = first.length() == second.length(); }
        else if (mCompOp == CompOperator.NOT_EQUALS) { stringEval = first.length() != second.length(); }
        else if (mCompOp == CompOperator.LESS_OR_EQUAL) { stringEval = first.length() <= second.length(); }
        else if (mCompOp == CompOperator.GREATER_OR_EQUAL) { stringEval = first.length() >= second.length(); }
        else if (mCompOp == CompOperator.LESS) { stringEval = first.length() < second.length(); }
        else if (mCompOp == CompOperator.GREATER) { stringEval = first.length() > second.length(); }

        return stringEval;
    }

    private boolean evaluateSetComp() {
        boolean setCompResult = false;
        if (mCompOp == CompOperator.EQUALS) { setCompResult = mFirstSet.size() == mSecondSet.size(); }
        else if (mCompOp == CompOperator.NOT_EQUALS) { setCompResult = mFirstSet.size() != mSecondSet.size(); }
        else if (mCompOp == CompOperator.LESS_OR_EQUAL) { setCompResult = mFirstSet.size() <= mSecondSet.size(); }
        else if (mCompOp == CompOperator.GREATER_OR_EQUAL) { setCompResult = mFirstSet.size() >= mSecondSet.size(); }
        else if (mCompOp == CompOperator.LESS) { setCompResult = mFirstSet.size() < mSecondSet.size(); }
        else if (mCompOp == CompOperator.GREATER) { setCompResult = mFirstSet.size() > mSecondSet.size(); }

        return setCompResult;
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

    public void setStaticExpression(boolean staticExpression) {
        mStaticExpression = staticExpression;
    }

    public void updateScope(Map<String, Var> scope) {
        mScope = scope;
        for (Map.Entry<String, Var> entry : mScope.entrySet()) {
            String key = entry.getKey();
            Var value = entry.getValue();
            // the atom's scope should only be updated if it's not a static boolean expression
            if (!mStaticExpression && (mRuleNumber == AtomRule.FIRST || mRuleNumber == AtomRule.THIRD)) {
                if (mFirstVar.getName().equals(key)) {
                    mFirstVar.setmValue(value.getmValue());
                    mFirstVar.setmSetType(value.getSetType());
                } else if (mSecondVar.getName().equals(key)) {
                    mSecondVar.setmValue(value.getmValue());
                    mSecondVar.setmSetType(value.getSetType());
                }
            }
        }
    }

    public enum AtomRule {
        FIRST,
        SECOND,
        THIRD,
        FOURTH,
        FIFTH
    }
}
