package com.gara.hellodemo.design_pattern.factory.method;

import com.gara.hellodemo.design_pattern.factory.simple.Bmw;
import com.gara.hellodemo.design_pattern.factory.simple.Car;

/**
 * @description: Audi 工厂
 * @author: GaraYing
 * @create: 2018-08-15 15:25
 **/

public class BmwFactory implements Factory {
    @Override
    public Car getCar() {
        return new Bmw();
    }
}
