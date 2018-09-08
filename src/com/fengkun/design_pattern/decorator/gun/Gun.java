package com.fengkun.design_pattern.decorator.gun;

/**
 * Created by boyxiaokun on 2018/9/8.
 */
public interface Gun {

    /**
     * 瞄准
     */
    void aim();

    /**
     * 射击
     */
    void shoot();

    /**
     * 上膛
     */
    void load();

    /**
     * 取出子弹
     */
    void unload();
}
