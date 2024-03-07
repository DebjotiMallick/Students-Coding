import java.util.Scanner;

class Armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int rem, num, sum = 0;

        System.out.print("Enter the number: ");
        num = sc.nextInt();
        int temp = num;

        // Main logic of reversing a number
        while(num != 0){
            rem = num % 10; // Take the last digit of given number
            sum = sum + (int)Math.pow(rem,3); // Cube the digit and add with previous sum
            num = num / 10; // Decreasing given number by one digit from end
        }

        if(sum == temp){
            System.out.println("The given number "+ temp + " is an Armstrong number.");
        } else {
            System.out.println("The given number "+ temp + " is not an Armstrong number.");
        }
    }
}

// Armstrong no: 153, 371, 407