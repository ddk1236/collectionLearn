package com.fc.test;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * set实现类hashset、TreeSet、LinkedHashSet
 */
public class SetTest {
    /**
     * hashset无序线程不安全可存放空值
     */
    @Test
    public void HashSetTest(){
        Set<String> set1 = new HashSet<>();
        set1.add("1-aaa");
        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.addAll(set1);

        System.out.println(set);
    }
    @Test
    public void LinkedHashSet(){
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("1-aaa");
        Set<String> set = new LinkedHashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.addAll(set1);
        System.out.println(set);
        
    }
}
