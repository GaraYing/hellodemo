package com.gara.hellodemo.design_pattern.delegate;

/**
 * @description: the delegator 委托者
 * @author: GaraYing
 * @create: 2018-08-22 18:40
 **/

public class Printer {

    /**
     * 特点：
     *   1. 类似于中介的功能（委托机制）
     *   2. 持有被委托人的引用
     *   3. 不关心过程，只关心结果
     * 目的：隐藏具体实现逻辑
     */

    RealPrinter realPrinter = new RealPrinter(); // create the delegate
    void print(){
        realPrinter.print();//delegation
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }
}
