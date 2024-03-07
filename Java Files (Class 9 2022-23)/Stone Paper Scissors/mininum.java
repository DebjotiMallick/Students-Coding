import java.util.Scanner;
import java.lang.Math;
public class mininum  
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Num 1=");
        int num1= sc.nextInt();
        System.out.println("Num 2=");
        int num2= sc.nextInt();
        System.out.println("Num 3=");
        int num3= sc.nextInt();
        int min1 = Math.min(num1,num2); //finds minimum between first and second number
        int min2 = Math.min(min1,num3); //finds minimum between already found min and third number
  
        System.out.println("The smallest number is "+ min2);
    }
}
