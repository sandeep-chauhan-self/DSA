package DSA.Algorithms;

public class BinarySearchUsingRecursion {

    public static void main(String[] args) {
        // int[] a = {0,1,2,3,4,5,6,7,8,9};
        int[] a = { 0, 12, 23, 35, 41, 52, 64, 76, 88, 329 };
        int t = 76;
        System.out.println(search(a, t, 0, a.length - 1));
    }

    public static int search(int[] a, int t, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;
        if (a[m] == t) {
            return m;
        }

        if (a[m] > t) {
            return search(a, t, s, m - 1);
        } else {
            return search(a, t, m + 1, e);
        }

    }
}
