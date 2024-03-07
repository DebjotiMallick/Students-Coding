import java.util.Scanner;
public class emirp 
{
    public static void main(String[] args)
    {
       Scanner sc= new Scanner(System.in);
       
       int rem=0,rev=0,num,num2,temp,i,temp2=0,rem2=0;
       
       System.out.println("Enter number");
       num= sc.nextInt();
       temp=num;
       while(num!=0){
       rem=num%10;
       rev = rev * 10 + rem; //missed
       num=num/10; 
    }
    System.out.println("Reverse" + rev);
    for( i = 2; i<temp; i++){ 
            if(temp % i==0)
            {
                temp2++;
            }
            if(rev % i==0)
            {
                temp2++;
            }
        }
    if(temp2==0)
        {
            System.out.println(temp+" is a twisted prime number");
        }else{
            System.out.println(temp+" is not twisted prime number");
        }
    
}
}

