package com.gara.hellodemo.design_pattern.factory.abstr;

import com.gara.hellodemo.design_pattern.factory.simple.Bmw;
import com.gara.hellodemo.design_pattern.factory.simple.Car;

/**
 * @description: 默认工厂
 * @author: GaraYing
 * @create: 2018-08-15 15:43
 **/

public class DefaultFactory extends AbstractFactory {

    private BmwFactory deafultFactory = new BmwFactory();

    @Override
    protected Car getCar() {
        return deafultFactory.getCar();
    }
}
