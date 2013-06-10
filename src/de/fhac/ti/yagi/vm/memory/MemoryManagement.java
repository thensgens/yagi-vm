package de.fhac.ti.yagi.vm.memory;

/**
 * This class holds all relevant information about the vm's current context (declarations, states, ...)
 */
public class MemoryManagement {

    private FluentState mFluentState;
    private FactState mFactState;

    public MemoryManagement() {
        mFluentState = new FluentState();
        mFactState = new FactState();
    }

    /**
     * This method will clear the complete internal state of the vm.
     */
    public void clearInternalState() {
        mFluentState.clearState();
        mFactState.clearState();
    }
}
