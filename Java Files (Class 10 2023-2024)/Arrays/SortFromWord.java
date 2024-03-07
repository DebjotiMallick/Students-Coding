/* WAP to store 5 words in an SDA and frame a new word by taking out the first character of each word. Arrange the letters of the new word in ascending order and display the resultant word.
Input: China, America, Brazil, Paris, London
New word: CABPL
Output: ABCLP */


import java.util.Scanner;
class SortFromWord{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String w[] = new String[5];
        char ch[] = new char[5];
        char temp;

        System.out.println("Enter five words: ");
        for(int i=0;i<5;i++){
            w[i] = sc.next();
            ch[i] = w[i].charAt(0);
        }

        // bubble sort
        for(int i=0;i<4;i++){
            for(int j=i;j<5;j++){
                if(ch[i]>ch[j]){
                    temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }

        for(int i=0;i<5;i++){
            System.out.print(ch[i]);
        }
    }
}