package com.fengkun.design_pattern.abstractfactory;

import com.fengkun.design_pattern.simplefactory.Car;

/**
 * Created by boyxiaokun on 2018/9/14.
 */
public class Customer {

    private Car car;

    public void buyCar(SSSS ssss) {
        this.car = ssss.sellCar();
    }

    public void drive() {
        car.run();
    }
}
