package DSA.GFG.String;
// pallindrom
public class Q1 {
    
public static void main(String[] args) {
    //String s = "nitin";
   // String s = "not pallendrom";
    int s = 1234564321;


    StringBuilder builder = new StringBuilder(s + "");
    String reverseString = builder.reverse().toString();

    System.out.println(reverseString.equals(s + "") ? "Pallindrom" : "not a pallindrom");
    
}


}
