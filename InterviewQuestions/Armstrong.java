package DSA.InterviewQuestions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(armNum(num));
        s.close();
    }

    private static boolean armNum(int num) {

        String s = num + "";
        int len = s.length();
        int sum = 0;
        int temp = num;

        while (num != 0) {
            sum += Math.pow(num % 10, len);
            num /= 10;
        }

        if (sum == temp) {
            return true;
        }

        return false;
    }
}
