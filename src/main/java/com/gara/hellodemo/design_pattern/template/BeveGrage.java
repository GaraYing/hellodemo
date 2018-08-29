package com.gara.hellodemo.design_pattern.template;

/**
 * @description: TODO 模板模式
 * @author: GaraYing
 * @create: 2018-08-29 19:17
 **/
//冲饮料
public abstract class BeveGrage {

    // 不能吧被重写
    public final void create(){
        // 1. 把水烧开
        boildWater();
        //2. 被子准备好，原材料放入杯子中
        pureInCup();
        // 3. 用水冲泡
        brew();
        //4. 添加辅料
        addCoundiments();
    }

    protected abstract void addCoundiments();

    protected abstract void brew();

    public void pureInCup(){
        System.out.println("将开水倒入杯中********");
    }

    public  void boildWater(){
        System.out.println("烧开水，100度出锅******");
    }
}
