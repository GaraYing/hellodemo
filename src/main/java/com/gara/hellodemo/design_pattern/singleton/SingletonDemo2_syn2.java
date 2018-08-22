package com.gara.hellodemo.design_pattern.singleton;

/**
 * @description: 线程安全的实现（jdk1.5以后）并发操作
 * @author: GaraYing
 * @create: 2018-08-21 19:13
 **/

public class SingletonDemo2_syn2 {

    private static volatile SingletonDemo2_syn2 singletonDemo2 = null;

    private SingletonDemo2_syn2() {
    }

    public static SingletonDemo2_syn2 getInstance() {

        if (singletonDemo2 == null) {
            synchronized (SingletonDemo2_syn2.class) {
                if (singletonDemo2 == null) {
                    singletonDemo2 = new SingletonDemo2_syn2();
                }
            }
        }
        return singletonDemo2;
    }
}
