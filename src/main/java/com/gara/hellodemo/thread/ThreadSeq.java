package com.gara.hellodemo.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author GARA
 * @Title: ThreadSeq
 * @Description: 控制线程执行的顺序
 * @date 2018/11/7 11:43
 */
public class ThreadSeq {

    static Thread thread1 = new Thread(() ->{
        System.out.println(Thread.currentThread());
    });

    static Thread thread2 = new Thread(() ->{
        System.out.println(Thread.currentThread());
    });

    static Thread thread3 = new Thread(() ->{
        System.out.println(Thread.currentThread());
    });

    static ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static void main(String[] args) throws InterruptedException {
        // join() 实现
//        thread1.start();
//        thread1.join();
//        thread2.start();
//        thread2.join();
//        thread3.start();
        //ExecutorService实现
        executorService.submit(thread1);
        executorService.submit(thread2);
        executorService.submit(thread3);
        executorService.shutdown();
    }
}
