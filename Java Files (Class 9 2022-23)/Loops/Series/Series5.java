import java.util.Scanner;

class Series5{
    public static void main(String[] args){
        int i, j, n, sum=0;

        Scanner sc = new Scanner(System.in);
        

        System.out.print("Enter n: ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++){
            System.out.print("(");
            for (j = 1; j <= i; j++){
                System.out.print(j + "+");
                sum = sum + j;
            }
            System.out.print(")+");
        }
        System.out.println();
        System.out.println("Sum is " + sum);

    }
}