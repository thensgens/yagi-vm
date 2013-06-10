package de.fhac.ti.yagi.vm.memory;

import de.fhac.ti.yagi.vm.interfaces.State;
import de.fhac.ti.yagi.vm.memory.models.Fact;

import java.util.Map;

/**
 * This class holds information about all (declared) facts.
 */
public class FactState implements State {

    private Map<String, Fact> mFacts;

    @Override
    public String listState() {
        return "PLACEHOLDER";
    }

    @Override
    public void clearState() {
        mFacts.clear();
    }
}
