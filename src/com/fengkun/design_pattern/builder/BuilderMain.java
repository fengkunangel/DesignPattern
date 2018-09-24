package com.fengkun.design_pattern.builder;

/**
 * Created by fengkunangel on 2018/9/24.
 */
public class BuilderMain {

    public static void main(String[] args) {
       ComputerBuilder builder = new ComputerBuilder();
       builder.setNetwork("电信").setOffice("Linux");
       Computer computer = builder.build();
        System.out.println(computer.getOffice());
    }
}
