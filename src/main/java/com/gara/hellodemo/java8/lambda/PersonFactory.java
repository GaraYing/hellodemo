package com.gara.hellodemo.java8.lambda;

/**
 * @description: person工厂
 * @author: GaraYing
 * @create: 2018-08-31 18:07
 **/

public interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}


