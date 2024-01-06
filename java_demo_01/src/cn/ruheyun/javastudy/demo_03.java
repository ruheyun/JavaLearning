package cn.ruheyun.javastudy;

public class demo_03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int[] arr1 = copyOfRange(arr,2,7);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int temp = to - from;
        int[] arr1 = new int[temp];
        for (int i = 0; i < temp; i++) {
            arr1[i] = arr[from++];
        }
        return arr1;
    }
}
