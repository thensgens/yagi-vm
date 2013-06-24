package de.fhac.ti.yagi.vm.interfaces;

import de.fhac.ti.yagi.vm.exceptions.IncompatibleOperationException;
import de.fhac.ti.yagi.vm.exceptions.VarNotInScopeException;

public interface ConditionObject {

    boolean evaluate() throws IncompatibleOperationException, VarNotInScopeException;
}
