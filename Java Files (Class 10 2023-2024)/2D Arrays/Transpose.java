/* Rows become columns, i.e. Transpose
1 2 3
4 5 6
7 8 9

Transpose:
1 4 7
2 5 8
3 6 9
*/

class Transpose{
    public static void main(String[] args){
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int arr_trans[][] = new int[4][4];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                arr_trans[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr_trans[i][j]+ " ");
            }
            System.out.println();
        }
    }
}