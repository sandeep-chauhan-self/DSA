package DSA.Algorithms;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 57, 12, 4, 57, 1, 3, 8, 9, 0, 99, 99 };

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // insertion sort
    private static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
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
