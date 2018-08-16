package com.gara.hellodemo.design_pattern.factory.method;

import com.gara.hellodemo.design_pattern.factory.simple.Car;

/**
 * @description: 工厂接口，定义了所有工厂的执行标准
 * 1.轮胎耐磨程度
 * 2.尾气排放标准
 * 3. ……
 * @author: GaraYing
 * @create: 2018-08-15 15:23
 **/

public interface Factory {
    Car getCar();
}
