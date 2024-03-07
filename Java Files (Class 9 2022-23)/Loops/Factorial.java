// Write a program to find the factorial of a number entered by user
// Factorial of 5: 5! = 5 * 4 * 3 * 2 * 1; (Multiplication starts at the given number, ends at 1)

import java.util.Scanner;
class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find factorial: ");
        int num = sc.nextInt();
        int i = 0;
        int product = 1;
        for(i = num; i >= 1; i--){
            product = product * i;
        }

        System.out.println("Factorial of "+ num + " is "+ product);
    }
}