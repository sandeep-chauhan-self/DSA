package DSA.Algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 57, 12, 4, 57, 1, 3, 8, 9, 0,99,99 };
        //int[] arr = { 1, 2, 3,4,5,6,7,8,9 };

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int count = 0;
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 1; j < arr.length - i; j++) {
                count++;
                if (arr[j] < arr[j - 1]) {
                    // swap logic
                    
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println(count);
    }
}
