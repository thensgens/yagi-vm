package de.fhac.ti.yagi.vm.memory;

import de.fhac.ti.yagi.vm.exceptions.InvalidModelException;
import de.fhac.ti.yagi.vm.exceptions.ModelNotFoundException;
import de.fhac.ti.yagi.vm.exceptions.TermAlreadyDeclaredException;
import de.fhac.ti.yagi.vm.interfaces.State;
import de.fhac.ti.yagi.vm.memory.models.AbstractGlobalModel;

/**
 * This class holds all relevant information about the VM's current context (declarations, states, ...)
 */
public class MemoryManagement {

    private State mFluentState;
    private State mFactState;

    /**
     * The default constructor will initialize all underlying data structures so that they are ready to use.
     */
    public MemoryManagement() {
        mFluentState = new FluentState();
        mFactState = new FactState();
    }

    /**
     * This method will clear the complete internal state of the vm.
     */
    public void clearInternalState() {
        mFluentState.clearState();
        mFactState.clearState();
    }

    /**
     * This method checks if a term with the specified name (id) is already present.
     * @param termID The term identifier
     * @return True if one term is present (with this name); false otherwise.
     */
    public boolean containsTerm(String termID) {
        // don't forget to add other terms as well later on, e.g. actions, procs, ...
        return mFluentState.contains(termID) || mFactState.contains(termID);
    }

    /**
     * Get the term (specified by the term id as parameter). The return value *can* be null.
     * @param termID The term identifier
     * @return The term if present; null otherwise.
     */
    public AbstractGlobalModel getTerm(String termID) {
        AbstractGlobalModel term = null;
        try {
            // ugly hack here... try & error on all possible states until one is found
            term = mFluentState.get(termID);
            if (term == null) {
                term = mFactState.get(termID);
            }

            /* add other terms later on, e.g. actions and procs.. */
            // ...
        } catch (ModelNotFoundException e) {
            e.printStackTrace();
        }

        return term;
    }

    /**
     * This method will return a "stringified" representation of the state (e.g. fluent state, fact state, ...)
     * @param type The term type (e.g. FLUENT, FACT, ...)
     * @return
     */
    public String listTerm(TermType type) {
        String termRepresentation = "No terms specified yet.";

        if (type.equals(TermType.FLUENT)) {
            termRepresentation = mFluentState.listState();
        } else if (type.equals(TermType.FACT)) {
            termRepresentation = mFactState.listState();
        }
        return termRepresentation;
    }

    /* --------------------------------------------------------------------  */
    /* Section: Convenient methods for accessing and storing memory states.  */
    /* Unfortunately not DRY at the moment, needs refactoring...              */
    /* --------------------------------------------------------------------  */

    public void addFluent(AbstractGlobalModel fluent) throws InvalidModelException, TermAlreadyDeclaredException {
        if (!containsTerm(fluent.getName())) {
            mFluentState.add(fluent);
        } else {
            throw new TermAlreadyDeclaredException("Term " + fluent.getName() + " already defined.");
        }
    }

    public void addFact(AbstractGlobalModel fact) throws InvalidModelException, TermAlreadyDeclaredException {
        if (!containsTerm(fact.getName())) {
            mFactState.add(fact);
        } else {
            throw new TermAlreadyDeclaredException("Term " + fact.getName() + " already defined.");
        }
    }


    public static enum TermType {
        FLUENT,
        FACT,
        ACTION,
        PROC
    }
}