package DSA.InterviewQuestions;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(gcd(a, b));
        s.close();
    }

    private static int gcd(int a, int b) {

        int n  = a>b?b:a;

        

        return 0;
    }
}
