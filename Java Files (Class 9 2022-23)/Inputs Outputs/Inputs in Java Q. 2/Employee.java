import java.util.Scanner;

public class Employee
{
    public static void main(String[] args){
        System.out.println("Enter the basic pay = ");
        Scanner sc = new Scanner(System.in);
        double basic = sc.nextDouble();

        double da = 0.3 * basic;
        double hra = 0.15 * basic;
        double pf = 0.125 * basic;
        
        double gross = basic + da + hra;
        double net = gross - pf;
        System.out.println("Net salary = " + net);
    }
}
