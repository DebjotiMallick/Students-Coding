class Basic{
    public static void main(String[] args){
        int i;
        double sum = 0.0;
        for(i = 1; i <= 10; i++){
            System.out.print(i + "/" + (i+1) + " + ");
            sum = sum + (i / (i+1.0));
        }
        System.out.println();
        
        System.out.println("Sum: " + sum);
    }
}