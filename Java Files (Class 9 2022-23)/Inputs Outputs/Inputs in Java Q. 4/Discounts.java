import java.util.Scanner;

public class Discounts
{
    public static void main(String[] args){
        System.out.println("Enter the price = ");
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        double shopOneDiscount = 0.3 * price; //Discount of first shopkeeper
        double shopTwoDiscounted1 = price * (1 - 0.2); // Price after first discount for second shopkeeper
        double shopTwoDiscounted2 = shopTwoDiscounted1 * (1 - 0.1); // Price after second discount for second shopkeeper
        double shopTwoDiscount = price - shopTwoDiscounted2; // Discount for second shopkeeper
        System.out.println("Discount of first shopkeeper = " + shopOneDiscount);
        System.out.println("Discount of second shopkeeper = " + shopTwoDiscount);
    }
}
