package DSA.Algorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int s, int e) {
        if(s >= e) return;
        int low = s;
        int high = e;
        int m = s + (e - s) / 2;
        int pivot = arr[m];

        while (low <= high) {
            while (arr[low] < pivot) {
                low++;
            }
            while (arr[high] > pivot) {
                high--;
            }

            if (low <= high) {
                swap(arr, low, high);
                low++;
                high--;
            }
        }

        sort(arr, s, high);
        sort(arr, low, e);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
