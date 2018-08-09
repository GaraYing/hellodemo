package com.gara.hellodemo.Proxy;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.omg.IOP.ExceptionDetailMessage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description: 月老 小哥哥加点注释吧~
 * @author: GaraYing
 * @create: 2018-08-02 19:56
 **/
public class MoonOlder implements InvocationHandler {

    private Person target;

    public Object getInstance(Person target) {

        this.target = target;
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        long startTime = System.currentTimeMillis();
        new SimpleDateFormat("yyyy-MM-da HH:mm:ss").format(startTime);

        System.out.println("----------" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(startTime) + "-----------");
        System.out.println("我是月老：你的性别是" + this.target.getSex() + "  得给你找一个异性才行");
        System.out.println("开始进行海选*********");
//        this.target.findLove();

        method.invoke(this.target, args);

        System.out.println("这么合适， 那就在一起把~~");
        System.out.println("---------------------");
        return null;
    }
}
