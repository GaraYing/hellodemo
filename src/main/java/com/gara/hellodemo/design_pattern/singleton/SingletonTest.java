package com.gara.hellodemo.design_pattern.singleton;

import org.springframework.util.Assert;

/**
 * @description: TODO 单例模式测试
 * @author: GaraYing
 * @create: 2018-08-21 19:10
 **/

public class SingletonTest {

    public static void main(String[] args) {
        System.out.println(SingletonDemo3.getInstance());

        System.out.println(SingletonDemo3.getInstance());

    }
}
