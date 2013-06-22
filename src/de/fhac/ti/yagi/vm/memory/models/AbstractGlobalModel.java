package de.fhac.ti.yagi.vm.memory.models;

import de.fhac.ti.yagi.vm.memory.MemoryManagement;
import de.fhac.ti.yagi.vm.memory.SetItem;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class AbstractGlobalModel {

    protected String mName;
    protected MemoryManagement.TermType mTermType;
    /* this should've probably been refactored to generics, like Fluent<T>... */
    protected SetType mSetType;
    protected Set<SetItem> mValues;

    public AbstractGlobalModel() {
        mValues = new HashSet<SetItem>();
    }

    public AbstractGlobalModel(String name, MemoryManagement.TermType termType, SetType setType) {
        this();
        mName = name;
        mTermType = termType;
        mSetType = setType;
    }

    public AbstractGlobalModel(String name, MemoryManagement.TermType termType) {
        this();
        mName = name;
        mTermType = termType;
    }

    public void setSetType(SetType setType) {
        mSetType = setType;
    }

    public String getName() {
        return mName;
    }

    public MemoryManagement.TermType getTermType() {
        return mTermType;
    }

    public SetType getSetType() {
        return mSetType;
    }

    public void addAll(List<SetItem> elems) {
        mValues.addAll(elems);
    }

    public Set<SetItem> getValues() {
        return mValues;
    }

    public void clear() {
        mValues.clear();
    }

    public static enum SetType {
        INT,
        STRING,
        VAR
    }
}
