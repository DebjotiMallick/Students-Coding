import java.util.Scanner;

class AverageMarks{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        double physics = sc.nextDouble();

        System.out.print("Enter Chemistry marks: ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter Biology marks: ");
        double biology = sc.nextDouble();

        double average = (physics + chemistry + biology) / 3;

        System.out.printf("Average marks rounded off: %.2f", average);
    }
}