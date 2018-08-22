package com.gara.hellodemo.design_pattern.delegate.example;

/**
 * @description:  测试
 * @author: GaraYing
 * @create: 2018-08-22 19:02
 **/

public class DispatcherTest {

    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher(new ExecutorA());
        // 看上去是项目经理在做事，实际上干活的人是普通员工，这就是典型的干活是你的，功劳是我的

        dispatcher.doSomething();
    }
}
