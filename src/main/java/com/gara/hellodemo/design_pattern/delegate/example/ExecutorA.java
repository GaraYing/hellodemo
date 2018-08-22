package com.gara.hellodemo.design_pattern.delegate.example;

/**
 * @description: 执行者A 普通员工A
 * @author: GaraYing
 * @create: 2018-08-22 18:58
 **/

public class ExecutorA implements IExecutor {
    @Override
    public void doSomething() {
        System.out.println("执行者A开始做事了");
    }
}
