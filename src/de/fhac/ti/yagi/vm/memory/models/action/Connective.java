package de.fhac.ti.yagi.vm.memory.models.action;

import de.fhac.ti.yagi.vm.exceptions.IncompatibleOperationException;
import de.fhac.ti.yagi.vm.exceptions.VarNotInScopeException;
import de.fhac.ti.yagi.vm.interfaces.ConditionObject;
import de.fhac.ti.yagi.vm.memory.models.Var;

import java.util.Map;

public class Connective implements ConditionObject {

    private ConnectiveState mState;
    private Atom mAtom;
    private Formula mFormula;

    public Connective(ConnectiveState state, Atom atom, Formula formula) {
        mState = state;
        mAtom = atom;
        mFormula = formula;
    }
    @Override
    public boolean evaluate() throws IncompatibleOperationException, VarNotInScopeException {
        boolean result = false;

        boolean atomResult = mAtom.evaluate();
        if (mState == ConnectiveState.AND) {
            result = atomResult && mFormula.evaluate();
        } else {
            result = atomResult || mFormula.evaluate();
        }

        return result;
    }

    public void updateScope(Map<String, Var> scope) {
        if (mAtom != null) {
            mAtom.updateScope(scope);
        }
        if (mFormula != null) {
            mFormula.updateScope(scope);
        }
    }

    public enum ConnectiveState {
        AND,
        OR
    }
}
