package cn.ruheyun.teststudy2;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[3];
        Student stu1 = new Student("2001","张三",20);
        Student stu2 = new Student("2002","李四",21);
        arr[0] = stu1;
        arr[1] = stu2;
        System.out.println("==============================");
        Student stu3 = new Student();
        while (true){
            System.out.println("请输入学号：");
            String studentId = sc.next();
            boolean flag = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (studentId.equals(arr[i].getStudentId())){
                    flag = false;
                    System.out.print("学号重复，");
                    break;
                }
            }
            if (flag){
                stu3.setStudentId(studentId);
                break;
            }
        }
        System.out.println("请输入姓名：");
        stu3.setName(sc.next());
        System.out.println("请输入年龄：");
        stu3.setAge(sc.nextInt());
        System.out.println("==============================");
        arr[2] = stu3;
        for (int i = 0; i < arr.length; i++) {
            arr[i].printStudent();
        }
        System.out.println("==============================");
        System.out.println("请输入要删除的学生id：");
        int id = sc.nextInt();
        if (id >= 0 && id <= 2){
            arr[id].setStudentId(null);
            arr[id].setName(null);
            arr[id].setAge(0);
        }else {
            System.out.println("删除失败");
        }
        System.out.println("==============================");
        for (int i = 0; i < arr.length; i++) {
            arr[i].printStudent();
        }
        System.out.println("==============================");

    }
}
