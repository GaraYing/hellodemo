package com.gara.hellodemo.java8.libs;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @description: 空指针异常处理
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
