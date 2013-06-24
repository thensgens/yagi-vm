package de.fhac.ti.yagi.vm.memory.models.action;

import de.fhac.ti.yagi.vm.exceptions.*;
import de.fhac.ti.yagi.vm.interfaces.Execution;
import de.fhac.ti.yagi.vm.memory.models.AbstractComplexModel;
import de.fhac.ti.yagi.vm.memory.models.Var;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Action extends AbstractComplexModel implements Execution {

    private Map<String, Var> mScope;
    private Formula mFormula;
    private Execution mAssign;
    private Signal mSignal;

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
        if (isFormulaInit()) {
            mFormula.updateScope(mScope);
        }
        if (isSignalInit()) {
            mSignal.updateScope(mScope);
        }
    }

    private boolean isFormulaInit() {
        return mFormula != null;
    }

    private boolean isAssignInit() {
        return mAssign != null;
    }

    private boolean isSignalInit() {
        return mSignal != null;
    }

    public void setFormula(Formula formula) {
        mFormula = formula;
    }

    public void setAssignment(Assign assign) {
        mAssign = assign;
    }

    public void setSignal(Signal signal) {
        mSignal = signal;
    }

    public void setScope(List<Var> vars) {
        for (Var var : vars) {
            mScope.put(var.getName(), var);
        }
    }
    public Map<String, Var> getScope() {
        return mScope;
    }

    public void execute(OutputStream writer) throws IOException {
        try {
            if (isFormulaInit() && mFormula.evaluate()) {
                writer.write(new String("Precondition is true.\n").getBytes());
                if (isAssignInit()) {
                    mAssign.execute(writer);
                }
                if (isSignalInit()) {
                    mSignal.execute(writer);
                }
            } else {
                writer.write(new String("Precondition is false.").getBytes());
            }
        } catch (VarNotInScopeException e) {
            System.out.println("Error during the exection of action [" + mName + "]:\n" + e.getMessage());
        } catch (IncompatibleOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
