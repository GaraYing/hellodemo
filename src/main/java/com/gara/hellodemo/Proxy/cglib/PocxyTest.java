package com.gara.hellodemo.Proxy.cglib;

/**
 * @description: 测试类 小哥哥加点注释吧~
 * @author: GaraYing
 * @create: 2018-08-06 19:23
 **/
public class PocxyTest {

    public static void main(String[] args) {
        // 接口测试

        // JDK 动态代理是通过接口强制转换的
        // 生成后的代理接口可以强制转换为接口


        // cglib 的动态代理是通过生成一个被代理对象的子类，然后重写父类的方法
        // 生成后的对，可以强制转换为被代理的对象（也就是自己写的类）
        // 子类应用赋值给父类

        try {
//            Class clazz  = Son.class;
//            Object object = (LiuNeng)new MoonOlder().getInstance(new LiuNeng());

            Object object = new MoonOlder().getInstance(LiuNeng.class);
            ((LiuNeng) object).findlove();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
