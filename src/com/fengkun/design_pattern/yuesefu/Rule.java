package com.fengkun.design_pattern.yuesefu;

/**
 * 封装了约瑟夫游戏的规则
 * Created by fengkunangel on 2018/9/15.
 */
public class Rule {

    private int personCount;//约瑟夫游戏的总人数
    private int maxNumber;//出圈的号，最大叫号
    private int startPersonNumber;//起始叫号人的序号

    public int getPersonCount() {
        return personCount;
    }

    public void setPersonCount(int personCount) {
        this.personCount = personCount;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int getStartPersonNumber() {
        return startPersonNumber;
    }

    public void setStartPersonNumber(int startPersonNumber) {
        this.startPersonNumber = startPersonNumber;
    }
}

