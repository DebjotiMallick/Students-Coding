// WAP to store 10 different numbers in an array and i) display all the numbers in reverse order ii) display the sum and average of the numbers
// {10,2,3,6,7} -> {7,6,3,2,10}

import java.util.Scanner;

class Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = 10;
        int nums[] = new int[n];
        
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Elements in reverse order: ");
        for(int i = n-1; i >= 0; i--){
            System.out.print(nums[i] + " ");
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