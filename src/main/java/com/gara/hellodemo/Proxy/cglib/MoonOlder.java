package com.gara.hellodemo.Proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;

/**
 * @description: 月老类 小哥哥加点注释吧~
 * @author: GaraYing
 * @create: 2018-08-06 19:16
 **/
public class MoonOlder implements MethodInterceptor {

    public Object getInstance(Object className) throws Exception{
        //反射机制实例化
        Enhancer enhancer = new Enhancer();
        // 父类设置
        enhancer.setSuperclass(className.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

//        long startTime = System.currentTimeMillis();
//        new SimpleDateFormat("yyyy-MM-da HH:mm:ss").format(startTime);

//        System.out.println("----------"+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(startTime)+"-----------");
        System.out.println("我是月老："+"  得给你找一个异性才行");
        System.out.println("开始进行海选*********");

//        method.invoke(o,objects)); // 这里会发生死循环
        methodProxy.invokeSuper(o,objects);
//        this.target.findLove();


        System.out.println("这么合适， 那就在一起把~~");
        System.out.println("---------------------");
        return null;
    }
}
