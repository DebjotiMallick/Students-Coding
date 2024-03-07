import java.util.Scanner;

public class DigitalCamera
{
    public static void main(String[] args){
        System.out.println("Printed price = ");
        Scanner sc = new Scanner(System.in);
        double printedPrice = sc.nextDouble();

        double discount = 0.1 * printedPrice; //Calculating how much discount will be given
        double discountedPrice = printedPrice - discount; //Price after giving discount
        double gst = 0.06 * discountedPrice; //Calculating gst
        double finalPrice = discountedPrice + gst; //Final price after adding gst
        System.out.println("Final price = " + finalPrice);
    }
}
