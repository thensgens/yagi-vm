package de.fhac.ti.yagi.vm.memory;

import de.fhac.ti.yagi.vm.interfaces.State;
import de.fhac.ti.yagi.vm.memory.models.Fluent;

import java.util.Map;

/**
 * This class holds information about all (declared) fluents.
 */
public class FluentState implements State {

    private Map<String, Fluent> mFluents;

    @Override
    public String listState() {
        return "PLACEHOLDER";
    }

    @Override
    public void clearState() {
        mFluents.clear();
    }
}
