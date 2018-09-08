package com.fengkun.design_pattern.decorator.women.extend;

/**
 * Created by fengkunangel on 2018/9/6.
 */
public class Main2 {

    public static void main(String[] args) {

        DressedUpWomen qingzi = new DressedUpWomen(90, 100, "青子");
        System.out.println(qingzi.getBeautyIndex());
        System.out.println(qingzi.getIq());
        qingzi.say();

        EducationWomen xiaolan = new EducationWomen(95, 90, "小兰");
        System.out.println(xiaolan.getBeautyIndex());
        System.out.println(xiaolan.getIq());
        xiaolan.say();
    }
}
