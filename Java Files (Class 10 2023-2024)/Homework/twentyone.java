public class twentyone
{
 public static void main(String[] args){
     twentyone obj = new twentyone();
     obj.compare(49,50);
     obj.compare('A','s');
     obj.compare("Methods","Array");
    }
  void compare(int a,int b){
     int max= Math.max(a,b);
     System.out.println("Greater number is= "+max);     
 }
  void compare(char ch1, char ch2){
      int max= Math.max((int) ch1,(int) ch2);
      System.out.println("Greater numeric value is= "+max);
 }
  void compare(String s1, String s2){
      int s=  s1.length();
      int ss= s2.length();
      if(s>ss){
       System.out.println("longer string is= "+s1);
      }
      else{   
      System.out.println("longer string is= "+s2);
      }
 }
}