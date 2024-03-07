/* WAP to accept 5 different names along with corresponding telephone numbers. Enter a name from the console and search whether the name is present or not. If the name is present then display the name along with the phone number otherwise, display an appropriate message using 'Linear Search'. */

import java.util.Scanner;
class PhoneBook{
    public static void main(String[] args){
        int flag=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the names: ");
        String name[]= new String [10];
        int i;
        for( i = 0; i < 5; i++){
            name[i] = sc.nextLine();
        }
        System.out.println("Enter the numbers: ");
        int num[]= new int[10];
        int j;
        for( j = 0; j < 5; j++){
            num[j] = sc.nextInt();
        }
        sc.nextLine(); // to clear any newline input from keyboard
        System.out.print("Enter the name to be searched: ");
        String search= sc.nextLine();
        
        for( i = 0; i < 5; i++){
            if(search.equals(name[i])){
                flag++;
                System.out.println("Name: " + name[i] + " Phone: " + num[i]);
                break;
            }
        }  
        if(flag==0){
        System.out.println("Match not found");
        }
    }
}