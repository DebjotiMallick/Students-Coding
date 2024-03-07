import java.util.Scanner;

class Ternary{
    public static void main(String[] args){
        // double a = 1;
        // double b = 7;

        // double square = (a>b)? a*a : b*b;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        double yourAge = sc.nextDouble();
        double entryAge = 18;

        // String message = (yourAge > entryAge)? "You can enter": "You are too child.";

        System.out.println((yourAge > entryAge)? "You can enter": "You are too child.");
    }
}