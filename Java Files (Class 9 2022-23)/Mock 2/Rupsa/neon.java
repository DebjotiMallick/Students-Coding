import java.util.Scanner;
class neon{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int no=sc.nextInt();
        int nopow= no*no;
        int no1=nopow/10;
        int no2=nopow%10;
        int no3=nopow-(no1+no2);
        if(nopow==no1+no2+no3){
            System.out.println(no+"is a neon number");
        }else{
            System.out.println(no+"is not a neon number");
        }
    }
}