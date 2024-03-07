public class eighteen
{
 public static void main(String[] args){
     eighteen obj = new eighteen();
     obj.calculate(49,'t');
     obj.calculate(31,45,'g');
    }
  void calculate(int m,char ch){
      int i,rem;
     if(ch=='s'){
          if(m%7==0){
             System.out.println(m+" is divisible by 7");
         }
          else{
             System.out.println(m+" is not divisible by 7");
         }
     }
     else
     {
         for(i=0; i<1;i++){
             if(m%10==7){
                 System.out.println(" last number is 7");
             }
             else{
                 System.out.println("last number is not 7");
             }
         }
     }
 }
  void calculate(int a, int b, char ch){
     int min, max;
     if(ch=='g'){
        max= Math.max(a,b);
        System.out.println("Greater number is= "+max);
     }
     else
     {
        min= Math.min(a,b);
        System.out.println("Smaller number is= "+min);
     }
 }
}