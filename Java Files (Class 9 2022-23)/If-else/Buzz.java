import java.util.Scanner;

class Buzz{
    public static void main(String[] args){
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        num = sc.nextInt();

        if(num % 10 == 7){
            System.out.println("Buzz");
        } else if(num % 7 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println("Not Buzz");
        }
    }
}