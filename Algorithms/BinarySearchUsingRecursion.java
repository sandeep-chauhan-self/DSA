package DSA.Algorithms;

public class BinarySearchUsingRecursion {
    
    public static void main(String[] args) {
        // int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int[] arr = {0,12,23,35,41,52,64,76,88,329};
        int target = 76;
        System.out.println(search(arr, target, 0, arr.length - 1)); 
    }

    public static int search (int[] arr, int target, int start, int end){
        if (end <= start){
            return -1;
        }

        int medium = (end + start) / 2;
        int value = arr[medium];
        if (value == target){
            return medium;
        }

        if (value > target){
            end = medium - 1;
            return search(arr, target, start, end);
        } else {
            start = medium + 1;
            return search(arr, target, start, end);    
        }

    }
}
