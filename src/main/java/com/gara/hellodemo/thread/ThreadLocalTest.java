package com.gara.hellodemo.thread;

/**
 * @description:
 * @author: GaraYing
 * @create: 2018-11-02 15:54
 **/

public class ThreadLocalTest {

    private void testThreadLocal() {
        Thread t = new Thread() {
            ThreadLocal<String> mStringThreadLocal = new ThreadLocal<>();

            @Override
            public void run() {
                super.run();
                mStringThreadLocal.set("droidyue.com");
                mStringThreadLocal.get();
            }
        };

        t.start();
    }

    public static void main(String[] args) {
        new ThreadLocalTest().testThreadLocal();



    }

}
