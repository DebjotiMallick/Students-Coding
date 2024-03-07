import java.util.Scanner;

class Disarium{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int a=0,b=0,dis = 0;
        
        int i = num;
        while(i != 0){
            i = i / 10;
            dis++;
        }

        i = num;
        while(i != 0){
            a = i % 10;
            b = b + (int)Math.pow(a , dis);
            i = i / 10;
            dis--;
        }

        if(b == num){
            System.out.println("Its a disarium number");
        } else {
            System.out.println("Its not a disarium number");
        }
    }
}