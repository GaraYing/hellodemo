package com.gara.hellodemo.design_pattern.factory.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 简单工厂类测试
 * @author: GaraYing
 * @create: 2018-08-09 19:26
 **/

public class SimpleFactoryTest {
    public static void main(String[] args) {
        Car car = new SimpleFactory().getCar("ddd");
        System.out.println(car!=null?car.getCar():"未匹配");

        Map<String, Object> map = new HashMap<String, Object>();

    }
}
