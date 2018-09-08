package com.fengkun.design_pattern.singleton.eager;

/**
 * Created by fengkunangel on 2018/9/9.
 */
public class LoadConfigMain {

    public static void main(String[] args) throws Exception {
        LoadConfig loadConfig = new LoadConfig();
        loadConfig.loadConfig();

        //用Config包装(单例)
        Config config = Config.getInstance();
        String tem = config.getProperty("tem");
        String size = config.getProperty("size");
        System.out.println("tem = " + tem + ",age = " + size);
    }
}
