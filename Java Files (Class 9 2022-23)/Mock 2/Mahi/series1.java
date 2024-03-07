import java.util.Scanner;
public class series1
{
    public static void main(String[] args)
    {
       Scanner sc= new Scanner(System.in);
       
       int i,j,a=0,sum1=0,sum2=0,sum=0;
       
       for(i=9;i>=5;i--){
            a=i*10+9;
            sum1=sum1+i;
            sum2=sum2+a;
            
            System.out.print( i+"+" +a+"+");
        }
       sum=sum1+sum2;
       System.out.println( );
       System.out.print( "sum= " +sum);
    }
}
