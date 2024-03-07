import java.util.Scanner;

class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("------------Calculator------------");
        while(true){
            System.out.println("Press 1 for addition, press 2 for subtraction, press 3 for multiplication, press 4 for division, press 0 to exit...");
            int c = sc.nextInt();
            if(c == 0){
                System.exit(0);
            }
            System.out.println("Enter first number: ");
            int first = sc.nextInt();
            System.out.println("Enter second number: ");
            int second = sc.nextInt();
            switch(c){
                case 1: 
                    System.out.println("Sum is : " + sum(first, second));
                    break;
                case 2:
                    System.out.println("Subtraction is : " + sub(first, second));
                    break;
                case 3:
                    System.out.println("Multiplication is : " + mul(first, second));
                    break;
                case 4:
                    System.out.println("Division is : " + div(first, second));
                    break;
            }
        }
    }

    public static int sum(int x, int y){
        int sum = x + y;
        return sum;
    }

    public static int sub(int x, int y){
        int sub = x - y;
        return sub;
    }

    public static int mul(int x, int y){
        int mul = x * y;
        return mul;
    }

    public static float div(int x, int y){
        float div = (float)x / (float)y;
        return div;
    }
}