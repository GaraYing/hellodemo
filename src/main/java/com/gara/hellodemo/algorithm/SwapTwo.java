package com.gara.hellodemo.algorithm;

import io.swagger.models.auth.In;

import java.lang.reflect.Field;

/**
 * 两个Integer对象的引用对象传给一个swap方法内部进行交换，返回后，两个引用的值是否发生变化？
 * 1. 自动装箱与拆箱
 * 2. Integer 对-128-127之间会缓存
 */
public class SwapTwo {
    public static void main(String[] args) {

        Integer a = 1, b = 2;
        System.out.println("a=:" + a + ",b=" + b);

        Integer i1 =1,i2=1;
        System.out.println(i1==i2);
        i1 = 129;
        i2 = 129;
        System.out.println(i1==i2);
//        swap(a, b);

        try {
            swapValue(a, b);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("a=:" + a + ",b=" + b);
    }

    /**
     * 交换后值不会变化
     * java数据参数分为值类型和引用类型’
     * 值类型：传入的是值的副本，本身不会改变
     * 引用类型：传入的是值的地址
     *
     * @param a
     * @param b
     *
     * @Result a=1,b=2
     *
     */
    private static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

    /**
     *
     * @param a
     * @param b
     * @throws NoSuchFieldException
     * @throws IllegalAccessException
     *
     * @Result a=2,b=2
     */
    private static void swapValue(Integer a, Integer b) throws NoSuchFieldException, IllegalAccessException {
        // 反射获取 private final 类型的值
        Field field = Integer.class.getDeclaredField("value");
        field.setAccessible(true);
        // Integer 对[-128-127]之间的数据会做内存缓存
        // 所以 a 的值改为2之后
//        Integer temp = a.intValue();

        // Result a=2,b=1
        Integer temp = new Integer(a.intValue());
        field.set(a, b.intValue());
        field.set(b, temp);
    }
}
