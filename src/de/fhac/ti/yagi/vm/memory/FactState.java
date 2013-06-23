package de.fhac.ti.yagi.vm.memory;

import de.fhac.ti.yagi.vm.exceptions.InvalidModelException;
import de.fhac.ti.yagi.vm.exceptions.ModelNotFoundException;
import de.fhac.ti.yagi.vm.interfaces.AbstractModel;
import de.fhac.ti.yagi.vm.interfaces.State;
import de.fhac.ti.yagi.vm.memory.models.AbstractSimpleModel;
import de.fhac.ti.yagi.vm.memory.models.Fact;

import java.util.HashMap;
import java.util.Map;

/**
 * This class holds information about all (declared) facts.
 */
public class FactState implements State {

    private static final String INVALID_MODEL = "Model instance is not of type <fact>.";
    private static final String MODEL_NOT_FOUND = "Model could not be found. It wasn't added yet.";

    private Map<String, Fact> mFacts;

    public FactState() {
        mFacts = new HashMap<String, Fact>();
    }

    @Override
    public void add(AbstractModel model) throws InvalidModelException {
        if (! (model instanceof  Fact)) {
            throw new InvalidModelException(INVALID_MODEL);
        }

        Fact input = (Fact)model;
        mFacts.put(input.getName(), input);
    }

    @Override
    public void remove(AbstractModel model) throws InvalidModelException {
        if (! (model instanceof  Fact)) {
            throw new InvalidModelException(INVALID_MODEL);
        }

        Fact input = (Fact)model;
        mFacts.remove(input.getName());
    }

    @Override
    public AbstractModel get(String identifier) {
        if (! mFacts.containsKey(identifier)) {
            return null;
        }

        return mFacts.get(identifier);
    }

    @Override
    public boolean contains(String id) {
        return mFacts.containsKey(id);
    }

    @Override
    public String listState() {
        StringBuilder strBuilder = new StringBuilder();
        for (Map.Entry<String, Fact> entry : mFacts.entrySet()) {
            strBuilder.append(entry.getKey()).append(":  ");
            for (SetItem item : entry.getValue().getValues()) {
                strBuilder.append(item.getValue()).append(" / ");
            }
            strBuilder.delete(strBuilder.length() - 3, strBuilder.length()).append("\n");
        }
        if (strBuilder.length() == 0) {
            strBuilder = new StringBuilder("There are no facts declared yet.");
        }
        return strBuilder.toString();
    }

    @Override
    public void clearState() {
        mFacts.clear();
    }
}
