import java.util.Scanner;

public class TimeConversion
{
    public static void main(String[] args){
        System.out.println("Enter seconds = ");
        Scanner sc = new Scanner(System.in);
        int inputSeconds = sc.nextInt();

        int hour = inputSeconds / 3600; //Calculating how many hours are there in the user given seconds
        int remaining = inputSeconds % 3600; //Calculating how many seconds left after calculating hours
        int minute = remaining / 60; //Calculating how many minutes are there in those remaining seconds
        int second = remaining % 60; //Calculating remaining seconds after calculating minutes
        
        System.out.println(hour + " Hour " + minute + " Minutes " + second + " Seconds ");
    }
}
