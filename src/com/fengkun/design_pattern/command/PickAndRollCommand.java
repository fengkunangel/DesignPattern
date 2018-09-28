package com.fengkun.design_pattern.command;

/**
 * Created by fengkunangel on 2018/9/29.
 */
public class PickAndRollCommand implements Command {

    @Override
    public void excute() {
        System.out.println("挡拆");
    }
}
