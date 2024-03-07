import java.util.Scanner;

class Hypoteneus{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter perpendicular: ");
        double perpendicular = sc.nextDouble();

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        double hypoteneus = Math.sqrt(perpendicular * perpendicular + base * base);

        System.out.println("Hypoteneus is: " + hypoteneus);
    }
}