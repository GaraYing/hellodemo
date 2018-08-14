package com.gara.hellodemo;

import org.apache.tomcat.util.codec.binary.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/**
 * @description: for test
 * @author: GaraYing
 * @create: 2018-08-01 14:49
 **/
public class JavaSETest {

    /**
     * @Description: 这是一个Main方法
     * @Param: [args]
     * @return: void
     * @Author: GaraYing
     * @Date: 2018/8/1 15:17
     */
    public static void main(String[] args) {
        System.out.println("这是一个测试方法");
    }

    @Test
    public void testCalc(){
        System.out.println(1<<4);
        System.out.println(2<<3);
        Assert.assertEquals(1<<4,2<<2);
        Assert.assertEquals(1<<4,2<<3);
    }

    @Test
    public void testHasMap(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("aa","晚上");
        map.put("bb","下午");
        map.put("cc","中午");

        // 第一种：推荐遍历集合方法
        Iterator<Map.Entry<String, Object>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String, Object> next = entryIterator.next();
            System.out.println("key=" + next.getKey() + " value=" + next.getValue());
        }

        // 第二种：不推荐，第一种可以把 key value 同时取出，第二种还得需要通过 key 取一次 value，效率较低。
        Iterator<String> iterator  = map.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println("key="+key + "value:"+map.get(key));
        }

//        int hashcode = Objects.hashCode("aa".toString()) ^ Objects.hashCode(map.get("aa"));
//        System.out.println("hashcode=========="+hashcode);
    }

}
