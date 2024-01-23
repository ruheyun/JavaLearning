package cn.ruheyun.collection;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Student s1 = new Student("zhansan", 23, 90, 89, 70);
        Student s2 = new Student("lisi", 24, 100, 99, 99);
        Student s3 = new Student("wangwu", 26, 70, 89, 70);
        Student s4 = new Student("zhaoliu", 25, 90, 89, 70);
        Student s5 = new Student("xiaoshishi", 18, 99, 99, 99);
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for (Student t : ts) {
            System.out.println(t);
        }
    }
}
