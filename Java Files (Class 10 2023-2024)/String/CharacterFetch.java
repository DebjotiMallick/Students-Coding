import java.util.Scanner;

class CharacterFetch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String w = "";
        s=s+" ";
        int l = s.length();

        for (int i = 0; i < l; i++){
            while(s.charAt(i) != ' '){
                w = w + s.charAt(i);
                i++;
            }
            int l2 = w.length();
            for (int j = 0; j < l2; j++){
                System.out.println(Character.toUpperCase(w.charAt(j)));
            }
            break;
            // if(s.charAt(i) == ' '){
            //     w = " ";
            //     System.out.print(' ');
            // }
        }
    }
}