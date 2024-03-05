package DSA.Algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        // int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 4;
        sort(arr, target);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swapped = true;
                    swap(arr, j, j - 1);
                }
            }

            if (!swapped)
                break;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
