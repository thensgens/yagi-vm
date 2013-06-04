package rules;

import rules.results.VarResult;

/**
 * Created with IntelliJ IDEA.
 * User: rs
 * Date: 04.06.13
 * Time: 12:38
 * To change this template use File | Settings | File Templates.
 */
public class Var {
    VarResult mResult = new VarResult();

    Var(String id) {
        mResult.setID("$" + id);
    }

    VarResult getResult() {
        return mResult;
    }
}

