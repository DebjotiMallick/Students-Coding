import java.util.Scanner;

class Functions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        double number = sc.nextDouble();

        System.out.println("Log of the given number is " + Math.log(number));
        System.out.println("Absolute value of the given number is " + Math.abs(number));
        System.out.println("Square root of the given number is " + Math.sqrt(number));
        System.out.println("Cube of the given number is " + Math.pow(number, 3));
        System.out.println("Random number between 0 and 1 is " + Math.random());
    }
}