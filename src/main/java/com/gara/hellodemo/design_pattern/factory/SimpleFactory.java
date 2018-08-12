package com.gara.hellodemo.design_pattern.factory;

/**
 * @description: 工厂类
 * @author: GaraYing
 * @create: 2018-08-09 19:23
 **/

public class SimpleFactory {

    public Car getCar(String name){
        if ("BMW".equalsIgnoreCase(name)){
            return  new Bmw();
        }else if ("AUDI".equalsIgnoreCase(name)){
            return new AuDi();
        }else {
            return null;
        }
    }
}
