package cn.ruheyun.javastudy;

import java.util.Scanner;

public class demo_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位整数：");
        int abc = sc.nextInt();
        int c = abc % 10;
        int b = abc / 10 % 10;
        int a = abc / 100 % 10;
        System.out.println("个位" + c + "    十位" + b + "    百位" + a);
    }
}
