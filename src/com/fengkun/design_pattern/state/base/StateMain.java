package com.fengkun.design_pattern.state.base;

/**
 * Created by fengkunangel on 2018/9/16.
 */
public class StateMain {

    public static void main(String[] args) {
        Person person = new Person();
        Mood mood = new SadMood();
        person.setMood(mood);
        person.perform();
    }
}
