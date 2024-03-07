// For parameterized constructor, scan values inside main just after object creation. Eg. Laptop
// For default constructor, scan values separately in method if they ask. Eg. MovieMagic

import java.util.Scanner;
public class Laptop
{
    double price,amt,dis;
    String name;
    Laptop(double x, double y,double z, String n){
        price=x;
        dis=y;
        amt=z;
        name=n;
    }

    public static void main(String[] args){
     Laptop obj;    
     obj.price = price;
     obj.amt = amt;
     obj = new Laptop(price,0.0,0.0,name);
     obj.accept();
     obj.compute();
     obj.display();
    }

    void accept(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter name = ");
        name= sc.next();
        System.out.println("enter price = ");
        price= sc.nextInt();
    }

     void compute(){
      if(price<=25000){
            dis= price * 0.05;
            amt= price - price* 0.05;
      }
      else if(price>25000 && price<=50000){
          dis= price * 0.075;
          amt= price - 0.075*price;
      }
      else if(price>50000 && price<=100000){
          dis= price * 0.1;
          amt= price - 0.1*price;
      }
      else if(price>100000 ){
          dis= price * 0.15;
          amt= price - 0.15*price;
      }
    }
    void display(){
     System.out.println("Name= "+name);
     System.out.println("Price= "+price);
     System.out.println("Discount= "+dis);
     System.out.println("Amount= "+amt);
    }
}