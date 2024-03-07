import java.util.Scanner;
import java.lang.Math;

public class Pendulum
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter l = ");
        double l = sc.nextDouble();
        
        System.out.println("Enter g = ");
        double g = sc.nextDouble();
        
        double t = 2 * (22 / 7) * Math.sqrt(l / g);
        System.out.println("Time period = " + t);
    }
}
