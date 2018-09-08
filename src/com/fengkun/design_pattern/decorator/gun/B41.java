package com.fengkun.design_pattern.decorator.gun;

/**
 * Created by fengkunangel on 2018/9/8.
 */
public class B41 implements Gun {

    @Override
    public void aim() {
        System.out.println("------------B41瞄准中-----------");
    }

    @Override
    public void shoot() {
        System.out.println("------------B41开枪-----------");
    }

    @Override
    public void load() {
        System.out.println("------------B41装满子弹-----------");
    }

    @Override
    public void unload() {
        System.out.println("------------B41卸下子弹-----------");
    }
}
