package cn.ruheyun.sort;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(RecursionNumber(number));
    }
    public static int RecursionNumber(int number){
        if (number == 1){
            return 1;
        }
        return number*RecursionNumber(number - 1);
    }
}
