package com.fengkun.design_pattern.factorymethod;

import com.fengkun.design_pattern.simplefactory.FordCar;

/**
 * Created by fengkunangel on 2018/9/15.
 */
public class FordSSSS extends SSSS {

    @Override
    public FordCar getCar() {
        return new FordCar();
    }
}
