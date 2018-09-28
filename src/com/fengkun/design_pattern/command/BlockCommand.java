package com.fengkun.design_pattern.command;

/**
 * Created by fengkunangel on 2018/9/29.
 */
public class BlockCommand implements Command {

    @Override
    public void excute() {
        System.out.println("封盖");
    }
}
