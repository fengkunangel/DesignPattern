package com.fengkun.design_pattern.decorator.women;

/**
 * Created by fengkunangel on 2018/9/6.
 */
public class DressedUpWomen extends WrapperWomen {

    public DressedUpWomen(Women women) {
        super(women);
    }

    @Override
    public int getBeautyIndex() {
        return super.getBeautyIndex() + 10;
    }
}
