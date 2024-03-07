// WAP to accept 10 different numbers in an array and display the greatest and smallest number of the array elements.

import java.util.Scanner;

class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be stored: ");
        int n = sc.nextInt();
        int num[] = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        int max = num[0];
        int min = num[0];

        for(int i = 0; i < n; i++){
            if(num[i] > max){
                max = num[i];
            }
            if(num[i] < min){
                min = num[i];
            }
        }

        System.out.println("Max: "+ max + " Min: "+ min);
    }
}