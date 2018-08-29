package com.gara.hellodemo.design_pattern.template;

/**
 * @description: TODO 模板模式测试
 * @author: GaraYing
 * @create: 2018-08-29 19:27
 **/



/*
        典型的模板模式应用:
        SpringJDBC Java规范 ，各个数据库厂商去实现
        加载JDBC驱动

        1. 加载jdbc驱动类DriverManager
        2. 建立连接
        3. 创建语句集（Statement PrepareState）
        4. 执行语句集
        5. 结果集ResultSet 游标

        ORM
     */

public class TestTemplate {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.create();

        Tea tea = new Tea();
        tea.create();
    }
}
