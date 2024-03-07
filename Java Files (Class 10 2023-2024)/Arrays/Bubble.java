import java.util.Scanner;

class Bubble{
    public static void main(String[] args){
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be stored in array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int num[] = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        int len = num.length;

        Bubble sort algo 1
        for (int i = 0; i < len-1; i++){
            for (int j = 0; j < len-i-1; j++){
                if (num[j] > num[j+1]) //comparing the pair of elements
                {
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }

        System.out.print("The sorted array is: ");
        for(int i = 0; i < n; i++){
            System.out.print(num[i] + " ");
        }
    }
}