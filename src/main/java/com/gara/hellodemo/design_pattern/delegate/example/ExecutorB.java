package com.gara.hellodemo.design_pattern.delegate.example;

/**
 * @description: 执行者B 普通员工B
 * @author: GaraYing
 * @create: 2018-08-22 18:59
 **/

public class ExecutorB implements IExecutor {
    @Override
    public void doSomething() {
        System.out.println("执行者B开始做事情了");
    }
}
