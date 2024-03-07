import java.util.Scanner;
public class WordCounter
  {  public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter= "); //entering word
        String w=sc.nextLine();
        System.out.println("enter a word to check frequency= ");
        String a=sc.nextLine();
        w=w+' '; 
        int l= w.length();
        String st2=""; 
        char ch; 
        int t=0;
        for (int i=0; i<l; i++){
            ch=w.charAt(i);
            if(ch==' '){ 
                if(st2.compareTo(a)==0){
                    t=t+1;
                } 
                st2="";
            } else {
                st2=st2+ch;
            }
            System.out.println(st2);
        }
        System.out.println("frequency of the word= "+t);
    }
}