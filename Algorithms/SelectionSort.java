package DSA.Algorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        //int[] arr = { 1, 2, 57, 12, 4, 57, 1, 3, 8, 9, 0, 99, 99 };
        int[] arr = { 9, 28, 57, 86, 35, 4, 53, 2, -1, 0,-51,6,-20,-3,-41,-5,-6,-7,-8,-9,-10,-11,-12,-13,-14,-15,-16,-17,-18 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // in selection sort find max element or min element then place it at its position
    public static void sort(int[] arr) {
        int count = 0;
        int swap = 0;
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            int last = arr.length - i - 1;
            for (int j = 1; j <= last; j++) {
                count++;
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }

            // swap with last location
            swap++;
            int temp = arr[last];
            arr[last] = arr[max];
            arr[max] = temp;

            
        }
        System.out.println(count+" " + swap);


    }
}
