import java.util.Scanner;

class basicString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // next() -> it takes string input till whitspace is detected (space or tab from keyboard)
        // nextLine() -> it takes string input till new line character is detected (enter pressed from keyboard)

        // System.out.print("Enter your full name: ");
        // String name = sc.next();
        // System.out.println("Full name: " + name);

        System.out.print("Enter your favorite character: ");
        String name2 = sc.next();
        System.out.println("Your favorite character: " + name2);

        // nextLine can be used to scan any line, word or character
        // next can only be used to scan a word or character
    }
}