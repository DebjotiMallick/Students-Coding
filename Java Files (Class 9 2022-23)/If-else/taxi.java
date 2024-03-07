import java.util.Scanner;
public class taxi  
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Taxi Number=");
        double taxino= sc.nextDouble();
        System.out.println("Distance Travelled=");
        double distance= sc.nextDouble();
        if(distance<= 5.00 ){
        System.out.println("Amount\nYou pay=100");
    }else if(distance>5.00 && distance<= 15.00 ){
        double dis1= 10.00/distance;
        System.out.println("Amount\nYou pay="+dis1);
    }else if(distance>15.00 && distance<= 25.00 ) {
        double dis2= 8.00/distance;
        System.out.println("Amount\nYou pay="+dis2);
    }else if(distance>25.00 ) {
        double dis3= 5.00/distance;
        System.out.println("Amount\nYou pay="+dis3);
    }
    System.out.println("Taxi no"+taxino);
    System.out.println("Distance Travelled"+distance);
}
}