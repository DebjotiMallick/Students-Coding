import java.util.Scanner;

class Basic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name1;
        String name2;

        System.out.print("Enter the name of first student: ");
        name1 = sc.nextLine();

        System.out.print("Enter the name of second student: ");
        name2 = sc.nextLine();

        System.out.println(name1 + " and " + name2 + " are my students.");
    }
}