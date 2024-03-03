/*
* Q1 - Check if pair with given Sum exists in Array (Two Sum)

* explanation :-

Given an array A[] of n numbers and another number x, the task is to check whether or not there exist two elements in A[] whose sum is exactly x. 

Examples: 

Input: arr[] = {0, -1, 2, -3, 1}, x= -2
Output: Yes
Explanation:  If we calculate the sum of the output,1 + (-3) = -2
Input: arr[] = {1, -2, 1, 0, 5}, x = 0
Output: No

*/

package DSA.GFG.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Array");
        String input = s.nextLine();
        System.out.println("Enter number");
        int number = s.nextInt();
        String[] stringArray = input.split(" ");
        int[] inputArray = Arrays.stream(stringArray).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i; j < inputArray.length; j++) {
                if(inputArray[i] + inputArray[j] == number){
                    System.out.println("YES");
                    s.close();
                    System.exit(1);
                }
            }
        }

        System.out.println("NO");
        s.close();

    }
}