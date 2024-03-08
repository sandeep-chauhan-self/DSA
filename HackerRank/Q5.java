package DSA.HackerRank;

import java.util.*;

// Better Approach to achieve below question then in Q4.java
// https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true

public class Q5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String[] inputString = s.nextLine().split(" ");
        int[] inputArray = Arrays.stream(inputString).mapToInt(Integer::parseInt).toArray();
        int count = countOfNegativeSubArrays(inputArray, n);
        System.out.println(count);
        s.close();
        
    }

    private static int countOfNegativeSubArrays(int[] inputArray, int len) {
        int count = 0;
        for (int i = 0; i < len; i++) {
            int sum = 0;
            ArrayList<Integer> subarr = new ArrayList<>();
            for (int j = i; j < len; j++) {
                subarr.add(inputArray[j]);
                sum += inputArray[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        return count;
    }

}