package de.fhac.ti.yagi.vm.memory.models.action;

import de.fhac.ti.yagi.vm.interfaces.Execution;
import de.fhac.ti.yagi.vm.memory.models.Var;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

public class Signal implements Execution {

    private Var mVar;

    private Map<String, Var> mScope;

    public Signal(Var var) {
        mVar = var;
    }

    public void updateScope(Map<String, Var> scope) {
        mScope = scope;
        for (Map.Entry<String, Var> entry : mScope.entrySet()) {
            String key = entry.getKey();
            Var value = entry.getValue();
            if (mVar.getName().equals(key)) {
                mVar.setmValue(value.getmValue());
                mVar.setmSetType(value.getSetType());
            }
        }
    }

    @Override
    public void execute(OutputStream writer) throws IOException {
        // as we only have simple val expressions for signals at the moment, simply output
        // var's representation value to the specified output stream
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("Var [").append(mVar.getName()).append("]:\t").append("Type: ").append(mVar.getSetType())
                .append("\tValue: ").append(mVar.getmValue());
        writer.write(strBuilder.toString().getBytes());
    }
}
