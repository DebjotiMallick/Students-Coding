/* Accept numbers into an array of size 4X4. Then display the diagonals and also display the sum of numbers present in the diagonal position. 
1 2 3 4
5 6 7 8
9 1 2 3
4 5 6 7
Left/primary diagonal = 1 6 2 7
Right/secondary diagonal = 4 7 1 4
i = 0 1 2 3
j = 3 2 1 0
j = 3 - i
*/

class SumOfDiagonals{
    public static void main(String[] args){
        int sum1=0, sum2=0;
        System.out.print("Left diagonals: ");
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for (int i = 0; i < 4; i++){
            System.out.print(arr[i][i] + " ");
            sum1 += arr[i][i];
        }
        System.out.print("Sum of left diagonal: "+ sum1);
        System.out.println();
        System.out.print("Right diagonals: ");
        for (int i = 0; i < 4; i++){
            System.out.print(arr[i][3-i]+ " ");
            sum2 += arr[i][3-i];
        }
        System.out.print("Sum of right diagonal: "+ sum2);
    }
}