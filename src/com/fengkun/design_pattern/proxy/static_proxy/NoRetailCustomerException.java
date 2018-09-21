package com.fengkun.design_pattern.proxy.static_proxy;

/**
 * Created by fengkunangel on 2018/9/18.
 */
public class NoRetailCustomerException extends RuntimeException{

    public NoRetailCustomerException() {
        super("不是终端用户");
    }
}
