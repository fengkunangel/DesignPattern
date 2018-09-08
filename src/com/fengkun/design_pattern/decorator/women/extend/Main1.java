package com.fengkun.design_pattern.decorator.women.extend;

import com.fengkun.design_pattern.decorator.women.Women;

/**
 * Created by fengkunangel on 2018/9/6.
 */
public class Main1 {

    public static void main(String[] args) {

        Women qingzi = new Women(90, 100, "青子");
        System.out.println(qingzi.getBeautyIndex());
        System.out.println(qingzi.getIq());
        qingzi.say();

        Women xiaolan = new Women(95, 90, "小兰");
        System.out.println(xiaolan.getBeautyIndex());
        System.out.println(xiaolan.getIq());
        xiaolan.say();
    }
}
