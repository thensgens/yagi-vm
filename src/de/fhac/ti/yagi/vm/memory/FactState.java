package de.fhac.ti.yagi.vm.memory;

import de.fhac.ti.yagi.vm.exceptions.InvalidModelException;
import de.fhac.ti.yagi.vm.exceptions.ModelNotFoundException;
import de.fhac.ti.yagi.vm.interfaces.State;
import de.fhac.ti.yagi.vm.memory.models.AbstractModel;
import de.fhac.ti.yagi.vm.memory.models.Fact;
import de.fhac.ti.yagi.vm.memory.models.Fluent;

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
    public AbstractModel get(String identifier) throws ModelNotFoundException {
        if (! mFacts.containsKey(identifier)) {
            throw new ModelNotFoundException(MODEL_NOT_FOUND);
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
            strBuilder.append(entry.getKey()).append("  //  ");
        }
        if (strBuilder.length() > 0) {
            strBuilder.delete(strBuilder.length() - 6, strBuilder.length()).toString();
        } else {
            strBuilder = new StringBuilder("There are no facts declared yet.");
        }

        return strBuilder.toString();
    }

    @Override
    public void clearState() {
        mFacts.clear();
    }
}
