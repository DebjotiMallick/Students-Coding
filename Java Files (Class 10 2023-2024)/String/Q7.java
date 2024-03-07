// Write a program to accept a name and display the initials along with the surname
// Eg: Input: Tom Charles Jones
// Output: T. C. Jones

import java.util.Scanner;

class Q7{
    public static void main(String[] args){
        int i;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();

        String surname="",st="",st1="";
        name=' '+ name;
        System.out.println(name);

        int x = name.lastIndexOf(' ');
        surname = name.substring(x+1);

        for(i = 0; i < x; i++){
            ch = name.charAt(i);
            if(ch == ' '){
                st = st + name.charAt(i+1) + ". ";
            }
        }
        st1 = st + surname;
        System.out.println("Name with initials and surname is: "+st1);
    }
}