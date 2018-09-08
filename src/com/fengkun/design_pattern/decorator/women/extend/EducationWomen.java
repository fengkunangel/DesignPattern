package com.fengkun.design_pattern.decorator.women.extend;

import com.fengkun.design_pattern.decorator.women.Women;

/**
 * Created by fengkunangel on 2018/9/6.
 */
public class EducationWomen extends Women {

    public EducationWomen(int beautyIndex, int iq, String name) {
        super(beautyIndex, iq, name);
    }

    @Override
    public int getIq() {
        return super.getIq() + 20;
    }
}
