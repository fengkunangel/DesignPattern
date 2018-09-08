package com.fengkun.design_pattern.singleton.eager;

/**
 * Created by fengkunangel on 2018/9/8.
 */
public class SunMain {

    public static void main(String[] args) {

        Sun sun1 = Sun.getInstance();
        Sun sun2 = Sun.getInstance();

        sun1.light();
        sun2.light();

        System.out.println(sun1 == sun2);
    }
}
