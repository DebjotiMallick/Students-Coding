import java.util.Scanner;

class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int rem, num, newN = 0;

        System.out.print("Enter the number: ");
        num = sc.nextInt();
        int temp = num;

        // Main logic of reversing a number
        while(num != 0){
            rem = num % 10; // Take the last digit of given number
            newN = newN * 10 + rem; // Generate new number by multiplying prev num by 10 and adding current remainder
            num = num / 10; // Decreasing given number by one digit from end
        }

        if(newN == temp){
            System.out.println("The given number "+ temp + " is a palindrome number.");
        } else {
            System.out.println("The given number "+ temp + " is not a palindrome number.");
        }
    }
}