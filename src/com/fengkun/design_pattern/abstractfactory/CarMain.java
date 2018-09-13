package com.fengkun.design_pattern.abstractfactory;

import com.fengkun.design_pattern.simplefactory.BenzCar;

/**
 * Created by boyxiaokun on 2018/9/14.
 */
public class CarMain {

    public static void main(String[] args) {
        //客户买车
        Customer customer = new Customer();
        SSSS ssss = new SSSS();
        ssss.setCarFactory(new BenzCarFactory());
        customer.buyCar(ssss);
        customer.drive();

    }
}
