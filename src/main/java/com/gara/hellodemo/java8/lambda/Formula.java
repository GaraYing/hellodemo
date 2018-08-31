package com.gara.hellodemo.java8.lambda;

import java.text.DecimalFormat;

/**
 * @description: 扩展方法
 * @author: GaraYing
 * @create: 2018-08-31 09:41
 **/

public interface Formula {

    double calculate(double r);

    double test();

    /**
     * 1. Java8允许interface中使用default关键字，为接口添加非抽象的方法实现--扩展方法
     * 2. 其实现类可以直接调用该扩展方法，不需要实现
     * @param a
     * @return
     */
    default double sqrt(double a){
        return Math.sqrt(a);
    }

}
