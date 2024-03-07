/* Write a program to store the numbers in a 3 by 4 matrix in a Double Dimensional array. Find the highest and lowest numbers of the matrix using assignment statement. */

class MinMax{
    public static void main(String[] args){
        int arr[][] = {{27,80,55,44},{43,23,10,23},{9,10,11,12}};
        int min = arr[0][0];
        int max = arr[0][0];
        for(int i=0; i< 3; i++){
            for(int j=0; j< 4; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                }if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}