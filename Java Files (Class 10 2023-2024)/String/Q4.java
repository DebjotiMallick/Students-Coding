// Write a program to print the pattern.
/* Input: CLASS
Output: CLASS
         CLAS
          CLA
           CL
            C
*/

import java.util.Scanner;

class Q4{
    public static void main(String[] args){
        int i,j,space=0; // i for space, j for character, space for number of blanks
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();
        int len = word.length(); // counts the number of characters in the string
        System.out.println("The pattern:");
        for(j = len; j >=0 ; j--){ // j starts from the end, loops to the beginning
            for(i = 0; i < space; i++){ // i starts from the beginning, loops to max spaces
                System.out.print(" ");
            }
            System.out.println(word.substring(0,j)); 
            space++;
        }
    }
}