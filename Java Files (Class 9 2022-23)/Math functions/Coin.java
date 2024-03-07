// In a game of tossing a coin you want to know the number of times you get Head and Tail. You keep the record as 1 for getting head and 0 for getting tail. Suppose you have
// tossed a coin for 20 times in this game. Program the game.

// (int)0.93 = 0, Math.random()*2, e.g 0.85*2=1.7 -> (int)1.7=1 e.g 0.33*2=0.66 -> (int)0.66=0

import java.lang.Math;
class Coin {
    public static void main(String[] args) {
        int i;
        int a;
        for(i=1; i<=20; i++){
            a=(int)(Math.random()*2);
            
            if(a==1){
                System.out.println("Heads");
            } else{
                System.out.println("tails");
            }


        }
    }
}