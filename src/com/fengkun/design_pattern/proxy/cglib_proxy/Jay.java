package com.fengkun.design_pattern.proxy.cglib_proxy;

import com.fengkun.design_pattern.proxy.jdk_proxy.Person;
import com.fengkun.design_pattern.proxy.jdk_proxy.Singer;

/**
 * Created by fengkunangel on 2018/9/23.
 */
public class Jay implements Singer, Person {

    @Override
    public int lives() {
        System.out.println("人生");
        return 100;
    }

    @Override
    public void sing(String songName) {
        switch (songName) {
            case "七里香" :
                System.out.println("厉害");
                break;
            default:
                System.out.println("大神");
                break;
        }
    }

    @Override
    public void sign() {
        System.out.println("合约");
    }

    @Override
    public void work() {
        System.out.println("工作");
    }
}
