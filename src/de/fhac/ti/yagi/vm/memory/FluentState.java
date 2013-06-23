package de.fhac.ti.yagi.vm.memory;

import de.fhac.ti.yagi.vm.exceptions.InvalidModelException;
import de.fhac.ti.yagi.vm.exceptions.ModelNotFoundException;
import de.fhac.ti.yagi.vm.interfaces.AbstractModel;
import de.fhac.ti.yagi.vm.interfaces.State;
import de.fhac.ti.yagi.vm.memory.models.AbstractSimpleModel;
import de.fhac.ti.yagi.vm.memory.models.Fluent;

import java.util.HashMap;
import java.util.Map;

/**
 * This class holds information about all (declared) fluents.
 */
public class FluentState implements State {

    private static final String INVALID_MODEL = "Model instance is not of type <fluent>.";
    private static final String MODEL_NOT_FOUND = "Model could not be found. It wasn't added yet.";

    private Map<String, Fluent> mFluents;

    public FluentState() {
        mFluents = new HashMap<String, Fluent>();
    }

    @Override
    public void add(AbstractModel model) throws InvalidModelException {
        if (! (model instanceof  Fluent)) {
            throw new InvalidModelException(INVALID_MODEL);
        }

        Fluent input = (Fluent)model;
        mFluents.put(input.getName(), input);
    }

    @Override
    public void remove(AbstractModel model) throws InvalidModelException {
        if (! (model instanceof  Fluent)) {
            throw new InvalidModelException(INVALID_MODEL);
        }

        Fluent input = (Fluent)model;
        mFluents.remove(input.getName());
    }

    @Override
    public AbstractModel get(String identifier){
        if (! mFluents.containsKey(identifier)) {
            return null;
        }

        return mFluents.get(identifier);
    }

    @Override
    public boolean contains(String id) {
        return mFluents.containsKey(id);
    }

    @Override
    public String listState() {
        StringBuilder strBuilder = new StringBuilder();
        for (Map.Entry<String, Fluent> entry : mFluents.entrySet()) {
            strBuilder.append(entry.getKey()).append(":  ");
            for (SetItem item : entry.getValue().getValues()) {
                strBuilder.append(item.getValue()).append(" / ");
            }
            strBuilder.delete(strBuilder.length() - 3, strBuilder.length()).append("\n");
        }
        if (strBuilder.length() == 0) {
            strBuilder = new StringBuilder("There are no fluents declared yet.");
        }

        return strBuilder.toString();
    }

    @Override
    public void clearState() {
        mFluents.clear();
    }
}
