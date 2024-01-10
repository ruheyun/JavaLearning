package cn.ruheyun.teststudy6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sum <= 200){
            System.out.println("请输入1-100的整数：");
            String str = sc.nextLine();
            if (str.matches("[1-9]\\d{0,1}|100")){
                int num = Integer.parseInt(str);
                arr.add(num);
                sum += num;
                continue;
            }
            System.out.println("输入错误");
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
