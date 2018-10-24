package com.gara.hellodemo.java8.libs;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @description: 空指针异常处理
 * Optional<T> 类(java.util.Optional) 是一个容器类，代表一个值存在或不存在，
 * null 表示一个值不存在，现在 Optional 可以更好的表达这个概念。并且可以避免空指针异常
 * @author: GaraYing
 * @create: 2018-09-03 16:14
 **/

public class MyOptional {
    public static void main(String[] args) {
        Optional<String> fullName = Optional.ofNullable(null);
        System.out.println( "Full Name is set? " + fullName.isPresent() ); //类的实例为非空值的话，isPresent()返回true，否从返回false
        System.out.println( "Full Name: " + fullName.orElseGet( () -> "[none]" ) );
        System.out.println( fullName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );

        System.out.println(fullName.empty().isPresent());

    }
}
