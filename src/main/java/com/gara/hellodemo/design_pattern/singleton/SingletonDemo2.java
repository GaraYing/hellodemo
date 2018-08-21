package com.gara.hellodemo.design_pattern.singleton;

/**
 * @description: 单元测试二
 * @author: GaraYing
 * @create: 2018-08-21 19:13
 **/

public class SingletonDemo2 {

    private static SingletonDemo2 singletonDemo2 = null;

    private SingletonDemo2() {
    }

    public static SingletonDemo2 getInstance() {
        if (singletonDemo2 == null) {
            singletonDemo2 = new SingletonDemo2();
        }
        return singletonDemo2;
    }
}
