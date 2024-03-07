import java.util.Scanner;

class RemoveElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements to store in array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter position to delete from array: "); // this indicates the term, so if user enters 3, means 3rd term or 2nd index
        int pos = sc.nextInt();
        for(int i = pos-1; i < n-1; i++){
            arr[i] = arr[i+1]; // we are overwriting each element with the next element, starting from pos-1, thus deleting the element at pos-1
        }
        n--; // as one element has been deleted, array size should be reduced by 1
        System.out.print("Array after deletion: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}