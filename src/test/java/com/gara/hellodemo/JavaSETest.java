package com.gara.hellodemo;

import org.apache.tomcat.util.codec.binary.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Timestamp;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

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

    /**
     * 测试操作数据自增原子性
     */
    @Test
    public void testAtom(){

        AtomicInteger integerGenernator = new AtomicInteger();
//        int iid = integerGenernator.incrementAndGet() + 10000;
        for (int i = 0; i < 10; i++) {
            int iid = integerGenernator.incrementAndGet() + 10000;
            System.out.println(iid);
//            System.out.println(new Timestamp(new Date().getTime())

        }
    }

    @Test
    public void testMapCreateTime() {
        final long REPS = 100000;
        long t1 = System.currentTimeMillis();
        System.out.print("Hashtable");
        for(long i = 0; i < REPS; i++)
            new Hashtable();
        long t2 = System.currentTimeMillis();
        System.out.println(": " + (t2 - t1));
        t1 = System.currentTimeMillis();
        System.out.print("TreeMap");
        for(long i = 0; i < REPS; i++)
            new TreeMap();
        t2 = System.currentTimeMillis();
        System.out.println(": " + (t2 - t1));
        t1 = System.currentTimeMillis();
        System.out.print("HashMap");
        for(long i = 0; i < REPS; i++)
            new HashMap();
        t2 = System.currentTimeMillis();
        System.out.println(": " + (t2 - t1));
    }

    @Test
    public void testArraysFunctions(){
        byte[] bytes = {95,96,97,98};
        Arrays.sort(bytes);
        System.out.println(bytes);
        Set<String> sets = Collections.emptySet();
//        set.add("WX"); // java.lang.UnsupportedOperationException 此方式不允许修改集合，emptyMap/emptyList等类似
        Set<String> set = new HashSet<>();
        set.add(null);
        set.add("sss");
        System.out.println(set);
        String ssource =
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                        "abcdefghijklmnopqrstuvwxyz";
        char[] src = ssource.toCharArray();
        Random r = new Random();
        int rnd = Math.abs(r.nextInt()) % src.length;
        System.out.println(rnd);
    }
}
