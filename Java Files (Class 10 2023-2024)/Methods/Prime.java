// WAP to accept a number and check whether the number is prime or not. Use function name as check(int n). The function returns 1 if the number is prime otherwise 0.

import java.util.Scanner;

class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime: ");
        int number = sc.nextInt();
        int c = check(number);
        if(c==1){
            System.out.println(number+" is prime");
        } else {
            System.out.println(number+" is not prime");
        }
    }

    public static int check(int n) {
        int i, temp=0;
        for(i = 1; i <= n; i++){
            if(n%i == 0){
                temp++;
            }
        }

        if(temp==2){
            return 1;
        } else {
            return 0;
        }
    }
}