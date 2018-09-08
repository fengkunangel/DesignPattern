package com.fengkun.design_pattern.singleton.eager;

/**
 * Created by fengkunangel on 2018/9/8.
 */
public class Sun {

    private static Sun sun = new Sun();

    public static Sun getInstance() {
        return sun;
    }

    /**
     * 温度
     */
    private int tem;

    /**
     * 尺寸
     */
    private int size;

    private Sun() {}

    public int getTem() {
        return tem;
    }

    public void setTem(int tem) {
        this.tem = tem;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void light() {
        System.out.println("-------发出光芒------");
    }

}
