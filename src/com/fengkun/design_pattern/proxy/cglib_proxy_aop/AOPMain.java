package com.fengkun.design_pattern.proxy.cglib_proxy_aop;

/**
 * Created by fengkunangel on 2018/9/24.
 */
public class AOPMain {
    public static void main(String[] args) {

        Worker worker = new Worker();
        Driver driver = new Driver();
        Coder coder = new Coder();

        worker = (Worker)new ProxyBuilder().setRealObj(worker).buildProxy();
        driver = (Driver)new ProxyBuilder().setRealObj(driver).buildProxy();
        coder = (Coder)new ProxyBuilder().setRealObj(coder).buildProxy();

        worker.work();
        System.out.println("-------------");
        driver.drive();
        driver.teach();
        System.out.println("-------------");
        coder.code();

    }
}
