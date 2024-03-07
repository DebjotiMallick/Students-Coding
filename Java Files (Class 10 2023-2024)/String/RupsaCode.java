import java.util.Scanner;

class RupsaCode{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s= sc.nextLine();
        String w="";
        s=s+" ";
        int l = s.length();

        for(int i=0;i<l;i++){
            while(s.charAt(i) !=' '){
                w = w + s.charAt(i);
                i++;
        }
        int l2 = w.length();
        for(int j = 0; j< 12;j++){
            System.out.println(Character.toUpperCase(w.charAt(j)));
        }
        if(s.charAt(i)==' '){
            w=" ";
            System.out.print(' ');
   }
}
}
}