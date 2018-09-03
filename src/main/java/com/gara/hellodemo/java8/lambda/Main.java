package com.gara.hellodemo.java8.lambda;

import java.util.Arrays;
import java.util.function.Consumer;

/**
 * @description: TODO
 * @author: GaraYing
 * @create: 2018-09-03 15:46
 **/

public class Main {
    public static void main(String[] args) {
        Arrays.asList("As","dv","pc").forEach(e -> System.out.println(e));
        String separator = ",";
        Arrays.asList("As","dv","pc").forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s+separator);
            }
        });
    }
}
