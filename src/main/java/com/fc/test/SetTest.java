package com.fc.test;

import org.junit.Test;

import java.util.*;

/**
 * set实现类hashset、TreeSet、LinkedHashSet
 */
public class SetTest {
    /**
     * hashset无序,
     *        线程不安全
     *        不可存放重复值
     *        可存放空值
     */
    @Test
    public void HashSetTest(){
        Set<String> set1 = new HashSet<>();
        set1.add("1-aaa");
        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.add("ccc");
        set.add("ddd");
        set.add("eee");
        set.add("rrr");
        set.add("ttt");
        set.add("yyy");
        set.add("fff");
        set.addAll(set1);

        System.out.println(set);
    }

    /**
     * LinkedHashSet有序，
     *              不可存放空值，
     *              线程不安全
     */
    @Test
    public void LinkedHashSet(){
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("1-aaa");
        Set<String> set = new LinkedHashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");
        set.add("eee");
        set.add("rrr");
        set.add("ttt");
        set.add("yyy");
        set.add("fff");
        set.addAll(set1);
        System.out.println(set);
    }
    @Test
    public void TreeSetTest(){
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("1-aaa");
        TreeSet<String> set = new TreeSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");
        set.add("eee");
        set.add("rrr");
        set.add("ttt");
        set.add("yyy");
        set.add("fff");
        set.addAll(set1);
        System.out.println(set);
    }

    /**
     * list去重
     */
    @Test
    public void listToSet(){
        List<String> list = new ArrayList<>();
        list.add("sss");
        list.add("ccc");
        list.add("sss");
        list.add("ccc");
        list.add("sss");
        list.add("ccc");
        System.out.println(list);
        Set<String> set = new HashSet<>();
        set.addAll(list);
        System.out.println(set);
    }
}
