import java.util.Scanner;

class Multiplication{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for the multiplication table: ");
        int n = sc.nextInt();

        int i;
        for(i = 1; i <= 10; i++){
            System.out.println(n + " X " + i + " = " + n*i);
        }
    }
}