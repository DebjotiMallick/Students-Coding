/* Write a program to store the numbers in a 3 by 4 matrix in a Double Dimensional array. Find the sum of all the numbers in the matrix and display the result using assignment statements. */

class SumAll{
    public static void main(String[] args){
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int sum = 0;
        for(int i=0; i< 3; i++){
            for(int j=0; j< 4; j++){
                sum += arr[i][j];
            }
        }

        System.out.println("Sum of all numbers in a 3 by 4 matrix: " + sum);
    }
}