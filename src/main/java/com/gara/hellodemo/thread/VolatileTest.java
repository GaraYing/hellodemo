package com.gara.hellodemo.thread;

/**
 * @description: volatile关键字
 * @author: GaraYing
 * @create: 2018-10-25 10:35
 **/

public class VolatileTest {

    volatile static float s =1.3f;

    public static void main(String[] args) {
        new Thread(() ->{
            s++;
//            System.out.println(s);
        }).start();
        System.out.println(s);
    }
}
