// Write a program to print the pattern.
/* Input: CLASS
Output: C
        L
        A
        S
        S
*/

import java.util.Scanner;

class Q2{
    public static void main(String[] args){
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();
        int len = word.length(); // counts the number of characters in the string
        System.out.println("The pattern:");
        for(i= 0; i < len; i++){
            System.out.println(word.charAt(i)); // prints the character at 'i'th index
        }
    }
}