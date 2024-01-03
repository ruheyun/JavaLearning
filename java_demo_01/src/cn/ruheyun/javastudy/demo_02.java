package cn.ruheyun.javastudy;

import java.util.Random;

public class demo_02 {
    public static void main(String[] args) {
        Random r = new Random();
        int sum = 0;
        int average = 0;
        int count = 0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100) + 1;
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (i == array.length - 1){
                average = sum / array.length;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < average){
                count++;
            }
        }
        System.out.println("和为" + sum + "    平均数为" + average + "    小于平均数个数为" + count);
    }
}
