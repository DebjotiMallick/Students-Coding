/* A computer typist has the habit of deleting the middle name while entering names containing three words. WAP to enter a name with three words and display the new name after deleting the middle name. 
Input: Ashish Kumar Nehra
Output: Ashish Nehra
*/

import java.util.Scanner;

class MiddleName{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String name = sc.nextLine();

        int a = name.indexOf(' ');
        int b = name.lastIndexOf(' ');

        String firstWord = name.substring(0,a);
        String lastWord = name.substring(b);
        String newName = firstWord.concat(lastWord);

        System.out.println("New name without middle name: " + newName);

    }
}