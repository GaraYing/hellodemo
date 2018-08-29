package com.gara.hellodemo.design_pattern.template;

/**
 * @description: TODO
 * @author: GaraYing
 * @create: 2018-08-29 19:25
 **/

public class Tea extends BeveGrage {

    //添加辅料
    @Override
    protected void addCoundiments() {
        System.out.println("添加蜂蜜");
    }

    // 原材料放入杯中
    @Override
    protected void brew() {
        System.out.println("将茶叶放入杯中");
    }
}
