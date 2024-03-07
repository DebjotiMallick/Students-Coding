public class twentythree
{
 public static void main(String[] args){
     twentythree obj = new twentythree();
     obj.series(3.0);
     obj.series(2.0,5.0);
    }
  void series(double n){
      int i; double sum=0.0;
      for(i=1;i<=n;i++){
          sum=sum+(1.0/i);
      }
      System.out.println("sum= "+sum);
 }
  void series(double a, double n){
     double k=1.0,sum=0.0; double i;
     for(i=2.0;i<=n;i=i+3.0){
         sum= k/(Math.pow(a,i));
         k=k+3.0;
     }
     System.out.println("sum= "+sum);
 }
}