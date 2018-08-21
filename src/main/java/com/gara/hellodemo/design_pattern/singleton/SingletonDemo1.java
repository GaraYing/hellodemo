package com.gara.hellodemo.design_pattern.singleton;

/**
 * @description: TODO 单例模式一
 * @author: GaraYing
 * @create: 2018-08-21 19:07
 **/

public class SingletonDemo1 {

    private static final SingletonDemo1 singletonDemo1 = new SingletonDemo1();

    private SingletonDemo1() {
    }

    public static final SingletonDemo1 getInstance() {
        return singletonDemo1 != null ? singletonDemo1 : null;
    }
}
