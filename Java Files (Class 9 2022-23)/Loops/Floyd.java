class Floyd{
    public static void main(String[] args){
        int i,j,num=0;

        for(i = 1; i <= 5; i++){
            for(j = 1; j <= i; j++){
                num = num + 1;
                System.out.print(num + " ");
            }
            System.out.println(" ");
        }
    }
}