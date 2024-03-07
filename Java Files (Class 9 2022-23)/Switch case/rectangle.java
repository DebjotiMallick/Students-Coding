import java.util.Scanner;

class rectangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for area, 2 for perimeter, 3 for diagonal: ");
        int choice = sc.nextInt();

        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();

        double area, perimeter, diagonal;

        switch(choice){
            case 1:
            area = length * breadth;
            System.out.println("Area is "+ area);
            break;
            case 2:
            perimeter = 2 * (length + breadth);
            System.out.println("Perimeter is "+ perimeter);
            break;
            case 3:
            diagonal = Math.sqrt(length*length + breadth*breadth);
            System.out.println("Diagonal is "+ diagonal);
            break;
            default:
            System.out.println("Wrong choice");
        }
    }
}