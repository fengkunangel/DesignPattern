package com.fengkun.design_pattern.decorator.women;

/**
 * Created by boyxiaokun on 2018/9/7.
 */
public abstract class WrapperWomen extends Women {

    //内部持有一个women对象属性
    private Women women;

    public WrapperWomen(Women women) {
        super(women.getBeautyIndex(), women.getIq(), women.getName());
        this.women = women;
    }

    @Override
    public int getBeautyIndex() {
        return women.getBeautyIndex();
    }

    @Override
    public int getIq() {
        return women.getIq();
    }

    @Override
    public String getName() {
        return women.getName();
    }

    @Override
    public void say() {
        women.say();
    }
}
