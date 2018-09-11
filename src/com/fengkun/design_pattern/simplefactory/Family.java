package com.fengkun.design_pattern.simplefactory;

/**
 * Created by fengkunangel on 2018/9/12.
 */
public class Family {

    private Car car;

    public Family(Car car) {
        this.car = car;
    }

    public void goOut() {
        System.out.println("-----准备外出了-----");
        car.run();
        System.out.println("------玩的开心----------");
    }
}
