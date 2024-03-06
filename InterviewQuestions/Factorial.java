package DSA.InterviewQuestions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(fact(num));
        s.close();
    }

    private static long fact(int num) {
        long fact = 1;
        if (num == 0)
            return 1;
        if (num < 0)
            return -1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        return fact;
    }
}
