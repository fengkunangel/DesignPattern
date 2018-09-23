package com.fengkun.design_pattern.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by fengkunangel on 2018/9/23.
 */
public class JayProxy implements MethodInterceptor {

    /**
     * 内部持有委托类对象的引用
     */
    private Object target;

    /**
     * 创建代理类对象
     * @return
     */
    public Jay createProxy(Jay object) {

        target = object;
        //创建Enhancer对象
        Enhancer enhancer = new Enhancer();
        //设置要代理的目标类
        enhancer.setSuperclass(this.target.getClass());
        //设置单一回调对象,在回调中拦截对目标方法的调用
        enhancer.setCallback(this);
        //设置类加载器
        enhancer.setClassLoader(object.getClass().getClassLoader());
        //创建代理对象
        return (Jay)enhancer.create();

    }


    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        //调用之前处理
        doBefore();

        //调用原方法
        method.invoke(target,args);

        //调用之后处理
        doAfter();

        return null;
    }

    private void doAfter() {
        System.out.println("do after.");
    }

    private void doBefore() {
        System.out.println("do before.");
    }
}
