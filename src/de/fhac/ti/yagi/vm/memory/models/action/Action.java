package de.fhac.ti.yagi.vm.memory.models.action;

import de.fhac.ti.yagi.vm.exceptions.*;
import de.fhac.ti.yagi.vm.memory.models.AbstractComplexModel;
import de.fhac.ti.yagi.vm.memory.models.Var;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Action extends AbstractComplexModel {

    private Map<String, Var> mScope;
    private Formula mFormula;
    private Assign mAssign;

    public Action(String name) {
        super(name);
        mScope = new HashMap<String, Var>();
    }

    /**
     * This method has to be called *immediately* after the action is called (action_exec).
     * It will initialize the local scope (that is, assigning the passed arguments to the varlist if
     * the set types are compatible.
     * @param arguments The passed arguments (action_exec)
     * @throws ArgumentCountMismatchException Argument count is not equal to the parameter count. Mismatch.
     * @throws ArgumentNotValidException This exception will occur if one of the passed arguments is not valid.
     */
    public void updateScope(List<Var> arguments) throws ArgumentCountMismatchException, ArgumentNotValidException {
        if (mScope.size() != arguments.size()) {
            throw new ArgumentCountMismatchException("The argument's count mismatched.");
        }

        int index = 0;
        Map<String, Var> newScope = new HashMap<String, Var>();
        for (Var var : mScope.values()) {
            Var argumentVar = arguments.get(index++);
            if (!argumentVar.isValid()) {
                throw new ArgumentNotValidException("Passed argument is not valid.");
            }
            newScope.put(var.getName(), argumentVar);
        }
        mScope = newScope;
        if (isInitialized()) {
            mFormula.updateScope(mScope);
        }
    }

    private boolean isInitialized() {
        return mFormula != null;
    }

    public void setFormula(Formula formula) {
        mFormula = formula;
    }

    public void setAssignment(Assign assign) {
        mAssign = assign;
    }

    public void setScope(List<Var> vars) {
        for (Var var : vars) {
            mScope.put(var.getName(), var);
        }
    }
    public Map<String, Var> getScope() {
        return mScope;
    }

    public void execute() {
        try {
            if (isInitialized() && mFormula.evaluate()) {
                System.out.println("Precondition is true.");
                mAssign.execute();
            } else {
                System.out.println("Precondition is false.");
            }
        } catch (VarNotInScopeException e) {
            System.out.println("Error during the exection of action [" + mName + "]:\n" + e.getMessage());
        } catch (IncompatibleOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
