public class perimeter
{
 public static void main(){
     perimeter obj = new perimeter();
     obj.square(4);
     obj.rectangle(2,5);
     obj.circle(14);
    }
  void square(int s){
      int p= 4*s;
      System.out.println("perimeter= "+p);
 }
  void rectangle(int l, int b){
     int p=2*(l+b);
     System.out.println("perimeter= "+p);
 }
  void circle(double r){
     double p=2*(22/7)*r;
     System.out.println("perimeter= "+p);
 }
}