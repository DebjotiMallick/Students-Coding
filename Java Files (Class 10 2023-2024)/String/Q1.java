// Write a program to enter a letter. Change the case of the letter and display its ASCII code after changing the case.

import java.util.Scanner;

class Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char letter = sc.next().charAt(0);
        char changedLetter;

        if(Character.isUpperCase(letter) == true){
            changedLetter = Character.toLowerCase(letter);
            System.out.println("The lowercase of "+ letter+" is "+ changedLetter);
            
        } else{
            changedLetter = Character.toUpperCase(letter);
            System.out.println("The uppercase of "+ letter+" is "+ changedLetter);
        }
        System.out.println("The ASCII value of "+ changedLetter+" is "+ (int)changedLetter); // we get the ASCII code of any letter by typecasting it into integer
    }
}