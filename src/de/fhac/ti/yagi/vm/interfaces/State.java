package de.fhac.ti.yagi.vm.interfaces;

import de.fhac.ti.yagi.vm.exceptions.InvalidModelException;
import de.fhac.ti.yagi.vm.exceptions.ModelNotFoundException;
import de.fhac.ti.yagi.vm.memory.models.AbstractGlobalModel;

public interface State {

    /**
     * The add method will add a new model to the state (and will override existing ones without a warning).
     * @param model
     * @throws InvalidModelException
     */
    public void add(AbstractGlobalModel model) throws InvalidModelException;

    /**
     * The remove method will remove the specified model from the state if it's present in the state.
     * Otherwise, the method will do nothing.
     * @param model
     * @throws InvalidModelException
     */
    public void remove(AbstractGlobalModel model) throws InvalidModelException;

    /**
     * This method will return the mapped model, specified by the parameter (ID).
     * If the model is cannot be found, a "ModelNotFoundException" will be raised indicating that the model
     * was not yet added to this state.
     * @param identifier Identifier which maps to the model (if present).
     * @return The mapped Model (if present).
     * @throws ModelNotFoundException
     */
    public AbstractGlobalModel get(String identifier) throws ModelNotFoundException;

    /**
     * This method checks if the term (specified by its id) is present in the current state.
     * @param id The term's identifier
     * @return True if the term is present; false otherwise.
     */
    public boolean contains(String id);

    /**
     * This method will list the whole content of the state conveniently.
     * @return The "stringified" representation of the current state.
     */
    public String listState();

    /**
     *  This method will clear the whole state (and therefore clear all underlying data structures).
     */
    public void clearState();
}
