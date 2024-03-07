import java.util.Scanner;

class mailDelivery{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter weight of the parcel: ");
        int weight = sc.nextInt(); // weight of the parcel

        System.out.print("Enter type, O for ordinary and E for express: ");
        String type = sc.next(); // O for ordinary and E for express

        System.out.println(weight);
        System.out.println(type);
    }
}