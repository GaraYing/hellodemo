package com.gara.hellodemo.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @description: TODO
 * @author: GaraYing
 * @create: 2018-08-27 15:27
 **/

public class LambdaExp {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("gara", "husn", "pony", "gary");
        List<String> cars = Arrays.asList("宝马", "奔驰", "奥迪", "红旗");
        List<String> houses = Arrays.asList("别墅", "茅草屋", "小平房");
        List<String> ages = Arrays.asList("12", "123", "1231");

        Collections.sort(ages, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
                return o1.compareTo(o2);
            }
        });

        //Lambda表达式
        Collections.sort(names, (String a, String b) -> {
            return a.compareTo(b);
        });

        //Lambda表达式优化1
        Collections.sort(cars, (String a, String b) -> a.compareTo(b));
        //Lambda表达式优化2
        Collections.sort(houses, (a, b) -> a.compareTo(b));

        System.out.println(ages);
        System.out.println(names);
        System.out.println(cars);
        System.out.println(houses);
    }
}
