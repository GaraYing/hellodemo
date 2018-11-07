package com.gara.hellodemo.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author GARA
 * @Title: SychronizedDemo
 * @Description:
 * @date 2018/11/7 20:48
 */
public class SynchronizedDemo {

    static ReentrantLock lock = new ReentrantLock();

    static volatile int count = 0;
    // synchronized实现
    synchronized static void test() {
        for (int i = 0; i < 1000; i++) {
            count++;
        }
        System.out.println(count);
    }
    // ReentrantLock实现
    static void test2() {
        lock.lock();
        for (int i = 0; i < 1000; i++) {
            count++;
        }
        System.out.println(count);
        lock.unlock();
    }

    public static void main(String[] args) {
        synchronized (SynchronizedDemo.class){
            count++;
        };
        test();
        test2();
    }
}

