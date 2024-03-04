package DSA.HackerRank;

// https://www.hackerrank.com/challenges/java-arraylist/problem

import java.util.*;

public class Q2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<int[]> list = new ArrayList<>();
        ArrayList<int[]> list2 = new ArrayList<>();
        int inputCount = Integer.parseInt(s.nextLine());

        while (inputCount > 0) {
            inputCount--;
            String input = s.nextLine();
            String[] inputString = input.split(" ");
            int[] array = Arrays.stream(inputString).mapToInt(Integer::parseInt).toArray();
            list.add(array);
        }

        int outputCount = Integer.parseInt(s.nextLine());

        while (outputCount > 0) {
            outputCount--;
            String input = s.nextLine();
            String[] inputString = input.split(" ");
            int[] array = Arrays.stream(inputString).mapToInt(Integer::parseInt).toArray();
            list2.add(array);
        }

        for (int[] is : list2) {
            try {
                int[] value = list.get(is[0] - 1);
                System.out.println(value[is[1]]);

            } catch (Exception e) {
                System.out.println("ERROR!");
            }

        }

        s.close();
    }
}
