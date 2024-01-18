package cn.ruheyun.sort;

public class SimpleSelectionSort {
    public static void main(String[] args) {
//        简单选择排序
        int[] arr = {2,5,7,13,21,16,19,1,0,3};
        InsertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void InsertSort(int[] arr){
        int i,j,temp;
        for (i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]){
                temp = arr[i];
                for (j = i-1; j >= 0 && arr[j] > temp; j--) {
                    arr[j+1] = arr[j];
                }
                arr[j+1] = temp;
            }
        }
    }
}
