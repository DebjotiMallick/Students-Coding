import java.util.Scanner;
public class IncomeTax  
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("SALARY=");
        double Salary= sc.nextDouble();
        
        if(Salary<=250000){
        System.out.println("No Tax");
    }else if(Salary>=250001|Salary<=500000){
        double more= Salary-250000;
        double TaxAmount= 10/100*more;
        System.out.println("Tax"+ TaxAmount);
    }else if(Salary>=500001|Salary<=1000000){
        double more2= Salary-500000;
        double TaxAmount2= 10000 + (20/100*more2);
        System.out.println("Tax"+ TaxAmount2);
    }else if(Salary>1000000){
        double more3= Salary-1000000;
        double TaxAmount3= 25000 + (30/100*more3);
        System.out.println("Tax"+ TaxAmount3);
    }else {
        System.out.println("Not Mentioned");
    }
}
}