/* Define a class called FruitJuice with the following description: [15]
Instance variables/data members:
int product_code – stores the product code number
String flavour – stores the flavor of the juice.(orange, apple, etc)
String pack_type – stores the type of packaging (tetra-pack, bottle etc)
int pack_size – stores package size (200ml, 400ml etc)
int product_price – stores the price of the product
Member Methods:
FriuitJuice() – default constructor to initialize integer data members
to zero and string data members to "".
void input() – to input and store the product code, flavor, pack type,
pack size and product price.
void discount() – to reduce the product price by 10.
void display() – to display the product code, flavor, pack type,
pack size and product price. */
import java.util.Scanner;
class FruitJuice{
    int product_code, pack_size, product_price;
    String flavour, pack_type;
    // to initialize the object with default values
    public FruitJuice(){
        this.product_code = 0;
        this.pack_size = 0;
        this.product_price = 0;
        this.flavour = "";
        this.pack_type = "";
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product code: ");
        product_code = sc.nextInt();

        System.out.print("Enter pack size: ");
        pack_size = sc.nextInt();

        System.out.print("Enter product price: ");
        product_price = sc.nextInt();

        System.out.print("Enter product flavour: ");
        flavour = sc.next();

        System.out.print("Enter pack type: ");
        pack_type = sc.next();
    }

    void discount(){
        product_price = (int)(0.9 * product_price);
    }

    void display(){
        System.out.println("Product code: " + product_code);
        System.out.println("Product price: " + product_price);
        System.out.println("Product pack type: " + pack_type);
        System.out.println("Product pack size: " + pack_size);
        System.out.println("Product flavour: " + flavour);
    }

    public static void main(String[] args){
        FruitJuice juice = new FruitJuice();
        juice.input();
        juice.discount();
        juice.display();
    }
}