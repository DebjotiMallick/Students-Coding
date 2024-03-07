import java.util.Scanner;

class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is prime or not: ");
        int num = sc.nextInt();
        int i, temp=0;

        for(i = 2; i < num; i++){
            if(num % i == 0){
                temp++;
            }
        }
        if(temp == 0){
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
    }
}