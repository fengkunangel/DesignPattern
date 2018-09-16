package com.fengkun.design_pattern.state.base;

/**
 * Created by fengkunangel on 2018/9/16.
 */
public class HappyMood implements Mood {


    @Override
    public void perform() {
        System.out.println("开心");
    }
}
