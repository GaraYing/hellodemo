package com.gara.hellodemo.design_pattern.factory.abstr;

import com.gara.hellodemo.design_pattern.factory.method.AudiFactory;
import com.gara.hellodemo.design_pattern.factory.method.BmwFactory;
import com.gara.hellodemo.design_pattern.factory.method.Factory;

/**
 * @description: 测试
 * @author: GaraYing
 * @create: 2018-08-15 15:29
 **/

public class FactoryTest {
    public static void main(String[] args) {
        /**
         * 设计模式的妙处:编码者和调用者独立存在，互不影响
         * 工厂模式特点：
         * 1. 隐藏复杂的逻辑处理过程，之关心执行结果
         */
        DefaultFactory factory = new DefaultFactory();
        // 默认bmw
        System.out.println(factory.getCar());

        System.out.println(factory.getCar("Audi"));
    }
}
