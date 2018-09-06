package com.fengkun.design_pattern.decorator.women;

/**
 * Created by boyxiaokun on 2018/9/6.
 */
public class Women {

    private int beautyIndex;

    private int iq;

    private String name;

    public Women(int beautyIndex, int iq, String name) {
        this.beautyIndex = beautyIndex;
        this.iq = iq;
        this.name = name;
    }

    public int getBeautyIndex() {
        return beautyIndex;
    }

    public int getIq() {
        return iq;
    }

    public String getName() {
        return name;
    }

    public void say() {
        System.out.println("我的名字叫：" + name);
    }
}
