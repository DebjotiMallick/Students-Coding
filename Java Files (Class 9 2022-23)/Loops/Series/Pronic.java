import java.util.Scanner;

class Pronic{
    public static void main(String[] args){
        int i, prod, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is pronic or not: ");
        int n = sc.nextInt();

        for(i=1; i<=n ; i++){
            prod = i * (i+1);
            if(prod == n){
                flag = 1;
                System.out.println(n + " is pronic");
                break;
            }
        }

        if(flag == 0){
            System.out.println(n + " is not pronic");
        }
    }
}