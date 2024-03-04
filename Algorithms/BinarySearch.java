package DSA.Algorithms;

public class BinarySearch {

    public static void main(String[] args) {
        // int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int[] arr = { 0, 12, 23, 35, 41, 52, 64, 76, 88, 329 };
        int target = 329;
        System.out.println(search(arr, target));
    }

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (end >= start) {
            int middle = start + (end - start) / 2;

            if (arr[middle] > target) {
                end = middle - 1;
            } else if (arr[middle] < target) {
                start = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}
