// Ceaser Cipher Encryption

import java.util.Scanner;

class Q10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word to encrypt: ");
        String word = sc.next();
        word = word.toLowerCase();
        System.out.print("Enter the shift: ");
        int shift = sc.nextInt();
        
        String enc_word = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int len = word.length();
        char ch, ch1;
        int i, index, shifted_index;

        for(i = 0; i < len; i++){
            ch = word.charAt(i); // pick char from given input
            index = alphabet.indexOf(ch); // get the index of that char from alphabet series
            shifted_index = (index + shift) % 26; // calculate the shifted index by adding shift amount
            ch1 = alphabet.charAt(shifted_index); // get the char at the new index from alphabet series
            enc_word = enc_word + ch1; // build the encrypted word
        }

        System.out.println("The encrypted word is: " + enc_word);


    }
}