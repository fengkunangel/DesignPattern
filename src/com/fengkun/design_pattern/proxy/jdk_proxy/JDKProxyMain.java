package com.fengkun.design_pattern.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by fengkunangel on 2018/9/22.
 */
public class JDKProxyMain {

    public static void main(String[] args) {
        Class<?>[] interfaces = new Class[]{Singer.class, Person.class};
        Object obj = Proxy.newProxyInstance(JDKProxyMain.class.getClassLoader(), interfaces, new MyInvocationHandler());
        System.out.println(obj.getClass());
        System.out.println(obj instanceof Singer);
        System.out.println(obj instanceof Person);

        Singer singer = (Singer)obj;
        singer.sing("小苹果");
        singer.sign();
        singer.work();

        Person person = (Person)obj;
        int value = person.lives();
        System.out.println(value);

    }
}

class MyInvocationHandler implements InvocationHandler{

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        switch (methodName){
            case "sing" :
                System.out.println(args[0]);
                return null;
            case "sign" :
                System.out.println("签约");
                return null;
            case "work" :
                System.out.println("工作");
                return null;
            case "lives" :
                System.out.println("生活");
                return 100;
        }
        return null;
    }
}

