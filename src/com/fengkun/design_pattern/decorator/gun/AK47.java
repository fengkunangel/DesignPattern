package com.fengkun.design_pattern.decorator.gun;

/**
 * Created by fengkunangel on 2018/9/8.
 */
public class AK47 implements Gun {

    @Override
    public void aim() {
        System.out.println("------------AK47瞄准中-----------");
    }

    @Override
    public void shoot() {
        System.out.println("------------AK47开枪-----------");
    }

    @Override
    public void load() {
        System.out.println("------------AK47装满子弹-----------");
    }

    @Override
    public void unload() {
        System.out.println("------------AK47卸下子弹-----------");
    }
}
