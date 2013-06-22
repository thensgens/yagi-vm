package de.fhac.ti.yagi.vm.memory.models;

import de.fhac.ti.yagi.vm.memory.MemoryManagement;

public class Fact extends AbstractGlobalModel {

    public Fact(String name, MemoryManagement.TermType termType) {
        super(name, termType);
    }

    public Fact(String name, MemoryManagement.TermType termType, SetType setType) {
        super(name, termType, setType);
    }

}
