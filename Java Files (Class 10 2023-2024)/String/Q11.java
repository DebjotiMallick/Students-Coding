// Ceaser Cipher Decryption

import java.util.Scanner;

class Q11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word to decrypt: ");
        String word = sc.next();
        word = word.toLowerCase();
        System.out.print("Enter the shift: ");
        int shift = sc.nextInt();
        
        String dcr_word = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int len = word.length();
        char ch, ch1;
        int i, index, shifted_index;

        for(i = 0; i < len; i++){
            ch = word.charAt(i); // pick char from given input
            index = alphabet.indexOf(ch); // get the index of that char from alphabet series
            shifted_index = index - shift; // calculate the shifted index by adding shift amount
            if(shifted_index < 0){
                shifted_index += 26;
            }
            ch1 = alphabet.charAt(shifted_index); // get the char at the new index from alphabet series
            dcr_word = dcr_word + ch1; // build the decrypted word
        }

        System.out.println("The decrypted word is: " + dcr_word);


    }
}