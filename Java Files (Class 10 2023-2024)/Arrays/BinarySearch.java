import java.util.Scanner;

class BinarySearch{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int search = 4;
        int end = arr.length - 1;
        int start = 0;
        int mid = (start + end) / 2;

        while(start <= end){
            if(arr[mid] == search){
                System.out.println("Search element found at position " + mid);
                break;
            } else if(arr[mid] > search){
                end = mid - 1;
            } else if(arr[mid] < search){
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }

        if(start > end){
            System.out.println("Element not found.");
        }
    }
}