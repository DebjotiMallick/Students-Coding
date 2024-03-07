// A-> 65 (1st) Z-> 90 (26th)

import java.util.Scanner;

class AlternateFromEnd{
    public static void main(String[] args){
        int flag;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the character to alter: ");
            char ch = sc.next().charAt(0);
            if(ch >= 'A' && ch <= 'Z'){
                int chAscii = (int)ch;
                int distLeft = 77 - chAscii;
                int distRight = 78 + distLeft;
                char ch1 = (char)distRight;
                System.out.println("The altered character is: " + ch1);
            } else if(ch >= 'a' && ch <= 'z'){
                int chAscii = (int)ch;
                int distLeft = 109 - chAscii;
                int distRight = 110 + distLeft;
                char ch1 = (char)distRight;
                System.out.println("The altered character is: " + ch1);
            }
            System.out.println("Do you want to continue? Press 1 for yes, 0 for no.");
            flag = sc.nextInt();
        } while(flag!=0);

    }
}