package cn.ruheyun.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionHashNext {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bb");
        coll.add("cccc");
        //第一种遍历方法，迭代器
        //获取迭代器对象
        Iterator<String> it = coll.iterator();
        //判断迭代器指向元素是否为空，不为空返回true
        while (it.hasNext()){
            //获取当前迭代器指向元素，并取出，然后迭代器指向下一个元素
            String str = it.next();
            System.out.println(str);
        }
        System.out.println("--------------------------------------");

        //第二种遍历方法，增强for
        //s只是第三方变量，在增强for里修改s的值，集合中的元素不变
        for (String s : coll) {
            System.out.println(s);
        }
        System.out.println("--------------------------------------");

        //第三种遍历方法，lambda表达式
        coll.forEach(new Consumer<String>() {
            //匿名内部类的方法
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("------------------------------------------");
        //lambda表达式，就是化简的内部类
        coll.forEach(s -> System.out.println(s));
    }
}
