//WAP to store 10 numbers in an array and display only those are perfect square. Hint: use Math.floor function

import java.util.Scanner;
class GetSquares{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("elements: ");
        int num[]=new int[10];
        double temp;
        //double i=0.0;
        double temp2;
        for(int i=0;i<10;i++){
            num[i]=sc.nextInt();
        } 
        
        for(int i=0;i<10;i++){
           temp=Math.sqrt(num[i]);
           temp2=Math.floor(temp);
           if(temp2==temp){
             System.out.println("elements: "+num[i]);  
           }
        }
    }
}