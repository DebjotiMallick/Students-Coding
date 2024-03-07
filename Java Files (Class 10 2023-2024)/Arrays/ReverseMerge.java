// input: a[3] = {2,3,4} and b[2] = {5,6}
// output: result[] = {5,6,2,3,4}

import java.util.Scanner;

class ReverseMerge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements to store in array 1: ");
        int n1 = sc.nextInt();
        int array1[] = new int[n1];

        System.out.print("Enter the number of elements to store in array 2: ");
        int n2 = sc.nextInt();
        int array2[] = new int[n2];

        System.out.print("Enter the elements to store in array 1: ");
        for(int i = 0; i < n1; i++){
            array1[i] = sc.nextInt();
        }

        System.out.print("Enter the elements to store in array 2: ");
        for(int i = 0; i < n2; i++){
            array2[i] = sc.nextInt();
        }

        int merged[] = new int[n1+n2];
        
        for(int j = 0; j < n2; j++){
            merged[j] = array2[j];
        }
        for(int k = n2; k < (n1+n2); k++){
            merged[k] = array1[k-n2];
        }

        System.out.print("Merged array in reverse: ");
        for(int i = 0; i < (n1+n2); i++){
            System.out.print(merged[i] + " ");
        }
        
    }
}