package com.fengkun.design_pattern.singleton.eager;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by fengkunangel on 2018/9/8.
 */
public class LoadConfig {

    public void loadConfig() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File("F:\\JAVA\\WorkSpace\\DesignPattern\\src\\com\\fengkun\\design_pattern\\singleton\\config.properties")));
        String tem = properties.getProperty("tem");
        String size = properties.getProperty("size");
        System.out.println("tem = " + tem + ",age = " + size);
    }
}
