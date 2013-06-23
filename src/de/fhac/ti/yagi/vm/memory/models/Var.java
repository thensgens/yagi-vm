package de.fhac.ti.yagi.vm.memory.models;

import de.fhac.ti.yagi.vm.memory.SetType;

public class Var {

    private String mName;
    private String mValue;
    private SetType mSetType;


    public Var(String mName, String mValue, SetType mSetType) {
        this.mName = mName;
        this.mValue = mValue;
        this.mSetType = mSetType;
    }

    public String getName() {
        return mName;
    }

    public String getmValue() {
        return mValue;
    }

    public SetType getSetType() {
        return mSetType;
    }
}
