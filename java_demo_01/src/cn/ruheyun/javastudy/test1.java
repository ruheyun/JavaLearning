package cn.ruheyun.javastudy;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价，月份，头等舱或者经济舱：");
        double price = sc.nextDouble();
        int month = sc.nextInt();
        int tape = sc.nextInt();
        if (month < 1 || month > 12){
            System.out.println("输入月份错误！！！");
        } else if (month >= 5 && month <= 10) {
            if (tape == 0){
                System.out.println(price * 0.9);
            }else {
                System.out.println(price * 0.85);
            }
        }else {
            if (tape == 0){
                System.out.println(price * 0.7);
            }else {
                System.out.println(price * 0.65);
            }
        }
    }
}
