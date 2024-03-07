import java.util.Scanner;

public class ISBN{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ISBN number to check: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int digit = n % 10;       
            sum = sum + i * digit;
            n = n / 10;
        }

        if      (sum % 11 == 1) System.out.println("NOT ISBN");
        else if (sum % 11 == 0) System.out.println("ISBN");
    }
}
