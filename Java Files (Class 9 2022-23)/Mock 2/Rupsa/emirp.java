import java.util.Scanner;
class emirp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int no=sc.nextInt();
        int i,k;
        int temp2=0;
        int temp1=0;
        for(i=2; i<no; i++){
            if(no%i==0){
                temp1++;
            }
        }
        if(temp1==0){
         int no1=no/10;
         int no2=no%10;
         int no3=no-(no1+no2);
         int no4=no3+no2+no1;
         for(k=2; k<no; k++){
            if(no4%k==0){
                temp2++;
            }
         }
         if(temp2==0){
               System.out.println("Emirp number"); 
            }
        }else{
            System.out.println("not emirp number");
        
        }
        
    }
}
      