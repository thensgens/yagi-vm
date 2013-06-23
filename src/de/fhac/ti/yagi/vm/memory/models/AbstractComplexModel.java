package de.fhac.ti.yagi.vm.memory.models;

import de.fhac.ti.yagi.vm.interfaces.AbstractModel;

public abstract class AbstractComplexModel implements AbstractModel {

    protected String mName;

    public AbstractComplexModel(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }
}
