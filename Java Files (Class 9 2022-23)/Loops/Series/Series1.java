class Series1{
    public static void main(String[] args){
        int i;
        double sum = 0.0;
        double sum1 = 0.0;
        double sum2 = 0.0;

        for(i=1; i<=5; i++){
            if((i+1)%2 == 0){
                System.out.print(i + "/" + (i+1) + " - ");
                sum1 = sum1 + (i / (i+1.0));
            } else {
                System.out.print(i + "/" + (i+1) + " + ");
                sum2 = sum2 + (i / (i+1.0));
            }
        }
        System.out.println();
        sum = sum1 - sum2;
        System.out.println("Sum: " + sum);

    }
}