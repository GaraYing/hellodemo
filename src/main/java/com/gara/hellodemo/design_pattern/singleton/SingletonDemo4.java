package com.gara.hellodemo.design_pattern.singleton;

/**
 * @description: 公共域方式:返回时无法进行逻辑处理
 * @author: GaraYing
 * @create: 2018-08-22 09:53
 **/

public class SingletonDemo4 {
    public static final SingletonDemo4 INSTANCE = new SingletonDemo4();

    private SingletonDemo4(){ }
}
