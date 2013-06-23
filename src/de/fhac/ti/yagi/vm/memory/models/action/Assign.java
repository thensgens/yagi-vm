package de.fhac.ti.yagi.vm.memory.models.action;

import de.fhac.ti.yagi.vm.memory.SetItem;
import de.fhac.ti.yagi.vm.memory.SetType;
import de.fhac.ti.yagi.vm.memory.models.AbstractSimpleModel;

import java.util.List;

public class Assign {

    private AssignState mState;
    private AbstractSimpleModel mModel;
    private SetType mType;
    private List<SetItem> mElements;

    public Assign(AssignState state, AbstractSimpleModel mModel, SetType mType, List<SetItem> mElements) {
        this.mState = state;
        this.mModel = mModel;
        this.mType = mType;
        this.mElements = mElements;
    }

    public void execute() {
        if (mState == AssignState.ASSIGN) {
            mModel.clear();
            mModel.setSetType(mType);
            mModel.addAll(mElements);
        } else if (mState == AssignState.PLUS_ASSIGN) {
            if (mModel.getSetType() == mType) {
                mModel.addAll(mElements);
            }
        } else if (mState == AssignState.MINUS_ASSIGN) {
            if (mModel.getSetType() == mType) {
                mModel.removeAll(mElements);
            }
        }
    }

    public enum AssignState {
        ASSIGN,
        PLUS_ASSIGN,
        MINUS_ASSIGN
    }
}
