/* WAP to accept a word in an Single Dimensional Array (SDA). Arrange all the letters in ascending order. Display the new word.
Input: BLUEJ
Ouput: BEJLU */

import java.util.Scanner;

class SortChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char chr[] = new char[20];
        char temp;
        System.out.print("Enter the word: ");
        String word = sc.next();
        int len = word.length();
        for(int i=0; i<len; i++){
            chr[i] = word.charAt(i); // store char by char into the array for comparison
        }

        // bubble sort algo
        for(int i=0; i<len-1; i++){
            for(int j=i; j<len; j++){
                if(chr[i] > chr[j]){
                    temp = chr[i];
                    chr[i] = chr[j];
                    chr[j] = temp;
                }
            }
        }

        String sortedWord = "";
        for(int i = 0; i < len; i++){
            sortedWord += chr[i]; // rebuild the string from the char array
        }
        System.out.println("Sorted word is: " + sortedWord);
    }
}