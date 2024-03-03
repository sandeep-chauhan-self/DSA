package DSA.GFG.array;
/*
 * Q2 - Best Time to Buy and Sell Stock
 * 
 * Given an array prices[] of length N, representing the prices of the stocks on different days,
 * the task is to find the maximum profit possible by buying and selling the stocks on different days 
 * when at most one transaction is allowed.

 * Note: Stock must be bought before being sold.

 * Examples:

 * Input: prices[] = {7, 1, 5, 3, 6, 4}
 * Output: 5
 * Explanation:
 * The lowest price of the stock is on the 2nd day, i.e. price = 1. Starting from the 2nd day, 
 * the highest price of the stock is witnessed on the 5th day, i.e. price = 6. 
 * Therefore, maximum possible profit = 6 – 1 = 5. 

 * Input: prices[] = {7, 6, 4, 3, 1} 
 * Output: 0
 * Explanation: Since the array is in decreasing order, no possible way exists to solve the problem
 */

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("enter array string");
        String input = s.nextLine();
        String[] inputString = input.split(" ");

        int[] inputArray = Arrays.stream(inputString).mapToInt(Integer :: parseInt).toArray();
        int maxProfit = 0;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i; j < inputArray.length; j++) {
                if(inputArray[j] - inputArray[i] > maxProfit){
                    maxProfit = inputArray[j] - inputArray[i];
                }
            }
        }

        System.out.println("Max profit is: " + maxProfit);

        s.close();
    }
}
