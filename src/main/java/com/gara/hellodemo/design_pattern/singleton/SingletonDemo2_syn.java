package com.gara.hellodemo.design_pattern.singleton;

/**
 * @description: 线程安全的实现（jdk1.5以后）
 * @author: GaraYing
 * @create: 2018-08-21 19:13
 **/

public class SingletonDemo2_syn {

    private static volatile SingletonDemo2_syn singletonDemo2 = null;

    private SingletonDemo2_syn() {
    }

    public static SingletonDemo2_syn getInstance() {
        synchronized (SingletonDemo2_syn.class){
            if (singletonDemo2 == null) {
                singletonDemo2 = new SingletonDemo2_syn();
            }
        }
        return singletonDemo2;
    }
}
