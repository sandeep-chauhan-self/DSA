package DSA.Algorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 57, 12, 4, 57, 1, 3, 8, 9, 0, 99, 99 };

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // in selection sort find max element or min element then place it at its position
    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            int last = arr.length - i - 1;
            for (int j = 1; j <= last; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }

            // swap with last location
            int temp = arr[last];
            arr[last] = arr[max];
            arr[max] = temp;
        }

    }
}
