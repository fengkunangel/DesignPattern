package com.fengkun.design_pattern.command;

/**
 * Created by fengkunangel on 2018/9/28.
 */
public class NBAGameHandler {

    private Command[] commands = new Command[4];

    public void setA(Command command) {
        commands[0] = command;
    }

    public void setB(Command command) {
        commands[1] = command;
    }

    public void setC(Command command) {
        commands[2] = command;
    }

    public void setD(Command command) {
        commands[3] = command;
    }

    public void pushA() {
        commands[0].excute();
    }

    public void pushB() {
        commands[1].excute();
    }

    public void pushC() {
        commands[2].excute();
    }

    public void pushD() {
        commands[3].excute();
    }
}
