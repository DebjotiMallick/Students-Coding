import java.util.Scanner;

class SqRoot{
    public static void main(String[] args){
        int n = 4329;
        int rem;
        int a = n;
        while(a!=0){
            rem = a%10;
            System.out.println(Math.sqrt(rem));
            a=a/10;
        }
    }
}