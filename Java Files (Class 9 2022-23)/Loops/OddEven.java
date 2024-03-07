import java.util.Scanner;
public class OddEven
{
    public static void main(String[] args)
    {
        int i;
        Scanner sc= new Scanner(System.in);
        for( i = 1; i<=5; i++){
            System.out.println("Enter a number= ");
            double num= sc.nextDouble();
            if(num%2==0){
                System.out.println("the number is even");
            }
            else {
                System.out.println("the number is odd");
            }
        }
    }
}