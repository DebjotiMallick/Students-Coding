import java.util.Scanner;

class GCD{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        num2 = sc.nextInt();

        int a, gcd = 1;
        for(a = 1; a <= num1; a++){
            if(num1 % a == 0 && num2 % a == 0){
                gcd = a;
            }
        }

        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);
    }
}