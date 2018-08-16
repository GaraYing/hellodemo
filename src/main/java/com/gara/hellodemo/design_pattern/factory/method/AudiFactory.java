package com.gara.hellodemo.design_pattern.factory.method;

import com.gara.hellodemo.design_pattern.factory.simple.AuDi;
import com.gara.hellodemo.design_pattern.factory.simple.Car;

/**
 * @description: Audi 工厂
 * @author: GaraYing
 * @create: 2018-08-15 15:25
 **/

public class AudiFactory implements Factory {
    @Override
    public Car getCar() {
        return new AuDi();
    }
}
