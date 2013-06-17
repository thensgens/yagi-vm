package de.fhac.ti.yagi.vm.memory.models;

import de.fhac.ti.yagi.vm.memory.MemoryManagement;

public abstract class AbstractModel {

    protected String mName;
    protected MemoryManagement.TermType mTermType;

    public AbstractModel(String name, MemoryManagement.TermType type) {
        mName = name;
        mTermType = type;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public MemoryManagement.TermType getTermType() {
        return mTermType;
    }
}
