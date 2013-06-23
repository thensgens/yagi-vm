package de.fhac.ti.yagi.vm.memory.models;

import de.fhac.ti.yagi.vm.interfaces.AbstractModel;
import de.fhac.ti.yagi.vm.memory.MemoryManagement;
import de.fhac.ti.yagi.vm.memory.SetItem;
import de.fhac.ti.yagi.vm.memory.SetType;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class AbstractSimpleModel implements AbstractModel {

    protected String mName;
    protected MemoryManagement.TermType mTermType;
    /* this should've probably been refactored to generics, like Fluent<T>, but well... */
    protected SetType mSetType;
    protected Set<SetItem> mValues;

    public AbstractSimpleModel() {
        mValues = new HashSet<SetItem>();
    }

    public AbstractSimpleModel(String name, MemoryManagement.TermType termType, SetType setType) {
        this();
        mName = name;
        mTermType = termType;
        mSetType = setType;
    }

    public AbstractSimpleModel(String name, MemoryManagement.TermType termType) {
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

    public void removeAll(List<SetItem> items) {
        mValues.removeAll(items);
    }

    public Set<SetItem> getValues() {
        return mValues;
    }

    public void clear() {
        mValues.clear();
    }
}