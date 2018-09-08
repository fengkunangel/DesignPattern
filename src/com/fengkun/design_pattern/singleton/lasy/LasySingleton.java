package com.fengkun.design_pattern.singleton.lasy;

/**
 * 线程安全的懒汉式(效率低)
 * Created by fengkunangel on 2018/9/9.
 */
public class LasySingleton {

    private static LasySingleton uniqueInstance;

    private LasySingleton() {}

    public static synchronized LasySingleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LasySingleton();
        }
        return uniqueInstance;
    }
}
