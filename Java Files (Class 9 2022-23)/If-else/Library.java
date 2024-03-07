import java.util.Scanner;

class Library{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of late days: ");
        int lateDays = sc.nextInt();

        double amount = 0.0;
        if (lateDays <= 5){
            amount = lateDays * 40;
        } else if (lateDays >= 6 && lateDays <= 10){
            amount = lateDays * 65;
        } else if (lateDays >= 10){
            amount = lateDays * 80;
        }

        System.out.println("Fine amount: " + amount + " paise");
    }
}