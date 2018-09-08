package com.fengkun.design_pattern.singleton.eager;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by fengkunangel on 2018/9/9.
 */
public class Config {

    private static Config config;

    static {
        try {
            config = new Config();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private Properties properties;

    private Config() throws Exception {
        properties = new Properties();
        properties.load(new FileInputStream(
                new File("F:\\JAVA\\WorkSpace\\DesignPattern\\src\\com\\fengkun\\design_pattern\\singleton\\config.properties")));
    }

    public static Config getInstance() {
        return config;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
