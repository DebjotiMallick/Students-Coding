/* Write a program to accept a word in lower case and display the new word after removing all the repeated letters.
Input: application
Output: aplicton
*/

import java.util.Scanner;

class Q8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = sc.next();
        String s2 = "";
        int i,j, flag=0;
        char ch1, ch2;
        int len = s1.length();

        for(i = 0; i < len; i++){
            flag = 0;
            ch1 = s1.charAt(i); // pick char from given string
            for(j = 0; j < s2.length(); j++){ // iterates over new string to check
                ch2 = s2.charAt(j); // pick char from new string
                if(ch1 == ch2){ // checks if both the char are equal
                    flag = 1; // if equal, make flag 1
                }
            }

            if(flag == 0){ // if we never got any equal char, then insert the current char we have
                s2 = s2 + ch1; // stores the character into the new string s2
            }
        }

        System.out.println("New string is "+ s2);



    }
}