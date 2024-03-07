import java.util.Scanner;

class HowManyA{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = sc.nextLine();
        word = ' ' + word;
        int l = word.length();  
        word = word.toUpperCase();
        int i;
        // System.out.println(word);
        int temp = 0;
        for(i = 0; i < l; i++){
            if(word.charAt(i) == ' '){
                if(word.charAt(i+1) == 'A'){
                    temp++;
                }
            }
        }
        System.out.println("Count: "+ temp);
    }
}