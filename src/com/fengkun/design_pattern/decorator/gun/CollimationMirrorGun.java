package com.fengkun.design_pattern.decorator.gun;

/**
 * Created by fengkunangel on 2018/9/8.
 */
public class CollimationMirrorGun extends WrapperGun {

    public CollimationMirrorGun(Gun gun) {
        super(gun);
    }

    @Override
    public void aim() {
        super.aim();
        System.out.println("----------加了瞄准镜，射击精度提高---------");
    }

}
