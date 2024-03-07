class Pattern6{
    public static void main(String[] args){
        int i, j, num;

        for(i = 1; i <= 5; i++){
            num = 9;
            for(j = 1; j <= i; j++){
                System.out.print(num + " ");
                num = num - 2;
            }
            System.out.println("");
        }
    }
}