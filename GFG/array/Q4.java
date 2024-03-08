package DSA.GFG.array;

import java.util.ArrayList;
import java.util.List;

public class Q4 {

    public static void findSubarrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            List<Integer> subarray = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                subarray.add(arr[j]);
                System.out.println(subarray.toString());
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        findSubarrays(arr);
    }
}

