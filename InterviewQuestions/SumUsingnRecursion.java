package DSA.InterviewQuestions;

import java.util.Scanner;

public class SumUsingnRecursion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(sumUsingRecursion(num));
        s.close();
    }

    private static int sumUsingRecursion(int num) {
        if (num == 0) {
            return 0;
        }
        return num + sumUsingRecursion(num - 1);
    }
}
