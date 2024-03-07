import java.util.Scanner;

class LinearSearch{
    public static void main(String[] args){
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be stored in array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int num[] = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        System.out.println("Enter the number to be searched: ");
        int search = sc.nextInt();

        //linear search algorithm
        for(int i = 0; i < n; i++){
            if(search == num[i]){
                System.out.println("The number "+ search + " is found in the array.");
                flag = 1;
                break;
            }
        }

        if(flag == 0){
            System.out.println("Match not found.");
        }
    }

}