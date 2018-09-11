package com.fengkun.design_pattern.simplefactory;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by fengkunangel on 2018/9/12.
 */
public class CarFactory {

    private static Properties config = new Properties();
    static {
        try {
            config.load(CarFactory.class.getResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static Car createCar() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
       String className = config.getProperty("Car");
       Class<Car> clazz = (Class<Car>)Class.forName(className);
       Car car = clazz.newInstance();
       return car;
    }
}
