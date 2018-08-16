package com.gara.hellodemo.design_pattern.factory.method;

/**
 * @description: 测试
 * @author: GaraYing
 * @create: 2018-08-15 15:29
 **/

public class FactoryTest {
    public static void main(String[] args) {

        // 工厂方法模式
        Factory factory = new AudiFactory();
        System.out.println(factory.getCar());

        // 需要用户关系产品的生厂商
        factory = new BmwFactory();
        System.out.println(factory.getCar());
    }
}
