class Pattern5{
    public static void main(String[] args){
        int i, j;
        int num = 9;
        for (i=1; i<= 5; i++){
            for (j=1; j<=5; j++){
                System.out.print(num);
            }
            System.out.println("");
            num=num-2;
        }
    }
}