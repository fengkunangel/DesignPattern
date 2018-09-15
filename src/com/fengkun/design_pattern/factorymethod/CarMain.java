package com.fengkun.design_pattern.factorymethod;

import com.fengkun.design_pattern.simplefactory.Car;

/**
 * Created by fengkunangel on 2018/9/15.
 */
public class CarMain {

    public static void main(String[] args) {

        SSSS ssss = new BenzSSSS();
        Car car = ssss.sellCar();
        car.run();
    }
}
