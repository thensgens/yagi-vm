package de.fhac.ti.yagi.vm.memory.models;

import de.fhac.ti.yagi.vm.memory.SetType;

public class Value {

    private String mValue;
    private SetType mType;

    public Value(String mValue, SetType mType) {
        this.mValue = mValue;
        this.mType = mType;
    }

    public String getValue() {
        return mValue;
    }

    public SetType getType() {
        return mType;
    }
}
