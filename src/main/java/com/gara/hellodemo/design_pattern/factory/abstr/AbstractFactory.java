package com.gara.hellodemo.design_pattern.factory.abstr;

import com.gara.hellodemo.design_pattern.factory.simple.AuDi;
import com.gara.hellodemo.design_pattern.factory.simple.Bmw;
import com.gara.hellodemo.design_pattern.factory.simple.Car;

/**
 * @description: 抽象工厂
 * @author: GaraYing
 * @create: 2018-08-15 15:36
 **/

public abstract class AbstractFactory {

    protected abstract Car getCar();

    public Car getCar(String name){
        if ("BMW".equalsIgnoreCase(name)){
            return  new BmwFactory().getCar();
        }else if ("AUDI".equalsIgnoreCase(name)){
            return new AudiFactory().getCar();
        }else {
            System.out.println("产品造不出来");
            return null;
        }
    }
}
