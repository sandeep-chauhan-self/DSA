package DSA.InterviewQuestions;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int gcd = gcd(a, b);
        int lcm = a * b / gcd;

        System.out.println(lcm);

        s.close();
    }

    public static int gcd(int a, int b) { 
        int n = a > b ? b : a;

        while (n > 0) {
            if (a % n == 0 && b % n == 0) {
                return n;
            } else {
                n--;
            }
        }
        return 1;
    }

}