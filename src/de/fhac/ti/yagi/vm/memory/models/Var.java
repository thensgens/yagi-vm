package de.fhac.ti.yagi.vm.memory.models;

import de.fhac.ti.yagi.vm.memory.SetType;

public class Var {

    public static final String PRIMITIVE = "primitive";
    public static final String VAR = "var";
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

    public void setmValue(String mValue) {
        this.mValue = mValue;
    }

    public void setmSetType(SetType mSetType) {
        this.mSetType = mSetType;
    }

    public boolean isValid() {
        return !mName.equals("") && mValue != null && isTyped();
    }
    public boolean isTyped() {
        return mSetType != SetType.UNDEFINED;
    }
}
