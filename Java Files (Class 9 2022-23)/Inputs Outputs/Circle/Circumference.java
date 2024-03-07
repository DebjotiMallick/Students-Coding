import java.util.Scanner;

public class Circumference
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius = ");
        double radius = sc.nextDouble();
        double pi = 22.0/7.0;
        System.out.println("Pi = " + pi);
        double circumference = 2 * pi * radius;
        double area = pi * radius * radius; 
        System.out.println("Circumference = " + circumference);
        System.out.println("Area = " + area);
    }
}
