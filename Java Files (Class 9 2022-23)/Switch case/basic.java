import java.util.Scanner;

class basic{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        switch(num){
            case 1:
            System.out.println("Good morning!");
            // break;
            case 2:
            System.out.println("Good afternoon!");
            // break;
            case 3:
            System.out.println("Good evening!");
            // break;
            case 4:
            System.out.println("Good night!");
            break;
            default:
            System.out.println("Nothing good!");
        }
    }
}