package com.fengkun.design_pattern.decorator.women;

/**
 * Created by fengkunangel on 2018/9/6.
 */
public class Main1 {

    public static void main(String[] args) {

        DressedUpWomen qingzi = new DressedUpWomen(new Women(90, 100, "青子"));
        System.out.println(qingzi.getBeautyIndex());
        System.out.println(qingzi.getIq());
        qingzi.say();

        DressedUpWomen qingzi2 = new DressedUpWomen(new EducationWomen(new Women(90, 100, "青子")));
        System.out.println(qingzi2.getBeautyIndex());
        System.out.println(qingzi2.getIq());
        qingzi2.say();

        EducationWomen qingzi3 = new EducationWomen(qingzi);
        System.out.println(qingzi3.getBeautyIndex());
        System.out.println(qingzi3.getIq());
        qingzi3.say();
    }
}
