package cn.ruheyun.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        //添加元素，键值对形式   key-value
        m.put("zhansan",60);
        m.put("lisi",70);
        m.put("wuangwu",90);
        System.out.println(m);
        System.out.println("----------------------------------");
        //细节：如果添加相同的对象的key，则会覆盖value的值，并将覆盖的值返回
        int value = m.put("zhansan",80);
        System.out.println(value);
        System.out.println(m);
        System.out.println("----------------------------------");
        //删除元素，根据key删除,会返回删除键的值
        int value1 = m.remove("wuangwu");
        System.out.println(value1);
        System.out.println(m);
        System.out.println("----------------------------------");
        //根据键来判断元素是否存在
        boolean flag = m.containsKey("lisi");
        boolean flag1 = m.containsKey("wangwu");
        System.out.println(flag + " " + flag1);
        System.out.println(m);
        System.out.println("----------------------------------");
        //根据值来判断元素是否存在
        boolean flag3 = m.containsValue(80);
        boolean flag4 = m.containsValue(85);
        System.out.println(flag3 + " " + flag4);
        System.out.println(m);
        System.out.println("----------------------------------");
        //判断集合是否为空
        boolean flag5 = m.isEmpty();
        System.out.println(flag5);
        System.out.println(m);
        System.out.println("----------------------------------");
        //求集合的长度
        int size = m.size();
        System.out.println(size);
        System.out.println(m);
        System.out.println("----------------------------------");
        //清空集合
        m.clear();
        System.out.println(m);
        System.out.println("----------------------------------");
    }
}
