package com.gara.hellodemo.thread;

/**
 * @description: 并发与串行执行效率对比  : 线程有创建和上下文切换的开销
 * @author: GaraYing
 * @create: 2018-10-24 14:12
 **/

public class ConcurrencyTest {
    private static final long count = 100001;

    public static void main(String[] args) throws InterruptedException {
        concurrency();
        serial();
    }

    private static void serial() {
        long start = System.currentTimeMillis();
        int a = 0;
        for (int i = 0; i <count ; i++) {
            a+=5;
        }
        int b =0;
        for (int i = 0; i < count; i++) {
            b--;
        }
        long time = System.currentTimeMillis()-start;
        System.out.println("serial:" + time+"ms,b="+b+",a="+a);
    }

    private static void concurrency() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (int i = 0; i <count ; i++) {
                    a+=5;
                }
            }
        });

        Runnable task = () ->{
            System.out.println("Lambda Expression");
        };
        new Thread(task).start();

        new Thread(()->{
            System.out.println("This is a new Thread from Lambda");
        }).start();
        thread.start();
        int b = 0;
        for (int i = 0; i <count ; i++) {
            b--;
        }
        long time = System.currentTimeMillis()-start;
        thread.join();
        System.out.println("concurrency :" + time+"ms,b="+b);

    }
}
