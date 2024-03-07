import java.util.Scanner;
class Triangle1{
    public static void main(String[] args){
        double angle1, angle2, angle3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first angle: ");
        angle1 = sc.nextDouble();

        System.out.print("Enter second angle: ");
        angle2 = sc.nextDouble();

        System.out.print("Enter third angle: ");
        angle3 = sc.nextDouble();

        if(angle1+angle2+angle3 == 180){

            if(angle1<90 && angle2<90 && angle3<90){
                System.out.println("Acute Angled Triangle");
            }

            if(angle1==90 || angle2==90 || angle3==90){
                System.out.println("Right Angled Triangle");
            }

            if(angle1>90 || angle2>90 || angle3>90){
                System.out.println("Obtuse Angled Triangle");
            }

        } else {
            System.out.println("Triangle is not possible");
        }
    }
}