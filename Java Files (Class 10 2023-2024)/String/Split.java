import java.util.Scanner;

public class Split
{
   public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a sentence:");
       String str = in.nextLine();
       str = str.toUpperCase();
       str += " ";
       int len = str.length();
       
       String word = "";
       for (int i = 0; i < len; i++) {
           char ch = str.charAt(i);
           if (ch != ' ')   {
               word = word + ch;
           }
           else {
               System.out.println(word);
               word = "";               
           }
       }
    }
}