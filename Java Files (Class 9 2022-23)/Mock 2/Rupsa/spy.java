                                                                                                                                                                                                                   import java.util.Scanner;
class spy{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        int no=sc.nextInt();
        int no1=no/10;
        int no2=no%10;
        int no3=no-(no1+no2);
        
        if(no1+no2+no3=no1*no2*no3){
        System.out.println(no+ "is a spy number" );
        }else{
            Sysem.out.println(no+ "is not a spy number");
    }
}
}