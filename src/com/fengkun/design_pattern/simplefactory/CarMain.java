package com.fengkun.design_pattern.simplefactory;

/**
 * Created by fengkunangel on 2018/9/12.
 */
public class CarMain {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        Car car = CarFactory.createCar();
        Family family = new Family(car);
        family.goOut();

    }
}
