public class seventeen
{
 public static void main(String[] args){
     seventeen obj = new seventeen();
     obj.display("AlZhEiMeRs",0);
     obj.display("abubenadem",'v');
    }
  void display(String str,int p){
   int i; char ch;
   int len= str.length();
     if(p==1){
       for(i=0;i<len;i++){
           ch= str.charAt(i);
           if(ch >='A' && ch <= 'Z'){
             System.out.print(ch+", ");  
           }
       }
     }
     else
     {
         for(i=0;i<len;i++){
           ch= str.charAt(i);
           if(ch >'a' && ch < 'z'){
             System.out.print(ch+", ");  
           }
        }
   }
   System.out.println();  
 }
  void display(String str, char chr){
     int i; char ch;
     int len= str.length();
     if(chr=='v'){
       for(i=0;i<len;i++){
           ch= str.charAt(i);
           if(ch=='A' || ch =='E'||ch=='I' || ch =='O'|| ch=='U' || ch =='a'||ch=='e' || ch =='i'||ch=='o' || ch =='u'){
             System.out.print(ch+", ");  
           }
       }
     }
     else
     {
         for(i=0;i<len;i++){
           ch= str.charAt(i);
           System.out.print(ch+", ");  
           }
      }
 }
}
