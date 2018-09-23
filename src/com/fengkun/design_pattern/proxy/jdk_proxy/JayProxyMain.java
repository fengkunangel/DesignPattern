package com.fengkun.design_pattern.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by fengkunangel on 2018/9/22.
 */
public class JayProxyMain {

    public static void main(String[] args) {
        Jay jay = new Jay();
        Class<?>[] interfaces = jay.getClass().getInterfaces();
        Object obj = Proxy.newProxyInstance(jay.getClass().getClassLoader(), interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("sign")) {
                    System.out.println("签约华谊");
                    return null;
                } else if (method.getName().equals("sing")) {
                    System.out.println("大家好");
                    Object value = method.invoke(jay, args);
                    System.out.println("谢谢");
                    return value;
                }else if (method.getName().equals("lives")) {
                    try {
                        return method.invoke(jay, args);
                    } catch (Exception e) {
                        System.out.println("异常");
                        throw e;
                    }
                } else {
                    return null;
                }
            }
        });
        System.out.println(obj.getClass());
        System.out.println(obj instanceof Singer);
        System.out.println(obj instanceof Person);

        Singer singer = (Singer)obj;
        singer.sing("七里香");
        singer.sign();
        singer.work();

        Person person = (Person)obj;
        int value = person.lives();
        System.out.println(value);

    }
}
