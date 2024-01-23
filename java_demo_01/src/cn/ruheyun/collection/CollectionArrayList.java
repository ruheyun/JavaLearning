package cn.ruheyun.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionArrayList {
    public static void main(String[] args) {
        //创建Collection中ArrayList对象
        Collection<String> coll = new ArrayList<>();
        System.out.println("集合中的元素为： " + coll);
        System.out.println("----------------------------------------------------");
        //添加元素
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println("集合中的元素为： " + coll);
        System.out.println("----------------------------------------------------");
        //删除元素
        coll.remove("bbb");
        System.out.println("集合中的元素为： " + coll);
        System.out.println("----------------------------------------------------");
        //判断是否包含,包含返回true，不包含返回false
        boolean flag = coll.contains("aaa");
        System.out.println(flag);
        System.out.println("----------------------------------------------------");
        //判断集合是否为空，为空返回true，不为空返回false
        boolean flag_2 = coll.isEmpty();
        System.out.println(flag_2);
        System.out.println("----------------------------------------------------");
        //求集合的长度
        int length = coll.size();
        System.out.println(length);
        System.out.println("----------------------------------------------------");
        //清空所有元素
        coll.clear();
        System.out.println("集合中的元素为： " + coll);
        System.out.println("----------------------------------------------------");
    }
}
