package com.fengkun.design_pattern.decorator.gun;

/**
 * Created by boyxiaokun on 2018/9/8.
 */
public class SilentGun extends WrapperGun {

    public SilentGun(Gun gun) {
        super(gun);
    }


    @Override
    public void shoot() {
        super.shoot();
        System.out.println("-------------加装了消声器---------");
    }
}
