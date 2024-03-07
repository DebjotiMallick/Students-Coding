import java.util.Scanner;
public class Train
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1 for train travelling in the same direction and 2 for opposite direction: ");
        int choice= sc.nextInt();
        System.out.print("Enter length of train 1 in meters: ");
        double l1= sc.nextDouble();
        System.out.print("Enter length of train 2 in meters: ");
        double l2= sc.nextDouble();
        System.out.print("Enter velocity of train 1 in km/hr: ");
        double v1= sc.nextDouble();
        System.out.print("Enter velocity of train 2 in km/hr: ");
        double v2= sc.nextDouble();
        double tl= (l1+l2) / 1000.0; // Converting total length from meters to km.

        switch(choice){
            case 1:
                double rs= Math.abs(v1-v2); // Absolute used to eliminate negative sign
                double t1= tl/rs; // Time = Distance / Speed
                double t= t1*3600; // Converting time from hours to seconds
                System.out.println("Relative Velocity "+rs+" km/hr and "+ " Time taken by the train to cross eachother " +t + " seconds");
            break;
            case 2:
                rs= v1+v2;
                t1= tl/rs;
                t= t1*3600;
                System.out.println("Relative Velocity "+rs+" km/hr and "+ " Time taken by the train to cross eachother " +t + " seconds");
        }
    }
}