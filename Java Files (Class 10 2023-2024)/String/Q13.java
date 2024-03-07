/* WAP to accept a name containing three words and display the surname first, followed by the first and middle names.
Input: Ram Chandra Das
Output: Das Ram Chandra
*/

import java.util.Scanner;

class Q13{
   public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a 3 word name:");
        String s = sc.nextLine();

        int last=s.lastIndexOf(" ");
        String newword = s.substring(last+1) + " " + s.substring(0,last);

        System.out.println(newword);
    }
}