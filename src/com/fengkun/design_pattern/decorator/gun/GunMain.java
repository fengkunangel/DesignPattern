package com.fengkun.design_pattern.decorator.gun;

/**
 * Created by boyxiaokun on 2018/9/8.
 */
public class GunMain {

    public static void main(String[] args) {
        Gun gun1 = new AK47();
        Gun gun2 = new StableGun(gun1);
        Gun gun3 = new CollimationMirrorGun(gun2);
        Gun gun4 = new SilentGun(gun3);

        gun4.aim();
        gun4.shoot();

    }
}
