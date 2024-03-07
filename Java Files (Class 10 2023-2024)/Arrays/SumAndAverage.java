/* WAP to input a few numbers from users, store them in array and find the sum and average of those numbers.*/

import java.util.Scanner;

class SumAndAverage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements to enter: ");
        int n = sc.nextInt();
        int nums[] = new int[n]; // 
        
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int sum = 0;
        double average = 0.0;
        for(int i = 0; i < n; i++){
            sum = sum + nums[i];
        }
        average = (double) sum / n;
        System.out.println("Sum: " + sum + " Average: " + average);
    }
}