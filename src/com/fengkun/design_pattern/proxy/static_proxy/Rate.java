package com.fengkun.design_pattern.proxy.static_proxy;

/**
 * Created by fengkunangel on 2018/9/18.
 */
public class Rate {

    public static double getRMBRate() {
        return Double.parseDouble(String.format("%.2f", 7.2 - 0.4 * Math.random()));
    }

    public static double getYenRate() {
        return Double.parseDouble(String.format("%.2f", 120.0 - 40.0 * Math.random()));
    }
}
