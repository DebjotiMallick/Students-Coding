/* Here we overload the sum function with three different argument types. When we invoke sum from main, depeding on the type of arguments passed, the appropriate sum function will be called. This is called function overloading. This is useful when we are not sure the type of inputs the user will pass, hence we create several possible functions will all possible argument combinations.
*/
import java.util.Scanner;
class FunctionOverload{

    void sum(int a, int b){
        int sum = a + b;
        System.out.println("Sum: " + sum);
        System.out.println("First method called");
    }

    void sum(double a, double b){
        double sum = a + b;
        System.out.println("Sum: " + sum);
        System.out.println("Second method called");
    }

    void sum(int a, double b, int c){
        double sum = a + b + c;
        System.out.println("Sum: " + sum);
        System.out.println("Third method called");
    }


    public static void main(String[] args){
        FunctionOverload func = new FunctionOverload();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers to sum: ");
        int x = sc.nextInt();
        double y = sc.nextDouble();
        int z = sc.nextInt();
        func.sum(x, y, z);
    }
}