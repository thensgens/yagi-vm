package de.fhac.ti.yagi.vm.memory;

import de.fhac.ti.yagi.vm.memory.models.AbstractModel;

public class SetItem {

    private AbstractModel.SetType mType;
    private String mValue;

    public SetItem(AbstractModel.SetType type, String value) {
        mType = type;
        mValue = value;
    }

    public AbstractModel.SetType getType() {
        return mType;
    }

    public String getValue() {
        return mValue;
    }
}

