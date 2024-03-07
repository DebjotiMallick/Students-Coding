// WAP to merge to arrays and create a third array and print it
// 1st array: 1 2 3
// 2nd array: 4 5 6
// Merged array: 1 2 3 4 5 6

import java.util.Scanner;

class Merging{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements for array1: ");
        int n = sc.nextInt();
        System.out.println("Enter number of elements for array2: ");
        int m = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[m];
        int arr3[] = new int[n+m];

        System.out.println("Enter the elements for 1st array: ");
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements for 2nd array: ");
        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }

        // merge algo
        for(int i = 0; i < n; i++){
            arr3[i] = arr1[i]; // storing elements of the first array into final array
        }
        for(int i = 0; i < m; i++){
            arr3[n+i] = arr2[i]; // storing elements of the second array into final array
        }

        System.out.print("Merged array: ");
        for(int i=0; i < n+m; i++){
            System.out.print(arr3[i] + " ");
        }
    }
}