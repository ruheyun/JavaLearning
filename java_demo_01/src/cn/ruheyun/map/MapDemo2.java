package cn.ruheyun.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MapDemo2 {
    public static void main(String[] args) {
        //第二种遍历方法：    通知键值对对象来遍历
        Map<String, Integer> m = new HashMap<>();
        m.put("zhansan", 23);
        m.put("lisi", 24);
        m.put("wangwu", 25);

        Set<Map.Entry<String, Integer>> entries = m.entrySet();
        //通过增强for遍历
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        System.out.println("-----------------------------------------");

        //通过迭代器遍历
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry en = iterator.next();
            System.out.println(en.getKey() + "=" + en.getValue());
        }
        System.out.println("-----------------------------------------");

        //通过lambda表达式遍历
        entries.forEach(stringIntegerEntry->System.out.println(stringIntegerEntry.getKey() + "=" + stringIntegerEntry.getValue()));
        System.out.println("-----------------------------------------");

        //第三种遍历方式：   lambda表达式
        m.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                System.out.println(key + "=" + value);
            }
        });

        //化简lambda
        m.forEach((key, value)->System.out.println(key + "=" + value));
    }
}
