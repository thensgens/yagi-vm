package de.fhac.ti.yagi.vm.interfaces;

import java.io.IOException;
import java.io.OutputStream;

public interface Execution {

    void execute(OutputStream writer) throws IOException;
}
