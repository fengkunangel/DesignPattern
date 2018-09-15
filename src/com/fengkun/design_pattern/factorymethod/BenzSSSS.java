package com.fengkun.design_pattern.factorymethod;

import com.fengkun.design_pattern.simplefactory.BenzCar;

/**
 * Created by fengkunangel on 2018/9/15.
 */
public class BenzSSSS extends SSSS {

    @Override
    public BenzCar getCar() {
        return new BenzCar();
    }
}
