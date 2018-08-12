package com.gara.hellodemo.design_pattern.proxy;

/**
 * @description: 接口实现测试类 小哥哥加点注释吧~
 * @author: GaraYing
 * @create: 2018-08-02 19:51
 **/
public class WangErXiao implements Person {

    private String name = "王二小";
    private String sex = "男";

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void findLove() {
        System.out.println("========================");

        System.out.println("我叫：" + this.name + "  性别：" + this.sex);
        System.out.println("找对象要求不高");
        System.out.println("白富美");
        System.out.println("温柔体贴贤惠");
        System.out.println("做梦的把你。。。。");

        System.out.println("========================");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSex() {
        return sex;
    }
}
