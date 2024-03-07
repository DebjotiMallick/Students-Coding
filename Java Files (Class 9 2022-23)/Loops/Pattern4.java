class Pattern4{
    public static void main(String[] args){
        int i,j;
        for(i = 1; i <= 9; i++){
            if(i < 5){
                for(j = 1; j <= 6-i ; j++){
                    System.out.print(j);
                }
                System.out.println("");
            } else if(i > 5){
                for(j = 1; j <= i-4 ; j++){
                    System.out.print(j);
                }
                System.out.println("");
            } else if(i == 5){
                System.out.print("1");
                System.out.println("");
            }
        }
    }
}