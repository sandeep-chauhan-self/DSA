package DSA.InterviewQuestions;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
                int[] arr = {9,8,7,6,5,4,3,2,1,0};
        sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int s, int e) {
        int m = s + (e - s)/2;
        if(e-s == 1) return;
        sort(arr, s, m);
        sort(arr, m, e);

        merge(arr,s,m,e);

    }

    private static void merge(int[] arr, int s, int m, int e) {
        for (int i = s; i < e; i++) {
            for (int j = s+1; j < e; j++) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j-1, j);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
