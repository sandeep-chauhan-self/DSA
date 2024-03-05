package DSA.Algorithms;

public class AsortBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        // int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 4;
        System.out.println(search(arr, target));
    }

    public static int search(int[] arr, int target) {

        if (arr[0] < arr[arr.length - 1]) {
            return ascendingSort(arr, target);
        } else {
            return descendingSort(arr, target);
        }

    }

    private static int ascendingSort(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (end >= start) {
            int medium = start + (end - start) / 2;

            if (arr[medium] > target) {
                end = medium - 1;
            } else if (arr[medium] < target) {
                start = medium + 1;
            } else {
                return medium;
            }
        }

        return -1;
    }

    private static int descendingSort(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (end >= start) {
            int medium = start + (end - start) / 2;

            if (arr[medium] < target) {
                end = medium - 1;
            } else if (arr[medium] > target) {
                start = medium + 1;
            } else {
                return medium;
            }
        }

        return -1;
    }

}
