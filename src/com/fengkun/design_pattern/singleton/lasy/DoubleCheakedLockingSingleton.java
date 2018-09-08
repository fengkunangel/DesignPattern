package com.fengkun.design_pattern.singleton.lasy;

/**
 * 双检锁
 * Created by fengkunangel on 2018/9/9.
 */
public class DoubleCheakedLockingSingleton {

    private volatile static DoubleCheakedLockingSingleton uniqueInstance;

    private DoubleCheakedLockingSingleton() {}

    public static DoubleCheakedLockingSingleton getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleCheakedLockingSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheakedLockingSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
