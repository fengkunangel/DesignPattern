package com.fengkun.design_pattern.state.advance;

/**
 * Created by fengkunangel on 2018/9/16.
 */
public interface State {

    void perform();

    State nextState();
}
