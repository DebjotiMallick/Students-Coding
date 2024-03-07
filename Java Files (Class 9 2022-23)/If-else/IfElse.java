import java.util.Scanner;

public class IfElse
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter ticket number: ");
        int tickerNumber = sc.nextInt();
        int prizeNumber = 1859;
        
        if(tickerNumber == prizeNumber){
            System.out.println("You won lottery");
        } else {
            System.out.println("You didn't win lottery");
        }*/
        System.out.println("Enter your birthDate: ");
        int birthDate = sc.nextInt();
        int todayDate = 21;
        
        if(birthDate != todayDate){
            System.out.println("Today isn't your birthday");
        } else {
            System.out.println("Today is your birthday");
        }
        
    } 
}
