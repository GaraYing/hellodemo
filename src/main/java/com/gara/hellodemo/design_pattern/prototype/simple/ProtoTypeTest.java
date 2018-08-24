package com.gara.hellodemo.design_pattern.prototype.simple;

/**
 * @description: 测试
 * @author: GaraYing
 * @create: 2018-08-24 18:06
 **/

public class ProtoTypeTest {

    public static void main(String[] args) {
        ConcreteProtoType cp = new ConcreteProtoType();
        cp.setAge(18);
        try {
            ConcreteProtoType copy = (ConcreteProtoType)cp.clone();

            System.out.println(cp.list==copy.list);

            copy.getAge();
            System.out.println(copy.getAge());
        }catch (Exception e){
            e.printStackTrace();
        }
        // 就是有一个现成的对象，这个对象已经设置好值
        // 当我要创建一个新的对象，并且要给新的对象赋值，而且赋值内容要和之前一样

        // 能够直接copy其世纪内容的的数据类型/只支持9种，8大基本数据类型+String ---浅拷贝
    }
}
