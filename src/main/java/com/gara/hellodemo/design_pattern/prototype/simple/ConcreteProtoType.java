package com.gara.hellodemo.design_pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * @author: GaraYing
 * @create: 2018-08-24 18:05
 **/

public class ConcreteProtoType extends ProtoType {

    public int age;

    public int getAge() {
        return age;
    }

    protected List<String > list = new ArrayList<>();

    public void setAge(int age) {
        this.age = age;
    }
}
