package com.fengkun.design_pattern.abstractfactory;

import com.fengkun.design_pattern.simplefactory.HondaCar;

/**
 * Created by fengkunangel on 2018/9/14.
 */
public class HondaCarFactory implements AbstractCarFactory {

    @Override
    public HondaCar createCar() {
        return new HondaCar();
    }
}
