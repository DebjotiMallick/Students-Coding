import java.util.Scanner;
class TermDeposit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter age: ");
        double age = sc.nextDouble();
        System.out.print("Enter term: ");
        double term = sc.nextDouble();
        double rate;

        if(age < 60){
            if(term <= 1){
                rate = 7.5;
            } else if(term <= 2){
                rate = 8.5;
            } else if(term <= 3){
                rate = 9.5;
            } else {
                rate = 10.0;
            }
        } else {
            if(term <= 1){
                rate = 8.0;
            } else if(term <= 2){
                rate = 9.0;
            } else if(term <= 3){
                rate = 10.0;
            } else {
                rate = 11.0;
            }
        }
        double interest = principal * rate * term / 100.0;
        double amount = interest + principal; 

        System.out.println("Amount Deposited \t Term \t Age \t Interest Earned \t Amount Paid");
        System.out.println(principal +"\t\t"+ term +"\t"+ age +"\t\t"+ interest +"\t\t"+ amount);
    }
}