package DSA.Algorithms;

import java.util.Arrays;

public class TimSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int m = s + (e - s) / 2;
        sort(arr, s, m);
        sort(arr, m, e);
        insertion(arr, s, m, e);
    }

    private static void insertion(int[] arr, int s, int m, int e) {
        for (int i = s + 1; i < e; i++) {
            for (int j = i; j > s; j--) {
                if (arr[j] >= arr[j - 1]) {
                    break;
                } else {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
