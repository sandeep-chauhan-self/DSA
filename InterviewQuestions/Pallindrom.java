package DSA.InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Pallindrom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String string = s.nextLine();
        System.out.println(pallindromUsingBuilder(string));
        System.out.println(pallindromUsingCharArray(string));
        System.out.println(pallindromUsingString(string));
        s.close();
    }

    private static boolean pallindromUsingBuilder(String string) {
        StringBuilder rev = new StringBuilder(string);
        String revString = rev.reverse().toString();
        if (string.equals(revString)) {
            return true;
        }

        return false;
    }

    private static boolean pallindromUsingCharArray(String string) {
        char[] charArray = string.toCharArray();

        for (int i = 0, j = charArray.length - 1; i <= j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        
        String revString = "";
        for (char c : charArray) {
            revString += c;
        }

        if (string.equals(revString)) {
            return true;
        }


        return false;
    }

    private static boolean pallindromUsingString(String string) {

        for (int i = 0, j= string.length() -1; i < j; i++, j--) {
            if (string.charAt(i) == string.charAt(j)) {
                continue;
            } else{
                return false;
            }
        }
        return true;
    }

}
