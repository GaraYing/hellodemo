package com.gara.hellodemo.design_pattern.template;

/**
 * @description: TODO
 * @author: GaraYing
 * @create: 2018-08-29 19:23
 **/

public class Coffee extends BeveGrage {

    // 添加辅料
    @Override
    protected void addCoundiments() {
        System.out.println("添加牛奶和糖");
    }

    // 原材料放入杯中
    @Override
    protected void brew() {
        System.out.println("将咖啡倒入杯中");
    }
}
