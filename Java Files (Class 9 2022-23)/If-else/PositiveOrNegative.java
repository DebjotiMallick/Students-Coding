import java.util.Scanner;
public class PositiveOrNegative
{
    public static void main(String[]args)
    { 
        Scanner sc= new Scanner(System.in);
        System.out.println("Number 1= ");
        double Num1= sc.nextDouble();
        System.out.println("Number 2= ");
        double Num2= sc.nextDouble();
        System.out.println("Number 3= ");
        double Num3= sc.nextDouble();
        
        // Greatest or equal
        if(Num1>Num2 && Num1>Num3) {
            System.out.println("The greatest number is= "+Num1);
        }
        else if(Num2> Num1 && Num2> Num3) {
            System.out.println("The greatest number is= "+Num2);
        }
        else if(Num3> Num1 && Num3>Num2) {
            System.out.println("The greatest number is= "+Num3);
        } else if(Num1==Num2 && Num2==Num3) {
            System.out.println("All are equal");
        }

        // All +ve/-ve/combination
        if(Num1>0 && Num2>0 && Num3>0) {
           System.out.println("All positive");
        }
        else if(Num1<0 && Num2<0 && Num3<0) {
           System.out.println("All negative");
        }
        else System.out.println("It is a combination of positive and negative numbers");
        }
        }