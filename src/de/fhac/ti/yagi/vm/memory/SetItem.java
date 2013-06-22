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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetItem setItem = (SetItem) o;

        if (mValue != null ? !mValue.equals(setItem.mValue) : setItem.mValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return mValue != null ? mValue.hashCode() : 0;
    }
}

