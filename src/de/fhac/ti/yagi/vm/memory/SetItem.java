package de.fhac.ti.yagi.vm.memory;

public class SetItem {

    // this value holds a value "generically".. it's represented as a string here, but its value can either
    // be an integer (INT), a string (STRING) or a variable (VAR)
    private String mValue;

    public SetItem(String value) {
        mValue = value;
    }

    public String getValue() {
        return mValue;
    }

    @Override
    public String toString() {
        return mValue;
    }
}

