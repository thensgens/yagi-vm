package de.fhac.ti.yagi.vm.memory.models;

import de.fhac.ti.yagi.vm.memory.MemoryManagement;
import de.fhac.ti.yagi.vm.memory.SetItem;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class AbstractModel {

    protected String mName;
    protected MemoryManagement.TermType mTermType;
    protected Set<SetItem> mValues;

    public AbstractModel(String name, MemoryManagement.TermType type) {
        mName = name;
        mTermType = type;
        mValues = new HashSet<SetItem>();
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

    public void addAll(List<SetItem> elems) {
            mValues.addAll(elems);
    }

    public static enum SetType {
        INT,
        STRING,
        VAR
    }
}
