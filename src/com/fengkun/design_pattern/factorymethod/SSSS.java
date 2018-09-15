package com.fengkun.design_pattern.factorymethod;

import com.fengkun.design_pattern.simplefactory.Car;

/**
 * Created by fengkunangel on 2018/9/15.
 */
public abstract class SSSS {

    public Car sellCar() {
        return getCar();
    }

    public abstract Car getCar();
}
