package DSA.InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        System.out.println(fibonacci(number)); 
        long[] arr = fibonacciInteger(number); 
        System.out.println(Arrays.toString(arr));
        s.close();
    }

    private static String fibonacci(int number) {
        long a = 0;
        long b = 1;
        long c = 0;
        String fib = "";

        if(number <= 0){
            return "";
        } else if (number == 1) {
            fib = fib + a;
        } else{
            fib = fib + a + " " + b;
            for (int i = 2; i < number; i++) {
                c = a+b;
                a = b;
                b = c;
                fib = fib + " " + c;
            }
        }

        return fib;

    }

    private static long[] fibonacciInteger(int number) {
        long a = 0;
        long b = 1;
        long c = 0;
        String fib = "";

        if(number <= 0){
            return new long[0];
        } else if (number == 1) {
            fib = fib + a;
        } else if (number == 2) {
            fib = fib + a + " " + b;
        } else{
            fib = fib + a + " " + b;
            for (int i = 2; i < number; i++) {
                c = a+b;
                a = b;
                b = c;
                fib = fib + " " + c;
            }
        }

        String[] arr = fib.split(" ");
        long[] fibArray = Arrays.stream(arr).mapToLong(Long :: parseLong).toArray();
        return fibArray;

    }
}
