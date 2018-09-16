package com.fengkun.design_pattern.state.base;

/**
 * Created by fengkunangel on 2018/9/16.
 */
public class Person {

    private Mood mood;

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    //人的表现，在不同的心情下有不同的行为
    public void perform() {
       mood.perform();
    }
}
