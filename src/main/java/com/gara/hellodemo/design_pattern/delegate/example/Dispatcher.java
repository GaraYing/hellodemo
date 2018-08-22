package com.gara.hellodemo.design_pattern.delegate.example;

/**
 * @description: 委派者
 * @author: GaraYing
 * @create: 2018-08-22 19:00
 **/

public class Dispatcher implements IExecutor {

    IExecutor executor;
    public Dispatcher(IExecutor executor) {
        this.executor = executor;
    }

    @Override
    public void doSomething() {
        this.executor.doSomething();
    }
}
