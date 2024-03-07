/* WAP to input a string and print all the palindrome words present in the string.
Input: MOM AND DAD ARE NOT AT HOME
Output: MOM
        DAD
*/

import java.util.Scanner;

class Q15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        String word = " ";
        s = " " + s + " ";
        int len = s.length();
        int index = 0;
        for (int i = 0; i < len-1; i++){
            index = i+1;
            if (s.charAt(i) == ' '){ // if we encounter space, that means a word starts from the next position
                while(s.charAt(index) != ' '){ // till we get the next space, we increase index by 1
                    index++;
                }
                word = s.substring(i+1, index); // extract the word

                // Reverse the string
                int lenWord = word.length();
                String word1 = "";
                char ch;
                int j = lenWord - 1;
                while(j >= 0){
                    ch = word.charAt(j);
                    word1 = word1 + ch;
                    j--;
                }
                
                // Check if palindrome
                if(word.equals(word1)){
                    System.out.println(word);
                }
            }
        }

    }
}