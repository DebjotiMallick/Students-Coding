public class twentysix
{
 public static void main(String[] args){
     twentysix obj = new twentysix();
     obj.Joystring("TECHNALOGY",'A','O');
     obj.Joystring("Cloud computing means internet based computing");
     obj.Joystring("COMMON WEALTH","GAMES");
    }
  void Joystring(String s,char ch1, char ch2){
     String a= s.replace(ch1,ch2);
     System.out.println(a);
 }
  void Joystring(String s){
     int a= s.indexOf(" ");
     int b= s.lastIndexOf(" ");
     System.out.println("First Index= "+a);
     System.out.println("Last Index= "+b);
 }
 void Joystring(String s1, String s2){
     String a= s1.concat(" "+s2);
     System.out.println(a);
 }
}
