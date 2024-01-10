package com.leetcode.practice01;

public class code01 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,3};
        int target = 6;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    System.out.println("[" + i + "," + j + "]");
                }
            }
        }
    }
}
