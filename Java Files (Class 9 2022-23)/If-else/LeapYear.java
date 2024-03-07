import java.util.Scanner;

class LeapYear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year%100 == 0){  // If it is a century year

            if (year%400 == 0){  //Checking if it is a leap year
                System.out.println("It is a leap year.");
            } else {
                System.out.println("It is not a leap year.");
            }

        } else {  //For non century years
        
            if (year%4 == 0){   //Checking if it is a leap year
                System.out.println("It is a leap year.");
            } else {
                System.out.println("It is not a leap year.");
            }
        }

    }
}