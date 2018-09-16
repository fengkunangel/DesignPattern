package com.fengkun.design_pattern.state.advance;

/**
 * Created by fengkunangel on 2018/9/16.
 */
public class PersonMain {

    public static void main(String[] args) {
        Person person = new Person();
        person.setState(new TeenState());
        person.perform();
        person.perform();
        person.perform();
    }
}
