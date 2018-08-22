package com.gara.hellodemo.design_pattern.singleton;

/**
 * @description: TODO 单例模式测试
 * @author: GaraYing
 * @create: 2018-08-21 19:10
 **/

public class SingletonTest {

    public static void main(String[] args) {
        System.out.println(SingletonDemo3.getInstance());

        System.out.println(SingletonDemo3.getInstance());

        System.out.println(SingletonDemo5.INSTANCE);
        System.out.println(SingletonDemo5.INSTANCE);

        System.out.println(SingletonDemo5.getInstance());
        System.out.println(SingletonDemo5.getInstance());


        SingletonDemo5.INSTANCE.sayHello("王二小");
    }
}
