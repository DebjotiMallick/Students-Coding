import java.util.Scanner;
class duck{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int no=sc.nextInt();
        
        int no1=no/10;
        int no2=no%10;
        int no3=no-(no1+no2);
        if(no3==0){
            System.out.println("It is a duck number");
        }else{
            System.out.println("It is not a duck number");
        }
    }
}