package com.gara.hellodemo.collection;

import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;

/**
 * @description: 自定义实现HashMap
 * @author: GaraYing
 * @create: 2018-10-29 14:37
 **/

public class MyHashMap<K, V> {

    public static final int DEFAULT_SIZE = 1 << 4; // 2的整数字幂
    public int capacity;    //2的整数次幂
    private int size = 0;
    private Entry<K, V>[] data; //Map <K,B> map = new HashMap<>();

    public MyHashMap() {
        this(DEFAULT_SIZE);
    }

    public MyHashMap(int capacity) {
        if (capacity > 0) {
            data = new Entry[capacity];
            size = 0;
            this.capacity = capacity;
        } else {
            throw new IllegalArgumentException("Illegal initial capacity: " +
                    capacity);
        }
    }


    /**
     * 获取hash值，保证数组数据尽量分散
     *
     * @param key
     * @return
     */
    private int hash(K key) {
        int h = 0;
        if(key == null) h = 0;
        else{
            h = key.hashCode() ^ (h >>> 16);
        }
        return h % capacity;
    }

    /**
     * 模拟HashMap的put操作
     *
     * @param key
     * @param value
     */
    private void put(K key, V value) {
        if (key == null) return;
        int hash = hash(key);
        Entry<K,V> newE = new Entry<>(key,value,null);
        Entry<K,V> hashM = data[hash];
        while (hashM !=null){
            if (hashM.key.equals(key)){
                hashM.value = value;
                return;
            }
            hashM = hashM.next;
        }
        newE.next = data[hash];
        data[hash] = newE;
        size++;
    }

    /**
     * 模拟HashMapd的get操作
     *
     * @param key
     */
    private V get(K key) {
        int hash = hash(key);
        Entry<K,V> entry = data[hash];
        while (entry != null){
            if (entry.key.equals(key)){
                return entry.value;
            }
            entry = entry.next;
        }
        return null;
    }

    private class Entry<K,V> {
        K key;
        V value;
        Entry<K, V> next;
        int cap; //表示hash冲突的个数

        public Entry() {
        }

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        MyHashMap<String,String> map = new MyHashMap<String, String>();
        map.put("1", "22");
        map.put("sd", "2");
        map.put("ssd", "3");

        System.out.println(map.get("1"));
        System.out.println(map.get("sd"));
        System.out.println(map.get("ssd"));
    }
}
