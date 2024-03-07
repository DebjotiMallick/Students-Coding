import java.util.Scanner;
public class neon
{
    public static void main(String[] args)
    {
       Scanner sc= new Scanner(System.in);
       
       int rem=0,num,num2,sum=0,product=1;
       
       System.out.println("Enter number");
       num= sc.nextInt();

      int square= num*num;
         
       while(square!=0){
       rem=square%10;
       sum=sum+rem;
       square=square/10;
    }
    
    if(sum==num){
        System.out.println("the number is a neon number");
    }
        
        else{
        System.out.println("the number is not a neon number");  
        }
}
}