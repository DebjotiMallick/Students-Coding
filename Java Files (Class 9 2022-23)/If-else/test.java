import java.util.Scanner;
class test
{
    public static void main(String[] args)
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Years Of Service ");
        double YrsOfService= sc.nextDouble();
        System.out.println("Salary ");
        double Salary= sc.nextDouble();

        if(YrsOfService<5){
            System.out.println("Net Salary" + Salary);
        } else {
            double Bonus= 5.0*Salary/100.0;
            double NetSalary= Salary + Bonus;
            System.out.println("Net Salary" + NetSalary);
        }
}
}