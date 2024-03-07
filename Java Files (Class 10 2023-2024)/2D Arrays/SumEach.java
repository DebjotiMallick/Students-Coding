/* Write a program to store the numbers in a 3 by 4 matrix in a Double Dimensional array. Find the sum of the numbers of each row and each column of the matrix using assignment statements. */

class SumEach{
    public static void main(String[] args){
        int arr[][] = {{27,80,55,44},{43,23,10,23},{9,10,11,12}};

        System.out.println("The sum of the elements of each row:");
        for(int i = 0; i < 3; i++){
            int sum = 0;
            for( int j = 0; j < 4;j++){
                sum += arr[i][j];
            }
            System.out.println("The sum of row " + (i+1) + " = " + sum);
        }     


        for(int i = 0; i < 4; i++){
            int sum = 0;
            for( int j = 0; j < 3;j++){
                sum += arr[j][i];
            }
            System.out.println("The sum of column " + (i+1) + " = " + sum);
        }    
    }
}