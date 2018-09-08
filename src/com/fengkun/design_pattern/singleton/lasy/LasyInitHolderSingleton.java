package com.fengkun.design_pattern.singleton.lasy;

/**
 * 内部类
 * Created by fengkunangel on 2018/9/9.
 */
public class LasyInitHolderSingleton {

    private LasyInitHolderSingleton() {

    }

    private static class SingletonHolder{
        private static final LasyInitHolderSingleton UNIQUE_INSTANCE =
                new LasyInitHolderSingleton();
    }

    public static LasyInitHolderSingleton getUniqueInstance() {
        return SingletonHolder.UNIQUE_INSTANCE;
    }
}
