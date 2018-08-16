package com.gara.hellodemo.design_pattern.factory.abstr;

import com.gara.hellodemo.design_pattern.factory.simple.Bmw;
import com.gara.hellodemo.design_pattern.factory.simple.Car;
import com.gara.hellodemo.design_pattern.factory.method.Factory;

/**
 * @description: Audi 工厂
 * @author: GaraYing
 * @create: 2018-08-15 15:25
 **/

public class BmwFactory extends AbstractFactory {
    @Override
    public Car getCar() {
        return new Bmw();
    }
}
