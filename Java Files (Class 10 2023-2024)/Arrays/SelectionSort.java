/* 5 3 6 2 8
   2 3 6 5 8
   2 3 6 5 8
   2 3 5 6 8
*/
import java.util.Scanner;

class SelectionSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j,min,temp;
        int num[] = new int[5];
        System.out.print("Enter the numbers: ");
        for (i = 0; i < 5; i++){
            num[i] = sc.nextInt();
        }

        // algo for selection sort
        for(i = 0; i < 4; i++){
            min=i;
            for(j = i+1; j < 5; j++){
                if(num[j] < num[min]){
                    min = j;
                }
            }
            temp = num[i];
            num[i] = num[min];
            num[min] = temp;
        }
        System.out.println("Numbers arranged in ascending order using Selection Sort: ");
        for(i = 0; i < 5; i++)
            System.out.println(num[i]);
    }
}