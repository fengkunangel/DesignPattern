package com.fengkun.design_pattern.abstractfactory;

import com.fengkun.design_pattern.simplefactory.BenzCar;

/**
 * Created by fengkunangel on 2018/9/14.
 */
public class BenzCarFactory implements AbstractCarFactory {

    @Override
    public BenzCar createCar() {
        return new BenzCar();
    }
}
