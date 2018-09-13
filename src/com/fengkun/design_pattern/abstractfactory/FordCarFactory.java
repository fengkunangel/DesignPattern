package com.fengkun.design_pattern.abstractfactory;

import com.fengkun.design_pattern.simplefactory.FordCar;

/**
 * Created by boyxiaokun on 2018/9/14.
 */
public class FordCarFactory implements AbstractCarFactory {

    @Override
    public FordCar createCar() {
        return new FordCar();
    }
}
