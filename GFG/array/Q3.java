package DSA.GFG.array;
import java.util.*;

/*
 * Q3 - Find duplicates in O(n) time and O(1) extra space
 * Given an array of n elements that contains elements from 0 to n-1, with any of these numbers appearing any number of times.
 * Find these repeating numbers in O(n) and use only constant memory space.
 * Note: The repeating element should be printed only once.
 * 
 * Example: 
 * Input: n=7 , array[]={1, 2, 3, 6, 3, 6, 1}
 * Output: 1, 3, 6
 * 
 * Explanation: The numbers 1 , 3 and 6 appears more than once in the array.
 * Input : n = 5 and array[] = {1, 2, 3, 4 ,3}
 * Output: 3
 * Explanation: The number 3 appears more than once in the array.
 */

public class Q3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
    
        String[] stringArray = input.split(" ");
        int[] array = Arrays.stream(stringArray).mapToInt(Integer :: parseInt).toArray();

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> anotherSet = new HashSet<>();

        for(int i : array){
            if(set.contains(i)) anotherSet.add(i);
            else set.add(i);
        }

        for (Integer ele : anotherSet) {     
            System.out.print(ele + ", ");
        }
        s.close();
    }

}
