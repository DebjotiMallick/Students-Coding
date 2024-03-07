import java.util.Scanner;

public class CompoundInterest
{
    public static void main(String[] args){
        System.out.println("Enter the principal amount = ");
        Scanner sc = new Scanner(System.in);
        
        double rate = 5;
        double principal = sc.nextDouble();
        
        double firstInterest = (principal * rate * 1) / 100;
        double firstAmount = principal + firstInterest;
        
        double secondInterest = (firstAmount * rate * 1) / 100;
        double secondAmount = firstAmount + secondInterest;
        
        double thirdInterest = (secondAmount * rate * 1) / 100;
        double thirdAmount = secondAmount + thirdInterest;
        
        System.out.println("Interest for first year = " + firstInterest);
        System.out.println("Interest for second year = " + secondInterest);
        System.out.println("Interest for third year = " + thirdInterest);
    }
}
