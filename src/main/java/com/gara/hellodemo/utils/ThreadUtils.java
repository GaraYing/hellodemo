package com.gara.hellodemo.utils;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: ThreadUtils
 * @description: 进程工具类
 * @author: GaraYing
 * @create: 2019-01-08 16:51
 * @Version: 1.0
 **/
public class ThreadUtils {
    public static final void second(long seconds){
        try{
            TimeUnit.SECONDS.sleep(seconds);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
