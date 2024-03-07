import java.util.Scanner;

class basicString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a time of day: ");
        String time = sc.nextLine();

        switch(time){
            case "morning":
            System.out.println("Good morning!");
            break;
            case "afternoon":
            System.out.println("Good afternoon!");
            break;
            case "evening":
            System.out.println("Good evening!");
            break;
            case "night":
            System.out.println("Good night!");
            break;
            default:
            System.out.println("Nothing good!");
        }
    }
}