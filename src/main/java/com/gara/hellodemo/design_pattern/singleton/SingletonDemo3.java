package com.gara.hellodemo.design_pattern.singleton;

/**
 * @description: 内部类实现单例模式
 * @author: GaraYing
 * @create: 2018-08-21 19:21
 **/

/**
 * 懒汉试（静态内部类）
 * 优点：结局性能问题和安全问题
 * 极简模式下的最经典代码设计
 */
public class SingletonDemo3 {

    /**
     * 1.申明一个静态内部类
     * private ：私有化保证不被修改
     * static : 保证全局唯一
     * final : 防止内部操作 代理模式。Cglib代理模式
     */
    private static class LazyHolder {
        private static final SingletonDemo3 INSTANCE = new SingletonDemo3();
    }

    // 2. 构造方法私有化
    // 如果不私有化，会有一个模式的无参构造，就意味着代码随时可以new出来！！！
    private SingletonDemo3() {
    }

    /**
     * 3. 提供静态方法获取实例
     * final： 确保别人不能覆盖
     */
    public static final SingletonDemo3 getInstance() {
        return LazyHolder.INSTANCE;
    }
}
