package DSA.InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String stringA = s.nextLine();
        String stringB = s.nextLine();
        System.out.println(anagram(stringA, stringB));
        s.close();
    }

    private static boolean anagram(String stringA, String stringB) {

        char[] charA = stringA.toLowerCase().toCharArray();
        char[] charB = stringB.toLowerCase().toCharArray();
        
        if (stringA.length() != stringB.length()) {
            return false;
        } else{
            Arrays.sort(charA);
            Arrays.sort(charB);
            return Arrays.equals(charA, charB);
        }
    }
}
