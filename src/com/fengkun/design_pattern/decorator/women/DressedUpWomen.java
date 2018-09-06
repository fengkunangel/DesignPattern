package com.fengkun.design_pattern.decorator.women;

/**
 * Created by boyxiaokun on 2018/9/6.
 */
public class DressedUpWomen extends BaseWomen {

    public DressedUpWomen(Women women) {
        super(women);
    }

    @Override
    public int getBeautyIndex() {
        return super.getBeautyIndex() + 10;
    }
}
