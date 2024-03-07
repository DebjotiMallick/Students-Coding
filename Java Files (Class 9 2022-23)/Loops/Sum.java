// You want to calculate the sum of all positive even numbers and the sum of all negative odd numbers from a set of numbers. You can enter zero to quit the program (get out from
// the loop) and display the result. Write a program to perform the above task.

import java.util.Scanner;

class Sum{
    public static void main(String[] args){
        int n, sum1=0;
        int sum2=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number or zero to quit the program: "); // first time
        n = sc.nextInt(); // first time
        while (n != 0){
            if( n%2 == 0 && n > 0 ){
                sum1 = sum1 + n;
            }
            if( n%2 != 0 && n < 0 ){
                sum2 = sum2 + n;
            }
            System.out.print("Enter a number or zero to quit the program: "); // every time from second time onwards
            n = sc.nextInt();  // every time from second time onwards

        }
        System.out.print("The sum of positive even integers: " + sum1);
        System.out.print("The sum of negative odd integers: " + sum2);


    }
}