package com.fengkun.design_pattern.proxy.cglib_proxy_aop;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by fengkunangel on 2018/9/24.
 */
public class MyMethodInterceptor implements MethodInterceptor {

    private static Properties proxyConf;
    private Map<String, String> confMap;
    {
        proxyConf = new Properties();
        try{
            proxyConf.load(MyMethodInterceptor.class.getResourceAsStream("proxy.properties"));
            confMap = new HashMap<>();
            String proxyRulesStr = proxyConf.getProperty("proxyRules");
            if (proxyRulesStr != null) {
                String[] proxyRules = proxyRulesStr.split(",");
                for (String proxyRule : proxyRules) {
                    String[] rule = proxyRule.split(":");
                    confMap.put(rule[0], rule[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //持有的代理对象
    private Object object;

    public MyMethodInterceptor(Object object) {
        super();
        this.object = object;
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        String realObjectClassName = object.getClass().getName();
        String methodName = method.getName();
        String key = realObjectClassName + "-" + methodName;
        String value = confMap.get(key);
        if (value == null) {
            value = confMap.get(realObjectClassName + "-*");
            if (value == null) {
                return method.invoke(object, args);
            }
        }

        if (value.equals("before")){
            System.out.println("before");
            return method.invoke(object, args);
        }

        if (value.equals("after")){
            Object reval = method.invoke(object, args);
            System.out.println("after");
            return reval;
        }
        return method.invoke(object, args);
    }
}
