package cn.ruheyun.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2,5,7,13,21,16,19,1,0,3};
        QuickSorting(arr,0,arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void QuickSorting(int[] arr, int low, int high){
        if (low < high){
            int pivotpos = Parision(arr,low,high);
            QuickSorting(arr,low,pivotpos - 1);
            QuickSorting(arr,pivotpos + 1,high);
        }
    }

    public static int Parision(int[] arr, int low, int high){
        int pivot = arr[low];
        while (low < high){
            while (low < high && arr[high] >= pivot) {
                high--;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= pivot){
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = pivot;
        return low;
    }
}
