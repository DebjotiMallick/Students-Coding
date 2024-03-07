import java.util.Scanner;

class mailDelivery{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter weight of the parcel: ");
        double weight = sc.nextDouble(); // weight of the parcel

        System.out.print("Enter type, O for ordinary and E for express: ");
        String type = sc.next(); // O for ordinary and E for express

        double price = 0.0;

        if(type.equals("O")){
            if(weight <= 100){
                price = 50;
            } else if(weight >= 101 && weight <= 500){
                price = 50 + Math.ceil((weight - 100) / 100) * 40;
            } else if(weight >= 501){
                price = 50 + 160 + Math.ceil((weight - 500) / 100) * 35;
            }
        } else if(type.equals("E")){
            if(weight <= 100){
                price = 80;
            } else if(weight >= 101 && weight <= 500){
                price = 80 + Math.ceil((weight - 100)/100) * 70;
            } else if(weight >= 501){
                price = 80 + 280 + Math.ceil((weight - 500)/100)*65; // ceil function expects double, so we have to pass double to the function
            }
        }
        System.out.println("Price="+price);
    }
}