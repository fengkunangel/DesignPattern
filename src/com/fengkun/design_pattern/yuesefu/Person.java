package com.fengkun.design_pattern.yuesefu;

/**
 * Created by fengkunangel on 2018/9/15.
 */
public class Person {

    private int number;//人的序号
    private Person leftPerson;//左手边的人
    private Person rightPerson;//右手边的人

    public void setNumber(int number) {
        this.number = number;
    }

    public void setLeftPerson(Person leftPerson) {
        this.leftPerson = leftPerson;
    }

    public void setRightPerson(Person rightPerson) {
        this.rightPerson = rightPerson;
    }

    //叫号
    public void callNumber(int num, Rule rule) {

        if (leftPerson == this && rightPerson == this) {
            System.out.println("我是最后一个留下来的人，我的号是：" + number);
            return;
        }

        if (num == rule.getMaxNumber()) {
            leave();
            num = 1;
        } else {
            num ++;
        }
        rightPerson.callNumber(num, rule);
    }

    private void leave() {
        leftPerson.setRightPerson(rightPerson);
        rightPerson.setLeftPerson(leftPerson);
        System.out.println("出圈人: " + number);
    }
}
