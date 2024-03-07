// WAP to insert an element in an array.
// Original array: 1245
// Modified array: 12345

import java.util.Scanner;

class Insert{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[50]; 

        System.out.println("Enter number of elements to insert: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to be inserted: ");
        int num = sc.nextInt();
        System.out.print("Enter the position/index of insertion: ");
        int pos = sc.nextInt();

        for(int i = n-1; i >= pos; i--){
            arr[i+1] = arr[i]; // shifts every element by one index to the right, starting from end
        }
        arr[pos] = num;

        for(int i = 0; i < n+1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}