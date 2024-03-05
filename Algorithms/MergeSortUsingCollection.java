package DSA.Algorithms;

import java.util.Arrays;

public class MergeSortUsingCollection {
    public static void main(String[] args) {
       // int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
       int[] arr = { 9, 28, 57, 86, 35, 4, 53, 2, -1, 0, -51, 6, -20, -3, -41, -5, -6, -7, -8, -9, -10, -11, -12, -13,
        -14, -15, -16, -17, -18 };
        int [] sortedArr = sort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    private static int[] sort(int[] arr) {

        if (arr.length == 1) {
            return arr;
        }
        int m = arr.length / 2;

        int[] left = sort(Arrays.copyOfRange(arr, 0, m));
        int[] right = sort(Arrays.copyOfRange(arr, m, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int l = left.length + right.length;
        int[] arr = new int[l];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                k++;
                i++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }

        }

        if (i == left.length) {
            for (int k2 = j; k2 < right.length; k2++) {
                arr[k] = right[k2];
                k++;
            }
        } else{
            for (int k2 = i; k2 < left.length; k2++) {
                arr[k] = left[k2];
                k++;
            }
        }
        return arr;
    }
}
