package cn.ruheyun.teststudy5;

import java.util.ArrayList;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        boolean flag = true;
        while (flag){
            Menu();
            int i = sc.nextInt();
            switch (i){
                case 1:
                    list = InsertStudent(list);
                    break;
                case 2:
                    list = DeteleStudent(list);
                    break;
                case 3:
                    list = UpdateStudent(list);
                    break;
                case 4:
                    InquireStudent(list);
                    break;
                default:
                    flag = false;
                    System.out.println("您已成功退出该系统");
                    break;
            }
        }
    }

    public static void Menu(){
        System.out.println("----------------欢迎来到黑马学生管理系统--------------");
        System.out.println("1:添加学生");
        System.out.println("2:删除学生");
        System.out.println("3:修改学生");
        System.out.println("4:查询学生");
        System.out.println("5:退出");
        System.out.println("请输入您的选择：");
    }
    public static ArrayList<Student> InsertStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生id：");
        String newId = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if (newId.equals(list.get(i).getId())){
                System.out.println("添加失败，学生id已存在，请重新添加");
                return InsertStudent(list);
            }
        }
        System.out.println("请输入学生姓名：");
        String newName = sc.next();
        System.out.println("请输入学生年龄：");
        int newAge = sc.nextInt();
        Student st = new Student(newId,newName,newAge);
        list.add(st);
        System.out.println("添加成功");
        return list;
    }
    public static ArrayList<Student> DeteleStudent(ArrayList<Student> list){
        if (list.size() == 0){
            System.out.println("该系统中无任何学生信息，删除失败，请先添加学生信息");
            return list;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除学生的id：");
        String str = sc.next();
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            if (str.equals(list.get(i).getId())){
                list.get(i).setId(null);
                list.get(i).setName(null);
                list.get(i).setAge(0);
                flag = true;
                System.out.println("删除成功");
            }
        }
        if (!flag){
            System.out.println("不存在id为" + str + "的学生,删除失败");
        }
        return list;
    }
    public static ArrayList<Student> UpdateStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改学生id：");
        String str = sc.next();
        int temp = SearchStudent(list,str);
        if (temp == -1){
            System.out.println("该系统没有该学生信息，请先添加再修改");
            return list;
        }else {
            System.out.println("请输入要修改学生姓名：");
            String str2 = sc.next();
            System.out.println("请输入要修改学生年龄：");
            int age2 = sc.nextInt();
            list.get(temp).setName(str2);
            list.get(temp).setAge(age2);
            System.out.println("修改成功");
        }
        return list;
    }
    public static void InquireStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询学生id：");
        String str = sc.next();
        int temp = SearchStudent(list,str);
        if (temp == -1){
            System.out.println("未查询到该学生信息");
        }else {
            System.out.println("查询学生信息为 " + list.get(temp).getId() + ", " + list.get(temp).getName() + ", " + list.get(temp).getAge());
        }
    }
    public static int SearchStudent(ArrayList<Student> list,String str){
        if (list.size() == 0){
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (str.equals(list.get(i).getId())){
                return i;
            }
        }
        return -1;
    }

}
