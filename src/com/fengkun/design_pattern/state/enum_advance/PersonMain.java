package com.fengkun.design_pattern.state.enum_advance;

/**
 * Created by fengkunangel on 2018/9/16.
 */
public class PersonMain {

    public static void main(String[] args) {
        Person person = new Person();
        person.setState(State.TEEN);
        person.perform();
        person.perform();
        person.perform();
        person.perform();
    }
}
