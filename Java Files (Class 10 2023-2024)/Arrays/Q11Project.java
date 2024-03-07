import java.util.Scanner;

class Q11Project{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.print("Enter the elements of the array: ");
        for(int i=0; i< 5; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        for(int i = 1; i < 5; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("The largest element of the array is "+ largest);

        int smallest = arr[0];
        for(int i = 1; i < 5; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("The smallest element of the array is "+ smallest);

        int sum = 0;
        for(int i = 0; i < 5; i++){
            sum += arr[i];
        }
        System.out.println("The sum of elements of the array is "+ sum);
    }
}