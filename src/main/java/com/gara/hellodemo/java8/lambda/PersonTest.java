package com.gara.hellodemo.java8.lambda;

/**
 * @description: TODO
 * @author: GaraYing
 * @create: 2018-08-31 18:10
 **/

public class PersonTest {
    public static void main(String[] args) {
        // 通过Person::new来创建一个Person类构造函数的引用
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter","Parker");
        System.out.println(person.toString());

    }
}
