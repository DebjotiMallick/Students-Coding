class Pattern2{
    public static void main(String[] args){

        int i,j,k,space=0,max=5;

        for(i = 1; i <= 5; i++){
            //for printing space, increasing with each line
            for(j = 1;j <= space; j++){
                System.out.print(" ");
            }
            space++;
             
            //for printing numbers, starting number decreases with each line
            for(k = max; k >= 1; k--){
                System.out.print(k);
            }
            max--;
            
            //for printing new line
            System.out.println("");
        }
    }
}

// Output
/*
54321
 4321
  321
   21
    1
*/