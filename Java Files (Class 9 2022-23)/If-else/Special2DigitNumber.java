import java.util.Scanner;
public class Special2DigitNumber
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two digit number= ");
        int OriginalNum= sc.nextInt();
        int Num1= OriginalNum/10;
        int Num2= OriginalNum%10;
        int sum= Num1+Num2;
        int product= Num1*Num2;
        int sum2= sum+product;
        
        if(OriginalNum==sum2){
            System.out.println("Special 2-Digit Number");
        }
        else System.out.println("Not a Special 2-Digit Number");
        }
    }
