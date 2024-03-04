package DSA.HackerRank;

// https://www.hackerrank.com/challenges/pattern-syntax-checker/problem

import java.util.Scanner;
import java.util.regex.*;

public class Q1
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
            testCases--;
            try{
                Pattern p = Pattern.compile(pattern);
                if (p != null){
                System.out.println("Valid");        
                }
            } catch(Exception e){
                System.out.println("Invalid");
            }
              
		}
        in.close();
	}
}



