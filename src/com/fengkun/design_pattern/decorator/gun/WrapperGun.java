package com.fengkun.design_pattern.decorator.gun;

/**
 * Created by boyxiaokun on 2018/9/8.
 */
public abstract class WrapperGun implements Gun {

    private Gun gun;

    public WrapperGun(Gun gun) {
        this.gun = gun;
    }

    @Override
    public void aim() {
        gun.aim();
    }

    @Override
    public void shoot() {
        gun.shoot();
    }

    @Override
    public void load() {
        gun.load();
    }

    @Override
    public void unload() {
        gun.unload();
    }
}
