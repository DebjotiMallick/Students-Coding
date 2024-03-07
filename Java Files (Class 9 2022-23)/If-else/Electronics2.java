import java.util.Scanner;
import java.io.*;
class Electronics2{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.print("Enter your amount of purchase: ");
        double amount = sc.nextDouble();
        System.out.print("Enter your type of purchase: ");
        String type = sc.next();
        double discount = 0;
        switch(type){
            case "L":
                if(amount<=25000){
                    discount = 0;
                } else if(amount>=25001 && amount<=50000){
                    discount = amount * 0.05;
                } else if(amount>=50001 && amount<=100000){
                    discount = amount * 0.075;
                } else if(amount>100000){
                    discount = amount * 0.1;
                }
                break;
            case "D":
                if(amount<=25000){
                    discount = amount * 0.05;
                } else if(amount>=25001 && amount<=50000){
                    discount = amount * 0.075;
                } else if(amount>=50001 && amount<=100000){
                    discount = amount * 0.1;
                } else if(amount>100000){
                    discount = amount * 0.15;
                }
                break;
            default:
                System.out.println("Wrong type.");
                // System.exit(0);
                return;
        }
        double finalPrice = amount - discount;
        System.out.println("Net amount to be paid: " + finalPrice);

    }
}