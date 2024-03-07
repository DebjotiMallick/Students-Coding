import java.util.Scanner;
class Series3{
    public static void main(String[] args){
        int sum=0,i,j,n;
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(j = 1; j <= n; j++){
            System.out.print(j + "! + ");
            int fact = 1;
            for(i = j; i >= 1; i--){
                fact = fact * i;
            }
            sum = sum + fact;
        }
        System.out.println();
        System.out.println("Sum of series: " + sum);
        
    }
}