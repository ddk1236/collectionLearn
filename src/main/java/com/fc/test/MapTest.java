package com.fc.test;

import org.junit.Test;

import java.util.*;

/**
 * map的实现类
 * HashMap、treeMap、hashTable、concurrentHashMap
 */
public class MapTest {
    /**
     * hashmap无序，可存放空值，线程不安全
     * 底层实现：数组+链表+红黑树
     *
     */
    @Test
    public void HashMapTest(){
        Map<String, String> map = new HashMap<>();
        map.put("a","A");
        map.put("b","B");
        System.out.println(map.get("a"));
        System.out.println(map);
    }
    @Test
    public void Treemap(){
        Map<String, String> map = new TreeMap<>();
        map.put("a","A");
        map.put("b","B");
        map.put("c","A");
        map.put("bd","B");
        map.put("e","A");
        map.put("ad","B");
        System.out.println(map);
    }
    @Test
    public void LinkedHashMapTest(){
        Map<String, String> map = new LinkedHashMap<>();
        map.put("a","A");
        map.put("b","B");
        map.put("c","A");
        map.put("bd","B");
        map.put("e","A");
        map.put("ad","B");
        System.out.println(map);
    }
    @Test
    public void HashTableTest(){
        Hashtable<String, String> map = new Hashtable<>();
        map.put("a","A");
        map.put("b","B");
        map.put("c","A");
        map.put("bd","B");
        map.put("e","A");
        map.put("ad","B");
        System.out.println(map);
    }
}
