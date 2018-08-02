package com.gara.hellodemo.Proxy;

import org.omg.IOP.ExceptionDetailMessage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: 月老 小哥哥加点注释吧~
 * @author: GaraYing
 * @create: 2018-08-02 19:56
 **/
public class MoonOlder implements InvocationHandler {

    private Person target;

    public Object getInstance(Person target) throws Exception {

        this.target = target;
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("---------------------");
        System.out.println("我是月老：你的性别是"+this.target.getSex()+"  得给你找一个异性才行");
        System.out.println("开始进行海选*********");
        this.target.findLove();
        System.out.println("这么合适， 那就在一起把~~");
        System.out.println("---------------------");
        return null;
    }
}