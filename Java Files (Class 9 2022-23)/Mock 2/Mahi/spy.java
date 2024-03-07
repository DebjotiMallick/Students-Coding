import java.util.Scanner;
public class spy
{
    public static void main(String[] args)
    {
       Scanner sc= new Scanner(System.in);
       
       int rem=0,num,num2,sum=0,product=1;
       
       System.out.println("Enter number");
       num= sc.nextInt();
       
       while(num!=0){
       rem=num%10;
       sum=sum+rem;
       product=product*rem;
       num=num/10;
    }

    if(sum==product){
        System.out.println("the number is a spy number");}
        
        else{
        System.out.println("the number is not a spy number");  
        }
}
}