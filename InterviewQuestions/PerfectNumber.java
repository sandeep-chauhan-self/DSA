package DSA.InterviewQuestions;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(perfect(n));
        s.close();
    }

    private static int perfect(int n) {

        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            return sum;
        }

        return 0;
    }
}
