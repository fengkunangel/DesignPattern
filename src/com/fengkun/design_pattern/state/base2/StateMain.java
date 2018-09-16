package com.fengkun.design_pattern.state.base2;

import java.io.IOException;

/**
 * Created by fengkunangel on 2018/9/16.
 */
public class StateMain {

    public static void main(String[] args) throws IOException {
        Person person = new Person();
        person.addMood("happy", new HappyMood());
        person.addMood("sad", new SadMood());
        person.addMood("miserable", new MiserableMood());
        person.perform();
    }
}
