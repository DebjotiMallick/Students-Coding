/* Write a program to accept a new string and change the case of each letter of the string. Display the new string.
Input: heLLo WOrlD
Output: HEllO woRLd
*/

import java.util.Scanner;

class Q6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String line = sc.nextLine();
        int len = line.length();
        String newLine = "";
        char ch,ch1;
        for (int i = 0; i < len; i++){
            ch = line.charAt(i); // picks character from string by index 
            if(ch>='a' && ch<='z'){ // checks if the character is lowercase 
                ch1 = Character.toUpperCase(ch); // converts it to uppercase
                newLine = newLine + ch1; // add the character to the new string
            } else if(ch>='A' && ch<='Z'){ // checks if the character is uppercase 
                ch1 = Character.toLowerCase(ch); // converts it to lowercase
                newLine = newLine + ch1; // add the character to the new string
            } else {
                ch1 = ch; // when we get space, we take as it is and store in new string
                newLine = newLine + ch1; // add the character to the new string
            }
        }
        System.out.println("The new string is " + newLine);
    }   
}