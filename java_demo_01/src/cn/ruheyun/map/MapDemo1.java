package cn.ruheyun.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapDemo1 {
    public static void main(String[] args) {
        //第一种遍历方法：    键找值
        Map<String, Integer> m = new HashMap<>();
        m.put("zhansan", 23);
        m.put("lisi", 24);
        m.put("wangwu", 25);
        //将键放入单列集合中
        Set<String> keys = m.keySet();
        //通过遍历键来输出对应的值
        //增强for遍历
        for (String key : keys) {
            //System.out.println(key);
            System.out.println(key + "=" + m.get(key));
        }
        System.out.println("-------------------------------------");
        //迭代器遍历
        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str + "=" + m.get(str));
        }
        System.out.println("-------------------------------------");
        //lamdba表达式遍历
        keys.forEach(s-> System.out.println(s + "=" + m.get(s)));
    }
}
