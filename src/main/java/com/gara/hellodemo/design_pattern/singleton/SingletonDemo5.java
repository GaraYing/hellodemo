package com.gara.hellodemo.design_pattern.singleton;

/**
 * @description: 枚举类实现：1.简介优化 2.不存在多个实例的问题 3. 不存在反序列化的问题
 *      使用枚举除了线程安全和防止反射强行调用构造器之外，还提供了自动序列化机制，防止反序列化的时候创建新的对象
 * @author: GaraYing
 * @create: 2018-08-22 09:55
 **/

public enum  SingletonDemo5 implements MySingleton{

    // 这里隐藏了一个空的私有构造方法
//    private SingletonDemo5 () {}

    INSTANCE{
        @Override
        public void doSomething() {
            System.out.println("complete singleton");
        }
    };

    public static void sayHello(String name){
        System.out.println("hello "+name);
    }



    public static MySingleton getInstance(){
        return SingletonDemo5.INSTANCE;
    }
}
