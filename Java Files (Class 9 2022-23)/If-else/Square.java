import java.util.Scanner;

class Square{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter first number: ");
        int num2 = sc.nextInt();

        double sq1 = Math.sqrt(num1);
        double sq1Floor = Math.floor(sq1);

        double sq2 = Math.sqrt(num2);
        double sq2Floor = Math.floor(sq2);

        if (sq1Floor == sq1 && sq2Floor == sq2){
            System.out.println("they are perfect square numbers");
        } else if (sq1Floor == sq1 && sq2Floor != sq2){
            System.out.println(num1 + " is a perfect square number");
            System.out.println(num2 + " is not a perfect square number");
        } else if (sq1Floor != sq1 && sq2Floor == sq2){
            System.out.println(num1 + " is not a perfect square number");
            System.out.println(num2 + " is a perfect square number");
        } else {
            System.out.println("They are not perfect square numbers");
        }
    }
}