package com.fengkun.design_pattern.abstractfactory;

import com.fengkun.design_pattern.simplefactory.Car;

/**
 * Created by boyxiaokun on 2018/9/14.
 */
public class SSSS {

    private AbstractCarFactory carFactory;

    public AbstractCarFactory getCarFactory() {
        return carFactory;
    }

    public void setCarFactory(AbstractCarFactory carFactory) {
        this.carFactory = carFactory;
    }

    public Car sellCar() {
        return carFactory.createCar();
    }
}
