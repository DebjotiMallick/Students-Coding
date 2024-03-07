import java.util.Scanner;
public class Series2
{
    public static void main(String[] args)
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("enter a number= ");
       int n= sc.nextInt();
       int i,j=1, a=0,sum1=0,sum2=0,sum=0,counter=1;
       
       for(i=1;i<=n; i++){
           a=(int)Math.pow(2,i);
           System.out.print(a+"+");
        }
    }
}