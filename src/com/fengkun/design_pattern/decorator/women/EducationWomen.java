package com.fengkun.design_pattern.decorator.women;

/**
 * Created by boyxiaokun on 2018/9/6.
 */
public class EducationWomen extends BaseWomen {

    public EducationWomen(Women women) {
        super(women);
    }

    @Override
    public int getIq() {
        return super.getIq() + 20;
    }
}
