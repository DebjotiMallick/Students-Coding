import java.util.Scanner;

class Admission{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter english marks: ");
        double english = sc.nextDouble();
        System.out.print("Enter maths marks: ");
        double maths = sc.nextDouble();
        System.out.print("Enter science marks: ");
        double science = sc.nextDouble();

        if(maths >= 80 && english >= 80 && science >= 80){
            System.out.println("You get pure science");
        } else if(maths >= 60 && english >= 80 && science >= 80){
            System.out.println("You get bio science");
        } else if(maths >= 60 && english >= 60 && science >= 60){
            System.out.println("You get commerce");
        }
    }
}