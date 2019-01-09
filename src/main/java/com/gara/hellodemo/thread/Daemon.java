package com.gara.hellodemo.thread;

import com.gara.hellodemo.utils.ThreadUtils;

/**
 * @ClassName: Daemon
 * @description: 守护进程
 * @author: GaraYing
 * @create: 2019-01-08 17:41
 * @Version: 1.0
 **/
public class Daemon {

    // 无输出
    public static void main(String[] args) {
        Thread thread = new Thread (new DaemonRunner(),"DaemonRunner");
        thread.setDaemon(true);
        thread.start();
    }

    static class DaemonRunner implements Runnable{
        @Override
        public void run() {
            try {
                ThreadUtils.second(100);
            }finally {
                /*
                    注意：在构建Daemon进程时，不能依靠finally来确认执行关闭和清理资源
                */
                System.out.println("DaemonThread finally run.");
            }
        }
    }
}
