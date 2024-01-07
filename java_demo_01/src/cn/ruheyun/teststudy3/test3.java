package cn.ruheyun.teststudy3;

import java.util.ArrayList;

public class test3 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User user1 = new User("001","zhangsan","123456");
        User user2 = new User("002","lisi","12345");
        User user3 = new User("003","wangwu","1234567");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        Boolean flag = InsertId(list,"004");
        System.out.println(flag);
    }

    public static boolean InsertId(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)){
                return true;
            }
        }
        return false;
    }
}
