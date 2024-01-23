package cn.ruheyun.map;

import java.util.*;

public class MapStudent {
    public static void main(String[] args) {
        String[] str = {"A", "B", "C", "D"};
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            list.add(str[r.nextInt(str.length)]);
        }
        Map<String, Integer> map = new HashMap<>();
        for (String locate : list) {
            if (map.containsKey(locate)) {
                int count = map.get(locate);
                count++;
                map.put(locate, count);
            } else {
                map.put(locate, 1);
            }
        }
        System.out.println(map);
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        System.out.println(max);
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey());
            }
        }
    }
}
