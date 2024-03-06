package DSA.InterviewQuestions;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        System.out.println(reverse1(number));
        System.out.println(reverse2(number));
        s.close();

    }

    private static int reverse1(int num) {
        int number = num;
        boolean neg = false;
        int rev = 0;
        if (number == 0)
            return 0;
        else if (number < 0) {
            number = Math.abs(number);
            neg = true;
        }
        while (number > 0) {
            rev = rev * 10 + number % 10;
            number /= 10;
        }

        if (neg) {
            return rev - 2 * rev;
        }
        return rev;
    }

    private static int reverse2(int num) {
        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        return rev;

    }

}
