package com.fengkun.design_pattern.yuesefu;

import java.util.Scanner;

/**
 * Created by fengkunangel on 2018/9/15.
 */
public class Game {

    private Person[] persons;
    private Rule rule;
    private Person startPerson;

    public void init() {
        System.out.println("---------------欢迎来到约瑟夫世界！--------------");
        ruleInput();
        initPersons();
    }

    public void go() {
        System.out.println("----------------约瑟夫游戏开始了!--------------");
        startPerson.callNumber(1, rule);
    }

    private void ruleInput() {
        rule = new Rule();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入约瑟夫圈的总人数:");
        rule.setPersonCount(scanner.nextInt());
        System.out.println("请输入约瑟夫圈出圈号:");
        rule.setMaxNumber(scanner.nextInt());
        System.out.println("请输入约瑟夫圈起始序号:");
        rule.setStartPersonNumber(scanner.nextInt());
        scanner.close();
    }

    private void initPersons() {
        int personCount = rule.getPersonCount();
        persons = new Person[personCount];
        for (int i = 0; i < persons.length ; i++) {
            persons[i] = new Person();
            persons[i].setNumber(i + 1);
        }

        startPerson = persons[rule.getStartPersonNumber() - 1];

        for (int i = 0; i < persons.length; i++) {

            if (i == 0) {
                persons[i].setLeftPerson(persons[persons.length - 1]);
            } else {
                persons[i].setLeftPerson(persons[i - 1]);
            }

            if (i == persons.length - 1) {
                persons[i].setRightPerson(persons[0]);
            } else {
                persons[i].setRightPerson(persons[i + 1]);
            }
        }
    }
}
