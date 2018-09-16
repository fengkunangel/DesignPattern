package com.fengkun.design_pattern.state.advance;

/**
 * Created by fengkunangel on 2018/9/16.
 */
public class TeenState implements State {

    @Override
    public void perform() {
        System.out.println("少年");
    }

    @Override
    public State nextState() {
        return new YouthState();
    }
}
