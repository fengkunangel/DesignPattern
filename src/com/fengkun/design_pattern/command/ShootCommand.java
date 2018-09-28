package com.fengkun.design_pattern.command;

/**
 * Created by fengkunangel on 2018/9/28.
 */
public class ShootCommand implements Command {

    @Override
    public void excute() {
        System.out.println("投篮");
    }
}
