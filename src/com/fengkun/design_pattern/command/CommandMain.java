package com.fengkun.design_pattern.command;

/**
 * Created by fengkunangel on 2018/9/29.
 */
public class CommandMain {

    public static void main(String[] args) {

        NBAGameHandler handler = new NBAGameHandler();
        handler.setA(new ShootCommand());
        handler.setB(new BlockCommand());
        handler.setC(new StealCommand());
        handler.setD(new PickAndRollCommand());

        handler.pushA();
        handler.pushB();
        handler.pushC();
        handler.pushD();

    }
}
