// WAP to store 10 numbers in an array and display only the prime numbers.

import java.util.Scanner;
class PrimeInArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers with space");
        int array[]=new int[10];
        int flag=0;
        for(int i=0;i<10;i++){
            array[i]=sc.nextInt();   
        }
        for(int i=0;i<10;i++){
            flag=0;
            if(array[i]==0||array[i]==1){
                System.out.println(array[i]+" is not a prime number.");
            } else {      
                for(int j=2;j<array[i];j++){
                    if(array[i]%j==0){
                        System.out.println(array[i]+" is not a prime number.");
                        flag=1; 
                        break;
                    }
                }
                if( flag==0){
                    System.out.println(array[i]+" is a prime number");
                }
            }
        }
    }
}
