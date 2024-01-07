package cn.ruheyun.teststudy4;

import java.util.ArrayList;

public class test4 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("小米",1000);
        Phone p2 = new Phone("苹果",8000);
        Phone p3 = new Phone("锤子",2999);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<Phone> list1 = InsertMin(list);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i).getBrand() + " " + list1.get(i).getPrice());
        }
    }

    public static ArrayList<Phone> InsertMin(ArrayList<Phone> list){
        ArrayList<Phone> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 3000){
                list1.add(list.get(i));
            }
        }
        return list1;
    }
}
