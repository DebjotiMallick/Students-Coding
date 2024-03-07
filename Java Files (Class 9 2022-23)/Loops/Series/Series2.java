import java.util.Scanner;

class Series2{
    public static void main(String[] args){
        int i,j,n,fact;
        double sum=0.0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        n = sc.nextInt();

        for(i = 1; i <= n; i++){
            System.out.print(i + "/" + i + "! + ");
            fact = 1; //reset fact variable to one each time we calculate new factorial
            for(j = i; j >= 1; j--){
                fact = fact * j;
            }

            sum = sum + (double)i/fact;
        }
        System.out.println("");
        System.out.println("Sum: "+ sum);
    }
}