package com.gara.hellodemo.design_pattern.proxy;

/**
 * @description: 测试类 小哥哥加点注释吧~
 * @author: GaraYing
 * @create: 2018-08-02 20:01
 **/
public class DateTest {
    public static void main(String[] args) {
//        new WangErXiao().findLove();
        try {
            Person person = (Person) new MoonOlder().getInstance(new WangErXiao());
            System.out.println(person.getClass());
            person.findLove();
            /* 原理：
             1. 拿到代理被对象得引用，同时获取到它的接口
             2. JDK代理重新生成一个类，同时实现我们给的代理对象的接口
             3. 把代理对象的引用也拿到了
             4. 重新动态生成一个class字节码
             5. 然后编译
             */
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
