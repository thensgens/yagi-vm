package de.fhac.ti.yagi.vm.memory.models;

import de.fhac.ti.yagi.vm.memory.MemoryManagement;
import de.fhac.ti.yagi.vm.memory.SetType;

public class Fact extends AbstractSimpleModel {

    public Fact(String name, MemoryManagement.TermType termType) {
        super(name, termType);
    }

    public Fact(String name, MemoryManagement.TermType termType, SetType setType) {
        super(name, termType, setType);
    }

}
