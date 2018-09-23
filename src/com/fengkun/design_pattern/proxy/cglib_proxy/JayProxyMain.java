package com.fengkun.design_pattern.proxy.cglib_proxy;

/**
 * Created by fengkunangel on 2018/9/23.
 */
public class JayProxyMain {

    public static void main(String[] args) {

        Jay jay = new Jay();
        jay.sign();

        //创建代理对象
        Jay jayProxy = new JayProxy().createProxy(jay);
        jayProxy.sign();

        //修改代理对象
        jayProxy.sing("神");
        jayProxy.sign();
    }
}
