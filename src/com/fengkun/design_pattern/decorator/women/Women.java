package com.fengkun.design_pattern.decorator.women;

/**
 * Created by fengkunangel on 2018/9/6.
 */
public class Women {

    /**
     * 颜值
     */
    private int beautyIndex;

    /**
     * 智商
     */
    private int iq;

    /**
     * 名字
     */
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
