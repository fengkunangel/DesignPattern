package com.fengkun.design_pattern.decorator.women;

/**
 * Created by fengkunangel on 2018/9/6.
 */
public class EducationWomen extends WrapperWomen {

    public EducationWomen(Women women) {
        super(women);
    }

    @Override
    public int getIq() {
        return super.getIq() + 20;
    }
}
