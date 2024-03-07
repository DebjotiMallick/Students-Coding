/* WAP to enter a word and check if it is palindrome or not.
Input: dad
Output: Palindrome
*/

import java.util.Scanner;

class Q9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();
        int len = word.length();
        int i;
        char ch;
        String word1 = "";

        // for(i = len - 1; i >= 0; i--){
        //     ch = word.charAt(i);
        //     word1 = word1 + ch;
        // }

        i = len - 1;
        while(i >= 0){
            ch = word.charAt(i);
            word1 = word1 + ch;
            i--;
        }

        if(word.equals(word1)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}