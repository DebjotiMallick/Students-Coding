// WAP to delete an element from an array of

// Original array: 12345
// Modified array: 1245

import java.util.Scanner;

class Delete{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[50]; 

        System.out.println("Enter number of elements to insert: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the position/index of deletion: ");
        int pos = sc.nextInt();

        // algo for deletion
        for(int i = pos; i < n-1; i++){
            arr[i] = arr[i+1]; // shifts every element by one index to the right, starting from end
        }

        // to print the array
        for(int i = 0; i < n-1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}