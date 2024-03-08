package DSA.HackerRank;

import java.util.*;

// https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true

public class Q4 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String input = s.nextLine();
        s.close();
        String[] inputString = input.split(" ");
        int[] inputArray = Arrays.stream(inputString).mapToInt(Integer::parseInt).toArray();
        int count = countOfNegativeSubArrays(inputArray, n);
        System.out.println(count);

    }

    private static int countOfNegativeSubArrays(int[] inputArray, int len) {
        int count = 0;
        for (int i = 0; i < len; i++) {
            ArrayList<Integer> subarr = new ArrayList<>();
            for (int j = i; j < len; j++) {
                subarr.add(inputArray[j]);
                if (sum(subarr) < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int sum(ArrayList<Integer> subarr) {
        int sum = 0;
        for (int i : subarr) {
            sum += i;
        }
        return sum;
    }
}