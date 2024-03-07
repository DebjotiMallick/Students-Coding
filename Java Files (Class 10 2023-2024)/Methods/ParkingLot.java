/*Define a class ParkingLot with the following description:
Instance variables/data members:
int vno – To store the vehicle number
int hours – To store the number of hours the vehicle is parked in the parking lot
double bill – To store the bill amount
Member methods:
void input() – To input and store vno and hours
void calculate() – To compute the parking charge at the rate of Rs.3 for the first hour or part thereof, 
and Rs.1.50 for each additional hour or part thereof.
void display() – To display the detail
Write a main method to create an object of the class and call the above methods */

import java.util.Scanner;
class ParkingLot{

    int vno, hours;
    double amount = 0;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle number: ");
        vno = sc.nextInt();

        System.out.println("Enter the number of hours: ");
        hours = sc.nextInt();
    }

    public void calculate(){
        amount = 3 + (hours - 1) * 1.5;
    }

    public void display(){
        System.out.println("Parking charges: "+ amount);
    }

    public static void main(String[] args){
        // Creating an object named BMW of ParkingLot class
        ParkingLot BMW = new ParkingLot();
        ParkingLot Toyota = new ParkingLot();

        //
        ParkingLot BMW;
        BMW = new ParkingLot();

        // Invoking input() method of BMW object
        BMW.input(); 

        // Invoking calculate() method of BMW object
        BMW.calculate();

        // Invoking display() method of BMW object
        BMW.display();
    }
}