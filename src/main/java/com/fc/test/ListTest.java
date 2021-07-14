package com.fc.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest {
    /**
     * list集合实现类Arraylist有序
     * 底层实现：数组，初始值默认为10，扩容机制：当前容量x1.5+1
     * 添加元素add(E e),
     *       add(int index，E e)
     *       addAll(Collection <? extends E> c)
     *       addAll(int index,Collection <? extends E> c)
     * 获取下标元素get(int index)
     * 获取元素下标indexOf(E e)
     * 删除操作remove(E e)
     *       remove(int index)
     */
    @Test
    public void ArrayListTest(){
        List<String> list1 = new ArrayList<>();
        list1.add("1-aaa");
        list1.add("1-ccc");
        List<String> list = new ArrayList<>();
        //添加元素
        list.add("sss");
        list.add("ccc");
        list.add(1,"ddd");
        //addAll添加参数为指定集合的类型或者其子类
        list.addAll(list1);
        //获取元素下标
        System.out.println(list.indexOf("sss"));
        //获取下标元素
        System.out.println(list.get(2));
        //删除操作
        list.remove("1-aaa");
        System.out.println(list);
    }

    /**
     *list实现类 LinkedList，有序
     * 底层实现：双向链表
     * 添加元素同上add(E e)
     *           add(int index,E e)
     *           addAll(Collection <? extends E> c)
     *           addAll(int index,Collection <? extends E> c)
     *获取元素：不能通过元素获取下标
     *        可以通过下标获取元素get(int index)
     *移除元素：remove(int index)
     *        remove(Object o)
     */
    @Test
    public void LinkedList(){
        List<String> list1 = new LinkedList<>();
        list1.add("ddd");
        list1.add("eee");
        List<String> list = new LinkedList<>();
        //添加元素
        list.add("aaa");
        list.add("ccc");
        list.add("333");
        list.add(1,"bbb");
        list.addAll(3,list1);
        //通过下标获取元素
        System.out.println(list.get(3));
        //删除元素
        list.remove("aaa");
        list.remove(1);


        System.out.println(list);
    }

    /**
     * vector线程安全的list实现类
     * 扩容机制： 扩容一倍
     */
    @Test
    public void VectorTest(){
        Vector<String> list1 = new Vector<>();
        list1.add("1-aaa");
        Vector<String> list2 = new Vector<>();
        list2.add("2-aaa");
        Vector<String> list = new Vector<>();
        list.add("aaa");
        list.addAll(list1);
        list.addAll(1,list2);

        System.out.println(list.get(1));
        System.out.println(list.remove("1-aaa"));
        System.out.println(list.remove(1));

        System.out.println(list);
    }

}
