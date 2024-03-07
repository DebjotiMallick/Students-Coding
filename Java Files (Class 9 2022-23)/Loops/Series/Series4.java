import java.util.Scanner;
class Series4{
    public static void main(String[] args){
        int i, j ,a, n;
        double sum=1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a:");
        a = sc.nextInt();

        System.out.print("Enter n:");
        n = sc.nextInt();

        System.out.print("1 + ");

        for(i = 2; i <= n; i++){
            System.out.print(a + "^" + i + "/" + (i-1) + "! + ");
            int fact = 1;
            for(j = i-1; j >= 1; j--){
                fact = fact * j;
            }
            sum = sum + Math.pow(a, i) / fact;
            
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}