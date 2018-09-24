package com.fengkun.design_pattern.proxy.cglib_proxy_aop;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created by fengkunangel on 2018/9/24.
 */
public class ProxyBuilder {

    private Enhancer enhancer = new Enhancer();
    public ProxyBuilder setRealObj(Object real) {
        enhancer.setSuperclass(real.getClass());
        enhancer.setCallback(new MyMethodInterceptor(real));
        return this;
    }

    public Object buildProxy() {
        return enhancer.create();
    }
}
